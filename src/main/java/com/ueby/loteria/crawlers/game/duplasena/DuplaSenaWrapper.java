package com.ueby.loteria.crawlers.game.duplasena;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.game.BaseCaixaGameWrapper;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
public class DuplaSenaWrapper extends BaseCaixaGameWrapper {

  private Integer concurso;
  private Long data;
  private Long dtinclusao;
  @JsonProperty(value = "resultado_sorteio1")
  private String resultadoSorteio1;
  @JsonProperty(value = "ganhadores_sena1")
  private Integer ganhadoresSena1;
  @JsonProperty(value = "valor_sena1")
  private BigDecimal valorSena1;
  @JsonProperty(value = "acumulado_sena1")
  private String acumuladoSena1;
  @JsonProperty(value = "valor_acumulado_sena1")
  private BigDecimal valorAcumuladoSena1;
  @JsonProperty(value = "resultado_sorteio2")
  private String resultadoSorteio2;
  @JsonProperty(value = "ganhadores_sena2")
  private Integer ganhadoresSena2;
  @JsonProperty(value = "valor_sena2")
  private BigDecimal valorSena2;
  @JsonProperty(value = "ganhadores_quina2")
  private Integer ganhadoresQuina2;
  @JsonProperty(value = "valor_quina2")
  private BigDecimal valorQuina2;
  @JsonProperty(value = "ganhadores_quadra2")
  private Integer ganhadoresQuadra2;
  @JsonProperty(value = "valor_quadra2")
  private BigDecimal valorQuadra2;
  private String observacao;
  @JsonProperty(value = "ic_conferido")
  private String icConferido;
  @JsonProperty(value = "de_local_sorteio1")
  private String deLocalSorteio1;
  @JsonProperty(value = "no_cidade")
  private String noCidade;
  @JsonProperty(value = "sg_uf")
  private String sgUf;
  @JsonProperty(value = "valor_estimativa")
  private BigDecimal valorEstimativa;
  @JsonProperty(value = "data_proximo_concurso")
  private Long dataProximoConcurso;
  @JsonProperty(value = "vr_arrecadado")
  private BigDecimal vrArrecadado;
  @JsonProperty(value = "qt_ganhador_quina_faixa1")
  private Integer qtGanhadorQuinaFaixa1;
  @JsonProperty(value = "vr_quina_faixa1")
  private BigDecimal vrQuinaFaixa1;
  @JsonProperty(value = "qt_ganhador_quadra_faixa1")
  private Integer qtGanhadorQuadraFaixa1;
  @JsonProperty(value = "vr_quadra_faixa1")
  private BigDecimal vrQuadraFaixa1;
  @JsonProperty(value = "vr_acumulado_especial")
  private BigDecimal vrAcumuladoEspecial;
  @JsonProperty(value = "qt_ganhador_terno_faixa1")
  private Integer qtGanhadorTernoFaixa1;
  @JsonProperty(value = "vr_terno_faixa1")
  private BigDecimal vrTernoFaixa1;
  @JsonProperty(value = "qt_ganhador_terno_faixa2")
  private Integer qtGanhadorTernoFaixa2;
  @JsonProperty(value = "vr_terno_faixa2")
  private BigDecimal vrTernoFaixa2;
  @JsonProperty(value = "ic_concurso_especial")
  private Boolean icConcursoEspecial;
  private Boolean error;
  private Boolean acumulado;
  private Boolean previaNormal;
  private Boolean previaEspecial;
  @JsonProperty(value = "ganhadoresPorRegiao1")
  private List<DuplaSenaGanhadoresPorRegiao1> ganhadoresPorRegiao1;
  @JsonProperty(value = "ganhadoresPorRegiao2")
  private List<DuplaSenaGanhadoresPorRegiao2> ganhadoresPorRegiao2;
  private String resultadoOrdenadoSorteio1;
  private String resultadoOrdenadoSorteio2;
  private String data_proximo_concursoStr;
  private String dataStr;
  private String descricaoLocalSorteio;

