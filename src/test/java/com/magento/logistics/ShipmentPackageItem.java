package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Items within a package
 */
public final class ShipmentPackageItem {
  /**
   * Id of the order line of the item within the package
   */
  public final String orderLineId;

  @JsonCreator
  public ShipmentPackageItem(
      @JsonProperty(value = "order_line_id", required = true) final String orderLineId) {
    this.orderLineId = orderLineId;
  }
}
