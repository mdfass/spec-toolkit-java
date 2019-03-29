package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Represents a appeasement of one or several items
 */
public final class Appeasement {
  /**
   * Reference to the Store where the order was placed
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * Reference to the order
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * User name
   */
  @JsonProperty(
      value = "user",
      required = true
  )
  public final String user;

  /**
   * Credit note number.
   */
  @JsonProperty(
      value = "credit_note_number",
      required = false
  )
  public final String creditNoteNumber;

  /**
   * Expected format example: 2016-05-20T09:09:09+00:00
   * Credit note date
   */
  @JsonProperty(
      value = "credit_note_date",
      required = false
  )
  public final ZonedDateTime creditNoteDate;

  /**
   * Date in which the appeasement was requested
   */
  @JsonProperty(
      value = "origin_date",
      required = false
  )
  public final ZonedDateTime originDate;

  /**
   * List of order lines in the appeasement
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<AppeasementLine> lines;

  /**
   * Custom Attributes of the appeasement
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Appeasement(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "credit_note_number", required = false) final String creditNoteNumber,
      @JsonProperty(value = "credit_note_date", required = false) final ZonedDateTime creditNoteDate,
      @JsonProperty(value = "origin_date", required = false) final ZonedDateTime originDate,
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
