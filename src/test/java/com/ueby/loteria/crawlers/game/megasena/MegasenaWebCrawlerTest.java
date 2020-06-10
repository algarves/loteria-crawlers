package com.ueby.loteria.crawlers.game.megasena;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class MegasenaWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.MEGA_SENA);

  @DisplayName("Megasena - Request by last contest")
  @Test
  public void shouldMegasenaWebCrawlerByLastContest() {
    crawler.byLastContest();

    MegaSenaWrapper megasenaWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(megasenaWrapper.getConcurso());
  }

  @DisplayName("Megasena - Request by contest number")
  @Test
  public void shouldMegasenaWebCrawlerByContestNumber() {
    final Integer contest = 2110;

    crawler.byContestNumber(contest);

    MegaSenaWrapper megasenaWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, megasenaWrapper.getConcurso());
  }

}