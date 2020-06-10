package com.ueby.loteria.crawlers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class CaixaCrawlerStubTest {

  @DisplayName("Getters and Setters of CaixaCrawlerStub")
  @Test
  public void shouldNewInstanceOfCaixaCrawlerStub() {
    CaixaCrawlerStub caixaCrawlerStub = new CaixaCrawlerStub();
    caixaCrawlerStub.setLinkHref("LinkHref");
    caixaCrawlerStub.setUrlBuscarResultado("UrlBuscarResultado");
    caixaCrawlerStub.setConcourse(1955);
    caixaCrawlerStub.setHtmlContent("Html content");

    String linkHref = caixaCrawlerStub.getLinkHref();
    String urlBuscarResultado = caixaCrawlerStub.getUrlBuscarResultado();
    Integer concouse = caixaCrawlerStub.getConcourse();
    String htmlContent = caixaCrawlerStub.getHtmlContent();

    Assertions.assertEquals("LinkHref", linkHref);
    Assertions.assertEquals("UrlBuscarResultado", urlBuscarResultado);
    Assertions.assertEquals(1955, concouse);
    Assertions.assertEquals("Html content", htmlContent);
  }

}
