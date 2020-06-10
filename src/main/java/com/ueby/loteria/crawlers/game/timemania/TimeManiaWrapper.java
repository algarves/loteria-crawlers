package com.ueby.loteria.crawlers.game.timemania;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class TimeManiaWrapper extends BaseCaixaGameWrapper {

  @JsonProperty(value = "de_local_sorteio1")
  private String deLocalSorteio1;
  private Boolean error;
  private Boolean sorteioAcumulado;
  private Boolean rateioProcessamento;
  private String localSorteio;
  private String legendaFinal;
  private String timeCoracao;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<TimeManiaGanhadoresPorUfWrapper> ganhadoresPorUf;
  private String resultadoOrdenado;
  @JsonProperty(value = "nu_CONCURSO")
  private String nuConcurso;
  @JsonProperty(value = "de_RESULTADO")
  private String deResultado;
  @JsonProperty(value = "de_OBSERVACAO")
  private String deObservacao;
  @JsonProperty(value = "sg_UF")
  private String sgUf;
  @JsonProperty(value = "no_CIDADE")
  private String noCidade;
  @JsonProperty(value = "co_TIME_CORACAO")
  private String coTimeCoracao;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_1")
  private String qtGanhadorFaixa1;
  @JsonProperty(value = "vr_RATEIO_FAIXA_1")
  private BigDecimal vrRateioFaixa1;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_2")
  private Integer qtGanhadorFaixa2;
  @JsonProperty(value = "vr_RATEIO_FAIXA_2")
  private BigDecimal vrRaterioFaixa2;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_3")
  private Integer qtGanhadorFaixa3;
  @JsonProperty(value = "vr_RATEIO_FAIXA_3")
  private BigDecimal vrRateioFaixa3;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_4")
  private Integer qtGanhadorFaixa4;
  @JsonProperty(value = "vr_RATEIO_FAIXA_4")
  private BigDecimal vrRateioFaixa4;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_5")
  private Integer qtGanhadorFaixa5;
  @JsonProperty(value = "vr_RATEIO_FAIXA_5")
  private BigDecimal vrRateioFaixa5;
  @JsonProperty(value = "qt_GANHADOR_TIME_CORACAO")
  private String qtGanhadorTimeCoracao;
  @JsonProperty(value = "vr_RATEIO_TIME_CORACAO")
  private BigDecimal vrRateioTimeCoracao;
  @JsonProperty(value = "vr_ACUMULADO_FAIXA_1")
  private BigDecimal vrAcumuladoFaixa1;
  @JsonProperty(value = "vr_ESTIMATIVA_FAIXA_1")
  private BigDecimal vrEstimativaFaixa1;
  @JsonProperty(value = "nu_PROXIMO_CONCURSO_FINAL_0_5")
  private String nuProximoConcursoFinal05;
  @JsonProperty(value = "vr_ACUMULADO_PROXIMO_CONCURSO")
  private BigDecimal vrAcumuladoProximoConcurso;
  @JsonProperty(value = "nu_CONFIGURACAO")
  private String nuConfiguracao;
  @JsonProperty(value = "ic_CONFERIDO")
  private String icConferido;
  @JsonProperty(value = "vr_ACUMULADO_FAIXA_2")
  private BigDecimal vrAcumuladoFaixa2;
  @JsonProperty(value = "vr_ACUMULADO_FAIXA_3")
  private BigDecimal vrAcumuladoFaixa3;
  @JsonProperty(value = "vr_ARRECADADO")
  private BigDecimal vrArrecadado;
  @JsonProperty(value = "dt_APURACAO")
  private Long dtApuracao;
  @JsonProperty(value = "dt_APURACAOStr")
  private String dtApuracaoStr;
  @JsonProperty(value = "dt_PROXIMO_CONCURSO")
  private Long dtProximoConcurso;
  @JsonProperty(value = "dt_PROXIMO_CONCURSOStr")
  private String dtProximoConcursoStr;

  public TimeManiaWrapper() {
  }

  public String getDeLocalSorteio1() {
    return deLocalSorteio1;
  }

  public void setDeLocalSorteio1(String deLocalSorteio1) {
    this.deLocalSorteio1 = deLocalSorteio1;
  }

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public Boolean getSorteioAcumulado() {
    return sorteioAcumulado;
  }

  public void setSorteioAcumulado(Boolean sorteioAcumulado) {
    this.sorteioAcumulado = sorteioAcumulado;
  }

  public Boolean getRateioProcessamento() {
    return rateioProcessamento;
  }

  public void setRateioProcessamento(Boolean rateioProcessamento) {
    this.rateioProcessamento = rateioProcessamento;
  }

  public String getLocalSorteio() {
    return localSorteio;
  }

  public void setLocalSorteio(String localSorteio) {
    this.localSorteio = localSorteio;
  }

  public String getLegendaFinal() {
    return legendaFinal;
  }

  public void setLegendaFinal(String legendaFinal) {
    this.legendaFinal = legendaFinal;
  }

  public String getTimeCoracao() {
    return timeCoracao;
  }

  public void setTimeCoracao(String timeCoracao) {
    this.timeCoracao = timeCoracao;
  }

  public List<TimeManiaGanhadoresPorUfWrapper> getGanhadoresPorUf() {
    return ganhadoresPorUf;
  }

  public void setGanhadoresPorUf(
      List<TimeManiaGanhadoresPorUfWrapper> ganhadoresPorUf) {
    this.ganhadoresPorUf = ganhadoresPorUf;
  }

  public String getResultadoOrdenado() {
    return resultadoOrdenado;
  }

  public void setResultadoOrdenado(String resultadoOrdenado) {
    this.resultadoOrdenado = resultadoOrdenado;
  }

  public String getNuConcurso() {
    return nuConcurso;
  }

  public void setNuConcurso(String nuConcurso) {
    this.nuConcurso = nuConcurso;
  }

  public String getDeResultado() {
    return deResultado;
  }

  public void setDeResultado(String deResultado) {
    this.deResultado = deResultado;
  }

  public String getDeObservacao() {
    return deObservacao;
  }

  public void setDeObservacao(String deObservacao) {
    this.deObservacao = deObservacao;
  }

  public String getSgUf() {
    return sgUf;
  }

  public void setSgUf(String sgUf) {
    this.sgUf = sgUf;
  }

  public String getNoCidade() {
    return noCidade;
  }

  public void setNoCidade(String noCidade) {
    this.noCidade = noCidade;
  }

  public String getCoTimeCoracao() {
    return coTimeCoracao;
  }

  public void setCoTimeCoracao(String coTimeCoracao) {
    this.coTimeCoracao = coTimeCoracao;
  }

  public String getQtGanhadorFaixa1() {
    return qtGanhadorFaixa1;
  }

  public void setQtGanhadorFaixa1(String qtGanhadorFaixa1) {
    this.qtGanhadorFaixa1 = qtGanhadorFaixa1;
  }

  public BigDecimal getVrRateioFaixa1() {
    return vrRateioFaixa1;
  }

  public void setVrRateioFaixa1(BigDecimal vrRateioFaixa1) {
    this.vrRateioFaixa1 = vrRateioFaixa1;
  }

  public Integer getQtGanhadorFaixa2() {
    return qtGanhadorFaixa2;
  }

  public void setQtGanhadorFaixa2(Integer qtGanhadorFaixa2) {
    this.qtGanhadorFaixa2 = qtGanhadorFaixa2;
  }

  public BigDecimal getVrRaterioFaixa2() {
    return vrRaterioFaixa2;
  }

  public void setVrRaterioFaixa2(BigDecimal vrRaterioFaixa2) {
    this.vrRaterioFaixa2 = vrRaterioFaixa2;
  }

  public Integer getQtGanhadorFaixa3() {
    return qtGanhadorFaixa3;
  }

  public void setQtGanhadorFaixa3(Integer qtGanhadorFaixa3) {
    this.qtGanhadorFaixa3 = qtGanhadorFaixa3;
  }

  public BigDecimal getVrRateioFaixa3() {
    return vrRateioFaixa3;
  }

  public void setVrRateioFaixa3(BigDecimal vrRateioFaixa3) {
    this.vrRateioFaixa3 = vrRateioFaixa3;
  }

  public Integer getQtGanhadorFaixa4() {
    return qtGanhadorFaixa4;
  }

  public void setQtGanhadorFaixa4(Integer qtGanhadorFaixa4) {
    this.qtGanhadorFaixa4 = qtGanhadorFaixa4;
  }

  public BigDecimal getVrRateioFaixa4() {
    return vrRateioFaixa4;
  }

  public void setVrRateioFaixa4(BigDecimal vrRateioFaixa4) {
    this.vrRateioFaixa4 = vrRateioFaixa4;
  }

  public Integer getQtGanhadorFaixa5() {
    return qtGanhadorFaixa5;
  }

  public void setQtGanhadorFaixa5(Integer qtGanhadorFaixa5) {
    this.qtGanhadorFaixa5 = qtGanhadorFaixa5;
  }

  public BigDecimal getVrRateioFaixa5() {
    return vrRateioFaixa5;
  }

  public void setVrRateioFaixa5(BigDecimal vrRateioFaixa5) {
    this.vrRateioFaixa5 = vrRateioFaixa5;
  }

  public String getQtGanhadorTimeCoracao() {
    return qtGanhadorTimeCoracao;
  }

  public void setQtGanhadorTimeCoracao(String qtGanhadorTimeCoracao) {
    this.qtGanhadorTimeCoracao = qtGanhadorTimeCoracao;
  }

  public BigDecimal getVrRateioTimeCoracao() {
    return vrRateioTimeCoracao;
  }

  public void setVrRateioTimeCoracao(BigDecimal vrRateioTimeCoracao) {
    this.vrRateioTimeCoracao = vrRateioTimeCoracao;
  }

  public BigDecimal getVrAcumuladoFaixa1() {
    return vrAcumuladoFaixa1;
  }

  public void setVrAcumuladoFaixa1(BigDecimal vrAcumuladoFaixa1) {
    this.vrAcumuladoFaixa1 = vrAcumuladoFaixa1;
  }

  public BigDecimal getVrEstimativaFaixa1() {
    return vrEstimativaFaixa1;
  }

  public void setVrEstimativaFaixa1(BigDecimal vrEstimativaFaixa1) {
    this.vrEstimativaFaixa1 = vrEstimativaFaixa1;
  }

  public String getNuProximoConcursoFinal05() {
    return nuProximoConcursoFinal05;
  }

  public void setNuProximoConcursoFinal05(String nuProximoConcursoFinal05) {
    this.nuProximoConcursoFinal05 = nuProximoConcursoFinal05;
  }

  public BigDecimal getVrAcumuladoProximoConcurso() {
    return vrAcumuladoProximoConcurso;
  }

  public void setVrAcumuladoProximoConcurso(BigDecimal vrAcumuladoProximoConcurso) {
    this.vrAcumuladoProximoConcurso = vrAcumuladoProximoConcurso;
  }

  public String getNuConfiguracao() {
    return nuConfiguracao;
  }

  public void setNuConfiguracao(String nuConfiguracao) {
    this.nuConfiguracao = nuConfiguracao;
  }

  public String getIcConferido() {
    return icConferido;
  }

  public void setIcConferido(String icConferido) {
    this.icConferido = icConferido;
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

  public BigDecimal getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(BigDecimal vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
  }

  public Long getDtApuracao() {
    return dtApuracao;
  }

  public void setDtApuracao(Long dtApuracao) {
    this.dtApuracao = dtApuracao;
  }

  public String getDtApuracaoStr() {
    return dtApuracaoStr;
  }

  public void setDtApuracaoStr(String dtApuracaoStr) {
    this.dtApuracaoStr = dtApuracaoStr;
  }

  public Long getDtProximoConcurso() {
    return dtProximoConcurso;
  }

  public void setDtProximoConcurso(Long dtProximoConcurso) {
    this.dtProximoConcurso = dtProximoConcurso;
  }

  public String getDtProximoConcursoStr() {
    return dtProximoConcursoStr;
  }

  public void setDtProximoConcursoStr(String dtProximoConcursoStr) {
    this.dtProximoConcursoStr = dtProximoConcursoStr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TimeManiaWrapper that = (TimeManiaWrapper) o;

    return getNuConcurso().equals(that.getNuConcurso());
  }

  @Override
  public int hashCode() {
    return getNuConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "TimemaniaWrapper{" +
        "deLocalSorteio1='" + deLocalSorteio1 + '\'' +
        ", error=" + error +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", rateioProcessamento=" + rateioProcessamento +
        ", localSorteio='" + localSorteio + '\'' +
        ", legendaFinal='" + legendaFinal + '\'' +
        ", timeCoracao='" + timeCoracao + '\'' +
        ", ganhadoresPorUf=" + ganhadoresPorUf +
        ", resultadoOrdenado='" + resultadoOrdenado + '\'' +
        ", nuConcurso='" + nuConcurso + '\'' +
        ", deResultado='" + deResultado + '\'' +
        ", deObservacao='" + deObservacao + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", noCidade='" + noCidade + '\'' +
        ", coTimeCoracao='" + coTimeCoracao + '\'' +
        ", qtGanhadorFaixa1='" + qtGanhadorFaixa1 + '\'' +
        ", vrRateioFaixa1=" + vrRateioFaixa1 +
        ", qtGanhadorFaixa2=" + qtGanhadorFaixa2 +
        ", vrRaterioFaixa2=" + vrRaterioFaixa2 +
        ", qtGanhadorFaixa3=" + qtGanhadorFaixa3 +
        ", vrRateioFaixa3=" + vrRateioFaixa3 +
        ", qtGanhadorFaixa4=" + qtGanhadorFaixa4 +
        ", vrRateioFaixa4=" + vrRateioFaixa4 +
        ", qtGanhadorFaixa5=" + qtGanhadorFaixa5 +
        ", vrRateioFaixa5=" + vrRateioFaixa5 +
        ", qtGanhadorTimeCoracao='" + qtGanhadorTimeCoracao + '\'' +
        ", vrRateioTimeCoracao=" + vrRateioTimeCoracao +
        ", vrAcumuladoFaixa1=" + vrAcumuladoFaixa1 +
        ", vrEstimativaFaixa1=" + vrEstimativaFaixa1 +
        ", nuProximoConcursoFinal05='" + nuProximoConcursoFinal05 + '\'' +
        ", vrAcumuladoProximoConcurso=" + vrAcumuladoProximoConcurso +
        ", nuConfiguracao='" + nuConfiguracao + '\'' +
        ", icConferido='" + icConferido + '\'' +
        ", vrAcumuladoFaixa2=" + vrAcumuladoFaixa2 +
        ", vrAcumuladoFaixa3=" + vrAcumuladoFaixa3 +
        ", vrArrecadado=" + vrArrecadado +
        ", dtApuracao=" + dtApuracao +
        ", dtApuracaoStr='" + dtApuracaoStr + '\'' +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        '}';
  }
  
}
