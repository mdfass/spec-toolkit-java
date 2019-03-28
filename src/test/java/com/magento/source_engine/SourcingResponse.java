package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity representing multiple lines after sourcing them
 */
public final class SourcingResponse {
  /**
   * UUID of the Sourcing Request
   */
  public final String sourcingRequestUuid;

  /**
   * UUID of the Order
   */
  public final String orderUuid;

  /**
   * external order id
   */
  public final String orderId;

  /**
   * Aggregate ID
   */
  public final String aggregateId;

  /**
   * wave id this sourcing response was processed in
   */
  public final String waveId;

  /**
   * When the sourcing happened
   */
  public final LocalDateTime sourcedOn;

  /**
   * Creation Date of the Order
   */
  public final LocalDateTime orderCreationDate;

  /**
   * Store ID
   */
  public final String storeId;

  /**
   * Shipping Method
   */
  public final String shippingMethod;

  /**
   * Address of the Order
   */
  public final Address shippingAddress;

  /**
   * Order Lines that have been sourced
   */
  public final List<SourcingResponseLine> lines;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public SourcingResponse(
      @JsonProperty(value = "sourcing_request_uuid", required = true) final String sourcingRequestUuid,
      @JsonProperty(value = "order_uuid", required = true) final String orderUuid,
      @JsonProperty(value = "order_id", required = false) final String orderId,
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "wave_id", required = false) final String waveId,
      @JsonProperty(value = "sourced_on", required = true) final LocalDateTime sourcedOn,
      @JsonProperty(value = "order_creation_date", required = true) final LocalDateTime orderCreationDate,
      @JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "shipping_method", required = true) final String shippingMethod,
      @JsonProperty(value = "shipping_address", required = true) final Address shippingAddress,
      @JsonProperty(value = "lines", required = true) final List<SourcingResponseLine> lines,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.sourcingRequestUuid = sourcingRequestUuid;
    this.orderUuid = orderUuid;
    this.orderId = orderId;
    this.aggregateId = aggregateId;
    this.waveId = waveId;
    this.sourcedOn = sourcedOn;
    this.orderCreationDate = orderCreationDate;
    this.storeId = storeId;
    this.shippingMethod = shippingMethod;
    this.shippingAddress = shippingAddress;
    this.lines = lines;
    this.customAttributes = customAttributes;
  }
}
