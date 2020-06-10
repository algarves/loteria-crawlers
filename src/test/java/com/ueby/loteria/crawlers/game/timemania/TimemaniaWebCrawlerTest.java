package com.ueby.loteria.crawlers.game.timemania;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class TimemaniaWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.TIME_MANIA);

  @DisplayName("Timemania - Request by last contest")
  @Test
  public void shouldTimemaniaWebCrawlerByLastContestTest() {
    crawler.byLastContest();

    TimeManiaWrapper timemaniaWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(timemaniaWrapper.getNuConcurso());
  }

  @DisplayName("Timemania - Request by contest number")
  @Test
  public void shouldTimemaniaWebCrawlerByContestNumberTest() {
    final String contest = "1469";

    crawler.byContestNumber(Integer.parseInt(contest));

    TimeManiaWrapper timemaniaWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, timemaniaWrapper.getNuConcurso());
  }

}