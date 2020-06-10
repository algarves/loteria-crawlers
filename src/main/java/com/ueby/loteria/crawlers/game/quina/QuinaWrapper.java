package com.ueby.loteria.crawlers.game.quina;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class QuinaWrapper extends BaseCaixaGameWrapper {

  private Integer concurso;
  private Long data;
  private String resultado;
  private Integer ganhadores;
  @JsonProperty(value = "ganhadores_quadra")
  private Integer ganhadoresQuadra;
  @JsonProperty(value = "ganhadores_terno")
  private Integer ganhadoresTerno;
  @JsonProperty(value = "qt_ganhador_duque")
  private Integer qtGanhadoresDuque;
  private BigDecimal valor;
  @JsonProperty(value = "valor_quadra")
  private BigDecimal valorQuadra;
  @JsonProperty(value = "valor_terno")
  private BigDecimal valorTerno;
  @JsonProperty(value = "vr_rateio_duque")
  private BigDecimal vrRateioDuque;
  @JsonProperty(value = "no_cidade")
  private String noCidade;
  @JsonProperty(value = "sg_uf")
  private String sgUf;
  private BigDecimal vrAcumulado;
  @JsonProperty(value = "vr_acumulado_especial")
  private BigDecimal vrAcumuladoEspecial;
  private BigDecimal vrEstimado;
  private Long dtProximoConcurso;
  private BigDecimal vrArrecadado;
  private String observacao;
  @JsonProperty(value = "de_local_sorteio")
  private String deLocalSorteio;
  @JsonProperty(value = "ic_concurso_especial")
  private Boolean icConcursoEspecial;
  private String resultadoOrdenado;
  private String duque;
  private Boolean error;
  private Boolean rateioProcessamento;
  private Boolean verificaAcumulado;
  private Boolean sorteioAcumulado;
  private String localSorteio;
  @JsonProperty(value = "ganhadoresPorUf")
  private List<QuinaGanhadoresPorUfWrapper> ganhadoresPorUfWrapper;
  private Boolean quinaSaoJoao;
  private String dataStr;
  @JsonProperty(value = "dt_proximo_concursoStr")
  private String dtProximoConcursoStr;

  public QuinaWrapper() {
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

  public Integer getGanhadoresQuadra() {
    return ganhadoresQuadra;
  }

  public void setGanhadoresQuadra(Integer ganhadoresQuadra) {
    this.ganhadoresQuadra = ganhadoresQuadra;
  }

  public Integer getGanhadoresTerno() {
    return ganhadoresTerno;
  }

  public void setGanhadoresTerno(Integer ganhadoresTerno) {
    this.ganhadoresTerno = ganhadoresTerno;
  }

  public Integer getQtGanhadoresDuque() {
    return qtGanhadoresDuque;
  }

  public void setQtGanhadoresDuque(Integer qtGanhadoresDuque) {
    this.qtGanhadoresDuque = qtGanhadoresDuque;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public BigDecimal getValorQuadra() {
    return valorQuadra;
  }

  public void setValorQuadra(BigDecimal valorQuadra) {
    this.valorQuadra = valorQuadra;
  }

  public BigDecimal getValorTerno() {
    return valorTerno;
  }

  public void setValorTerno(BigDecimal valorTerno) {
    this.valorTerno = valorTerno;
  }

  public BigDecimal getVrRateioDuque() {
    return vrRateioDuque;
  }

  public void setVrRateioDuque(BigDecimal vrRateioDuque) {
    this.vrRateioDuque = vrRateioDuque;
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

  public BigDecimal getVrAcumulado() {
    return vrAcumulado;
  }

  public void setVrAcumulado(BigDecimal vrAcumulado) {
    this.vrAcumulado = vrAcumulado;
  }

  public BigDecimal getVrAcumuladoEspecial() {
    return vrAcumuladoEspecial;
  }

  public void setVrAcumuladoEspecial(BigDecimal vrAcumuladoEspecial) {
    this.vrAcumuladoEspecial = vrAcumuladoEspecial;
  }

  public BigDecimal getVrEstimado() {
    return vrEstimado;
  }

  public void setVrEstimado(BigDecimal vrEstimado) {
    this.vrEstimado = vrEstimado;
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

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
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

  public String getResultadoOrdenado() {
    return resultadoOrdenado;
  }

  public void setResultadoOrdenado(String resultadoOrdenado) {
    this.resultadoOrdenado = resultadoOrdenado;
  }

  public String getDuque() {
    return duque;
  }

  public void setDuque(String duque) {
    this.duque = duque;
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

  public Boolean getVerificaAcumulado() {
    return verificaAcumulado;
  }

  public void setVerificaAcumulado(Boolean verificaAcumulado) {
    this.verificaAcumulado = verificaAcumulado;
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

  public List<QuinaGanhadoresPorUfWrapper> getGanhadoresPorUfWrapper() {
    return ganhadoresPorUfWrapper;
  }

  public void setGanhadoresPorUfWrapper(
      List<QuinaGanhadoresPorUfWrapper> ganhadoresPorUfWrapper) {
    this.ganhadoresPorUfWrapper = ganhadoresPorUfWrapper;
  }

  public Boolean getQuinaSaoJoao() {
    return quinaSaoJoao;
  }

  public void setQuinaSaoJoao(Boolean quinaSaoJoao) {
    this.quinaSaoJoao = quinaSaoJoao;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    QuinaWrapper that = (QuinaWrapper) o;

    return getConcurso().equals(that.getConcurso());
  }

  @Override
  public int hashCode() {
    return getConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "QuinaWrapper{" +
        "concurso=" + concurso +
        ", data=" + data +
        ", resultado='" + resultado + '\'' +
        ", ganhadores=" + ganhadores +
        ", ganhadoresQuadra=" + ganhadoresQuadra +
        ", ganhadoresTerno=" + ganhadoresTerno +
        ", qtGanhadoresDuque=" + qtGanhadoresDuque +
        ", valor=" + valor +
        ", valorQuadra=" + valorQuadra +
        ", valorTerno=" + valorTerno +
        ", vrRateioDuque=" + vrRateioDuque +
        ", noCidade='" + noCidade + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", vrAcumulado=" + vrAcumulado +
        ", vrAcumuladoEspecial=" + vrAcumuladoEspecial +
        ", vrEstimado=" + vrEstimado +
        ", dtProximoConcurso=" + dtProximoConcurso +
        ", vrArrecadado=" + vrArrecadado +
        ", observacao='" + observacao + '\'' +
        ", deLocalSorteio='" + deLocalSorteio + '\'' +
        ", icConcursoEspecial=" + icConcursoEspecial +
        ", resultadoOrdenado='" + resultadoOrdenado + '\'' +
        ", duque='" + duque + '\'' +
        ", error=" + error +
        ", rateioProcessamento=" + rateioProcessamento +
        ", verificaAcumulado=" + verificaAcumulado +
        ", sorteioAcumulado=" + sorteioAcumulado +
        ", localSorteio='" + localSorteio + '\'' +
        ", quinaGanhadoresPorUfWrapper=" + ganhadoresPorUfWrapper +
        ", quinaSaoJoao=" + quinaSaoJoao +
        ", dataStr='" + dataStr + '\'' +
        ", dtProximoConcursoStr='" + dtProximoConcursoStr + '\'' +
        '}';
  }
  
}
