package com.ueby.loteria.crawlers.game.lotofacil;

import java.math.BigDecimal;

/**
 * @author Algarves, Khristian
 */
public class LotoFacilGanhadoresPorUfWrapper {

  private String coLoteria;
  private Integer nuConcurso;
  private String sgUf;
  private Integer qtGanhadores;
  private String noCidade;
  private BigDecimal total;
  private String icCanalEletronico;

  public LotoFacilGanhadoresPorUfWrapper() {
  }

  public String getCoLoteria() {
    return coLoteria;
  }

  public void setCoLoteria(String coLoteria) {
    this.coLoteria = coLoteria;
  }

  public Integer getNuConcurso() {
    return nuConcurso;
  }

  public void setNuConcurso(Integer nuConcurso) {
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

  public String getIcCanalEletronico() {
    return icCanalEletronico;
  }

  public void setIcCanalEletronico(String icCanalEletronico) {
    this.icCanalEletronico = icCanalEletronico;
  }

  @Override
  public String toString() {
    return "GanhadoresPorUf{" +
        "coLoteria='" + coLoteria + '\'' +
        ", nuConcurso=" + nuConcurso +
        ", sgUf='" + sgUf + '\'' +
        ", qtGanhadores=" + qtGanhadores +
        ", noCidade='" + noCidade + '\'' +
        ", total=" + total +
        ", icCanalEletronico='" + icCanalEletronico + '\'' +
        '}';
  }

}
