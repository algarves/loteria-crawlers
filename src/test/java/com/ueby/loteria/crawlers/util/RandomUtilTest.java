package com.ueby.loteria.crawlers.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
class RandomUtilTest {

  @DisplayName("Return a random number in the given range")
  @Test
  void shouldReturnRandomNumberInTheGivenRange() {
    final int rand = RandomUtil.getRandomNumInRange(1, 60);

    Assertions.assertTrue(rand >= 1 && rand <= 60);
  }

  @DisplayName("Invalid Range Number")
  @Test
  void shouldThrowTheExceptionWhenInvalidRange() {
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
      RandomUtil.getRandomNumInRange(60, 1);
    });

    String expectedMessage = "Max must be greater than min";
    String actualMessage = exception.getMessage();

    Assertions.assertTrue(actualMessage.contains(expectedMessage));
  }

  @DisplayName("Equals Range Number")
  @Test
  void shouldThrowTheExceptionWhenEqualsRange() {
    int expectedNumber = 1;
    int num = RandomUtil.getRandomNumInRange(1, 1);

    Assertions.assertEquals(expectedNumber, num);
  }

}
