package com.ueby.loteria.crawlers.game.megasena;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class MegaSenaWrapper extends BaseCaixaGameWrapper {

  private Integer concurso;
  private Long data;
  private String resultado;
  private Integer ganhadores;
  @JsonProperty(value = "ganhadores_quina")
  private Integer ganhadoresQuina;
  @JsonProperty(value = "ganhadores_quadra")
  private Integer ganhadoresQuadra;
  private BigDecimal valor;
  @JsonProperty(value = "valor_quina")
  private BigDecimal valorQuina;
  @JsonProperty(value = "valor_quadra")
  private BigDecimal valorQuadra;
  private Integer acumulado;
  @JsonProperty(value = "valor_acumulado")
  private BigDecimal valorAcumulado;
  @JsonProperty(value = "dtinclusao")
  private Long dtInclusao;
  @JsonProperty(value = "prox_final_zero")
  private String proxFinalZero;
  @JsonProperty(value = "ac_final_zero")
  private BigDecimal acFinalZero;
  private String proxConcursoFinal;
  private String observacao;
  private String rowguid;
  @JsonProperty(value = "ic_conferido")
  private String icConferido;
  @JsonProperty(value = "de_local_sorteio")
  private String deLocalSorteio;
  @JsonProperty(value = "no_cidade")
  private String noCidade;
  @JsonProperty(value = "sg_uf")
  private String sgUf;
  @JsonProperty(value = "vr_estimativa")
  private BigDecimal vrEstimativa;
  @JsonProperty(value = "dt_proximo_concurso")
  private Long dtProximoConcurso;
  @JsonProperty(value = "vr_acumulado_especial")
  private BigDecimal vrAcumuladoEspecial;
  @JsonProperty(value = "vr_arrecadado")
  private BigDecimal vrArrecadado;
  @JsonProperty(value = "ic_concurso_especial")
  private Boolean icConcursoEspecial;
  private Boolean rateioProcessamento;
  private Boolean sorteioAcumulado;
  private String concursoEspecial;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<MegaSenaGanhadoresPorUfWrapper> ganhadoresPorUfWrapper;
  private String resultadoOrdenado;
  private String dataStr;
  @JsonProperty(value = "dt_proximo_concursoStr")
  private String dtProximoConcursoStr;
  private Boolean error;

  public MegaSenaWrapper() {
  }

  public Integer getConcurso() {
    return concurso;
  }

  public void setConcurso(Integer concurso) {
    this.concurso = concurso;
  }

  public Long getData() {
    return data;
  }

  public void setData(Long data) {
    this.data = data;
  }

  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }

  public Integer getGanhadores() {
    return ganhadores;
  }

  public void setGanhadores(Integer ganhadores) {
    this.ganhadores = ganhadores;
  }

  public Integer getGanhadoresQuina() {
    return ganhadoresQuina;
  }

  public void setGanhadoresQuina(Integer ganhadoresQuina) {
    this.ganhadoresQuina = ganhadoresQuina;
  }

  public Integer getGanhadoresQuadra() {
    return ganhadoresQuadra;
  }

  public void setGanhadoresQuadra(Integer ganhadoresQuadra) {
    this.ganhadoresQuadra = ganhadoresQuadra;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public BigDecimal getValorQuina() {
    return valorQuina;
  }

  public void setValorQuina(BigDecimal valorQuina) {
    this.valorQuina = valorQuina;
  }

  public BigDecimal getValorQuadra() {
    return valorQuadra;
  }

  public void setValorQuadra(BigDecimal valorQuadra) {
    this.valorQuadra = valorQuadra;
  }

  public Integer getAcumulado() {
    return acumulado;
  }

  public void setAcumulado(Integer acumulado) {
    this.acumulado = acumulado;
  }

  public BigDecimal getValorAcumulado() {
    return valorAcumulado;
  }

  public void setValorAcumulado(BigDecimal valorAcumulado) {
    this.valorAcumulado = valorAcumulado;
  }

  public Long getDtInclusao() {
    return dtInclusao;
  }

  public void setDtInclusao(Long dtInclusao) {
    this.dtInclusao = dtInclusao;
  }

  public String getProxFinalZero() {
    return proxFinalZero;
  }

  public void setProxFinalZero(String proxFinalZero) {
    this.proxFinalZero = proxFinalZero;
  }

  public BigDecimal getAcFinalZero() {
    return acFinalZero;
  }

  public void setAcFinalZero(BigDecimal acFinalZero) {
    this.acFinalZero = acFinalZero;
  }

  public String getProxConcursoFinal() {
    return proxConcursoFinal;
  }

  public void setProxConcursoFinal(String proxConcursoFinal) {
    this.proxConcursoFinal = proxConcursoFinal;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public String getRowguid() {
    return rowguid;
  }

  public void setRowguid(String rowguid) {
    this.rowguid = rowguid;
  }

  public String getIcConferido() {
    return icConferido;
  }

  public void setIcConferido(String icConferido) {
    this.icConferido = icConferido;
  }

  public String getDeLocalSorteio() {
    return deLocalSorteio;
  }

  public void setDeLocalSorteio(String deLocalSorteio) {
    this.deLocalSorteio = deLocalSorteio;
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

  public BigDecimal getVrAcumuladoEspecial() {
    return vrAcumuladoEspecial;
  }

  public void setVrAcumuladoEspecial(BigDecimal vrAcumuladoEspecial) {
    this.vrAcumuladoEspecial = vrAcumuladoEspecial;
  }

  public BigDecimal getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(BigDecimal vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
  }

  public Boolean getIcConcursoEspecial() {
    return icConcursoEspecial;
  }

  public void setIcConcursoEspecial(Boolean icConcursoEspecial) {
    this.icConcursoEspecial = icConcursoEspecial;
  }

  public Boolean getRateioProcessamento() {
    return rateioProcessamento;
  }

  public void setRateioProcessamento(Boolean rateioProcessamento) {
    this.rateioProcessamento = rateioProcessamento;
  }

  public Boolean getSorteioAcumulado() {
    return sorteioAcumulado;
  }

  public void setSorteioAcumulado(Boolean sorteioAcumulado) {
    this.sorteioAcumulado = sorteioAcumulado;
  }

  public String getConcursoEspecial() {
    return concursoEspecial;
  }

  public void setConcursoEspecial(String concursoEspecial) {
    this.concursoEspecial = concursoEspecial;
  }

  public List<MegaSenaGanhadoresPorUfWrapper> getGanhadoresPorUfWrapper() {
    return ganhadoresPorUfWrapper;
  }

  public void setGanhadoresPorUfWrapper(
      List<MegaSenaGanhadoresPorUfWrapper> ganhadoresPorUfWrapper) {
    this.ganhadoresPorUfWrapper = ganhadoresPorUfWrapper;
  }

  public String getResultadoOrdenado() {
    return resultadoOrdenado;
  }

  public void setResultadoOrdenado(String resultadoOrdenado) {
    this.resultadoOrdenado = resultadoOrdenado;
  }

  public String getDataStr() {
    return dataStr;
  }

  public void setDataStr(String dataStr) {
    this.dataStr = dataStr;
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

    MegaSenaWrapper that = (MegaSenaWrapper) o;

    return getConcurso().equals(that.getConcurso());
  }

  @Override
  public int hashCode() {
    return getConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "MegasenaWrapper{" +
        "concurso=" + concurso +
        ", data=" + data +
        ", resultado='" + resultado + '\'' +
        ", ganhadores=" + ganhadores +
        ", ganhadoresQuina=" + ganhadoresQuina +
        ", ganhadoresQuadra=" + ganhadoresQuadra +
        ", valor=" + valor +
        ", valorQuina=" + valorQuina +
        ", valorQuadra=" + valorQuadra +
        ", acumulado=" + acumulado +
        ", valorAcumulado=" + valorAcumulado +
        ", dtInclusao=" + dtInclusao +
        ", proxFinalZero='" + proxFinalZero + '\'' +
        ", acFinalZero=" + acFinalZero +
        ", proxConcursoFinal='" + proxConcursoFinal + '\'' +
        ", observacao='" + observacao + '\'' +
        ", rowguid='" + rowguid + '\'' +
        ", icConferido='" + icConferido + '\'' +
        ", deLocalSorteio='" + deLocalSorteio + '\'' +
        ", noCidade='" + noCidade + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", vrEstimativa=" + vrEstimativa +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", vrAcumuladoEspecial=" + vrAcumuladoEspecial +
        ", vrArrecadado=" + vrArrecadado +
        ", icConcursoEspecial=" + icConcursoEspecial +
        ", rateioProcessamento=" + rateioProcessamento +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", concursoEspecial='" + concursoEspecial + '\'' +
        ", ganhadoresPorUfWrapper=" + ganhadoresPorUfWrapper +
        ", resultadoOrdenado='" + resultadoOrdenado + '\'' +
        ", dataStr='" + dataStr + '\'' +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        ", error=" + error +
        '}';
  }

}
