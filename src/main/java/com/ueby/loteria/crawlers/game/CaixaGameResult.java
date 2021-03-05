package com.ueby.loteria.crawlers.game;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ueby.loteria.crawlers.CaixaGameType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Algarves, Khristian
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CaixaGameResult {

  private Boolean acumulado;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  private LocalDate dataApuracao;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  private LocalDate dataProximoConcurso;

  private List<String> dezenasSorteadasOrdemSorteio;

  private int indicadorConcursoEspecial;

  private List<String> listaDezenas;

  private List<String> listaDezenasSegundoSorteio;

  private List<MunicipioUFGanhadores> listaMunicipioUFGanhadores;

  private List<RateioPremio> listaRateioPremio;

  private List<ResultadoEquipeEsportiva> listaResultadoEquipeEsportiva;

  private String localSorteio;

  private String nomeMunicipioUFSorteio;

  private String nomeTimeCoracaoMesSorte;

  @JsonProperty(value = "numero")
  private Integer numero;

  private String numeroConcursoAnterior;

  @JsonProperty(value = "numeroConcursoFinal_0_5")
  private Integer numeroConcursoFinal05;

  private String numeroConcursoProximo;

  private Integer numeroJogo;

  private String observacao;

  private Integer tipoPublicacao;

  private BigDecimal valorAcumuladoConcursoEspecial;

  @JsonProperty(value = "valorAcumuladoConcurso_0_5")
  private BigDecimal valorAcumuladoConcurso05;

  private BigDecimal valorAcumuladoProximoConcurso;

  private BigDecimal valorArrecadado;

  private BigDecimal valorEstimadoProximoConcurso;

  private BigDecimal valorTotalPremioFaixaUm;

  private CaixaGameType tipoJogo;

}
