package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a refund of one or several items
 */
public final class Refund {
  /**
   * Client name
   */
  @JsonProperty(
      value = "client",
      required = true
  )
  public final String client;

  /**
   * Reference to the order
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Store from the order
   */
  @JsonProperty(
      value = "store_id",
      required = true
  )
  public final String storeId;

  /**
   * Store from the order
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = false
  )
  public final String salesChannelId;

  /**
   * Credit note number
   */
  @JsonProperty(
      value = "credit_note_number",
      required = false
  )
  public final String creditNoteNumber;

  /**
   * Credit note date
   */
  @JsonProperty(
      value = "credit_note_date",
      required = false
  )
  public final LocalDate creditNoteDate;

  /**
   * Status of the refund
   */
  @JsonProperty(
      value = "status",
      required = true
  )
  public final RefundStatus status;

  /**
   * Type (return/appeasement/cancellation)
   */
  @JsonProperty(
      value = "refund_type",
      required = false
  )
  public final String refundType;

  /**
   * RMA code of the associated return (if applicable)
   */
  @JsonProperty(
      value = "rma",
      required = false
  )
  public final String rma;

  /**
   * User that initiated the refund request
   */
  @JsonProperty(
      value = "user",
      required = false
  )
  public final String user;

  /**
   * Reason for the refund
   */
  @JsonProperty(
      value = "refund_reason",
      required = false
  )
  public final String refundReason;

  /**
   * List of order lines in the refund
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<RefundLines> lines;

  /**
   * Custom Attributes of the refund
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Refund(@JsonProperty(value = "client", required = true) final String client,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "sales_channel_id", required = false) final String salesChannelId,
      @JsonProperty(value = "credit_note_number", required = false) final String creditNoteNumber,
      @JsonProperty(value = "credit_note_date", required = false) final LocalDate creditNoteDate,
      @JsonProperty(value = "status", required = true) final RefundStatus status,
      @JsonProperty(value = "refund_type", required = false) final String refundType,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "user", required = false) final String user,
      @JsonProperty(value = "refund_reason", required = false) final String refundReason,
      @JsonProperty(value = "lines", required = true) final List<RefundLines> lines,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.client = client;
    this.orderId = orderId;
    this.storeId = storeId;
    this.salesChannelId = salesChannelId;
    this.creditNoteNumber = creditNoteNumber;
    this.creditNoteDate = creditNoteDate;
    this.status = status;
    this.refundType = refundType;
    this.rma = rma;
    this.user = user;
    this.refundReason = refundReason;
    this.lines = lines;
    this.customAttributes = customAttributes;
  }
}
