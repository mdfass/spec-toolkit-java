package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Payment event exception relates to issues raised with individual payment events
 * Payment event exception from payment events
 */
public final class PaymentEventException {
  /**
   * Type of the payment event
   */
  public final PaymentEventType eventType;

  /**
   * Type of the payment event
   */
  public final PaymentEventStatus eventStatus;

  /**
   * Reference to the payment event
   */
  public final String operationReference;

  /**
   * Type of payment event exception
   */
  public final PaymentEventType type;

  /**
   * Type of payment event exception
   */
  public final PaymentEventExceptionSubType subType;

  /**
   * Status of the payment event exception
   */
  public final String status;

  /**
   * Reason for the payment event exception
   */
  public final String reason;

  /**
   * Date that the payment event exception was created
   */
  public final LocalDateTime createdOn;

  /**
   * Date that the payment event exception was updated
   */
  public final LocalDateTime modifiedOn;

  /**
   * Payment gateway provider
   */
  public final String gateway;

  /**
   * Gateway account
   */
  public final String gatewayAccount;

  /**
   * Gateway key that identifies the payment in the payment provider
   */
  public final String gatewayKey;

  /**
   * Amount of the payment transaction
   */
  public final Integer amount;

  /**
   * Currency of the payment transaction
   */
  public final String currency;

  /**
   * Method details for the payment transaction
   */
  public final PaymentMethodDetails methodDetails;

  /**
   * Date when the order was authorised
   */
  public final LocalDateTime orderOriginDate;

  /**
   * Order external
   */
  public final String orderId;

  /**
   * Customer that placed the order
   */
  public final PaymentEventCustomerDetails customer;

  @JsonCreator
  public PaymentEventException(
      @JsonProperty(value = "event_type", required = false) final PaymentEventType eventType,
      @JsonProperty(value = "event_status", required = false) final PaymentEventStatus eventStatus,
      @JsonProperty(value = "operation_reference", required = false) final String operationReference,
      @JsonProperty(value = "type", required = false) final PaymentEventType type,
      @JsonProperty(value = "sub_type", required = false) final PaymentEventExceptionSubType subType,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "created_on", required = false) final LocalDateTime createdOn,
      @JsonProperty(value = "modified_on", required = false) final LocalDateTime modifiedOn,
      @JsonProperty(value = "gateway", required = true) final String gateway,
      @JsonProperty(value = "gateway_account", required = true) final String gatewayAccount,
      @JsonProperty(value = "gateway_key", required = true) final String gatewayKey,
      @JsonProperty(value = "amount", required = true) final Integer amount,
      @JsonProperty(value = "currency", required = true) final String currency,
      @JsonProperty(value = "method_details", required = false) final PaymentMethodDetails methodDetails,
      @JsonProperty(value = "order_origin_date", required = false) final LocalDateTime orderOriginDate,
      @JsonProperty(value = "order_id", required = false) final String orderId,
      @JsonProperty(value = "customer", required = false) final PaymentEventCustomerDetails customer) {
    this.eventType = eventType;
    this.eventStatus = eventStatus;
    this.operationReference = operationReference;
    this.type = type;
    this.subType = subType;
    this.status = status;
    this.reason = reason;
    this.createdOn = createdOn;
    this.modifiedOn = modifiedOn;
    this.gateway = gateway;
    this.gatewayAccount = gatewayAccount;
    this.gatewayKey = gatewayKey;
    this.amount = amount;
    this.currency = currency;
    this.methodDetails = methodDetails;
    this.orderOriginDate = orderOriginDate;
    this.orderId = orderId;
    this.customer = customer;
  }
}
