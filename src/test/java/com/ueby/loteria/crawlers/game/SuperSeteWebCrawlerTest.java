package com.ueby.loteria.crawlers.game;

import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SuperSeteWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private static final CaixaGameType caixaGameType = CaixaGameType.SUPER_SETE;

  @BeforeAll
  public void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("Supersete - Request by last contest")
  @Test
  public void shouldLotofacilWebCrawlerByLastContest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("Supersete - Request by number contest")
  @Test
  public void shouldLotofacilWebCrawlerByNumberContest() {
    final Integer contest = 60;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}