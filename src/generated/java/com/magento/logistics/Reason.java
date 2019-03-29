package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Reason
 */
public final class Reason {
  /**
   * Reason type (pick-decline, customer-decline)
   */
  @JsonProperty(
      value = "type",
      required = true
  )
  public final ReasonType type;

  /**
   * Description of the reason
   */
  @JsonProperty(
      value = "description",
      required = true
  )
  public final String description;

  @JsonCreator
  public Reason(@JsonProperty(value = "type", required = true) final ReasonType type,
      @JsonProperty(value = "description", required = true) final String description) {
    this.type = type;
    this.description = description;
  }
}
