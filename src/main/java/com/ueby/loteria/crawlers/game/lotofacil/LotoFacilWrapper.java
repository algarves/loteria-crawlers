package com.ueby.loteria.crawlers.game.lotofacil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class LotoFacilWrapper extends BaseCaixaGameWrapper {

  @JsonProperty(value = "nu_concurso")
  private Integer nuConcurso;
  @JsonProperty(value = "dt_apuracao")
  private Long dtApuracao;
  @JsonProperty(value = "de_resultado")
  private String deResultado;
  @JsonProperty(value = "de_observacao")
  private String deObservacao;
  @JsonProperty(value = "qt_ganhador_faixa1")
  private Integer qtGanhadorFaixa1;
  @JsonProperty(value = "qt_ganhador_faixa2")
  private Integer qtGanhadorFaixa2;
  @JsonProperty(value = "qt_ganhador_faixa3")
  private Integer qtGanhadorFaixa3;
  @JsonProperty(value = "qt_ganhador_faixa4")
  private Integer qtGanhadorFaixa4;
  @JsonProperty(value = "qt_ganhador_faixa5")
  private Integer qtGanhadorFaixa5;
  @JsonProperty(value = "vr_rateio_faixa1")
  private BigDecimal vrRateioFaixa1;
  @JsonProperty(value = "vr_rateio_faixa2")
  private BigDecimal vrRateioFaixa2;
  @JsonProperty(value = "vr_rateio_faixa3")
  private BigDecimal vrRateioFaixa3;
  @JsonProperty(value = "vr_rateio_faixa4")
  private BigDecimal vrRateioFaixa4;
  @JsonProperty(value = "vr_rateio_faixa5")
  private BigDecimal vrRateioFaixa5;
  @JsonProperty(value = "no_cidade")
  private String noCidade;
  @JsonProperty(value = "sg_uf")
  private String sgUf;
  private String vrAcumuladoFaixa1;
  private String vrAcumuladoFaixa2;
  private String vrEstimativa;
  private Long dtProximoConcurso;
  private String vrArrecadado;
  private String vrAcumuladoEspecial;
  @JsonProperty(value = "de_local_sorteio")
  private String deLocalSorteio;
  @JsonProperty(value = "ic_concurso_especial")
  private Boolean icConcursoEspecial;
  private Boolean sorteioAcumulado;
  private Boolean rateioProcessamento;
  private String localSorteio;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<LotoFacilGanhadoresPorUfWrapper> ganhadoresPorUfWrapper;
  private String resultadoOrdenado;
  @JsonProperty(value = "dt_apuracaoStr")
  private String dtApuracaoStr;
  private String dtProximoConcursoStr;
  private Boolean error;

  public LotoFacilWrapper() {
  }

  public Integer getNuConcurso() {
    return nuConcurso;
  }

  public void setNuConcurso(Integer nuConcurso) {
    this.nuConcurso = nuConcurso;
  }

  public Long getDtApuracao() {
    return dtApuracao;
  }

  public void setDtApuracao(Long dtApuracao) {
    this.dtApuracao = dtApuracao;
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

  public Integer getQtGanhadorFaixa1() {
    return qtGanhadorFaixa1;
  }

  public void setQtGanhadorFaixa1(Integer qtGanhadorFaixa1) {
    this.qtGanhadorFaixa1 = qtGanhadorFaixa1;
  }

  public Integer getQtGanhadorFaixa2() {
    return qtGanhadorFaixa2;
  }

  public void setQtGanhadorFaixa2(Integer qtGanhadorFaixa2) {
    this.qtGanhadorFaixa2 = qtGanhadorFaixa2;
  }

  public Integer getQtGanhadorFaixa3() {
    return qtGanhadorFaixa3;
  }

  public void setQtGanhadorFaixa3(Integer qtGanhadorFaixa3) {
    this.qtGanhadorFaixa3 = qtGanhadorFaixa3;
  }

  public Integer getQtGanhadorFaixa4() {
    return qtGanhadorFaixa4;
  }

  public void setQtGanhadorFaixa4(Integer qtGanhadorFaixa4) {
    this.qtGanhadorFaixa4 = qtGanhadorFaixa4;
  }

  public Integer getQtGanhadorFaixa5() {
    return qtGanhadorFaixa5;
  }

  public void setQtGanhadorFaixa5(Integer qtGanhadorFaixa5) {
    this.qtGanhadorFaixa5 = qtGanhadorFaixa5;
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

  public String getVrAcumuladoFaixa1() {
    return vrAcumuladoFaixa1;
  }

  public void setVrAcumuladoFaixa1(String vrAcumuladoFaixa1) {
    this.vrAcumuladoFaixa1 = vrAcumuladoFaixa1;
  }

  public String getVrAcumuladoFaixa2() {
    return vrAcumuladoFaixa2;
  }

  public void setVrAcumuladoFaixa2(String vrAcumuladoFaixa2) {
    this.vrAcumuladoFaixa2 = vrAcumuladoFaixa2;
  }

  public String getVrEstimativa() {
    return vrEstimativa;
  }

  public void setVrEstimativa(String vrEstimativa) {
    this.vrEstimativa = vrEstimativa;
  }

  public Long getDtProximoConcurso() {
    return dtProximoConcurso;
  }

  public void setDtProximoConcurso(Long dtProximoConcurso) {
    this.dtProximoConcurso = dtProximoConcurso;
  }

  public String getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(String vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
  }

  public String getVrAcumuladoEspecial() {
    return vrAcumuladoEspecial;
  }

  public void setVrAcumuladoEspecial(String vrAcumuladoEspecial) {
    this.vrAcumuladoEspecial = vrAcumuladoEspecial;
  }

  public String getDeLocalSorteio() {
    return deLocalSorteio;
  }

  public void setDeLocalSorteio(String deLocalSorteio) {
    this.deLocalSorteio = deLocalSorteio;
  }

  public Boolean getIcConcursoEspecial() {
    return icConcursoEspecial;
  }

  public void setIcConcursoEspecial(Boolean icConcursoEspecial) {
    this.icConcursoEspecial = icConcursoEspecial;
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

  public List<LotoFacilGanhadoresPorUfWrapper> getGanhadoresPorUfWrapper() {
    return ganhadoresPorUfWrapper;
  }

  public void setGanhadoresPorUfWrapper(
      List<LotoFacilGanhadoresPorUfWrapper> ganhadoresPorUfWrapper) {
    this.ganhadoresPorUfWrapper = ganhadoresPorUfWrapper;
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

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    LotoFacilWrapper lotofacilWrapper = (LotoFacilWrapper) o;

    return getNuConcurso().equals(lotofacilWrapper.getNuConcurso());
  }

  @Override
  public int hashCode() {
    return getNuConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "LotofacilWrapper{" +
        "nuConcurso=" + nuConcurso +
        ", dtApuracao=" + dtApuracao +
        ", deResultado='" + deResultado + '\'' +
        ", deObservacao='" + deObservacao + '\'' +
        ", qtGanhadorFaixa1=" + qtGanhadorFaixa1 +
        ", qtGanhadorFaixa2=" + qtGanhadorFaixa2 +
        ", qtGanhadorFaixa3=" + qtGanhadorFaixa3 +
        ", qtGanhadorFaixa4=" + qtGanhadorFaixa4 +
        ", qtGanhadorFaixa5=" + qtGanhadorFaixa5 +
        ", vrRateioFaixa1=" + vrRateioFaixa1 +
        ", vrRateioFaixa2=" + vrRateioFaixa2 +
        ", vrRateioFaixa3=" + vrRateioFaixa3 +
        ", vrRateioFaixa4=" + vrRateioFaixa4 +
        ", vrRateioFaixa5=" + vrRateioFaixa5 +
        ", noCidade='" + noCidade + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", vrAcumuladoFaixa1='" + vrAcumuladoFaixa1 + '\'' +
        ", vrAcumuladoFaixa2='" + vrAcumuladoFaixa2 + '\'' +
        ", vrEstimativa='" + vrEstimativa + '\'' +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", vrArrecadado='" + vrArrecadado + '\'' +
        ", vrAcumuladoEspecial='" + vrAcumuladoEspecial + '\'' +
        ", deLocalSorteio='" + deLocalSorteio + '\'' +
        ", icConcursoEspecial=" + icConcursoEspecial +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", rateioProcessamento=" + rateioProcessamento +
        ", localSorteio='" + localSorteio + '\'' +
        ", ganhadoresPorUfWrapper=" + ganhadoresPorUfWrapper +
        ", resultadoOrdenado='" + resultadoOrdenado + '\'' +
        ", dtApuracaoStr='" + dtApuracaoStr + '\'' +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        ", error=" + error +
        '}';
  }

}
