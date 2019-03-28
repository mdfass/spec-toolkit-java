package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;

/**
 * Endpoint control payload
 */
public final class EndpointControl {
  /**
   * Endpoint id
   */
  public final String id;

  /**
   * A flag to enable or disable a given endpoint
   * Endpoint status enabled/disabled
   */
  public final Boolean enabled;

  @JsonCreator
  public EndpointControl(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "enabled", required = true) final Boolean enabled) {
    this.id = id;
    this.enabled = enabled;
  }
}
