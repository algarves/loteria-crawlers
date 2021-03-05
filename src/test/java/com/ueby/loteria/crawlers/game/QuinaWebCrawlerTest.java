package com.ueby.loteria.crawlers.game;

import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QuinaWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private final CaixaGameType caixaGameType = CaixaGameType.QUINA;

  @BeforeAll
  public void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("Quina - Request by last contest")
  @Test
  public void shouldQuinaWebCrawlerByLastContest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("Quina - Request by contest number")
  @Test
  public void shouldQuinaWebCrawlerByContestNumber() {
    final Integer contest = 2110;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}