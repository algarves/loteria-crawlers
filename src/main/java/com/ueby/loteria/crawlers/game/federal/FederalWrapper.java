package com.ueby.loteria.crawlers.game.federal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class FederalWrapper extends BaseCaixaGameWrapper {

  @JsonProperty(value = "premios")
  private List<FederalPremioWrapper> premioWrapper;
  private String cidade;
  private String observacao;
  private String data;
  private String concurso;
  private String ufSorteio;

  public FederalWrapper() {
  }

  public List<FederalPremioWrapper> getPremioWrapper() {
    return premioWrapper;
  }

  public void setPremioWrapper(
      List<FederalPremioWrapper> premioWrapper) {
    this.premioWrapper = premioWrapper;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getConcurso() {
    return concurso;
  }

  public void setConcurso(String concurso) {
    this.concurso = concurso;
  }

  public String getUfSorteio() {
    return ufSorteio;
  }

  public void setUfSorteio(String ufSorteio) {
    this.ufSorteio = ufSorteio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    FederalWrapper that = (FederalWrapper) o;

    return getConcurso().equals(that.getConcurso());
  }

  @Override
  public int hashCode() {
    return getConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "FederalWrapper{" +
        "premioWrapper=" + premioWrapper +
        ", cidade='" + cidade + '\'' +
        ", observacao='" + observacao + '\'' +
        ", data='" + data + '\'' +
        ", concurso='" + concurso + '\'' +
        ", ufSorteio='" + ufSorteio + '\'' +
        '}';
  }

}
