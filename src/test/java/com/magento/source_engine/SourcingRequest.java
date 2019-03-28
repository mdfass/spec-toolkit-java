package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity representing multiple lines of an order to be sourced
 */
public final class SourcingRequest {
  /**
   * UUID of the Sourcing Request
   */
  public final String uuid;

  /**
   * Execution Mode for Sourcing Engine
   */
  public final String mode;

  /**
   * UUID of the Order
   */
  public final String orderUuid;

  /**
   * Id of the Order
   */
  public final String orderId;

  /**
   * Creation Date of the Order
   */
  public final LocalDateTime orderCreationDate;

  /**
   * Client ID
   */
  public final String client;

  /**
   * Store ID
   */
  public final String storeId;

  /**
   * Aggregate ID
   */
  public final String aggregateId;

  /**
   * Shipping Method
   */
  public final String shippingMethod;

  /**
   * Address of the Order
   */
  public final Address shippingAddress;

  /**
   * Order Lines to be sourced.
   */
  public final List<SourcingRequestLine> lines;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public SourcingRequest(@JsonProperty(value = "uuid", required = true) final String uuid,
      @JsonProperty(value = "mode", required = true) final String mode,
      @JsonProperty(value = "order_uuid", required = true) final String orderUuid,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "order_creation_date", required = true) final LocalDateTime orderCreationDate,
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
