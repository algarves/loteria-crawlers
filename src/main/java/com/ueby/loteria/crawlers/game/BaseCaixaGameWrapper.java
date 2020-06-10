package com.ueby.loteria.crawlers.game;

import java.util.List;

/**
 * @author Algarves, Khristian
 */
public abstract class BaseCaixaGameWrapper {

  protected String proximoConcurso;
  protected String concursoAnterior;
  protected String forward;
  protected List<String> mensagens;

  public BaseCaixaGameWrapper() {
  }

  public String getProximoConcurso() {
    return proximoConcurso;
  }

  public void setProximoConcurso(String proximoConcurso) {
    this.proximoConcurso = proximoConcurso;
  }

  public String getConcursoAnterior() {
    return concursoAnterior;
  }

  public void setConcursoAnterior(String concursoAnterior) {
    this.concursoAnterior = concursoAnterior;
  }

  public String getForward() {
    return forward;
  }

  public void setForward(String forward) {
    this.forward = forward;
  }

  public List<String> getMensagens() {
    return mensagens;
  }

  public void setMensagens(List<String> mensagens) {
    this.mensagens = mensagens;
  }

}
