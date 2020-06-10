package com.ueby.loteria.crawlers.game.lotomania;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class LotomaniaWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.LOTO_MANIA);

  @DisplayName("Lotomania - Request by last contest")
  @Test
  public void shouldLotomaniaWebCrawlerByLastContest() {
    crawler.byLastContest();

    LotoManiaWrapper lotomaniaWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(lotomaniaWrapper.getConcurso());
  }

  @DisplayName("Lotomania - Request by contest number")
  @Test
  public void shouldLotomaniaWebCrawlerByContestNumber() {
    final Integer contest = 1000;

    crawler.byContestNumber(contest);

    LotoManiaWrapper lotomaniaWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, lotomaniaWrapper.getConcurso());
  }

}