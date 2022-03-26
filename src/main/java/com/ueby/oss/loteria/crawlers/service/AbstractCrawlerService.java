package com.ueby.oss.loteria.crawlers.service;

import com.ueby.oss.loteria.crawlers.exception.CaixaWebCrawlerException;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author Algarves, Khristian
 */
public abstract class AbstractCrawlerService {

  protected static final Long REQUEST_TIMEOUT = TimeUnit.MILLISECONDS.toSeconds(30); // 30sec

  protected Response get(String url) throws CaixaWebCrawlerException {
    try {
      return Request.Get(url)
          .connectTimeout(REQUEST_TIMEOUT.intValue())
          .socketTimeout(REQUEST_TIMEOUT.intValue())
          .execute();
    } catch (IOException ie) {
      throw new CaixaWebCrawlerException(ie.getLocalizedMessage(), ie);
    }
  }

}
