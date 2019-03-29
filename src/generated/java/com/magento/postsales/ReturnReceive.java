package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * A return is received for all product items to be returned
 */
public final class ReturnReceive {
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
   * Reference to the Source where the items were returned
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * User who do the action
   */
  @JsonProperty(
      value = "user",
      required = true
  )
  public final String user;

  /**
   * RMA code of the return (empty for blind returns)
   */
  @JsonProperty(
      value = "rma",
      required = false
  )
  public final String rma;

  /**
   * Carrier Tracking number of the Return package
   */
  @JsonProperty(
      value = "return_tracking_number",
      required = false
  )
  public final String returnTrackingNumber;

  /**
   * URL for Carrier Tracking of the Return package
   */
  @JsonProperty(
      value = "return_tracking_url",
      required = false
  )
  public final String returnTrackingUrl;

  /**
   * URL to get the Carrier Tracking label of the Return package
   */
  @JsonProperty(
      value = "return_tracking_label_url",
      required = false
  )
  public final String returnTrackingLabelUrl;

  /**
   * Return tracking carrier name
   */
  @JsonProperty(
      value = "return_tracking_carrier",
      required = false
  )
  public final String returnTrackingCarrier;

  /**
   * Date in which the return was received
   */
  @JsonProperty(
      value = "origin_date",
      required = false
  )
  public final ZonedDateTime originDate;

  /**
   * Custom attributes at return header level
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  /**
   * List of items in the return received
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<ReturnReceiveLine> lines;

  @JsonCreator
  public ReturnReceive(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "return_tracking_number", required = false) final String returnTrackingNumber,
      @JsonProperty(value = "return_tracking_url", required = false) final String returnTrackingUrl,
      @JsonProperty(value = "return_tracking_label_url", required = false) final String returnTrackingLabelUrl,
      @JsonProperty(value = "return_tracking_carrier", required = false) final String returnTrackingCarrier,
      @JsonProperty(value = "origin_date", required = false) final ZonedDateTime originDate,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "lines", required = true) final List<ReturnReceiveLine> lines) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.user = user;
    this.rma = rma;
    this.returnTrackingNumber = returnTrackingNumber;
    this.returnTrackingUrl = returnTrackingUrl;
    this.returnTrackingLabelUrl = returnTrackingLabelUrl;
    this.returnTrackingCarrier = returnTrackingCarrier;
    this.originDate = originDate;
    this.customAttributes = customAttributes;
    this.lines = lines;
  }
}
