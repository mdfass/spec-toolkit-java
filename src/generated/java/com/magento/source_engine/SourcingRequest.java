package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Entity representing multiple lines of an order to be sourced
 */
public final class SourcingRequest {
  /**
   * UUID of the Sourcing Request
   */
  @JsonProperty(
      value = "uuid",
      required = true
  )
  public final String uuid;

  /**
   * Execution Mode for Sourcing Engine
   */
  @JsonProperty(
      value = "mode",
      required = true
  )
  public final String mode;

  /**
   * UUID of the Order
   */
  @JsonProperty(
      value = "order_uuid",
      required = true
  )
  public final String orderUuid;

  /**
   * Id of the Order
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Creation Date of the Order
   */
  @JsonProperty(
      value = "order_creation_date",
      required = true
  )
  public final ZonedDateTime orderCreationDate;

  /**
   * Client ID
   */
  @JsonProperty(
      value = "client",
      required = true
  )
  public final String client;

  /**
   * Store ID
   */
  @JsonProperty(
      value = "store_id",
      required = true
  )
  public final String storeId;

  /**
   * Aggregate ID
   */
  @JsonProperty(
      value = "aggregate_id",
      required = true
  )
  public final String aggregateId;

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
   * Order Lines to be sourced.
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<SourcingRequestLine> lines;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public SourcingRequest(@JsonProperty(value = "uuid", required = true) final String uuid,
      @JsonProperty(value = "mode", required = true) final String mode,
      @JsonProperty(value = "order_uuid", required = true) final String orderUuid,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "order_creation_date", required = true) final ZonedDateTime orderCreationDate,
      @JsonProperty(value = "client", required = true) final String client,
      @JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "shipping_method", required = true) final String shippingMethod,
      @JsonProperty(value = "shipping_address", required = true) final Address shippingAddress,
      @JsonProperty(value = "lines", required = true) final List<SourcingRequestLine> lines,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.uuid = uuid;
    this.mode = mode;
    this.orderUuid = orderUuid;
    this.orderId = orderId;
    this.orderCreationDate = orderCreationDate;
    this.client = client;
    this.storeId = storeId;
    this.aggregateId = aggregateId;
    this.shippingMethod = shippingMethod;
    this.shippingAddress = shippingAddress;
    this.lines = lines;
    this.customAttributes = customAttributes;
  }
}
