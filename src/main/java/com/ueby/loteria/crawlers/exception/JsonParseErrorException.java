package com.ueby.loteria.crawlers.exception;

/**
 * @author Algarves, Khristian
 */
public class JsonParseErrorException extends RuntimeException {

  static final long serialVersionUID = 1L;

  public JsonParseErrorException(String message) {
    super(message);
  }

  public JsonParseErrorException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
