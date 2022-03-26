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
class DiaDeSorteWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private final CaixaGameType caixaGameType = CaixaGameType.DIA_DE_SORTE;

  @BeforeAll
  void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("DiaDeSorte - Request by last contest")
  @Test
  void shouldDiaDeSorteWebCrawlerByLastContest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("DiaDeSorte - Request by contest number")
  @Test
  void shouldDiaDeSorteWebCrawlerByContestNumber() {
    final Integer contest = 1;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}
