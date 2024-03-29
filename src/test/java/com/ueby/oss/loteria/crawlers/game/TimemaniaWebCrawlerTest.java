package com.ueby.oss.loteria.crawlers.game;

import com.ueby.oss.loteria.crawlers.CaixaGameType;
import com.ueby.oss.loteria.crawlers.IntegrationTest;
import com.ueby.oss.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@IntegrationTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TimemaniaWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private static final CaixaGameType caixaGameType = CaixaGameType.TIMEMANIA;

  @BeforeAll
  void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("Timemania - Request by last contest")
  @Test
  void shouldTimemaniaWebCrawlerByLastContestTest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("Timemania - Request by contest number")
  @Test
  void shouldTimemaniaWebCrawlerByContestNumberTest() {
    final Integer contest = 1469;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}
