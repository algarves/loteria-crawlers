package com.ueby.loteria.crawlers;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Algarves, Khristian
 */
@Getter
@AllArgsConstructor
public enum CaixaGameType {

  // @formatter:off
  MEGA_SENA("/landing/megasena/"),
  QUINA("/landing/quina/"),
  LOTOFACIL("/landing/lotofacil/"),
  LOTOMANIA("/landing/lotomania/"),
  DUPLA_SENA("/landing/duplasena/"),
  TIMEMANIA("/landing/timemania/"),
  DIA_DE_SORTE("/landing/diadesorte/"),
  LOTECA("/landing/loteca/"),
  LOTERIA_FEDERAL("/landing/federal/"),
  SUPER_SETE("/landing/supersete/");
  // @formatter:on

  final String path;

}
