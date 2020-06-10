package com.ueby.loteria.crawlers;

import com.ueby.loteria.crawlers.exception.CaixaWebCrawlerException;
import com.ueby.loteria.crawlers.util.JsonUtil;
import com.ueby.loteria.crawlers.util.RandomUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * @author Algarves, Khristian
 */
public class CaixaWebCrawlerFacade {

  private static final Logger LOGGER = LogManager.getLogger(CaixaWebCrawlerFacade.class);

  private static final Long REQUEST_TIMEOUT = TimeUnit.SECONDS.toMillis(30); // 30sec

  private static final String BASE_URL = "http://www.loterias.caixa.gov.br";
  private static final String GAME_URL = "http://loterias.caixa.gov.br";
  private static final String HOME_URL_PATH = "/wps/portal/loterias";

  private static final String HTML_ELEMENT_FIRST = "com.ibm.lotus.NavStateUrl";
  private static final String HTML_ELEMENT_SECOND = "input[type=hidden][id=urlBuscarResultado]";
  private static final String HTML_DOCTYPE = "<!DOCTYPE";

  private static final int MAX_ATTEMPTS = 5;
  private int attempts = 1;

  private boolean firstRequest = true;

  CaixaGameTypesEnum caixaGameTypesEnum;
  CaixaCrawlerStub caixaCrawlerStub;
  String url;

  public CaixaWebCrawlerFacade(CaixaGameTypesEnum caixaGameTypesEnum) {
    this.caixaCrawlerStub = new CaixaCrawlerStub();
    this.caixaGameTypesEnum = caixaGameTypesEnum;
    init();
  }

  public CaixaWebCrawlerFacade init() {
    call();
    return this;
  }

  public CaixaWebCrawlerFacade byLastContest() {
    return init();
  }

  public CaixaWebCrawlerFacade byContestNumber(final int concourse) {
    caixaCrawlerStub.setConcourse(concourse);
    call();
    return this;
  }

  private void recall() throws InterruptedException, CaixaWebCrawlerException {
    if (attempts <= MAX_ATTEMPTS) {
      int threadSleep = RandomUtil
          .getRandomNumInRange(1, (int) TimeUnit.MILLISECONDS.toSeconds(REQUEST_TIMEOUT));
      LOGGER.warn("Await ...");
      Thread.sleep(TimeUnit.SECONDS.toMillis(threadSleep));
      LOGGER.warn("New try ...");
      call();
      attempts++;
    } else {
      LOGGER.fatal("Oops! Number of attempts exhausted.");
      throw new CaixaWebCrawlerException("Oops! Number of attempts exhausted.");
    }
  }

  private void call() {
    try {
      URIBuilder uriBuilder = newUrlBuilder();

      if (caixaCrawlerStub.getLinkHref() != null
          && caixaCrawlerStub.getUrlBuscarResultado() != null) {
        uriBuilder.setPath(
            caixaCrawlerStub.getPath());
        uriBuilder.addParameter("timestampAjax", Long.toString(System.currentTimeMillis()));

        if (caixaCrawlerStub.getConcourse() != null) {
          uriBuilder.addParameter("concurso", caixaCrawlerStub.getConcourse().toString());
        }
      }

      this.url = uriBuilder.build().toString();

      LOGGER.debug("URL: {}", this.url);

      Response response = Request.Get(this.url)
          .connectTimeout(REQUEST_TIMEOUT.intValue())
          .socketTimeout(REQUEST_TIMEOUT.intValue())
          .execute();

      final HttpResponse httpResponse = response.returnResponse();
      final StatusLine responseStatus = httpResponse.getStatusLine();
      final String html = EntityUtils.toString(httpResponse.getEntity());

      LOGGER.debug("Response content: {}", html);

      if (HttpStatus.SC_OK == responseStatus.getStatusCode()) {
        Document doc = Jsoup.parse(html);
        Element link = doc.getElementById(HTML_ELEMENT_FIRST);
        Element input = doc.select(HTML_ELEMENT_SECOND).first();

        if (firstRequest) {
          if (link != null) {
            String linkHref = link.attr("href");
            caixaCrawlerStub.setLinkHref(linkHref);
          } else {
            LOGGER.error("Oops! I couldn't find the first element '" + HTML_ELEMENT_FIRST + "'.");
            // Invalid result for the request. You must call the recursive method
            recall();
          }

          if (input != null) {
            String inputValue = input.attr("value");
            caixaCrawlerStub.setUrlBuscarResultado(inputValue);
          } else {
            LOGGER.error("Oops! I couldn't find the second element '" + HTML_ELEMENT_SECOND + "'.");
            // Invalid result for the request. You must call the recursive method
            recall();
          }
        } else if (html.startsWith(HTML_DOCTYPE)) {
          LOGGER.error("Oops! No valid content.");
          // Invalid result for the request. You must call the recursive method
          recall();
        }

        if (html != null) {
          if (!html.startsWith(HTML_DOCTYPE)) {
            caixaCrawlerStub.setHtmlContent(html);
          }

          firstRequest = false;
        } else {
          recall();
        }
      } else {
        // Invalid result for the request. You must call the recursive method
        LOGGER.error("[" + responseStatus.getStatusCode() + "] - {} ",
            responseStatus.getReasonPhrase());
        recall();
      }
    } catch (URISyntaxException e) {
      LOGGER.fatal(e.getLocalizedMessage(), e);
    } catch (IOException e) {
      LOGGER.fatal(e.getLocalizedMessage(), e);
    } catch (Exception e) {
      LOGGER.error(e.getLocalizedMessage(), e);
    }
  }

  private URIBuilder newUrlBuilder() throws URISyntaxException {
    if (firstRequest) {
      this.url = GAME_URL + HOME_URL_PATH + this.caixaGameTypesEnum.getPath();
    } else {
      this.url = BASE_URL;
    }
    return new URIBuilder(this.url);
  }

  @SuppressWarnings("unchecked")
  public <A> A getMatchResult() {
    return (A) JsonUtil
        .fromJson(caixaCrawlerStub.getHtmlContent(), this.caixaGameTypesEnum.getClazz());
  }

  public CaixaCrawlerStub getCaixaCrawlerStub() {
    return this.caixaCrawlerStub;
  }

}