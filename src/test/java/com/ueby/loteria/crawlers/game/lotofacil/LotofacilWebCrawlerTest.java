package com.ueby.loteria.crawlers.game.lotofacil;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class LotofacilWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.LOTO_FACIL);

  @DisplayName("Lotofacil - Request by last contest")
  @Test
  public void shouldLotofacilWebCrawlerByLastContest() {
    crawler.byLastContest();

    LotoFacilWrapper lotofacilWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(lotofacilWrapper.getNuConcurso());
  }

  @DisplayName("Lotofacil - Request by number contest")
  @Test
  public void shouldLotofacilWebCrawlerByNumberContest() {
    final Integer contest = 1000;

    crawler.byContestNumber(contest);

    LotoFacilWrapper lotofacilWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, lotofacilWrapper.getNuConcurso());
  }

}