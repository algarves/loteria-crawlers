package com.ueby.loteria.crawlers.service;

import com.ueby.loteria.crawlers.CaixaCrawlerStub;
import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.exception.CaixaWebCrawlerException;
import com.ueby.loteria.crawlers.game.CaixaGameResult;
import com.ueby.loteria.crawlers.util.JsonUtil;
import com.ueby.loteria.crawlers.util.RandomUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

/**
 * @author Algarves, Khristian
 */
@Log4j2
public class CaixaWebCrawlerService extends AbstractCrawlerService {

  private static final String BASE_URL = "http://loterias.caixa.gov.br";
  private static final String HOME_URL_PATH = "/wps/portal/loterias";

  private static final String HTML_ELEMENT_FIRST = "com.ibm.lotus.NavStateUrl";
  private static final String HTML_ELEMENT_SECOND = "input[type=hidden][id=urlBuscarResultado]";
  private static final String HTML_DOCTYPE = "<!DOCTYPE";

  private static final int MAX_ATTEMPTS = 5;
  private int attempts = 1;

  private Boolean firstRequest = true;

  CaixaGameType caixaGameType;
  CaixaCrawlerStub caixaCrawlerStub;

  public CaixaWebCrawlerService(CaixaGameType caixaGameType) {
    this.caixaCrawlerStub = new CaixaCrawlerStub();
    this.caixaGameType = caixaGameType;
    init();
  }

  public CaixaWebCrawlerService init() {
    call();
    return this;
  }

  public CaixaWebCrawlerService byLastContest() {
    return init();
  }

  public CaixaWebCrawlerService byContestNumber(final int concourse) {
    caixaCrawlerStub.setConcurso(concourse);
    call();
    return this;
  }

  /**
   * Call whenever the result is invalid for the request.
   *
   * @throws InterruptedException     When the process is interrupted.
   * @throws CaixaWebCrawlerException If Number of attempts exhausted.
   */
  private void recall() throws InterruptedException, CaixaWebCrawlerException {
    if (attempts <= MAX_ATTEMPTS) {
      long threadSleep = getSleep();

      log.warn(String.format("Await (%s) seconds ...", threadSleep));
      Thread.sleep(threadSleep);
      log.warn("New try ...");

      call();
      attempts++;
    } else {
      throw new CaixaWebCrawlerException("Oops! Number of attempts exhausted.");
    }
  }

  private long getSleep() {
    return TimeUnit.SECONDS.toMillis(RandomUtil.getRandomNumInRange(1, 30));
  }

  private void call() {
    try {
      final String url = getUrl();

      log.debug("Request URL '{}' - {}", this.caixaGameType, url);

      Response response = get(url);

      final HttpResponse httpResponse = response.returnResponse();
      final StatusLine responseStatus = httpResponse.getStatusLine();
      final String html = EntityUtils.toString(httpResponse.getEntity());

      log.debug("Response status - {}", responseStatus.getStatusCode());

      if (HttpStatus.SC_OK == responseStatus.getStatusCode()) {
        if (html != null) {
          checkContent(html);
        } else {
          recall();
        }
      } else {
        log.error("[" + responseStatus.getStatusCode() + "] - {} ",
            responseStatus.getReasonPhrase());
        recall();
      }
    } catch (CaixaWebCrawlerException e) {
      log.error(e.getLocalizedMessage(), e);
    } catch (Exception e) {
      log.fatal(e.getLocalizedMessage(), e);
    }
  }

  private void checkContent(String html) throws InterruptedException, CaixaWebCrawlerException {
    Document doc = Jsoup.parse(html);
    Element link = doc.getElementById(HTML_ELEMENT_FIRST);
    Element input = doc.select(HTML_ELEMENT_SECOND).first();

    if (firstRequest) {
      checkContentFirstRequest(link, input);
    } else if (html.startsWith(HTML_DOCTYPE)) {
      log.error("Oops! No valid content.");
      recall();
    }

    if (!html.startsWith(HTML_DOCTYPE)) {
      this.caixaCrawlerStub.setHtmlContent(html);
    }

    firstRequest = false;
  }

  private void checkContentFirstRequest(Element link, Element input) throws InterruptedException, CaixaWebCrawlerException {
    if (link != null) {
      String linkHref = link.attr("href");
      this.caixaCrawlerStub.setLinkHref(linkHref);
    } else {
      log.error("Oops! I couldn't find the first element '" + HTML_ELEMENT_FIRST + "'.");
      recall();
    }

    if (input != null) {
      String inputValue = input.attr("value");
      this.caixaCrawlerStub.setUrlBuscarResultado(inputValue);
    } else {
      log.error("Oops! I couldn't find the second element '" + HTML_ELEMENT_SECOND + "'.");
      recall();
    }
  }

  private String getUrl() throws URISyntaxException {
    URIBuilder uriBuilder = getUriBuilder();

    if (caixaCrawlerStub.getLinkHref() != null
        && caixaCrawlerStub.getUrlBuscarResultado() != null) {
      uriBuilder.setPath(this.caixaCrawlerStub.getLinkHref() + this.caixaCrawlerStub.getUrlBuscarResultado());
      uriBuilder.addParameter("timestampAjax", Long.toString(System.currentTimeMillis()));

      if (caixaCrawlerStub.getConcurso() != null) {
        uriBuilder.addParameter("concurso", caixaCrawlerStub.getConcurso().toString());
      }
    }

    return uriBuilder.build().toString();
  }

  private URIBuilder getUriBuilder() throws URISyntaxException {
    StringBuilder url = new StringBuilder(BASE_URL);

    if (firstRequest) {
      url.append(HOME_URL_PATH + this.caixaGameType.getPath());
    }

    return new URIBuilder(url.toString());
  }

  public CaixaGameResult getMatchResult() {
    return JsonUtil.fromJson(caixaCrawlerStub.getHtmlContent(), CaixaGameResult.class);
  }

}