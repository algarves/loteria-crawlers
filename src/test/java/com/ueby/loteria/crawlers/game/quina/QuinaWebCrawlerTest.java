package com.ueby.loteria.crawlers.game.quina;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class QuinaWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.QUINA);

  @DisplayName("Quina - Request by last contest")
  @Test
  public void shouldQuinaWebCrawlerByLastContest() {
    crawler.byLastContest();

    QuinaWrapper quinaWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(quinaWrapper.getConcurso());
  }

  @DisplayName("Quina - Request by contest number")
  @Test
  public void shouldQuinaWebCrawlerByContestNumber() {
    final Integer contest = 2110;

    crawler.byContestNumber(contest);

    QuinaWrapper quinaWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, quinaWrapper.getConcurso());
  }

}