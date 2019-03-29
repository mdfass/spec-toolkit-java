package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Custom attributes modification
 */
public final class CustomAttributesModification {
  /**
   * The sales channel for the order
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * Order identifier
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * User
   */
  @JsonProperty(
      value = "user",
      required = true
  )
  public final String user;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = true
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public CustomAttributesModification(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "custom_attributes", required = true) final List<CustomAttribute> customAttributes) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.customAttributes = customAttributes;
  }
}
