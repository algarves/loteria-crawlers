package com.ueby.loteria.crawlers.game.lotomania;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class LotoManiaWrapper extends BaseCaixaGameWrapper {

  private Integer concurso;
  private Long dtApuracao;
  private String deObservacao;
  private String deResultado;
  private Integer qtGanhadoresFaixa1;
  private Integer qtGanhadoresFaixa2;
  private Integer qtGanhadoresFaixa3;
  private Integer qtGanhadoresFaixa4;
  private Integer qtGanhadoresFaixa5;
  private Integer qtGanhadoresFaixa6;
  private Integer qtGanhadoresFaixa7;
  private BigDecimal vrRateioFaixa1;
  private BigDecimal vrRateioFaixa2;
  private BigDecimal vrRateioFaixa3;
  private BigDecimal vrRateioFaixa4;
  private BigDecimal vrRateioFaixa5;
  private BigDecimal vrRateioFaixa6;
  private BigDecimal vrRateioFaixa7;
  private BigDecimal vrAcumuladoFaixa1;
  private BigDecimal vrAcumuladoFaixa2;
  private BigDecimal vrAcumuladoFaixa3;
  private BigDecimal vrAcumuladoFaixa4;
  private BigDecimal vrAcumuladoFaixa5;
  private BigDecimal vrAcumuladoFaixa6;
  private BigDecimal vrAcumuladoFaixa7;
  private Long dtInclusao;
  private String icConferido;
  private String icLocalSorteio;
  private String noCidade;
  private String sgUf;
  private BigDecimal vrEstimativa;
  private Long dtProximoConcurso;
  private BigDecimal vrArrecadado;
  private BigDecimal vrAcumuladoEspecial;
  private String totalAcumulado;
  private Boolean sorteioAcumulado;
  private Boolean error;
  private Boolean rateioProcessamento;
  private Boolean acumuladoPascoa;
  private String localSorteio;
  @JsonProperty(value = "ganhadoresPorRegiao1")
  private List<LotoManiaGanhadoresPorRegiao1> ganhadoresPorRegiao1;
  @JsonProperty(value = "ganhadoresPorRegiao2")
  private List<LotoManiaGanhadoresPorRegiao2> ganhadoresPorRegiao2;
  private String resultadoOrdenado;
  private String dtApuracaoStr;
  private String dtProximoConcursoStr;
  private Boolean especialPascoa;

  public LotoManiaWrapper() {
  }

  public Integer getConcurso() {
    return concurso;
  }

  public void setConcurso(Integer concurso) {
    this.concurso = concurso;
  }

  public Long getDtApuracao() {
    return dtApuracao;
  }

  public void setDtApuracao(Long dtApuracao) {
    this.dtApuracao = dtApuracao;
  }

  public String getDeObservacao() {
    return deObservacao;
  }

  public void setDeObservacao(String deObservacao) {
    this.deObservacao = deObservacao;
  }

  public String getDeResultado() {
    return deResultado;
  }

  public void setDeResultado(String deResultado) {
    this.deResultado = deResultado;
  }

  public Integer getQtGanhadoresFaixa1() {
    return qtGanhadoresFaixa1;
  }

  public void setQtGanhadoresFaixa1(Integer qtGanhadoresFaixa1) {
    this.qtGanhadoresFaixa1 = qtGanhadoresFaixa1;
  }

  public Integer getQtGanhadoresFaixa2() {
    return qtGanhadoresFaixa2;
  }

  public void setQtGanhadoresFaixa2(Integer qtGanhadoresFaixa2) {
    this.qtGanhadoresFaixa2 = qtGanhadoresFaixa2;
  }

  public Integer getQtGanhadoresFaixa3() {
    return qtGanhadoresFaixa3;
  }

  public void setQtGanhadoresFaixa3(Integer qtGanhadoresFaixa3) {
    this.qtGanhadoresFaixa3 = qtGanhadoresFaixa3;
  }

  public Integer getQtGanhadoresFaixa4() {
    return qtGanhadoresFaixa4;
  }

  public void setQtGanhadoresFaixa4(Integer qtGanhadoresFaixa4) {
    this.qtGanhadoresFaixa4 = qtGanhadoresFaixa4;
  }

  public Integer getQtGanhadoresFaixa5() {
    return qtGanhadoresFaixa5;
  }

  public void setQtGanhadoresFaixa5(Integer qtGanhadoresFaixa5) {
    this.qtGanhadoresFaixa5 = qtGanhadoresFaixa5;
  }

  public Integer getQtGanhadoresFaixa6() {
    return qtGanhadoresFaixa6;
  }

  public void setQtGanhadoresFaixa6(Integer qtGanhadoresFaixa6) {
    this.qtGanhadoresFaixa6 = qtGanhadoresFaixa6;
  }

  public Integer getQtGanhadoresFaixa7() {
    return qtGanhadoresFaixa7;
  }

  public void setQtGanhadoresFaixa7(Integer qtGanhadoresFaixa7) {
    this.qtGanhadoresFaixa7 = qtGanhadoresFaixa7;
  }

  public BigDecimal getVrRateioFaixa1() {
    return vrRateioFaixa1;
  }

  public void setVrRateioFaixa1(BigDecimal vrRateioFaixa1) {
    this.vrRateioFaixa1 = vrRateioFaixa1;
  }

  public BigDecimal getVrRateioFaixa2() {
    return vrRateioFaixa2;
  }

  public void setVrRateioFaixa2(BigDecimal vrRateioFaixa2) {
    this.vrRateioFaixa2 = vrRateioFaixa2;
  }

  public BigDecimal getVrRateioFaixa3() {
    return vrRateioFaixa3;
  }

  public void setVrRateioFaixa3(BigDecimal vrRateioFaixa3) {
    this.vrRateioFaixa3 = vrRateioFaixa3;
  }

  public BigDecimal getVrRateioFaixa4() {
    return vrRateioFaixa4;
  }

  public void setVrRateioFaixa4(BigDecimal vrRateioFaixa4) {
    this.vrRateioFaixa4 = vrRateioFaixa4;
  }

  public BigDecimal getVrRateioFaixa5() {
    return vrRateioFaixa5;
  }

  public void setVrRateioFaixa5(BigDecimal vrRateioFaixa5) {
    this.vrRateioFaixa5 = vrRateioFaixa5;
  }

  public BigDecimal getVrRateioFaixa6() {
    return vrRateioFaixa6;
  }

  public void setVrRateioFaixa6(BigDecimal vrRateioFaixa6) {
    this.vrRateioFaixa6 = vrRateioFaixa6;
  }

  public BigDecimal getVrRateioFaixa7() {
    return vrRateioFaixa7;
  }

  public void setVrRateioFaixa7(BigDecimal vrRateioFaixa7) {
    this.vrRateioFaixa7 = vrRateioFaixa7;
  }

  public BigDecimal getVrAcumuladoFaixa1() {
    return vrAcumuladoFaixa1;
  }

  public void setVrAcumuladoFaixa1(BigDecimal vrAcumuladoFaixa1) {
    this.vrAcumuladoFaixa1 = vrAcumuladoFaixa1;
  }

  public BigDecimal getVrAcumuladoFaixa2() {
    return vrAcumuladoFaixa2;
  }

  public void setVrAcumuladoFaixa2(BigDecimal vrAcumuladoFaixa2) {
    this.vrAcumuladoFaixa2 = vrAcumuladoFaixa2;
  }

  public BigDecimal getVrAcumuladoFaixa3() {
    return vrAcumuladoFaixa3;
  }

  public void setVrAcumuladoFaixa3(BigDecimal vrAcumuladoFaixa3) {
    this.vrAcumuladoFaixa3 = vrAcumuladoFaixa3;
  }

  public BigDecimal getVrAcumuladoFaixa4() {
    return vrAcumuladoFaixa4;
  }

  public void setVrAcumuladoFaixa4(BigDecimal vrAcumuladoFaixa4) {
    this.vrAcumuladoFaixa4 = vrAcumuladoFaixa4;
  }

  public BigDecimal getVrAcumuladoFaixa5() {
    return vrAcumuladoFaixa5;
  }

  public void setVrAcumuladoFaixa5(BigDecimal vrAcumuladoFaixa5) {
    this.vrAcumuladoFaixa5 = vrAcumuladoFaixa5;
  }

  public BigDecimal getVrAcumuladoFaixa6() {
    return vrAcumuladoFaixa6;
  }

  public void setVrAcumuladoFaixa6(BigDecimal vrAcumuladoFaixa6) {
    this.vrAcumuladoFaixa6 = vrAcumuladoFaixa6;
  }

  public BigDecimal getVrAcumuladoFaixa7() {
    return vrAcumuladoFaixa7;
  }

  public void setVrAcumuladoFaixa7(BigDecimal vrAcumuladoFaixa7) {
    this.vrAcumuladoFaixa7 = vrAcumuladoFaixa7;
  }

  public Long getDtInclusao() {
    return dtInclusao;
  }

  public void setDtInclusao(Long dtInclusao) {
    this.dtInclusao = dtInclusao;
  }

  public String getIcConferido() {
    return icConferido;
  }

  public void setIcConferido(String icConferido) {
    this.icConferido = icConferido;
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

  public BigDecimal getVrEstimativa() {
    return vrEstimativa;
  }

  public void setVrEstimativa(BigDecimal vrEstimativa) {
    this.vrEstimativa = vrEstimativa;
  }

  public Long getDtProximoConcurso() {
    return dtProximoConcurso;
  }

  public void setDtProximoConcurso(Long dtProximoConcurso) {
    this.dtProximoConcurso = dtProximoConcurso;
  }

  public BigDecimal getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(BigDecimal vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
  }

  public BigDecimal getVrAcumuladoEspecial() {
    return vrAcumuladoEspecial;
  }

  public void setVrAcumuladoEspecial(BigDecimal vrAcumuladoEspecial) {
    this.vrAcumuladoEspecial = vrAcumuladoEspecial;
  }

  public String getTotalAcumulado() {
    return totalAcumulado;
  }

  public void setTotalAcumulado(String totalAcumulado) {
    this.totalAcumulado = totalAcumulado;
  }

  public Boolean getSorteioAcumulado() {
    return sorteioAcumulado;
  }

  public void setSorteioAcumulado(Boolean sorteioAcumulado) {
    this.sorteioAcumulado = sorteioAcumulado;
  }

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public Boolean getRateioProcessamento() {
    return rateioProcessamento;
  }

  public void setRateioProcessamento(Boolean rateioProcessamento) {
    this.rateioProcessamento = rateioProcessamento;
  }

  public Boolean getAcumuladoPascoa() {
    return acumuladoPascoa;
  }

  public void setAcumuladoPascoa(Boolean acumuladoPascoa) {
    this.acumuladoPascoa = acumuladoPascoa;
  }

  public String getLocalSorteio() {
    return localSorteio;
  }

  public void setLocalSorteio(String localSorteio) {
    this.localSorteio = localSorteio;
  }

  public List<LotoManiaGanhadoresPorRegiao1> getGanhadoresPorRegiao1() {
    return ganhadoresPorRegiao1;
  }

  public void setGanhadoresPorRegiao1(
      List<LotoManiaGanhadoresPorRegiao1> ganhadoresPorRegiao1) {
    this.ganhadoresPorRegiao1 = ganhadoresPorRegiao1;
  }

  public List<LotoManiaGanhadoresPorRegiao2> getGanhadoresPorRegiao2() {
    return ganhadoresPorRegiao2;
  }

  public void setGanhadoresPorRegiao2(
      List<LotoManiaGanhadoresPorRegiao2> ganhadoresPorRegiao2) {
    this.ganhadoresPorRegiao2 = ganhadoresPorRegiao2;
  }

  public String getResultadoOrdenado() {
    return resultadoOrdenado;
  }

  public void setResultadoOrdenado(String resultadoOrdenado) {
    this.resultadoOrdenado = resultadoOrdenado;
  }

  public String getDtApuracaoStr() {
    return dtApuracaoStr;
  }

  public void setDtApuracaoStr(String dtApuracaoStr) {
    this.dtApuracaoStr = dtApuracaoStr;
  }

  public String getDtProximoConcursoStr() {
    return dtProximoConcursoStr;
  }

  public void setDtProximoConcursoStr(String dtProximoConcursoStr) {
    this.dtProximoConcursoStr = dtProximoConcursoStr;
  }

  public Boolean getEspecialPascoa() {
    return especialPascoa;
  }

  public void setEspecialPascoa(Boolean especialPascoa) {
    this.especialPascoa = especialPascoa;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    LotoManiaWrapper that = (LotoManiaWrapper) o;

    return getConcurso().equals(that.getConcurso());
  }

  @Override
  public int hashCode() {
    return getConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "LotomaniaWrapper{" +
        "concurso=" + concurso +
        ", dtApuracao=" + dtApuracao +
        ", deObservacao='" + deObservacao + '\'' +
        ", deResultado='" + deResultado + '\'' +
        ", qtGanhadoresFaixa1=" + qtGanhadoresFaixa1 +
        ", qtGanhadoresFaixa2=" + qtGanhadoresFaixa2 +
        ", qtGanhadoresFaixa3=" + qtGanhadoresFaixa3 +
        ", qtGanhadoresFaixa4=" + qtGanhadoresFaixa4 +
        ", qtGanhadoresFaixa5=" + qtGanhadoresFaixa5 +
        ", qtGanhadoresFaixa6=" + qtGanhadoresFaixa6 +
        ", qtGanhadoresFaixa7=" + qtGanhadoresFaixa7 +
        ", vrRateioFaixa1=" + vrRateioFaixa1 +
        ", vrRateioFaixa2=" + vrRateioFaixa2 +
        ", vrRateioFaixa3=" + vrRateioFaixa3 +
        ", vrRateioFaixa4=" + vrRateioFaixa4 +
        ", vrRateioFaixa5=" + vrRateioFaixa5 +
        ", vrRateioFaixa6=" + vrRateioFaixa6 +
        ", vrRateioFaixa7=" + vrRateioFaixa7 +
        ", vrAcumuladoFaixa1=" + vrAcumuladoFaixa1 +
        ", vrAcumuladoFaixa2=" + vrAcumuladoFaixa2 +
        ", vrAcumuladoFaixa3=" + vrAcumuladoFaixa3 +
        ", vrAcumuladoFaixa4=" + vrAcumuladoFaixa4 +
        ", vrAcumuladoFaixa5=" + vrAcumuladoFaixa5 +
        ", vrAcumuladoFaixa6=" + vrAcumuladoFaixa6 +
        ", vrAcumuladoFaixa7=" + vrAcumuladoFaixa7 +
        ", dtInclusao=" + dtInclusao +
        ", icConferido='" + icConferido + '\'' +
        ", icLocalSorteio='" + icLocalSorteio + '\'' +
        ", noCidade='" + noCidade + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", vrEstimativa=" + vrEstimativa +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", vrArrecadado=" + vrArrecadado +
        ", vrAcumuladoEspecial=" + vrAcumuladoEspecial +
        ", totalAcumulado='" + totalAcumulado + '\'' +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", error=" + error +
        ", rateioProcessamento=" + rateioProcessamento +
        ", acumuladoPascoa=" + acumuladoPascoa +
        ", localSorteio='" + localSorteio + '\'' +
        ", ganhadoresPorRegiao1=" + ganhadoresPorRegiao1 +
        ", ganhadoresPorRegiao2=" + ganhadoresPorRegiao2 +
        ", resultadoOrdenado='" + resultadoOrdenado + '\'' +
        ", dtApuracaoStr='" + dtApuracaoStr + '\'' +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        ", especialPascoa=" + especialPascoa +
        '}';
  }

}
