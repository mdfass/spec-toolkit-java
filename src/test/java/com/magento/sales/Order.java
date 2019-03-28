package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Order represent the purchase of the customer
 */
public final class Order {
  /**
   * The identifier of the order
   */
  public final String id;

  /**
   * The identifier of the original order to which it refers to
   */
  public final String originalOrderId;

  /**
   * Store from where the order comes from
   */
  public final String store;

  /**
   * Status of the order
   */
  public final String status;

  /**
   * Status reason of the order
   */
  public final String statusReason;

  /**
   * When the status changed for the order
   */
  public final LocalDateTime statusDate;

  /**
   * IP of the customer that placed the order
   */
  public final String ip;

  /**
   * Language of the order
   */
  public final String language;

  /**
   * Country in which the order is paying taxes
   */
  public final String vatCountry;

  /**
   * Channel in which the order was placed
   */
  public final String origin;

  /**
   * Date in which the order was placed
   */
  public final LocalDateTime originDate;

  /**
   * Identifier of the agent that placed the order (if any)
   */
  public final String customerServiceAgent;

  /**
   * Customer that placed the order
   */
  public final OrderCustomer customer;

  /**
   * Addresses of the order
   */
  public final List<Address> addresses;

  /**
   * Payments of the order
   */
  public final List<OrderPayment> payments;

  /**
   * Lines of the order
   */
  public final List<OrderLine> lines;

  /**
   * Gift message
   */
  public final String giftMessage;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Order(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "original_order_id", required = false) final String originalOrderId,
      @JsonProperty(value = "store", required = true) final String store,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "status_reason", required = false) final String statusReason,
      @JsonProperty(value = "status_date", required = false) final LocalDateTime statusDate,
      @JsonProperty(value = "ip", required = false) final String ip,
      @JsonProperty(value = "language", required = false) final String language,
      @JsonProperty(value = "vat_country", required = true) final String vatCountry,
      @JsonProperty(value = "origin", required = true) final String origin,
      @JsonProperty(value = "origin_date", required = true) final LocalDateTime originDate,
      @JsonProperty(value = "customer_service_agent", required = false) final String customerServiceAgent,
      @JsonProperty(value = "customer", required = true) final OrderCustomer customer,
      @JsonProperty(value = "addresses", required = true) final List<Address> addresses,
      @JsonProperty(value = "payments", required = true) final List<OrderPayment> payments,
      @JsonProperty(value = "lines", required = true) final List<OrderLine> lines,
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
