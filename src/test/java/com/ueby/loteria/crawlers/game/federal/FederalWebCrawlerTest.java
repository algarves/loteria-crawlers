package com.ueby.loteria.crawlers.game.federal;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class FederalWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.FEDERAL);

  @DisplayName("Federal - Request by last contest")
  @Test
  public void shouldFederalWebCrawlerByLastContest() {
    crawler.byLastContest();

    FederalWrapper federalWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(federalWrapper.getConcurso());
  }

  @DisplayName("Federal - Request by contest number")
  @Test
  public void shouldFederalWebCrawlerByContestNumber() {
    final String concourse = "05476";

    crawler.byContestNumber(Integer.parseInt(concourse));

    FederalWrapper federalWrapper = crawler.getMatchResult();

    Assertions.assertEquals(concourse, federalWrapper.getConcurso());
  }

}