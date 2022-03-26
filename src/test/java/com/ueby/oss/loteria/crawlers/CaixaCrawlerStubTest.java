package com.ueby.oss.loteria.crawlers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
class CaixaCrawlerStubTest {

  @DisplayName("Getters and Setters of CaixaCrawlerStub")
  @Test
  void shouldNewInstanceOfCaixaCrawlerStub() {
    CaixaCrawlerStub caixaCrawlerStub = new CaixaCrawlerStub.Builder()
        .withConcurso(1955)
        .withResult("API response content")
        .build();

    Assertions.assertEquals(1955, caixaCrawlerStub.getConcurso());
    Assertions.assertEquals("API response content", caixaCrawlerStub.getResult());
  }

}
