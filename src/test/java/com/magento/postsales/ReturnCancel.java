package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Represents a return cancellation
 */
public final class ReturnCancel {
  /**
   * Reference to the Store where the order was placed
   */
  public final String salesChannelId;

  /**
   * Reference to the Order affected
   */
  public final String orderId;

  /**
   * Reference to the Source where the items were returned
   */
  public final String sourceId;

  /**
   * User who cancels the return
   */
  public final String user;

  /**
   * RMA code of the return authorization
   */
  public final String rma;

  /**
   * Custom attributes at return header level
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public ReturnCancel(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "user", required = false) final String user,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.user = user;
    this.rma = rma;
    this.customAttributes = customAttributes;
  }
}
