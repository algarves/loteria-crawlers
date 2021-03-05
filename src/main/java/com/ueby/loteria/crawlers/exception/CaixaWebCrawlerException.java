package com.ueby.loteria.crawlers.exception;

/**
 * @author Algarves, Khristian
 */
public class CaixaWebCrawlerException extends Exception {

  static final long serialVersionUID = 1L;

  public CaixaWebCrawlerException(String message) {
    super(message);
  }

  public CaixaWebCrawlerException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
