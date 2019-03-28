package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Map;

/**
 * Log entry
 */
public final class LogEntry {
  /**
   * Log type
   */
  public final String type;

  /**
   * Log category
   */
  public final String category;

  /**
   * Log level
   */
  public final String level;

  /**
   * Log message
   */
  public final String message;

  /**
   * Log context
   */
  public final Map<String, String> context;

  @JsonCreator
  public LogEntry(@JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "category", required = true) final String category,
      @JsonProperty(value = "level", required = true) final String level,
      @JsonProperty(value = "message", required = true) final String message,
      @JsonProperty(value = "context", required = false) final Map<String, String> context) {
    this.type = type;
    this.category = category;
    this.level = level;
    this.message = message;
    this.context = context;
  }
}
