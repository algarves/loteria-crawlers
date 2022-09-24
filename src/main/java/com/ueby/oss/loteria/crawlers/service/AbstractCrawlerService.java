package com.ueby.oss.loteria.crawlers.service;

import com.ueby.oss.loteria.crawlers.exception.CaixaWebCrawlerException;
import com.ueby.oss.loteria.crawlers.util.SSLHelper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import lombok.extern.log4j.Log4j2;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * @author Algarves, Khristian
 */
@Log4j2
public abstract class AbstractCrawlerService {

  protected static final Long REQUEST_TIMEOUT = TimeUnit.MILLISECONDS.toSeconds(30); // 30sec

  protected Response get(String url) throws CaixaWebCrawlerException, IOException {
    CloseableHttpClient httpClient = createHttpClient();
    try {
      Executor executor = Executor.newInstance(httpClient);
      return executor.execute(
          Request.Get(url)
            .connectTimeout(REQUEST_TIMEOUT.intValue())
            .socketTimeout(REQUEST_TIMEOUT.intValue())
      );
    } catch (IOException ie) {
      log.error("An error occurred during the request - {}", url);
      throw new CaixaWebCrawlerException(ie.getLocalizedMessage(), ie);
    }
  }

  private static CloseableHttpClient createHttpClient() {
    PoolingHttpClientConnectionManager connectionManager = createConnectionManager();
    return HttpClientBuilder.create()
        .setConnectionManager(connectionManager)
        .build();
  }

  private static PoolingHttpClientConnectionManager createConnectionManager() {
    final Registry<ConnectionSocketFactory> sfr = RegistryBuilder.<ConnectionSocketFactory>create()
        .register("https", SSLHelper.socketFactory())
        .build();

    PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(
        sfr);
    connectionManager.setDefaultMaxPerRoute(100);
    connectionManager.setMaxTotal(200);
    connectionManager.setValidateAfterInactivity(1000);
    return connectionManager;
  }

}
