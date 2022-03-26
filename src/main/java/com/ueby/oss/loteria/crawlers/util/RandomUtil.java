package com.ueby.oss.loteria.crawlers.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Algarves, Khristian
 */
@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtil {

  private static Random rand;

  static {
    try {
      rand = SecureRandom.getInstanceStrong();
    } catch (NoSuchAlgorithmException e) {
      log.error(e.getLocalizedMessage(), e);
    }
  }

  public static int getRandomNumInRange(final int min, final int max) {
    if (min > max) {
      throw new IllegalArgumentException("Max must be greater than min");
    }

    return rand.nextInt((max - min) + 1) + min;
  }

}
