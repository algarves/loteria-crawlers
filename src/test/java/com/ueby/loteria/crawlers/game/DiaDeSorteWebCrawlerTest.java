package com.ueby.loteria.crawlers.game;

import com.ueby.loteria.crawlers.CaixaGameType;
import com.ueby.loteria.crawlers.service.CaixaWebCrawlerService;
import org.junit.jupiter.api.*;

/**
 * @author Algarves, Khristian
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DiaDeSorteWebCrawlerTest {

  private CaixaWebCrawlerService crawler;
  private final CaixaGameType caixaGameType = CaixaGameType.DIA_DE_SORTE;

  @BeforeAll
  public void setUp() {
    crawler = new CaixaWebCrawlerService(caixaGameType);
  }

  @DisplayName("DiaDeSorte - Request by last contest")
  @Test
  public void shouldDiaDeSorteWebCrawlerByLastContest() {
    crawler.byLastContest();

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertNotNull(caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

  @DisplayName("DiaDeSorte - Request by contest number")
  @Test
  public void shouldDiaDeSorteWebCrawlerByContestNumber() {
    final Integer contest = 1;

    crawler.byContestNumber(contest);

    CaixaGameResult caixaGameResult = crawler.getMatchResult();

    Assertions.assertEquals(contest, caixaGameResult.getNumero());
    Assertions.assertEquals(caixaGameType, caixaGameResult.getTipoJogo());
  }

}