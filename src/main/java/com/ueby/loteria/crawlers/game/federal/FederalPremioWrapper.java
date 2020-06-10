package com.ueby.loteria.crawlers.game.federal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;

/**
 * @author Algarves, Khristian
 */
public class FederalPremioWrapper extends BaseCaixaGameWrapper {

  private String extracao;
  private String planoSorteio;
  private String dataExtracao;
  private String premio1;
  private String premio2;
  private String premio3;
  private String premio4;
  private String premio5;
  private String observacao;
  private String informacao;
  private String icLocalSorteio;
  private String noCidade;
  private String sgUf;
  private String faixa;
  private String valor;
  private String series;
  private String tipoPlano;
  @JsonProperty(value = "co_bilhete")
  private String coBilhete;
  @JsonProperty(value = "qtde_bilhetes")
  private String qtdeBilhetes;
  private Boolean error;
  private String bilhete;
  private String noMunicipioCD;
  private String noSgUfCD;
  private String noFantasiaCD;

  public FederalPremioWrapper() {
  }

  public String getExtracao() {
    return extracao;
  }

  public void setExtracao(String extracao) {
    this.extracao = extracao;
  }

  public String getPlanoSorteio() {
    return planoSorteio;
  }

  public void setPlanoSorteio(String planoSorteio) {
    this.planoSorteio = planoSorteio;
  }

  public String getDataExtracao() {
    return dataExtracao;
  }

  public void setDataExtracao(String dataExtracao) {
    this.dataExtracao = dataExtracao;
  }

  public String getPremio1() {
    return premio1;
  }

  public void setPremio1(String premio1) {
    this.premio1 = premio1;
  }

  public String getPremio2() {
    return premio2;
  }

  public void setPremio2(String premio2) {
    this.premio2 = premio2;
  }

  public String getPremio3() {
    return premio3;
  }

  public void setPremio3(String premio3) {
    this.premio3 = premio3;
  }

  public String getPremio4() {
    return premio4;
  }

  public void setPremio4(String premio4) {
    this.premio4 = premio4;
  }

  public String getPremio5() {
    return premio5;
  }

  public void setPremio5(String premio5) {
    this.premio5 = premio5;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public String getInformacao() {
    return informacao;
  }

  public void setInformacao(String informacao) {
    this.informacao = informacao;
  }

  public String getIcLocalSorteio() {
    return icLocalSorteio;
  }

  public void setIcLocalSorteio(String icLocalSorteio) {
    this.icLocalSorteio = icLocalSorteio;
  }

  public String getNoCidade() {
    return noCidade;
  }

  public void setNoCidade(String noCidade) {
    this.noCidade = noCidade;
  }

  public String getSgUf() {
    return sgUf;
  }

  public void setSgUf(String sgUf) {
    this.sgUf = sgUf;
  }

  public String getFaixa() {
    return faixa;
  }

  public void setFaixa(String faixa) {
    this.faixa = faixa;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public String getTipoPlano() {
    return tipoPlano;
  }

  public void setTipoPlano(String tipoPlano) {
    this.tipoPlano = tipoPlano;
  }

  public String getCoBilhete() {
    return coBilhete;
  }

  public void setCoBilhete(String coBilhete) {
    this.coBilhete = coBilhete;
  }

  public String getQtdeBilhetes() {
    return qtdeBilhetes;
  }

  public void setQtdeBilhetes(String qtdeBilhetes) {
    this.qtdeBilhetes = qtdeBilhetes;
  }

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public String getBilhete() {
    return bilhete;
  }

  public void setBilhete(String bilhete) {
    this.bilhete = bilhete;
  }

  public String getNoMunicipioCD() {
    return noMunicipioCD;
  }

  public void setNoMunicipioCD(String noMunicipioCD) {
    this.noMunicipioCD = noMunicipioCD;
  }

  public String getNoSgUfCD() {
    return noSgUfCD;
  }

  public void setNoSgUfCD(String noSgUfCD) {
    this.noSgUfCD = noSgUfCD;
  }

  public String getNoFantasiaCD() {
    return noFantasiaCD;
  }

  public void setNoFantasiaCD(String noFantasiaCD) {
    this.noFantasiaCD = noFantasiaCD;
  }

}
