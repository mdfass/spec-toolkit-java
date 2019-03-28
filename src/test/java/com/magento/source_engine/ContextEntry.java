package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 *
 *                 Context data that is used by the source engine to calculate the sourcing options.
 *             
 * Context data relating to the sourcing request
 */
public final class ContextEntry {
  /**
   * The time when the entry was made
   */
  public final LocalDateTime timestamp;

  /**
   * The entry type, which describes the type of data to expect
   */
  public final String type;

  /**
   *
   *                         The data is a free-formed map that is dependent on the type, and frequently changes.
   *                     
   * The context data
   */
  public final String data;

  @JsonCreator
  public ContextEntry(
      @JsonProperty(value = "timestamp", required = true) final LocalDateTime timestamp,
      @JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "data", required = true) final String data) {
    this.timestamp = timestamp;
    this.type = type;
    this.data = data;
  }
}
