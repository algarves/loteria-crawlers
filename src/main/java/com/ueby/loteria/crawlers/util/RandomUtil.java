package com.ueby.loteria.crawlers.util;

import java.util.Random;

/**
 * @author Algarves, Khristian
 */
public final class RandomUtil {

  public static int getRandomNumInRange(final int min, final int max) {
    if (min > max) {
      throw new IllegalArgumentException("Max must be greater than min");
    }

    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

}
