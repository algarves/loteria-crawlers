package com.ueby.loteria.crawlers.game;

import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TimemaniaWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private static final CaixaGameType caixaGameType = CaixaGameType.TIMEMANIA;

  @BeforeAll
  public void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("Timemania - Request by last contest")
  @Test
  public void shouldTimemaniaWebCrawlerByLastContestTest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("Timemania - Request by contest number")
  @Test
  public void shouldTimemaniaWebCrawlerByContestNumberTest() {
    final Integer contest = 1469;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}