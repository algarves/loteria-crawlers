package com.ueby.loteria.crawlers.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class CaixaWebCrawlerFacadeExceptionTest {

  @Test
  public void shouldCaixaWebCrawlerExceptionTest() {
    Exception exception = Assertions.assertThrows(CaixaWebCrawlerException.class, () -> {
      throw new CaixaWebCrawlerException("Message example");
    });

    String expectedMessage = "Message example";
    String actualMessage = exception.getMessage();

    Assertions.assertTrue(actualMessage.contains(expectedMessage));
  }

}
