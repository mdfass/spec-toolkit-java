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
   * RMA
   */
  @JsonProperty(
      value = "rma",
      required = true
  )
  public final String rma;

  /**
   * Return line number
   */
  @JsonProperty(
      value = "line_number",
      required = true
  )
  public final String lineNumber;

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
