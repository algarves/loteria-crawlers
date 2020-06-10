package com.ueby.loteria.crawlers.game.loteca;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class LotecaWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.LOTECA);

  @DisplayName("Loteca - Request by last contest")
  @Test
  public void shouldLotecaWebCrawlerByLastContest() {
    crawler.byLastContest();

    LotecaWrapper lotecaWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(lotecaWrapper.getConcurso());
  }

  @DisplayName("Loteca - Request by contest number")
  @Test
  public void shouldLotecaWebCrawlerByContestNumber() {
    final Integer contest = 850;

    crawler.byContestNumber(contest);

    LotecaWrapper lotecaWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, lotecaWrapper.getConcurso());
  }

}