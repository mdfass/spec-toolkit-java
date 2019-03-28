package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Line custom attributes modification
 */
public final class LineCustomAttributesModification {
  /**
   * The sales channel for the order
   */
  public final String salesChannelId;

  /**
   * Order identifier
   */
  public final String orderId;

  /**
   * User
   */
  public final String user;

  /**
   * Order Line ID
   */
  public final String lineId;

  /**
   * Order Line Number
   */
  public final String lineNumber;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public LineCustomAttributesModification(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "line_id", required = true) final String lineId,
      @JsonProperty(value = "line_number", required = true) final String lineNumber,
      @JsonProperty(value = "custom_attributes", required = true) final List<CustomAttribute> customAttributes) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.lineId = lineId;
    this.lineNumber = lineNumber;
    this.customAttributes = customAttributes;
  }
}
