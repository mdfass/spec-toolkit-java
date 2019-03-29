package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Entity representing multiple lines after sourcing them
 */
public final class SourcingResponse {
  /**
   * UUID of the Sourcing Request
   */
  @JsonProperty(
      value = "sourcing_request_uuid",
      required = true
  )
  public final String sourcingRequestUuid;

  /**
   * UUID of the Order
   */
  @JsonProperty(
      value = "order_uuid",
      required = true
  )
  public final String orderUuid;

  /**
   * external order id
   */
  @JsonProperty(
      value = "order_id",
      required = false
  )
  public final String orderId;

  /**
   * Aggregate ID
   */
  @JsonProperty(
      value = "aggregate_id",
      required = true
  )
  public final String aggregateId;

  /**
   * wave id this sourcing response was processed in
   */
  @JsonProperty(
      value = "wave_id",
      required = false
  )
  public final String waveId;

  /**
   * When the sourcing happened
   */
  @JsonProperty(
      value = "sourced_on",
      required = true
  )
  public final ZonedDateTime sourcedOn;

  /**
   * Creation Date of the Order
   */
  @JsonProperty(
      value = "order_creation_date",
      required = true
  )
  public final ZonedDateTime orderCreationDate;

  /**
   * Store ID
   */
  @JsonProperty(
      value = "store_id",
      required = true
  )
  public final String storeId;

  /**
   * Shipping Method
   */
  @JsonProperty(
      value = "shipping_method",
      required = true
  )
  public final String shippingMethod;

  /**
   * Address of the Order
   */
  @JsonProperty(
      value = "shipping_address",
      required = true
  )
  public final Address shippingAddress;

  /**
   * Order Lines that have been sourced
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<SourcingResponseLine> lines;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public SourcingResponse(
      @JsonProperty(value = "sourcing_request_uuid", required = true) final String sourcingRequestUuid,
      @JsonProperty(value = "order_uuid", required = true) final String orderUuid,
      @JsonProperty(value = "order_id", required = false) final String orderId,
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "wave_id", required = false) final String waveId,
      @JsonProperty(value = "sourced_on", required = true) final ZonedDateTime sourcedOn,
      @JsonProperty(value = "order_creation_date", required = true) final ZonedDateTime orderCreationDate,
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
