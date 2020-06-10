package com.ueby.loteria.crawlers.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Algarves, Khristian
 */
public final class JsonUtil {

  private static final Logger LOGGER = LogManager.getLogger();
  private static volatile ObjectMapper mapper = null;

  static {
    mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, false)
        .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
  }

  public static String toJson(final Object data) {
    try {
      return mapper.writeValueAsString(data);
    } catch (Exception e) {
      LOGGER.error(e.getLocalizedMessage(), e);
      throw new RuntimeException(e);
    }
  }

  public static <A> A fromJson(String json, Class<A> clazz) {
    Objects.requireNonNull(json, "Value cannot be null.");
    try {
      return mapper.readValue(json, clazz);
    } catch (JsonParseException e) {
      LOGGER.error(e.getLocalizedMessage(), e);
      throw new RuntimeException(e.getLocalizedMessage());
    } catch (Exception e) {
      LOGGER.error(e.getLocalizedMessage(), e);
      throw new RuntimeException(e.getLocalizedMessage());
    }
  }

  public static boolean isValid(final String json) {
    try {
      mapper.readTree(json);
      return true;
    } catch (IOException e) {
      return false;
    }
  }

}
