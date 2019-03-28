package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;

/**
 * Container of data needed to perform a shipping address update for an order
 * Shipping address information for an order modification action
 */
public final class ShippingAddressModification {
  /**
   * Reference to the Store where the order was placed
   */
  public final String salesChannelId;

  /**
   * Reference to the Order to modify
   */
  public final String orderId;

  /**
   * Reference to the order line to modify
   */
  public final String lineNumber;

  /**
   * User who initiated the order modification
   */
  public final String user;

  /**
   * Force creation skipping validations
   */
  public final Boolean force;

  /**
   * New shipping address
   */
  public final ShippingAddress newShippingAddress;

  @JsonCreator
  public ShippingAddressModification(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "line_number", required = true) final String lineNumber,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "force", required = false) final Boolean force,
      @JsonProperty(value = "new_shipping_address", required = true) final ShippingAddress newShippingAddress) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.lineNumber = lineNumber;
    this.user = user;
    this.force = force;
    this.newShippingAddress = newShippingAddress;
  }
}
