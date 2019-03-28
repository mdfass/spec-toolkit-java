package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * Capabilities of a source
 */
public final class SourceCapabilities {
  /**
   * List of shipping method skus
   */
  public final List<String> shipping;

  /**
   * List of services skus
   */
  public final List<String> services;

  /**
   * Whether a source accepts returns or not
   */
  public final Boolean acceptsReturns;

  /**
   * Fulfillment capabilities
   */
  public final SourceFulfillment fulfillment;

  @JsonCreator
  public SourceCapabilities(
      @JsonProperty(value = "shipping", required = false) final List<String> shipping,
      @JsonProperty(value = "services", required = false) final List<String> services,
      @JsonProperty(value = "accepts_returns", required = false) final Boolean acceptsReturns,
      @JsonProperty(value = "fulfillment", required = false) final SourceFulfillment fulfillment) {
    this.shipping = shipping;
    this.services = services;
    this.acceptsReturns = acceptsReturns;
    this.fulfillment = fulfillment;
  }
}
