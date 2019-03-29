package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * An item in a shipments
 */
public final class ShipmentItem {
  /**
   * Reference to the order line
   */
  @JsonProperty(
      value = "order_line_id",
      required = true
  )
  public final String orderLineId;

  @JsonCreator
  public ShipmentItem(
      @JsonProperty(value = "order_line_id", required = true) final String orderLineId) {
    this.orderLineId = orderLineId;
  }
}
