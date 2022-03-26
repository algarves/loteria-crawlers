package com.ueby.oss.loteria.crawlers.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Algarves, Khristian
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MunicipioUFGanhadores {

  private Integer ganhadores;

  private String municipio;

  @JsonProperty(value = "nomeFatansiaUL")
  private String nomeFantasia;

  private Integer posicao;

  private String serie;

  private String uf;

}