  public DuplaSenaWrapper() {
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

  public Long getDtinclusao() {
    return dtinclusao;
  }

  public void setDtinclusao(Long dtinclusao) {
    this.dtinclusao = dtinclusao;
  }

  public String getResultadoSorteio1() {
    return resultadoSorteio1;
  }

  public void setResultadoSorteio1(String resultadoSorteio1) {
    this.resultadoSorteio1 = resultadoSorteio1;
  }

  public Integer getGanhadoresSena1() {
    return ganhadoresSena1;
  }

  public void setGanhadoresSena1(Integer ganhadoresSena1) {
    this.ganhadoresSena1 = ganhadoresSena1;
  }

  public BigDecimal getValorSena1() {
    return valorSena1;
  }

  public void setValorSena1(BigDecimal valorSena1) {
    this.valorSena1 = valorSena1;
  }

  public String getAcumuladoSena1() {
    return acumuladoSena1;
  }

  public void setAcumuladoSena1(String acumuladoSena1) {
    this.acumuladoSena1 = acumuladoSena1;
  }

  public BigDecimal getValorAcumuladoSena1() {
    return valorAcumuladoSena1;
  }

  public void setValorAcumuladoSena1(BigDecimal valorAcumuladoSena1) {
    this.valorAcumuladoSena1 = valorAcumuladoSena1;
  }

  public String getResultadoSorteio2() {
    return resultadoSorteio2;
  }

  public void setResultadoSorteio2(String resultadoSorteio2) {
    this.resultadoSorteio2 = resultadoSorteio2;
  }

  public Integer getGanhadoresSena2() {
    return ganhadoresSena2;
  }

  public void setGanhadoresSena2(Integer ganhadoresSena2) {
    this.ganhadoresSena2 = ganhadoresSena2;
  }

  public BigDecimal getValorSena2() {
    return valorSena2;
  }

  public void setValorSena2(BigDecimal valorSena2) {
    this.valorSena2 = valorSena2;
  }

  public Integer getGanhadoresQuina2() {
    return ganhadoresQuina2;
  }

  public void setGanhadoresQuina2(Integer ganhadoresQuina2) {
    this.ganhadoresQuina2 = ganhadoresQuina2;
  }

  public BigDecimal getValorQuina2() {
    return valorQuina2;
  }

  public void setValorQuina2(BigDecimal valorQuina2) {
    this.valorQuina2 = valorQuina2;
  }

  public Integer getGanhadoresQuadra2() {
    return ganhadoresQuadra2;
  }

  public void setGanhadoresQuadra2(Integer ganhadoresQuadra2) {
    this.ganhadoresQuadra2 = ganhadoresQuadra2;
  }

  public BigDecimal getValorQuadra2() {
    return valorQuadra2;
  }

  public void setValorQuadra2(BigDecimal valorQuadra2) {
    this.valorQuadra2 = valorQuadra2;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public String getIcConferido() {
    return icConferido;
  }

  public void setIcConferido(String icConferido) {
    this.icConferido = icConferido;
  }

  public String getDeLocalSorteio1() {
    return deLocalSorteio1;
  }

  public void setDeLocalSorteio1(String deLocalSorteio1) {
    this.deLocalSorteio1 = deLocalSorteio1;
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

  public BigDecimal getValorEstimativa() {
    return valorEstimativa;
  }

  public void setValorEstimativa(BigDecimal valorEstimativa) {
    this.valorEstimativa = valorEstimativa;
  }

  public Long getDataProximoConcurso() {
    return dataProximoConcurso;
  }

  public void setDataProximoConcurso(Long dataProximoConcurso) {
    this.dataProximoConcurso = dataProximoConcurso;
  }

  public BigDecimal getVrArrecadado() {
    return vrArrecadado;
  }

  public void setVrArrecadado(BigDecimal vrArrecadado) {
    this.vrArrecadado = vrArrecadado;
  }

  public Integer getQtGanhadorQuinaFaixa1() {
    return qtGanhadorQuinaFaixa1;
  }

  public void setQtGanhadorQuinaFaixa1(Integer qtGanhadorQuinaFaixa1) {
    this.qtGanhadorQuinaFaixa1 = qtGanhadorQuinaFaixa1;
  }

  public BigDecimal getVrQuinaFaixa1() {
    return vrQuinaFaixa1;
  }

  public void setVrQuinaFaixa1(BigDecimal vrQuinaFaixa1) {
    this.vrQuinaFaixa1 = vrQuinaFaixa1;
  }

  public Integer getQtGanhadorQuadraFaixa1() {
    return qtGanhadorQuadraFaixa1;
  }

  public void setQtGanhadorQuadraFaixa1(Integer qtGanhadorQuadraFaixa1) {
    this.qtGanhadorQuadraFaixa1 = qtGanhadorQuadraFaixa1;
  }

  public BigDecimal getVrQuadraFaixa1() {
    return vrQuadraFaixa1;
  }

  public void setVrQuadraFaixa1(BigDecimal vrQuadraFaixa1) {
    this.vrQuadraFaixa1 = vrQuadraFaixa1;
  }

  public BigDecimal getVrAcumuladoEspecial() {
    return vrAcumuladoEspecial;
  }

  public void setVrAcumuladoEspecial(BigDecimal vrAcumuladoEspecial) {
    this.vrAcumuladoEspecial = vrAcumuladoEspecial;
  }

  public Integer getQtGanhadorTernoFaixa1() {
    return qtGanhadorTernoFaixa1;
  }

  public void setQtGanhadorTernoFaixa1(Integer qtGanhadorTernoFaixa1) {
    this.qtGanhadorTernoFaixa1 = qtGanhadorTernoFaixa1;
  }

  public BigDecimal getVrTernoFaixa1() {
    return vrTernoFaixa1;
  }

  public void setVrTernoFaixa1(BigDecimal vrTernoFaixa1) {
    this.vrTernoFaixa1 = vrTernoFaixa1;
  }

  public Integer getQtGanhadorTernoFaixa2() {
    return qtGanhadorTernoFaixa2;
  }

  public void setQtGanhadorTernoFaixa2(Integer qtGanhadorTernoFaixa2) {
    this.qtGanhadorTernoFaixa2 = qtGanhadorTernoFaixa2;
  }

  public BigDecimal getVrTernoFaixa2() {
    return vrTernoFaixa2;
  }

  public void setVrTernoFaixa2(BigDecimal vrTernoFaixa2) {
    this.vrTernoFaixa2 = vrTernoFaixa2;
  }

  public Boolean getIcConcursoEspecial() {
    return icConcursoEspecial;
  }

  public void setIcConcursoEspecial(Boolean icConcursoEspecial) {
    this.icConcursoEspecial = icConcursoEspecial;
  }

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public Boolean getAcumulado() {
    return acumulado;
  }

  public void setAcumulado(Boolean acumulado) {
    this.acumulado = acumulado;
  }

  public Boolean getPreviaNormal() {
    return previaNormal;
  }

  public void setPreviaNormal(Boolean previaNormal) {
    this.previaNormal = previaNormal;
  }

  public Boolean getPreviaEspecial() {
    return previaEspecial;
  }

  public void setPreviaEspecial(Boolean previaEspecial) {
    this.previaEspecial = previaEspecial;
  }

  public List<DuplaSenaGanhadoresPorRegiao1> getGanhadoresPorRegiao1() {
    return ganhadoresPorRegiao1;
  }

  public void setGanhadoresPorRegiao1(
      List<DuplaSenaGanhadoresPorRegiao1> ganhadoresPorRegiao1) {
    this.ganhadoresPorRegiao1 = ganhadoresPorRegiao1;
  }

  public List<DuplaSenaGanhadoresPorRegiao2> getGanhadoresPorRegiao2() {
    return ganhadoresPorRegiao2;
  }

  public void setGanhadoresPorRegiao2(
      List<DuplaSenaGanhadoresPorRegiao2> ganhadoresPorRegiao2) {
    this.ganhadoresPorRegiao2 = ganhadoresPorRegiao2;
  }

  public String getResultadoOrdenadoSorteio1() {
    return resultadoOrdenadoSorteio1;
  }

  public void setResultadoOrdenadoSorteio1(String resultadoOrdenadoSorteio1) {
    this.resultadoOrdenadoSorteio1 = resultadoOrdenadoSorteio1;
  }

  public String getResultadoOrdenadoSorteio2() {
    return resultadoOrdenadoSorteio2;
  }

  public void setResultadoOrdenadoSorteio2(String resultadoOrdenadoSorteio2) {
    this.resultadoOrdenadoSorteio2 = resultadoOrdenadoSorteio2;
  }

  public String getData_proximo_concursoStr() {
    return data_proximo_concursoStr;
  }

  public void setData_proximo_concursoStr(String data_proximo_concursoStr) {
    this.data_proximo_concursoStr = data_proximo_concursoStr;
  }

  public String getDataStr() {
    return dataStr;
  }

  public void setDataStr(String dataStr) {
    this.dataStr = dataStr;
  }

  public String getDescricaoLocalSorteio() {
    return descricaoLocalSorteio;
  }

  public void setDescricaoLocalSorteio(String descricaoLocalSorteio) {
    this.descricaoLocalSorteio = descricaoLocalSorteio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    DuplaSenaWrapper that = (DuplaSenaWrapper) o;

    return getConcurso().equals(that.getConcurso());
  }

  @Override
  public int hashCode() {
    return getConcurso().hashCode();
  }

  @Override
  public String toString() {
    return "DuplasenaWrapper{" +
        "concurso=" + concurso +
        ", data=" + data +
        ", dtinclusao=" + dtinclusao +
        ", resultadoSorteio1='" + resultadoSorteio1 + '\'' +
        ", ganhadoresSena1=" + ganhadoresSena1 +
        ", valorSena1=" + valorSena1 +
        ", acumuladoSena1='" + acumuladoSena1 + '\'' +
        ", valorAcumuladoSena1=" + valorAcumuladoSena1 +
        ", resultadoSorteio2='" + resultadoSorteio2 + '\'' +
        ", ganhadoresSena2=" + ganhadoresSena2 +
        ", valorSena2=" + valorSena2 +
        ", ganhadoresQuina2=" + ganhadoresQuina2 +
        ", valorQuina2=" + valorQuina2 +
        ", ganhadoresQuadra2=" + ganhadoresQuadra2 +
        ", valorQuadra2=" + valorQuadra2 +
        ", observacao='" + observacao + '\'' +
        ", icConferido='" + icConferido + '\'' +
        ", deLocalSorteio1='" + deLocalSorteio1 + '\'' +
        ", noCidade='" + noCidade + '\'' +
        ", sgUf='" + sgUf + '\'' +
        ", valorEstimativa=" + valorEstimativa +
        ", dataProximoConcurso=" + dataProximoConcurso +
        ", vrArrecadado=" + vrArrecadado +
        ", qtGanhadorQuinaFaixa1=" + qtGanhadorQuinaFaixa1 +
        ", vrQuinaFaixa1=" + vrQuinaFaixa1 +
        ", qtGanhadorQuadraFaixa1=" + qtGanhadorQuadraFaixa1 +
        ", vrQuadraFaixa1=" + vrQuadraFaixa1 +
        ", vrAcumuladoEspecial=" + vrAcumuladoEspecial +
        ", qtGanhadorTernoFaixa1=" + qtGanhadorTernoFaixa1 +
        ", vrTernoFaixa1=" + vrTernoFaixa1 +
        ", qtGanhadorTernoFaixa2=" + qtGanhadorTernoFaixa2 +
        ", vrTernoFaixa2=" + vrTernoFaixa2 +
        ", icConcursoEspecial=" + icConcursoEspecial +
        ", error=" + error +
        ", acumulado=" + acumulado +
        ", previaNormal=" + previaNormal +
        ", previaEspecial=" + previaEspecial +
        ", ganhadoresPorRegiao1=" + ganhadoresPorRegiao1 +
        ", ganhadoresPorRegiao2=" + ganhadoresPorRegiao2 +
        ", resultadoOrdenadoSorteio1='" + resultadoOrdenadoSorteio1 + '\'' +
        ", resultadoOrdenadoSorteio2='" + resultadoOrdenadoSorteio2 + '\'' +
        ", data_proximo_concursoStr='" + data_proximo_concursoStr + '\'' +
        ", dataStr='" + dataStr + '\'' +
        ", descricaoLocalSorteio='" + descricaoLocalSorteio + '\'' +
        '}';
  }
  
}
