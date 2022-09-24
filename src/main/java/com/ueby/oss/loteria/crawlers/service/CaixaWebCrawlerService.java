package com.ueby.oss.loteria.crawlers.service;

import com.ueby.oss.loteria.crawlers.CaixaCrawlerStub;
import com.ueby.oss.loteria.crawlers.CaixaGameType;
import com.ueby.oss.loteria.crawlers.exception.CaixaWebCrawlerException;
import com.ueby.oss.loteria.crawlers.game.CaixaGameResult;
import com.ueby.oss.loteria.crawlers.util.JsonUtil;
import com.ueby.oss.loteria.crawlers.util.RandomUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import lombok.extern.log4j.Log4j2;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author Algarves, Khristian
 */
@Log4j2
public class CaixaWebCrawlerService extends AbstractCrawlerService {

  private static final String API_BASE_URL = "https://servicebus2.caixa.gov.br/portaldeloterias/api";

  private static final int MAX_ATTEMPTS = 5;
  private int attempts = 1;

  final CaixaGameType caixaGameType;
  final CaixaCrawlerStub caixaCrawlerStub;

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
   * @throws InterruptedException When the process is interrupted.
   */
  private void recall() throws InterruptedException {
    if (attempts <= MAX_ATTEMPTS) {
      long threadSleep = getSleep();

      log.warn(String.format("Await (%s) seconds ...", threadSleep));
      Thread.sleep(threadSleep);
      log.warn("New try ...");

      call();
      attempts++;
    } else {
      throw new InterruptedException("Oops! Number of attempts exhausted.");
    }
  }

  private long getSleep() {
    return TimeUnit.SECONDS.toMillis(RandomUtil.getRandomNumInRange(1, 5));
  }

  private void call() {
    try {
      final String url = getUriBuilder().toString();

      log.debug("Request URL '{}' - {}", caixaGameType, url);

      Response response = get(url);

      final HttpResponse httpResponse = response.returnResponse();
      final StatusLine responseStatus = httpResponse.getStatusLine();
      final String responseEntity = EntityUtils.toString(httpResponse.getEntity());

      log.debug("Response status - {}", responseStatus.getStatusCode());

      if (HttpStatus.SC_OK == responseStatus.getStatusCode()) {
        checkContent(responseEntity);
      } else {
        throw new CaixaWebCrawlerException("[" + responseStatus.getStatusCode() + "] - " +
            responseStatus.getReasonPhrase());
      }
    } catch (CaixaWebCrawlerException e) {
      log.error(e.getMessage(), e);
      try {
        recall();
      } catch (InterruptedException ie) {
        log.fatal(ie.getLocalizedMessage(), ie);
        Thread.currentThread().interrupt();
      }
    } catch (IOException | URISyntaxException ex) {
      log.error(ex.getLocalizedMessage(), ex);
    }
  }

  private void checkContent(String responseEntity) {
    caixaCrawlerStub.setResult(responseEntity);
  }

  private URIBuilder getUriBuilder() throws URISyntaxException {
    StringBuilder url = new StringBuilder(API_BASE_URL);

    url.append(caixaGameType.getPath());

    if (caixaCrawlerStub.getConcurso() != null) {
      url.append(caixaCrawlerStub.getConcurso());
    }

    return new URIBuilder(url.toString());
  }

  public CaixaGameResult getMatchResult() {
    return JsonUtil.fromJson(caixaCrawlerStub.getResult(), CaixaGameResult.class);
  }

}
