package com.ueby.loteria.crawlers.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Algarves, Khristian
 */
class JsonUtilTest {

  private static final String JSON_EXAMPLE = "{\"key\":\"value\"}";

  @DisplayName("Convert Object to JSON")
  @Test
  void shouldConvertObjectToJson() {
    Map<String, String> obj = new HashMap<String, String>();
    obj.put("key", "value");

    String json = JsonUtil.toJson(obj);
    Assertions.assertEquals(JSON_EXAMPLE, json);
  }

  @DisplayName("JSON on object")
  @Test
  void shouldJsonOnObject() {
    JsonObjectDto obj = JsonUtil.fromJson(JSON_EXAMPLE, JsonObjectDto.class);
    Assertions.assertEquals("value", obj.getKey());
  }

  @DisplayName("Throw Nullpointer Exception from JSON")
  @Test
  void shouldThrowNullpointerExceptionFromJson() {
    Exception exception = Assertions.assertThrows(NullPointerException.class, () -> {
      JsonUtil.fromJson(null, JsonObjectDto.class);
    });

    String expectedMessage = "Value cannot be null.";
    String actualMessage = exception.getMessage();

    Assertions.assertTrue(actualMessage.contains(expectedMessage));
  }

  @DisplayName("Check if the json structure is valid")
  @Test
  void shouldIsValid() {
    boolean isValid = JsonUtil.isValid(JSON_EXAMPLE);
    Assertions.assertEquals(Boolean.TRUE, isValid);
  }

}
