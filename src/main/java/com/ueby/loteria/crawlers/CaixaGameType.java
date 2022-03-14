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
  MEGA_SENA("/megasena/"),
  QUINA("/quina/"),
  LOTOFACIL("/lotofacil/"),
  LOTOMANIA("/lotomania/"),
  DUPLA_SENA("/duplasena/"),
  TIMEMANIA("/timemania/"),
  DIA_DE_SORTE("/diadesorte/"),
  LOTECA("/loteca/"),
  LOTERIA_FEDERAL("/federal/"),
  SUPER_SETE("/supersete/");
  // @formatter:on

  final String path;

}
