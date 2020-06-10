package com.ueby.loteria.crawlers.game.lotofacil;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class LotoFacilGanhadoresPorUfWrapperTest {

  @Test
  public void shouldGanhadoresPorUfWrapperTest() {
    LotoFacilGanhadoresPorUfWrapper lotofacilGanhadoresPorUfWrapper = new LotoFacilGanhadoresPorUfWrapper();
    lotofacilGanhadoresPorUfWrapper.setCoLoteria("0");
    lotofacilGanhadoresPorUfWrapper.setNuConcurso(12345);
    lotofacilGanhadoresPorUfWrapper.setSgUf("SC");
    lotofacilGanhadoresPorUfWrapper.setQtGanhadores(1);
    lotofacilGanhadoresPorUfWrapper.setNoCidade("Criciúma");
    lotofacilGanhadoresPorUfWrapper.setTotal(new BigDecimal("1.00"));
    lotofacilGanhadoresPorUfWrapper.setIcCanalEletronico("T");

    String coLoteria = lotofacilGanhadoresPorUfWrapper.getCoLoteria();
    Integer nuConcurso = lotofacilGanhadoresPorUfWrapper.getNuConcurso();
    String sgUf = lotofacilGanhadoresPorUfWrapper.getSgUf();
    Integer qtGanhadores = lotofacilGanhadoresPorUfWrapper.getQtGanhadores();
    String noCidade = lotofacilGanhadoresPorUfWrapper.getNoCidade();
    BigDecimal total = lotofacilGanhadoresPorUfWrapper.getTotal();
    String icCanalEletronico = lotofacilGanhadoresPorUfWrapper.getIcCanalEletronico();

    Assertions.assertEquals("0", coLoteria);
    Assertions.assertEquals(12345, nuConcurso);
    Assertions.assertEquals("SC", sgUf);
    Assertions.assertEquals(1, qtGanhadores);
    Assertions.assertEquals("Criciúma", noCidade);
    Assertions.assertEquals(new BigDecimal("1.00"), total);
    Assertions.assertEquals("T", icCanalEletronico);
  }

}
