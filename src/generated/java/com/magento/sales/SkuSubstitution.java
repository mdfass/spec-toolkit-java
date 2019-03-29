package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Container of data needed to perform a sku substitution for an order
 * Sku substitution information
 */
public final class SkuSubstitution {
  /**
   * This field is optional. If not provided, the SKU will be substituted on every order of the given sales channel if provided, or on every order.
   * Reference to the order to modify
   */
  @JsonProperty(
      value = "order_id",
      required = false
  )
  public final String orderId;

  /**
   * If an order id is provided, the sales channel must be provided as well. If not, the sales channel is optional.
   * Reference to the sales channel where the order was placed
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = false
  )
  public final String salesChannelId;

  /**
   * Current sku to be substituted
   */
  @JsonProperty(
      value = "current_sku",
      required = true
  )
  public final String currentSku;

  /**
   * New sku to substitute
   */
  @JsonProperty(
      value = "new_sku",
      required = true
  )
  public final String newSku;

  @JsonCreator
  public SkuSubstitution(@JsonProperty(value = "order_id", required = false) final String orderId,
      @JsonProperty(value = "sales_channel_id", required = false) final String salesChannelId,
      @JsonProperty(value = "current_sku", required = true) final String currentSku,
      @JsonProperty(value = "new_sku", required = true) final String newSku) {
    this.orderId = orderId;
    this.salesChannelId = salesChannelId;
    this.currentSku = currentSku;
    this.newSku = newSku;
  }
}
