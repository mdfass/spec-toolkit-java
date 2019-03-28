package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a return authorization for all product items returned
 */
public final class ReturnAuthorize {
  /**
   * Reference to the Store where the order was placed
   */
  public final String salesChannelId;

  /**
   * Reference to the Order affected
   */
  public final String orderId;

  /**
   *
   *                         Reference to the source where goods will be returned, if provided.
   *                         Otherwise, the source that fulfilled the order will be assigned by default.
   *                     
   * Source where goods will be returned
   */
  public final String sourceId;

  /**
   * User who authorized the return
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
   * Date in which the return was authorized
   */
  public final LocalDateTime originDate;

  /**
   * Custom attributes at return header level
   */
  public final List<CustomAttribute> customAttributes;

  /**
   * List of items in the return
   */
  public final List<ReturnLine> lines;

  @JsonCreator
  public ReturnAuthorize(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "user", required = false) final String user,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "return_tracking_number", required = false) final String returnTrackingNumber,
      @JsonProperty(value = "return_tracking_url", required = false) final String returnTrackingUrl,
      @JsonProperty(value = "return_tracking_label_url", required = false) final String returnTrackingLabelUrl,
      @JsonProperty(value = "return_tracking_carrier", required = false) final String returnTrackingCarrier,
      @JsonProperty(value = "origin_date", required = false) final LocalDateTime originDate,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "lines", required = true) final List<ReturnLine> lines) {
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
