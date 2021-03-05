package com.ueby.loteria.crawlers.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Algarves, Khristian
 */
@Getter
@Setter
@ToString
public class RateioPremio {

  private String descricaoFaixa;

  private Integer faixa;

  private Integer numeroDeGanhadores;

  private BigDecimal valorPremio;

}
