package com.ueby.oss.loteria.crawlers.util;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

public class SSLHelper {

  public static SSLConnectionSocketFactory socketFactory() {
    TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
      }

      public void checkClientTrusted(X509Certificate[] certs, String authType) {
      }

      public void checkServerTrusted(X509Certificate[] certs, String authType) {
      }
    } };

    try {
      SSLContext sslContext = SSLContext.getInstance("SSL");
      sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

      return new SSLConnectionSocketFactory(sslContext);
    } catch (NoSuchAlgorithmException | KeyManagementException e) {
      throw new RuntimeException("Failed to create a SSL socket factory", e);
    }
  }
}
