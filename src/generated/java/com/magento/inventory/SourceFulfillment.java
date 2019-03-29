package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;

/**
 * Fulfillment capabilities
 */
public final class SourceFulfillment {
  /**
   * Can fulfill and ship orders to another source
   */
  @JsonProperty(
      value = "can_ship_to_source",
      required = false
  )
  public final Boolean canShipToSource;

  @JsonCreator
  public SourceFulfillment(
      @JsonProperty(value = "can_ship_to_source", required = false) final Boolean canShipToSource) {
    this.canShipToSource = canShipToSource;
  }
}
