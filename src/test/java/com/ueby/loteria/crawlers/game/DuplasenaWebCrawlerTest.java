package com.ueby.loteria.crawlers.game;

import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DuplasenaWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private final CaixaGameType caixaGameType = CaixaGameType.DUPLA_SENA;

  @BeforeAll
  public void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("Duplasena - Request by last contest")
  @Test
  public void shouldDuplasenaWebCrawlerByLastContest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("Duplasena - Request by contest number")
  @Test
  public void shouldDuplasenaWebCrawlerByContestNumber() {
    final Integer contest = 1709;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}