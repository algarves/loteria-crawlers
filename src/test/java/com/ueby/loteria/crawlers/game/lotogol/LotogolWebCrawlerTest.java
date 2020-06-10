package com.ueby.loteria.crawlers.game.lotogol;

import com.ueby.loteria.crawlers.CaixaGameTypesEnum;
import com.ueby.loteria.crawlers.CaixaWebCrawlerFacade;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class LotogolWebCrawlerTest {

  private CaixaWebCrawlerFacade crawler = new CaixaWebCrawlerFacade(CaixaGameTypesEnum.LOTOGOL);

  @DisplayName("Lotogol - Request by last contest")
  @Test
  public void shouldCLotogolWebCrawlerByLastContest() {
    crawler.byLastContest();

    LotogolWrapper lotogolWrapperArr[] = crawler.getMatchResult();

    Assertions.assertNotNull(lotogolWrapperArr);

    String coConcurso = lotogolWrapperArr[0].getCoConcurso();
    Arrays.asList(lotogolWrapperArr).forEach(lotogolWrapper -> {
      Assertions.assertEquals(coConcurso, lotogolWrapper.getCoConcurso());
    });
  }

  @DisplayName("Lotogol - Request by contest number")
  @Test
  public void shouldLotogolWebCrawlerByContestNumber() {
    final String contest = "1054";

    crawler.byContestNumber(Integer.parseInt(contest));

    LotogolWrapper lotogolWrapperArr[] = crawler.getMatchResult();

    Assertions.assertNotNull(lotogolWrapperArr);

    String coConcurso = lotogolWrapperArr[0].getCoConcurso();
    Arrays.asList(lotogolWrapperArr).forEach(lotogolWrapper -> {
      Assertions.assertEquals(coConcurso, lotogolWrapper.getCoConcurso());
    });
  }

}