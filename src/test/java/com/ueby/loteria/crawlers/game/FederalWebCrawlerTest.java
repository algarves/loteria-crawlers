package com.ueby.loteria.crawlers.game;

import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.IntegrationTest;
import com.ueby.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@IntegrationTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FederalWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private final CaixaGameType caixaGameType = CaixaGameType.LOTERIA_FEDERAL;

  @BeforeAll
  void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("Federal - Request by last contest")
  @Test
  void shouldFederalWebCrawlerByLastContest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("Federal - Request by contest number")
  @Test
  void shouldFederalWebCrawlerByContestNumber() {
    final Integer concourse = 5476;

    crawler.byContestNumber(concourse);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(concourse, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}
