package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Represents a return request for all product items to be returned
 */
public final class ReturnRequest {
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
   * Reference to the Source where the items will be returned
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * RMA code of the return authorization
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
   * Custom attributes at return header level
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  /**
   * List of items in the return
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<ReturnLine> lines;

  @JsonCreator
  public ReturnRequest(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "return_tracking_number", required = false) final String returnTrackingNumber,
      @JsonProperty(value = "return_tracking_url", required = false) final String returnTrackingUrl,
      @JsonProperty(value = "return_tracking_label_url", required = false) final String returnTrackingLabelUrl,
      @JsonProperty(value = "return_tracking_carrier", required = false) final String returnTrackingCarrier,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "lines", required = true) final List<ReturnLine> lines) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.rma = rma;
    this.returnTrackingNumber = returnTrackingNumber;
    this.returnTrackingUrl = returnTrackingUrl;
    this.returnTrackingLabelUrl = returnTrackingLabelUrl;
    this.returnTrackingCarrier = returnTrackingCarrier;
    this.customAttributes = customAttributes;
    this.lines = lines;
  }
}
