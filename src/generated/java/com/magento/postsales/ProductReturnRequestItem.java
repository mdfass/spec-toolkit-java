package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * An item in a product return request
 */
public final class ProductReturnRequestItem {
  /**
   * Reference to the order line
   */
  @JsonProperty(
      value = "order_line",
      required = true
  )
  public final String orderLine;

  /**
   * Details of item
   */
  @JsonProperty(
      value = "item_details",
      required = true
  )
  public final ProductReturnRequestItemDetails itemDetails;

  @JsonCreator
  public ProductReturnRequestItem(
      @JsonProperty(value = "order_line", required = true) final String orderLine,
      @JsonProperty(value = "item_details", required = true) final ProductReturnRequestItemDetails itemDetails) {
    this.orderLine = orderLine;
    this.itemDetails = itemDetails;
  }
}
