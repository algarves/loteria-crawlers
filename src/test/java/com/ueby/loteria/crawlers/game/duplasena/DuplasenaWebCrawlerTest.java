package com.ueby.loteria.crawlers.game.duplasena;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class DuplasenaWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.DUPLA_SENA);

  @DisplayName("Duplasena - Request by last contest")
  @Test
  public void shouldDuplasenaWebCrawlerByLastContest() {
    crawler.byLastContest();

    DuplaSenaWrapper duplasenaWrapper = crawler.getMatchResult();

    Assertions.assertNotNull(duplasenaWrapper.getConcurso());
  }

  @DisplayName("Duplasena - Request by contest number")
  @Test
  public void shouldDuplasenaWebCrawlerByContestNumber() {
    final Integer contest = 1709;

    crawler.byContestNumber(contest);

    DuplaSenaWrapper duplasenaWrapper = crawler.getMatchResult();

    Assertions.assertEquals(contest, duplasenaWrapper.getConcurso());
  }

}