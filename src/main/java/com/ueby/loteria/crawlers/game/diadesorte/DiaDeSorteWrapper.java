package com.ueby.loteria.crawlers.game.diadesorte;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class DiaDeSorteWrapper extends BaseCaixaGameWrapper {

  @JsonProperty(value = "de_local_sorteio")
  private String deLocalSorteio;
  private Boolean error;
  private Boolean sorteioAcumulado;
  private Boolean rateioProcessamento;
  private String localSorteio;
  private String legendaFinal;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<DiaDeSorteGanhadoresPorUfWrapper> ganhadoresPorUfWrapper;
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
  @JsonProperty(value = "qt_GANHADOR_FAIXA_1")
  private String qtGanhadorFaixa1;
  @JsonProperty(value = "vr_RATEIO_FAIXA_1")
  private BigDecimal vrRateioFaixa1;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_2")
  private Integer qtGanhadorFaixa2;
  @JsonProperty(value = "vr_RATEIO_FAIXA_2")
  private BigDecimal vrRateioFaixa2;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_3")
  private Integer qtGanhadorFaixa3;
  @JsonProperty(value = "vr_RATEIO_FAIXA_3")
  private BigDecimal vrRateioFaixa3;
  @JsonProperty(value = "qt_GANHADOR_FAIXA_4")
  private Integer qtGanhadorFaixa4;
  @JsonProperty(value = "vr_RATEIO_FAIXA_4")
  private BigDecimal vrRateioFaixa4;
  @JsonProperty(value = "vr_ACUMULADO")
  private BigDecimal vrAcumulado;
  @JsonProperty(value = "vr_ESTIMATIVA")
  private BigDecimal vrEstimativa;
  @JsonProperty(value = "ic_CONFERIDO")
  private String icConferido;
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
  @JsonProperty(value = "mes_DE_SORTE")
  private Integer mesDeSorte;
  @JsonProperty(value = "qt_GANHADOR_MES_DE_SORTE")
  private Integer qtGanhadorMesDeSorte;
  @JsonProperty(value = "vr_RATEIO_MES_DE_SORTE")
  private BigDecimal vrRateioMesDeSorte;

  public DiaDeSorteWrapper() {
  }

  public String getDeLocalSorteio() {
    return deLocalSorteio;
  }

  public void setDeLocalSorteio(String deLocalSorteio) {
    this.deLocalSorteio = deLocalSorteio;
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

  public List<DiaDeSorteGanhadoresPorUfWrapper> getGanhadoresPorUfWrapper() {
    return ganhadoresPorUfWrapper;
  }

  public void setGanhadoresPorUfWrapper(
      List<DiaDeSorteGanhadoresPorUfWrapper> ganhadoresPorUfWrapper) {
    this.ganhadoresPorUfWrapper = ganhadoresPorUfWrapper;
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

  public BigDecimal getVrRateioFaixa2() {
    return vrRateioFaixa2;
  }

  public void setVrRateioFaixa2(BigDecimal vrRateioFaixa2) {
    this.vrRateioFaixa2 = vrRateioFaixa2;
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

  public BigDecimal getVrAcumulado() {
    return vrAcumulado;
  }

  public void setVrAcumulado(BigDecimal vrAcumulado) {
    this.vrAcumulado = vrAcumulado;
  }

  public BigDecimal getVrEstimativa() {
    return vrEstimativa;
  }

  public void setVrEstimativa(BigDecimal vrEstimativa) {
    this.vrEstimativa = vrEstimativa;
  }

  public String getIcConferido() {
    return icConferido;
  }

  public void setIcConferido(String icConferido) {
    this.icConferido = icConferido;
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

  public Integer getMesDeSorte() {
    return mesDeSorte;
  }

  public void setMesDeSorte(Integer mesDeSorte) {
    this.mesDeSorte = mesDeSorte;
  }

  public Integer getQtGanhadorMesDeSorte() {
    return qtGanhadorMesDeSorte;
  }

  public void setQtGanhadorMesDeSorte(Integer qtGanhadorMesDeSorte) {
    this.qtGanhadorMesDeSorte = qtGanhadorMesDeSorte;
  }

  public BigDecimal getVrRateioMesDeSorte() {
    return vrRateioMesDeSorte;
  }

  public void setVrRateioMesDeSorte(BigDecimal vrRateioMesDeSorte) {
    this.vrRateioMesDeSorte = vrRateioMesDeSorte;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    DiaDeSorteWrapper that = (DiaDeSorteWrapper) o;

    return getNuConcurso().equals(that.getNuConcurso());
  }

  @Override
  public int hashCode() {
    return getNuConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "DiaDeSorteWrapper{" +
        "deLocalSorteio='" + deLocalSorteio + '\'' +
        ", error=" + error +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", rateioProcessamento=" + rateioProcessamento +
        ", localSorteio='" + localSorteio + '\'' +
        ", legendaFinal='" + legendaFinal + '\'' +
        ", ganhadoresPorUfWrapper=" + ganhadoresPorUfWrapper +
        ", resultadoOrdenado='" + resultadoOrdenado + '\'' +
        ", nuConcurso='" + nuConcurso + '\'' +
        ", deResultado='" + deResultado + '\'' +
        ", deObservacao='" + deObservacao + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", noCidade='" + noCidade + '\'' +
        ", qtGanhadorFaixa1='" + qtGanhadorFaixa1 + '\'' +
        ", vrRateioFaixa1=" + vrRateioFaixa1 +
        ", qtGanhadorFaixa2=" + qtGanhadorFaixa2 +
        ", vrRateioFaixa2=" + vrRateioFaixa2 +
        ", qtGanhadorFaixa3=" + qtGanhadorFaixa3 +
        ", vrRateioFaixa3=" + vrRateioFaixa3 +
        ", qtGanhadorFaixa4=" + qtGanhadorFaixa4 +
        ", vrRateioFaixa4=" + vrRateioFaixa4 +
        ", vrAcumulado=" + vrAcumulado +
        ", vrEstimativa=" + vrEstimativa +
        ", icConferido='" + icConferido + '\'' +
        ", vrArrecadado=" + vrArrecadado +
        ", dtApuracao=" + dtApuracao +
        ", dtApuracaoStr='" + dtApuracaoStr + '\'' +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        ", mesDeSorte=" + mesDeSorte +
        ", qtGanhadorMesDeSorte=" + qtGanhadorMesDeSorte +
        ", vrRateioMesDeSorte=" + vrRateioMesDeSorte +
        '}';
  }

}
