package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Notify a return duplication
 */
public final class ReturnDuplicate {
  /**
   * Reference to the Store where the order was placed
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * Reference to the Order affected
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * RMA code of the return authorization
   */
  @JsonProperty(
      value = "rma",
      required = false
  )
  public final String rma;

  @JsonCreator
  public ReturnDuplicate(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "rma", required = false) final String rma) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.rma = rma;
  }
}
