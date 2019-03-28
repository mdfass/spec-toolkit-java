package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a appeasement of one or several items
 */
public final class Appeasement {
  /**
   * Reference to the Store where the order was placed
   */
  public final String salesChannelId;

  /**
   * Reference to the order
   */
  public final String orderId;

  /**
   * User name
   */
  public final String user;

  /**
   * Credit note number.
   */
  public final String creditNoteNumber;

  /**
   * Expected format example: 2016-05-20T09:09:09+00:00
   * Credit note date
   */
  public final LocalDateTime creditNoteDate;

  /**
   * Date in which the appeasement was requested
   */
  public final LocalDateTime originDate;

  /**
   * List of order lines in the appeasement
   */
  public final List<AppeasementLine> lines;

  /**
   * Custom Attributes of the appeasement
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Appeasement(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "credit_note_number", required = false) final String creditNoteNumber,
      @JsonProperty(value = "credit_note_date", required = false) final LocalDateTime creditNoteDate,
      @JsonProperty(value = "origin_date", required = false) final LocalDateTime originDate,
      @JsonProperty(value = "lines", required = true) final List<AppeasementLine> lines,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.creditNoteNumber = creditNoteNumber;
    this.creditNoteDate = creditNoteDate;
    this.originDate = originDate;
    this.lines = lines;
    this.customAttributes = customAttributes;
  }
}
