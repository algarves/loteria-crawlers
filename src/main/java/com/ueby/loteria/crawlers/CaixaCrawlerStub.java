package com.ueby.loteria.crawlers;

/**
 * @author Algarves, Algarves
 */
public class CaixaCrawlerStub {

  private String linkHref;
  private String urlBuscarResultado;
  private Integer concourse;
  private String htmlContent;

  public CaixaCrawlerStub() {
  }

  public String getLinkHref() {
    return linkHref;
  }

  public void setLinkHref(String linkHref) {
    this.linkHref = linkHref;
  }

  public String getUrlBuscarResultado() {
    return urlBuscarResultado;
  }

  public void setUrlBuscarResultado(String urlBuscarResultado) {
    this.urlBuscarResultado = urlBuscarResultado;
  }

  public Integer getConcourse() {
    return concourse;
  }

  public void setConcourse(Integer concourse) {
    this.concourse = concourse;
  }

  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public String getPath() {
    return linkHref + urlBuscarResultado;
  }

}
