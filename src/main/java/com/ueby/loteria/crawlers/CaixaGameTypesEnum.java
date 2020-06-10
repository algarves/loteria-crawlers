package com.ueby.loteria.crawlers;

import com.ueby.loteria.crawlers.game.diadesorte.DiaDeSorteWrapper;
import com.ueby.loteria.crawlers.game.duplasena.DuplaSenaWrapper;
import com.ueby.loteria.crawlers.game.federal.FederalWrapper;
import com.ueby.loteria.crawlers.game.loteca.LotecaWrapper;
import com.ueby.loteria.crawlers.game.lotofacil.LotoFacilWrapper;
import com.ueby.loteria.crawlers.game.lotogol.LotogolWrapper;
import com.ueby.loteria.crawlers.game.lotomania.LotoManiaWrapper;
import com.ueby.loteria.crawlers.game.megasena.MegaSenaWrapper;
import com.ueby.loteria.crawlers.game.quina.QuinaWrapper;
import com.ueby.loteria.crawlers.game.timemania.TimeManiaWrapper;

/**
 * @author Algarves, Khristian
 */
public enum CaixaGameTypesEnum {

  // @formatter:off
  MEGA_SENA("/landing/megasena/", MegaSenaWrapper.class),
  QUINA("/landing/quina/", QuinaWrapper.class),
  LOTO_FACIL("/landing/lotofacil/", LotoFacilWrapper.class),
  LOTO_MANIA("/landing/lotomania/", LotoManiaWrapper.class),
  DUPLA_SENA("/landing/duplasena/", DuplaSenaWrapper.class),
  TIME_MANIA("/landing/timemania/", TimeManiaWrapper.class),
  DIA_DE_SORTE("/landing/diadesorte/", DiaDeSorteWrapper.class),
  LOTECA("/landing/loteca/", LotecaWrapper.class),
  LOTOGOL("/landing/lotogol/", LotogolWrapper[].class),
  FEDERAL("/landing/federal/", FederalWrapper.class);
  // @formatter:on

  final String path;
  final Class<?> clazz;

  CaixaGameTypesEnum(String path, Class<?> clazz) {
    this.path = path;
    this.clazz = clazz;
  }

  public String getPath() {
    return path;
  }

  public Class<?> getClazz() {
    return clazz;
  }

  public static CaixaGameTypesEnum ofClazz(Class<?> clazz) {
    CaixaGameTypesEnum obj = null;
    for (CaixaGameTypesEnum v : values()) {
      if (v.getClazz().getTypeName().equals(clazz.getTypeName())) {
        obj = v;
        break;
      }
    }

    if (obj == null) {
      throw new IllegalArgumentException(
          "This class '" + clazz.getName() + "' is invalid type");
    }

    return obj;
  }

}
