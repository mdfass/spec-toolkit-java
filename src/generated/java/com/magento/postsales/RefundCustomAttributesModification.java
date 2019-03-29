package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Represents a custom attributes modification
 */
public final class RefundCustomAttributesModification {
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
   * Credit note number
   */
  @JsonProperty(
      value = "credit_note_number",
      required = true
  )
  public final String creditNoteNumber;

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
  public RefundCustomAttributesModification(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "credit_note_number", required = true) final String creditNoteNumber,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "custom_attributes", required = true) final List<CustomAttribute> customAttributes) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.creditNoteNumber = creditNoteNumber;
    this.user = user;
    this.customAttributes = customAttributes;
  }
}
