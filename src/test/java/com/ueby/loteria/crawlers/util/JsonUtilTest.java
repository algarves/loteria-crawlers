package com.ueby.loteria.crawlers.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Algarves, Khristian
 */
public class JsonUtilTest {

  private static final String JSON_EXAMPLE = "{\"key\":\"value\"}";

  @DisplayName("From object to json string")
  @Test
  public void shouldToJson() {
    Map<String, String> obj = new HashMap<String, String>();
    obj.put("key", "value");

    String json = JsonUtil.toJson(obj);
    Assertions.assertEquals(JSON_EXAMPLE, json);
  }

  @DisplayName("From json string to object")
  @Test
  public void shouldFromJson() {
    JsonObjectTest obj = JsonUtil.fromJson(JSON_EXAMPLE, JsonObjectTest.class);
    Assertions.assertEquals("value", obj.getKey());
  }

  @DisplayName("From json string to object")
  @Test
  public void shouldNullpointerFromJson() {
    Exception exception = Assertions.assertThrows(NullPointerException.class, () -> {
      JsonUtil.fromJson(null, JsonObjectTest.class);
    });

    String expectedMessage = "Value cannot be null.";
    String actualMessage = exception.getMessage();

    Assertions.assertTrue(actualMessage.contains(expectedMessage));
  }

  @DisplayName("Check if the json structure is valid")
  @Test
  public void shouldIsValid() {
    boolean isValid = JsonUtil.isValid(JSON_EXAMPLE);
    Assertions.assertEquals(Boolean.TRUE, isValid);
  }

}
