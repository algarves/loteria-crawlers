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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class GameTypesEnumTest {

  private CaixaGameTypesEnum caixaGameTypesEnum;

  @DisplayName("Get path of game types")
  @Test
  public void shouldGameTypesEnumGetPath() {
    caixaGameTypesEnum = CaixaGameTypesEnum.MEGA_SENA;
    Assertions.assertEquals("/landing/megasena/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.QUINA;
    Assertions.assertEquals("/landing/quina/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTO_FACIL;
    Assertions.assertEquals("/landing/lotofacil/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTO_MANIA;
    Assertions.assertEquals("/landing/lotomania/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.DUPLA_SENA;
    Assertions.assertEquals("/landing/duplasena/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.TIME_MANIA;
    Assertions.assertEquals("/landing/timemania/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.DIA_DE_SORTE;
    Assertions.assertEquals("/landing/diadesorte/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTECA;
    Assertions.assertEquals("/landing/loteca/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTOGOL;
    Assertions.assertEquals("/landing/lotogol/", caixaGameTypesEnum.getPath());

    caixaGameTypesEnum = CaixaGameTypesEnum.FEDERAL;
    Assertions.assertEquals("/landing/federal/", caixaGameTypesEnum.getPath());
  }

  @DisplayName("Get clazz of game types")
  @Test
  public void shouldGameTypesEnumGetClazz() {
    caixaGameTypesEnum = CaixaGameTypesEnum.MEGA_SENA;
    Assertions.assertEquals(MegaSenaWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.QUINA;
    Assertions.assertEquals(QuinaWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTO_FACIL;
    Assertions.assertEquals(LotoFacilWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTO_MANIA;
    Assertions.assertEquals(LotoManiaWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.DUPLA_SENA;
    Assertions.assertEquals(DuplaSenaWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.TIME_MANIA;
    Assertions.assertEquals(TimeManiaWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.DIA_DE_SORTE;
    Assertions.assertEquals(DiaDeSorteWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTECA;
    Assertions.assertEquals(LotecaWrapper.class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.LOTOGOL;
    Assertions.assertEquals(LotogolWrapper[].class, caixaGameTypesEnum.getClazz());

    caixaGameTypesEnum = CaixaGameTypesEnum.FEDERAL;
    Assertions.assertEquals(FederalWrapper.class, caixaGameTypesEnum.getClazz());
  }

}
