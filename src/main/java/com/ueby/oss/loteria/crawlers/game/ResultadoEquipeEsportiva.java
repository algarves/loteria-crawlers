package com.ueby.oss.loteria.crawlers.game;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Algarves, Khristian
 */
@Getter
@Setter
@ToString
public class ResultadoEquipeEsportiva {

  private String diaSemana;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  @JsonProperty("dtJogo")
  private LocalDate dataJogo;

  private Integer icSorteioResultado;

  private String nomeCampeonato;

  private String nomeEquipeDois;

  private String nomeEquipeUm;

  private Integer nuConcurso;

  private Integer nuGolEquipeDois;

  private Integer nuGolEquipeUm;

  private Integer nuJogo;

  private Integer nuSequencial;

  private String resultado;

  private String siglaPaisDois;

  private String siglaPaisUm;

  private String siglaUFDois;

  private String siglaUFUm;

}
