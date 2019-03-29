package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Order represent the purchase of the customer
 */
public final class Order {
  /**
   * The identifier of the order
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * The identifier of the original order to which it refers to
   */
  @JsonProperty(
      value = "original_order_id",
      required = false
  )
  public final String originalOrderId;

  /**
   * Store from where the order comes from
   */
  @JsonProperty(
      value = "store",
      required = true
  )
  public final String store;

  /**
   * Status of the order
   */
  @JsonProperty(
      value = "status",
      required = false
  )
  public final String status;

  /**
   * Status reason of the order
   */
  @JsonProperty(
      value = "status_reason",
      required = false
  )
  public final String statusReason;

  /**
   * When the status changed for the order
   */
  @JsonProperty(
      value = "status_date",
      required = false
  )
  public final ZonedDateTime statusDate;

  /**
   * IP of the customer that placed the order
   */
  @JsonProperty(
      value = "ip",
      required = true
  )
  public final String ip;

  /**
   * Language of the order
   */
  @JsonProperty(
      value = "language",
      required = false
  )
  public final String language;

  /**
   * Country in which the order is paying taxes
   */
  @JsonProperty(
      value = "vat_country",
      required = true
  )
  public final String vatCountry;

  /**
   * Channel in which the order was placed
   */
  @JsonProperty(
      value = "origin",
      required = true
  )
  public final String origin;

  /**
   * Date in which the order was placed
   */
  @JsonProperty(
      value = "origin_date",
      required = true
  )
  public final ZonedDateTime originDate;

  /**
   * Identifier of the agent that placed the order (if any)
   */
  @JsonProperty(
      value = "customer_service_agent",
      required = false
  )
  public final String customerServiceAgent;

  /**
   * Customer that placed the order
   */
  @JsonProperty(
      value = "customer",
      required = true
  )
  public final OrderCustomer customer;

  /**
   * Addresses of the order
   */
  @JsonProperty(
      value = "addresses",
      required = true
  )
  public final List<Address> addresses;

  /**
   * Payments of the order
   */
  @JsonProperty(
      value = "payments",
      required = false
  )
  public final List<OrderPayment> payments;

  /**
   * Lines of the order
   */
  @JsonProperty(
      value = "lines",
      required = false
  )
  public final List<OrderLine> lines;

  /**
   * Gift message
   */
  @JsonProperty(
      value = "gift_message",
      required = false
  )
  public final String giftMessage;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Order(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "original_order_id", required = false) final String originalOrderId,
      @JsonProperty(value = "store", required = true) final String store,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "status_reason", required = false) final String statusReason,
      @JsonProperty(value = "status_date", required = false) final ZonedDateTime statusDate,
      @JsonProperty(value = "ip", required = true) final String ip,
      @JsonProperty(value = "language", required = false) final String language,
      @JsonProperty(value = "vat_country", required = true) final String vatCountry,
      @JsonProperty(value = "origin", required = true) final String origin,
      @JsonProperty(value = "origin_date", required = true) final ZonedDateTime originDate,
      @JsonProperty(value = "customer_service_agent", required = false) final String customerServiceAgent,
      @JsonProperty(value = "customer", required = true) final OrderCustomer customer,
      @JsonProperty(value = "addresses", required = true) final List<Address> addresses,
      @JsonProperty(value = "payments", required = false) final List<OrderPayment> payments,
      @JsonProperty(value = "lines", required = false) final List<OrderLine> lines,
      @JsonProperty(value = "gift_message", required = false) final String giftMessage,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.id = id;
    this.originalOrderId = originalOrderId;
    this.store = store;
    this.status = status;
    this.statusReason = statusReason;
    this.statusDate = statusDate;
    this.ip = ip;
    this.language = language;
    this.vatCountry = vatCountry;
    this.origin = origin;
    this.originDate = originDate;
    this.customerServiceAgent = customerServiceAgent;
    this.customer = customer;
    this.addresses = addresses;
    this.payments = payments;
    this.lines = lines;
    this.giftMessage = giftMessage;
    this.customAttributes = customAttributes;
  }
}
