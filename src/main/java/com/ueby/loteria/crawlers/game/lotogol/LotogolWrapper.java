package com.ueby.loteria.crawlers.game.lotogol;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class LotogolWrapper extends BaseCaixaGameWrapper {

  @JsonProperty(value = "co_concurso")
  private String coConcurso;
  @JsonProperty(value = "dt_apuracao")
  private Long dtApuracao;
  @JsonProperty(value = "dt_jogo")
  private Long dtJogo;
  @JsonProperty(value = "qt_ganhador_faixa1")
  private String qtGanhadorFaixa1;
  @JsonProperty(value = "vr_rateio_faixa1")
  private BigDecimal vrRateioFaixa1;
  @JsonProperty(value = "qt_ganhador_faixa2")
  private String qtGanhadorFaixa2;
  @JsonProperty(value = "vr_rateio_faixa2")
  private BigDecimal vrRateioFaixa2;
  @JsonProperty(value = "qt_ganhador_faixa3")
  private String qtGanhadorFaixa3;
  @JsonProperty(value = "vr_rateio_faixa3")
  private BigDecimal vrRateioFaixa3;
  @JsonProperty(value = "vr_estimativa")
  private BigDecimal vrEstimativa;
  @JsonProperty(value = "dt_proximo_concurso")
  private Long dtProximoConcurso;
  @JsonProperty(value = "ic_jogo")
  private String icJogo;
  @JsonProperty(value = "co_time1")
  private String coTime1;
  @JsonProperty(value = "nu_time")
  private Integer nuTime;
  @JsonProperty(value = "co_time2")
  private String coTime2;
  private String time1;
  private String time2;
  @JsonProperty(value = "qt_gol_time1")
  private String qtGolTime1;
  @JsonProperty(value = "qt_gol_time2")
  private String qtGolTime2;
  @JsonProperty(value = "de_local_sorteio")
  private String deLocalSorteio;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<LotogolGanhadoresPorUfWrapper> ganhadoresPorUfWrapper;
  private Boolean rateioProcessamento;
  private Boolean error;
  private Boolean sorteioAcumulado;
  private String localSorteio;
  private String diaDaSemana;
  private String programacaoJogos;
  private Boolean ultimoConcurso;
  @JsonProperty(value = "dt_apuracaoStr")
  private String dtApuracaoStr;
  @JsonProperty(value = "vr_ACUMULADO_FAIXA1")
  private BigDecimal vrAcumuladoFaixa1;
  @JsonProperty(value = "ic_ACUMULADO_FAIXA1")
  private String icAcumuladoFaixa1;
  @JsonProperty(value = "vr_ACUMULADO_FAIXA2")
  private BigDecimal vrAcumuladoFaixa2;
  @JsonProperty(value = "ic_ACUMULADO_FAIXA2")
  private String icAcumuladoFaixa2;
  @JsonProperty(value = "vr_ACUMULADO_FAIXA3")
  private BigDecimal vrAcumuladoFaixa3;
  @JsonProperty(value = "ic_ACUMULADO_FAIXA3")
  private String icAcumuladoFaixa3;
  @JsonProperty(value = "dt_INCLUSAO")
  private Long dtInclusao;
  @JsonProperty(value = "de_OBSERVACAO")
  private String deObservacao;
  @JsonProperty(value = "ic_CONFERIDO")
  private Boolean icConferido;
  @JsonProperty(value = "ic_PROGRAMACAO")
  private String icProgramacao;
  @JsonProperty(value = "dt_proximo_concursoStr")
  private String dtProximoConcursoStr;
  @JsonProperty(value = "vr_ARRECADADO")
  private BigDecimal vrArrecadado;

  public LotogolWrapper() {
  }

  public String getCoConcurso() {
    return coConcurso;
  }

  public void setCoConcurso(String coConcurso) {
    this.coConcurso = coConcurso;
  }

  public Long getDtApuracao() {
    return dtApuracao;
  }

  public void setDtApuracao(Long dtApuracao) {
    this.dtApuracao = dtApuracao;
  }

  public Long getDtJogo() {
    return dtJogo;
  }

  public void setDtJogo(Long dtJogo) {
    this.dtJogo = dtJogo;
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

  public String getQtGanhadorFaixa2() {
    return qtGanhadorFaixa2;
  }

  public void setQtGanhadorFaixa2(String qtGanhadorFaixa2) {
    this.qtGanhadorFaixa2 = qtGanhadorFaixa2;
  }

  public BigDecimal getVrRateioFaixa2() {
    return vrRateioFaixa2;
  }

  public void setVrRateioFaixa2(BigDecimal vrRateioFaixa2) {
    this.vrRateioFaixa2 = vrRateioFaixa2;
  }

  public String getQtGanhadorFaixa3() {
    return qtGanhadorFaixa3;
  }

  public void setQtGanhadorFaixa3(String qtGanhadorFaixa3) {
    this.qtGanhadorFaixa3 = qtGanhadorFaixa3;
  }

  public BigDecimal getVrRateioFaixa3() {
    return vrRateioFaixa3;
  }

  public void setVrRateioFaixa3(BigDecimal vrRateioFaixa3) {
    this.vrRateioFaixa3 = vrRateioFaixa3;
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

  public String getIcJogo() {
    return icJogo;
  }

  public void setIcJogo(String icJogo) {
    this.icJogo = icJogo;
  }

  public String getCoTime1() {
    return coTime1;
  }

  public void setCoTime1(String coTime1) {
    this.coTime1 = coTime1;
  }

  public Integer getNuTime() {
    return nuTime;
  }

  public void setNuTime(Integer nuTime) {
    this.nuTime = nuTime;
  }

  public String getCoTime2() {
    return coTime2;
  }

  public void setCoTime2(String coTime2) {
    this.coTime2 = coTime2;
  }

  public String getTime1() {
    return time1;
  }

  public void setTime1(String time1) {
    this.time1 = time1;
  }

  public String getTime2() {
    return time2;
  }

  public void setTime2(String time2) {
    this.time2 = time2;
  }

  public String getQtGolTime1() {
    return qtGolTime1;
  }

  public void setQtGolTime1(String qtGolTime1) {
    this.qtGolTime1 = qtGolTime1;
  }

  public String getQtGolTime2() {
    return qtGolTime2;
  }

  public void setQtGolTime2(String qtGolTime2) {
    this.qtGolTime2 = qtGolTime2;
  }

  public String getDeLocalSorteio() {
    return deLocalSorteio;
  }

  public void setDeLocalSorteio(String deLocalSorteio) {
    this.deLocalSorteio = deLocalSorteio;
  }

  public List<LotogolGanhadoresPorUfWrapper> getGanhadoresPorUfWrapper() {
    return ganhadoresPorUfWrapper;
  }

  public void setGanhadoresPorUfWrapper(
      List<LotogolGanhadoresPorUfWrapper> ganhadoresPorUfWrapper) {
    this.ganhadoresPorUfWrapper = ganhadoresPorUfWrapper;
  }

  public Boolean getRateioProcessamento() {
    return rateioProcessamento;
  }

  public void setRateioProcessamento(Boolean rateioProcessamento) {
    this.rateioProcessamento = rateioProcessamento;
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

  public String getLocalSorteio() {
    return localSorteio;
  }

  public void setLocalSorteio(String localSorteio) {
    this.localSorteio = localSorteio;
  }

  public String getDiaDaSemana() {
    return diaDaSemana;
  }

  public void setDiaDaSemana(String diaDaSemana) {
    this.diaDaSemana = diaDaSemana;
  }

  public String getProgramacaoJogos() {
    return programacaoJogos;
  }

  public void setProgramacaoJogos(String programacaoJogos) {
    this.programacaoJogos = programacaoJogos;
  }

  public Boolean getUltimoConcurso() {
    return ultimoConcurso;
  }

  public void setUltimoConcurso(Boolean ultimoConcurso) {
    this.ultimoConcurso = ultimoConcurso;
  }

  public String getDtApuracaoStr() {
    return dtApuracaoStr;
  }

  public void setDtApuracaoStr(String dtApuracaoStr) {
    this.dtApuracaoStr = dtApuracaoStr;
  }

  public BigDecimal getVrAcumuladoFaixa1() {
    return vrAcumuladoFaixa1;
  }

  public void setVrAcumuladoFaixa1(BigDecimal vrAcumuladoFaixa1) {
    this.vrAcumuladoFaixa1 = vrAcumuladoFaixa1;
  }

  public String getIcAcumuladoFaixa1() {
    return icAcumuladoFaixa1;
  }

  public void setIcAcumuladoFaixa1(String icAcumuladoFaixa1) {
    this.icAcumuladoFaixa1 = icAcumuladoFaixa1;
  }

  public BigDecimal getVrAcumuladoFaixa2() {
    return vrAcumuladoFaixa2;
  }

  public void setVrAcumuladoFaixa2(BigDecimal vrAcumuladoFaixa2) {
    this.vrAcumuladoFaixa2 = vrAcumuladoFaixa2;
  }

  public String getIcAcumuladoFaixa2() {
    return icAcumuladoFaixa2;
  }

  public void setIcAcumuladoFaixa2(String icAcumuladoFaixa2) {
    this.icAcumuladoFaixa2 = icAcumuladoFaixa2;
  }

  public BigDecimal getVrAcumuladoFaixa3() {
    return vrAcumuladoFaixa3;
  }

  public void setVrAcumuladoFaixa3(BigDecimal vrAcumuladoFaixa3) {
    this.vrAcumuladoFaixa3 = vrAcumuladoFaixa3;
  }

  public String getIcAcumuladoFaixa3() {
    return icAcumuladoFaixa3;
  }

  public void setIcAcumuladoFaixa3(String icAcumuladoFaixa3) {
    this.icAcumuladoFaixa3 = icAcumuladoFaixa3;
  }

  public Long getDtInclusao() {
    return dtInclusao;
  }

  public void setDtInclusao(Long dtInclusao) {
    this.dtInclusao = dtInclusao;
  }

  public String getDeObservacao() {
    return deObservacao;
  }

  public void setDeObservacao(String deObservacao) {
    this.deObservacao = deObservacao;
  }

  public Boolean getIcConferido() {
    return icConferido;
  }

  public void setIcConferido(Boolean icConferido) {
    this.icConferido = icConferido;
  }

  public String getIcProgramacao() {
    return icProgramacao;
  }

  public void setIcProgramacao(String icProgramacao) {
    this.icProgramacao = icProgramacao;
  }

  public String getDtProximoConcursoStr() {
    return dtProximoConcursoStr;
  }

  public void setDtProximoConcursoStr(String dtProximoConcursoStr) {
    this.dtProximoConcursoStr = dtProximoConcursoStr;
  }

  public BigDecimal getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(BigDecimal vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    LotogolWrapper that = (LotogolWrapper) o;

    if (!getCoConcurso().equals(that.getCoConcurso())) {
      return false;
    }
    return getIcJogo().equals(that.getIcJogo());
  }

  @Override
  public int hashCode() {
    int result = getCoConcurso().hashCode();
    result = 31 * result + getIcJogo().hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "LotogolWrapper{" +
        "coConcurso='" + coConcurso + '\'' +
        ", dtApuracao=" + dtApuracao +
        ", dtJogo=" + dtJogo +
        ", qtGanhadorFaixa1='" + qtGanhadorFaixa1 + '\'' +
        ", vrRateioFaixa1=" + vrRateioFaixa1 +
        ", qtGanhadorFaixa2='" + qtGanhadorFaixa2 + '\'' +
        ", vrRateioFaixa2=" + vrRateioFaixa2 +
        ", qtGanhadorFaixa3='" + qtGanhadorFaixa3 + '\'' +
        ", vrRateioFaixa3=" + vrRateioFaixa3 +
        ", vrEstimativa=" + vrEstimativa +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", icJogo='" + icJogo + '\'' +
        ", coTime1='" + coTime1 + '\'' +
        ", nuTime=" + nuTime +
        ", coTime2='" + coTime2 + '\'' +
        ", time1='" + time1 + '\'' +
        ", time2='" + time2 + '\'' +
        ", qtGolTime1='" + qtGolTime1 + '\'' +
        ", qtGolTime2='" + qtGolTime2 + '\'' +
        ", deLocalSorteio='" + deLocalSorteio + '\'' +
        ", ganhadoresPorUfWrapper=" + ganhadoresPorUfWrapper +
        ", rateioProcessamento=" + rateioProcessamento +
        ", error=" + error +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", localSorteio='" + localSorteio + '\'' +
        ", diaDaSemana='" + diaDaSemana + '\'' +
        ", programacaoJogos='" + programacaoJogos + '\'' +
        ", ultimoConcurso=" + ultimoConcurso +
        ", dtApuracaoStr='" + dtApuracaoStr + '\'' +
        ", vrAcumuladoFaixa1=" + vrAcumuladoFaixa1 +
        ", icAcumuladoFaixa1='" + icAcumuladoFaixa1 + '\'' +
        ", vrAcumuladoFaixa2=" + vrAcumuladoFaixa2 +
        ", icAcumuladoFaixa2='" + icAcumuladoFaixa2 + '\'' +
        ", vrAcumuladoFaixa3=" + vrAcumuladoFaixa3 +
        ", icAcumuladoFaixa3='" + icAcumuladoFaixa3 + '\'' +
        ", dtInclusao=" + dtInclusao +
        ", deObservacao='" + deObservacao + '\'' +
        ", icConferido=" + icConferido +
        ", icProgramacao='" + icProgramacao + '\'' +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        ", vrArrecadado=" + vrArrecadado +
        '}';
  }

}
