package com.ueby.loteria.crawlers;

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
        .withLinkHref("LinkHref")
        .withUrlBuscarResultado("UrlBuscarResultado")
        .withConcurso(1955)
        .withHtmlContent("Html content")
        .build();

    Assertions.assertEquals("LinkHref", caixaCrawlerStub.getLinkHref());
    Assertions.assertEquals("UrlBuscarResultado", caixaCrawlerStub.getUrlBuscarResultado());
    Assertions.assertEquals(1955, caixaCrawlerStub.getConcurso());
    Assertions.assertEquals("Html content", caixaCrawlerStub.getHtmlContent());
  }

}
