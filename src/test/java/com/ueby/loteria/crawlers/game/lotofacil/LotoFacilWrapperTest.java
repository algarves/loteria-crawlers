package com.ueby.loteria.crawlers.game.lotofacil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class LotoFacilWrapperTest {

  @Test
  public void shouldLotofacilWrapperTest() {
    LotoFacilWrapper lotofacilWrapper = new LotoFacilWrapper();
    List<LotoFacilGanhadoresPorUfWrapper> lotoFacilGanhadoresPorUfWrapperList = new ArrayList<>();

    lotofacilWrapper.setNuConcurso(12345);
    lotofacilWrapper.setDtApuracao(1L);
    lotofacilWrapper.setDeResultado("1,00");
    lotofacilWrapper.setDeObservacao(null);
    lotofacilWrapper.setQtGanhadorFaixa1(1);
    lotofacilWrapper.setQtGanhadorFaixa2(0);
    lotofacilWrapper.setQtGanhadorFaixa3(0);
    lotofacilWrapper.setQtGanhadorFaixa4(0);
    lotofacilWrapper.setQtGanhadorFaixa5(0);
    lotofacilWrapper.setVrRateioFaixa1(new BigDecimal("0.00"));
    lotofacilWrapper.setVrRateioFaixa2(new BigDecimal("0.00"));
    lotofacilWrapper.setVrRateioFaixa3(new BigDecimal("0.00"));
    lotofacilWrapper.setVrRateioFaixa4(new BigDecimal("0.00"));
    lotofacilWrapper.setVrRateioFaixa5(new BigDecimal("0.00"));
    lotofacilWrapper.setNoCidade("Criciúma");
    lotofacilWrapper.setSgUf("SC");
    lotofacilWrapper.setVrAcumuladoFaixa1("0,00");
    lotofacilWrapper.setVrAcumuladoFaixa2("0,00");
    lotofacilWrapper.setVrEstimativa("1,00");
    lotofacilWrapper.setDtProximoConcurso(1L);
    lotofacilWrapper.setVrArrecadado("1,00");
    lotofacilWrapper.setVrAcumuladoEspecial("0,00");
    lotofacilWrapper.setDeLocalSorteio("Criciúma");
    lotofacilWrapper.setIcConcursoEspecial(false);
    lotofacilWrapper.setSorteioAcumulado(false);
    lotofacilWrapper.setRateioProcessamento(false);
    lotofacilWrapper.setLocalSorteio("Criciúma");

    LotoFacilGanhadoresPorUfWrapper lotofacilGanhadoresPorUfWrapper = new LotoFacilGanhadoresPorUfWrapper();

    lotofacilGanhadoresPorUfWrapper.setCoLoteria("0");
    lotofacilGanhadoresPorUfWrapper.setNuConcurso(12345);
    lotofacilGanhadoresPorUfWrapper.setSgUf("SC");
    lotofacilGanhadoresPorUfWrapper.setQtGanhadores(1);
    lotofacilGanhadoresPorUfWrapper.setNoCidade("Criciúma");
    lotofacilGanhadoresPorUfWrapper.setTotal(new BigDecimal("0.00"));
    lotofacilGanhadoresPorUfWrapper.setIcCanalEletronico("T");

    lotoFacilGanhadoresPorUfWrapperList.add(lotofacilGanhadoresPorUfWrapper);

    lotofacilWrapper.setGanhadoresPorUfWrapper(lotoFacilGanhadoresPorUfWrapperList);
    lotofacilWrapper.setError(false);
    lotofacilWrapper.setResultadoOrdenado("0-1-2-3-4-5-6-7-8-9-10-11-12-13-14-15");
    lotofacilWrapper.setDtApuracaoStr("01/01/1970");
    lotofacilWrapper.setDtProximoConcursoStr("03/01/1970");

    if (lotofacilWrapper.getGanhadoresPorUfWrapper() != null
        && !lotofacilWrapper.getGanhadoresPorUfWrapper().isEmpty()) {

      Assertions
          .assertEquals("0", lotofacilWrapper.getGanhadoresPorUfWrapper().get(0).getCoLoteria());
      Assertions.assertEquals(12345, lotofacilWrapper.getGanhadoresPorUfWrapper().get(0)
          .getNuConcurso());
      Assertions.assertEquals("SC", lotofacilWrapper.getGanhadoresPorUfWrapper().get(0).getSgUf());
      Assertions.assertEquals(1, lotofacilWrapper.getGanhadoresPorUfWrapper().get(0)
          .getQtGanhadores());
      Assertions.assertEquals("Criciúma",
          lotofacilWrapper.getGanhadoresPorUfWrapper().get(0).getNoCidade());
      Assertions.assertEquals(new BigDecimal("0.00"),
          lotofacilWrapper.getGanhadoresPorUfWrapper().get(0).getTotal());
      Assertions.assertEquals("T", lotofacilWrapper.getGanhadoresPorUfWrapper().get(0)
          .getIcCanalEletronico());
    }

    Assertions.assertEquals(12345, lotofacilWrapper.getNuConcurso());
    Assertions.assertEquals(1L, lotofacilWrapper.getDtApuracao());
    Assertions.assertEquals("1,00", lotofacilWrapper.getDeResultado());
    Assertions.assertEquals(null, lotofacilWrapper.getDeObservacao());
    Assertions.assertEquals(1, lotofacilWrapper.getQtGanhadorFaixa1());
    Assertions.assertEquals(0, lotofacilWrapper.getQtGanhadorFaixa2());
    Assertions.assertEquals(0, lotofacilWrapper.getQtGanhadorFaixa3());
    Assertions.assertEquals(0, lotofacilWrapper.getQtGanhadorFaixa4());
    Assertions.assertEquals(0, lotofacilWrapper.getQtGanhadorFaixa5());
    Assertions.assertEquals(new BigDecimal("0.00"), lotofacilWrapper.getVrRateioFaixa1());
    Assertions.assertEquals(new BigDecimal("0.00"), lotofacilWrapper.getVrRateioFaixa2());
    Assertions.assertEquals(new BigDecimal("0.00"), lotofacilWrapper.getVrRateioFaixa3());
    Assertions.assertEquals(new BigDecimal("0.00"), lotofacilWrapper.getVrRateioFaixa4());
    Assertions.assertEquals(new BigDecimal("0.00"), lotofacilWrapper.getVrRateioFaixa5());
    Assertions.assertEquals("Criciúma", lotofacilWrapper.getNoCidade());
    Assertions.assertEquals("SC", lotofacilWrapper.getSgUf());
    Assertions.assertEquals("0,00", lotofacilWrapper.getVrAcumuladoFaixa1());
    Assertions.assertEquals("0,00", lotofacilWrapper.getVrAcumuladoFaixa2());
    Assertions.assertEquals("1,00", lotofacilWrapper.getVrEstimativa());
    Assertions.assertEquals(1L, lotofacilWrapper.getDtProximoConcurso());
    Assertions.assertEquals("1,00", lotofacilWrapper.getVrArrecadado());
    Assertions.assertEquals("0,00", lotofacilWrapper.getVrAcumuladoEspecial());
    Assertions.assertEquals("Criciúma", lotofacilWrapper.getDeLocalSorteio());
    Assertions.assertEquals(false, lotofacilWrapper.getIcConcursoEspecial());
    Assertions.assertEquals(false, lotofacilWrapper.getSorteioAcumulado());
    Assertions.assertEquals(false, lotofacilWrapper.getRateioProcessamento());
    Assertions.assertEquals("Criciúma", lotofacilWrapper.getLocalSorteio());

    Assertions.assertEquals(false, lotofacilWrapper.getError());
    Assertions.assertEquals("0-1-2-3-4-5-6-7-8-9-10-11-12-13-14-15",
        lotofacilWrapper.getResultadoOrdenado());
    Assertions.assertEquals("01/01/1970", lotofacilWrapper.getDtApuracaoStr());
    Assertions.assertEquals("03/01/1970", lotofacilWrapper.getDtProximoConcursoStr());
  }

}
