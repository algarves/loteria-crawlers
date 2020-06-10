package com.ueby.loteria.crawlers.game.diadesorte;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class DiaDeSorteWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(
      CaixaGameTypesEnum.DIA_DE_SORTE);

  @DisplayName("DiaDeSorte - Request by last contest")
  @Test
  public void shouldDiaDeSorteWebCrawlerByLastContest() {
    crawler.byLastContest();

    DiaDeSorteWrapper diaDeSorteWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(diaDeSorteWrapper.getNuConcurso());
  }

  @DisplayName("DiaDeSorte - Request by contest number")
  @Test
  public void shouldDiaDeSorteWebCrawlerByContestNumber() {
    final String contest = "1";

    crawler.byContestNumber(Integer.parseInt(contest));

    DiaDeSorteWrapper diaDeSorteWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, diaDeSorteWrapper.getNuConcurso());
  }

}