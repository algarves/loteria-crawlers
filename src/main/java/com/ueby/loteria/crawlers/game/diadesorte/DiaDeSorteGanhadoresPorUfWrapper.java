package com.ueby.loteria.crawlers.game.diadesorte;

import java.math.BigDecimal;

/**
 * @author Algarves, Khristian
 */
public class DiaDeSorteGanhadoresPorUfWrapper {

  private String coLoteria;
  private String nuConcurso;
  private String sgUf;
  private Integer qtGanhadores;
  private String noCidade;
  private BigDecimal total;
  private Boolean icCanalEletronico;

  public DiaDeSorteGanhadoresPorUfWrapper() {
  }

  public String getCoLoteria() {
    return coLoteria;
  }

  public void setCoLoteria(String coLoteria) {
    this.coLoteria = coLoteria;
  }

  public String getNuConcurso() {
    return nuConcurso;
  }

  public void setNuConcurso(String nuConcurso) {
    this.nuConcurso = nuConcurso;
  }

  public String getSgUf() {
    return sgUf;
  }

  public void setSgUf(String sgUf) {
    this.sgUf = sgUf;
  }

  public Integer getQtGanhadores() {
    return qtGanhadores;
  }

  public void setQtGanhadores(Integer qtGanhadores) {
    this.qtGanhadores = qtGanhadores;
  }

  public String getNoCidade() {
    return noCidade;
  }

  public void setNoCidade(String noCidade) {
    this.noCidade = noCidade;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Boolean getIcCanalEletronico() {
    return icCanalEletronico;
  }

  public void setIcCanalEletronico(Boolean icCanalEletronico) {
    this.icCanalEletronico = icCanalEletronico;
  }

}
