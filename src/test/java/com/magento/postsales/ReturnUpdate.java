package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Notify a return update
 */
public final class ReturnUpdate {
  /**
   * Reference to the Store where the order was placed
   */
  public final String salesChannelId;

  /**
   * Reference to the Order affected
   */
  public final String orderId;

  /**
   * Reference to the Source where the order items were sourced
   */
  public final String sourceId;

  /**
   * User who updated the return
   */
  public final String user;

  /**
   * RMA code of the return authorization
   */
  public final String rma;

  /**
   * Carrier Tracking number of the Return package
   */
  public final String returnTrackingNumber;

  /**
   * URL for Carrier Tracking of the Return package
   */
  public final String returnTrackingUrl;

  /**
   * URL to get the Carrier Tracking label of the Return package
   */
  public final String returnTrackingLabelUrl;

  /**
   * Return tracking carrier name
   */
  public final String returnTrackingCarrier;

  /**
   * Custom attributes at return header level
   */
  public final List<CustomAttribute> customAttributes;

  /**
   * Status of the return
   */
  public final Status status;

  /**
   * List of items in the return
   */
  public final List<ReturnUpdateLine> lines;

  @JsonCreator
  public ReturnUpdate(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "user", required = false) final String user,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "return_tracking_number", required = false) final String returnTrackingNumber,
      @JsonProperty(value = "return_tracking_url", required = false) final String returnTrackingUrl,
      @JsonProperty(value = "return_tracking_label_url", required = false) final String returnTrackingLabelUrl,
      @JsonProperty(value = "return_tracking_carrier", required = false) final String returnTrackingCarrier,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "status", required = false) final Status status,
      @JsonProperty(value = "lines", required = true) final List<ReturnUpdateLine> lines) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.user = user;
    this.rma = rma;
    this.returnTrackingNumber = returnTrackingNumber;
    this.returnTrackingUrl = returnTrackingUrl;
    this.returnTrackingLabelUrl = returnTrackingLabelUrl;
    this.returnTrackingCarrier = returnTrackingCarrier;
    this.customAttributes = customAttributes;
    this.status = status;
    this.lines = lines;
  }
}
