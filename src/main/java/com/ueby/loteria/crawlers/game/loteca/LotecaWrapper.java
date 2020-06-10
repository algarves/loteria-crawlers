package com.ueby.loteria.crawlers.game.loteca;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class LotecaWrapper extends BaseCaixaGameWrapper {

  private Integer concurso;
  private Long dtApuracao;
  private String icJogo;
  @JsonProperty(value = "dt_jogo")
  private Long dtJogo;
  private String noTime1;
  private String noTime2;
  private String qtGanhadorFaixa1;
  private String qtGanhadorFaixa2;
  private String qtGanhadorFaixa3;
  private BigDecimal vrRateioFaixa1;
  private BigDecimal vrRateioFaixa2;
  private BigDecimal vrRateioFaixa3;
  private BigDecimal vrAcumuladoFaixa1;
  private BigDecimal vrConcursoAcumulado;
  private String nuConcursoAcumulado;
  private BigDecimal vrEstimativa;
  private BigDecimal vrArrecadado;
  @JsonProperty(value = "qt_gol_time1")
  private String qtGolTime1;
  @JsonProperty(value = "qt_gol_time2")
  private String qtGolTime2;
  @JsonProperty(value = "de_observacao")
  private String deObservacao;
  @JsonProperty(value = "dt_proximo_concurso")
  private Long dtProximoConcurso;
  @JsonProperty(value = "ic_sorteio")
  private String icSorteio;
  @JsonProperty(value = "jogos")
  private List<LotecaJogosWrapper> jogos;
  private Boolean error;
  private Boolean sorteioAcumulado;
  private Boolean sorteioAcumuladoCinco;
  private Boolean rateioProcessamento;
  private String localSorteio;
  private String legendaFinal;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<LotecaGanhadoresPorUfWrapper> ganhadoresPorUfWrapper;
  private Boolean ultimoConcurso;
  private String dtApuracaoStr;
  @JsonProperty(value = "dt_proximo_concursoStr")
  private String dtProximoConcursoStr;
  private Boolean colunaUm;
  private Boolean colunaDois;
  private Boolean colunaMeio;
  private String concursosProgramacao;

  public LotecaWrapper() {
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

  public String getIcJogo() {
    return icJogo;
  }

  public void setIcJogo(String icJogo) {
    this.icJogo = icJogo;
  }

  public Long getDtJogo() {
    return dtJogo;
  }

  public void setDtJogo(Long dtJogo) {
    this.dtJogo = dtJogo;
  }

  public String getNoTime1() {
    return noTime1;
  }

  public void setNoTime1(String noTime1) {
    this.noTime1 = noTime1;
  }

  public String getNoTime2() {
    return noTime2;
  }

  public void setNoTime2(String noTime2) {
    this.noTime2 = noTime2;
  }

  public String getQtGanhadorFaixa1() {
    return qtGanhadorFaixa1;
  }

  public void setQtGanhadorFaixa1(String qtGanhadorFaixa1) {
    this.qtGanhadorFaixa1 = qtGanhadorFaixa1;
  }

  public String getQtGanhadorFaixa2() {
    return qtGanhadorFaixa2;
  }

  public void setQtGanhadorFaixa2(String qtGanhadorFaixa2) {
    this.qtGanhadorFaixa2 = qtGanhadorFaixa2;
  }

  public String getQtGanhadorFaixa3() {
    return qtGanhadorFaixa3;
  }

  public void setQtGanhadorFaixa3(String qtGanhadorFaixa3) {
    this.qtGanhadorFaixa3 = qtGanhadorFaixa3;
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

  public BigDecimal getVrAcumuladoFaixa1() {
    return vrAcumuladoFaixa1;
  }

  public void setVrAcumuladoFaixa1(BigDecimal vrAcumuladoFaixa1) {
    this.vrAcumuladoFaixa1 = vrAcumuladoFaixa1;
  }

  public BigDecimal getVrConcursoAcumulado() {
    return vrConcursoAcumulado;
  }

  public void setVrConcursoAcumulado(BigDecimal vrConcursoAcumulado) {
    this.vrConcursoAcumulado = vrConcursoAcumulado;
  }

  public String getNuConcursoAcumulado() {
    return nuConcursoAcumulado;
  }

  public void setNuConcursoAcumulado(String nuConcursoAcumulado) {
    this.nuConcursoAcumulado = nuConcursoAcumulado;
  }

  public BigDecimal getVrEstimativa() {
    return vrEstimativa;
  }

  public void setVrEstimativa(BigDecimal vrEstimativa) {
    this.vrEstimativa = vrEstimativa;
  }

  public BigDecimal getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(BigDecimal vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
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

  public String getDeObservacao() {
    return deObservacao;
  }

  public void setDeObservacao(String deObservacao) {
    this.deObservacao = deObservacao;
  }

  public Long getDtProximoConcurso() {
    return dtProximoConcurso;
  }

  public void setDtProximoConcurso(Long dtProximoConcurso) {
    this.dtProximoConcurso = dtProximoConcurso;
  }

  public String getIcSorteio() {
    return icSorteio;
  }

  public void setIcSorteio(String icSorteio) {
    this.icSorteio = icSorteio;
  }

  public List<LotecaJogosWrapper> getJogos() {
    return jogos;
  }

  public void setJogos(List<LotecaJogosWrapper> jogos) {
    this.jogos = jogos;
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

  public Boolean getSorteioAcumuladoCinco() {
    return sorteioAcumuladoCinco;
  }

  public void setSorteioAcumuladoCinco(Boolean sorteioAcumuladoCinco) {
    this.sorteioAcumuladoCinco = sorteioAcumuladoCinco;
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

  public List<LotecaGanhadoresPorUfWrapper> getGanhadoresPorUfWrapper() {
    return ganhadoresPorUfWrapper;
  }

  public void setGanhadoresPorUfWrapper(
      List<LotecaGanhadoresPorUfWrapper> ganhadoresPorUfWrapper) {
    this.ganhadoresPorUfWrapper = ganhadoresPorUfWrapper;
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

  public String getDtProximoConcursoStr() {
    return dtProximoConcursoStr;
  }

  public void setDtProximoConcursoStr(String dtProximoConcursoStr) {
    this.dtProximoConcursoStr = dtProximoConcursoStr;
  }

  public Boolean getColunaUm() {
    return colunaUm;
  }

  public void setColunaUm(Boolean colunaUm) {
    this.colunaUm = colunaUm;
  }

  public Boolean getColunaDois() {
    return colunaDois;
  }

  public void setColunaDois(Boolean colunaDois) {
    this.colunaDois = colunaDois;
  }

  public Boolean getColunaMeio() {
    return colunaMeio;
  }

  public void setColunaMeio(Boolean colunaMeio) {
    this.colunaMeio = colunaMeio;
  }

  public String getConcursosProgramacao() {
    return concursosProgramacao;
  }

  public void setConcursosProgramacao(String concursosProgramacao) {
    this.concursosProgramacao = concursosProgramacao;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    LotecaWrapper that = (LotecaWrapper) o;

    return getConcurso().equals(that.getConcurso());
  }

  @Override
  public int hashCode() {
    return getConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "LotecaWrapper{" +
        "concurso=" + concurso +
        ", dtApuracao=" + dtApuracao +
        ", icJogo='" + icJogo + '\'' +
        ", dtJogo=" + dtJogo +
        ", noTime1='" + noTime1 + '\'' +
        ", noTime2='" + noTime2 + '\'' +
        ", qtGanhadorFaixa1='" + qtGanhadorFaixa1 + '\'' +
        ", qtGanhadorFaixa2='" + qtGanhadorFaixa2 + '\'' +
        ", qtGanhadorFaixa3='" + qtGanhadorFaixa3 + '\'' +
        ", vrRateioFaixa1=" + vrRateioFaixa1 +
        ", vrRateioFaixa2=" + vrRateioFaixa2 +
        ", vrRateioFaixa3=" + vrRateioFaixa3 +
        ", vrAcumuladoFaixa1=" + vrAcumuladoFaixa1 +
        ", vrConcursoAcumulado=" + vrConcursoAcumulado +
        ", nuConcursoAcumulado='" + nuConcursoAcumulado + '\'' +
        ", vrEstimativa=" + vrEstimativa +
        ", vrArrecadado=" + vrArrecadado +
        ", qtGolTime1='" + qtGolTime1 + '\'' +
        ", qtGolTime2='" + qtGolTime2 + '\'' +
        ", deObservacao='" + deObservacao + '\'' +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", icSorteio='" + icSorteio + '\'' +
        ", jogos=" + jogos +
        ", error=" + error +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", sorteioAcumuladoCinco=" + sorteioAcumuladoCinco +
        ", rateioProcessamento=" + rateioProcessamento +
        ", localSorteio='" + localSorteio + '\'' +
        ", legendaFinal='" + legendaFinal + '\'' +
        ", ganhadoresPorUfWrapper=" + ganhadoresPorUfWrapper +
        ", ultimoConcurso=" + ultimoConcurso +
        ", dtApuracaoStr='" + dtApuracaoStr + '\'' +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        ", colunaUm=" + colunaUm +
        ", colunaDois=" + colunaDois +
        ", colunaMeio=" + colunaMeio +
        ", concursosProgramacao='" + concursosProgramacao + '\'' +
        '}';
  }

}
