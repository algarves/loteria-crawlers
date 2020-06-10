package com.ueby.loteria.crawlers.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class RandomUtilTest {

  @DisplayName("Random number in range")
  @Test
  public void shouldRandomNumberInRange() {
    final int rand = RandomUtil.getRandomNumInRange(1, 60);

    Assertions.assertTrue(rand >= 1 && rand <= 60);
  }

  @DisplayName("Invalid Range Number")
  @Test
  public void shouldInvalidRangeNumber() {
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
      RandomUtil.getRandomNumInRange(60, 1);
    });

    String expectedMessage = "Max must be greater than min";
    String actualMessage = exception.getMessage();

    Assertions.assertTrue(actualMessage.contains(expectedMessage));
  }

}
