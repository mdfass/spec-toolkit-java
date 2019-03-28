package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Line custom attributes modification
 */
public final class ReturnLineCustomAttributesModification {
  /**
   * The sales channel for the order
   */
  public final String salesChannelId;

  /**
   * Order identifier
   */
  public final String orderId;

  /**
   * RMA
   */
  public final String rma;

  /**
   * Return line number
   */
  public final String lineNumber;

  /**
   * User
   */
  public final String user;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public ReturnLineCustomAttributesModification(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "rma", required = true) final String rma,
      @JsonProperty(value = "line_number", required = true) final String lineNumber,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "custom_attributes", required = true) final List<CustomAttribute> customAttributes) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.rma = rma;
    this.lineNumber = lineNumber;
    this.user = user;
    this.customAttributes = customAttributes;
  }
}
