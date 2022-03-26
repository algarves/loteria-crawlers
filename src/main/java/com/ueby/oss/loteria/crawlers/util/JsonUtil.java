package com.ueby.oss.loteria.crawlers.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.ueby.oss.loteria.crawlers.exception.JsonParseErrorException;
import java.io.IOException;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author Algarves, Khristian
 */
@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonUtil {

  private static final ObjectMapper mapper;

  static {
    mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule())
        .registerModule(new ParameterNamesModule())
        .registerModule(new Jdk8Module())
        .registerModule(new JavaTimeModule())
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, false)
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
  }

  public static String toJson(final Object data) {
    try {
      return mapper.writeValueAsString(data);
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new JsonParseErrorException(e.getMessage(), e);
    }
  }

  public static <A> A fromJson(String json, Class<A> clazz) {
    Objects.requireNonNull(json, "Value cannot be null.");
    try {
      return mapper.readValue(json, clazz);
    } catch (JsonParseException e) {
      log.error(e.getLocalizedMessage(), e);
      throw new JsonParseErrorException(e.getMessage());
    } catch (Exception e) {
      log.error(e.getLocalizedMessage(), e);
      throw new JsonParseErrorException(e.getMessage());
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
