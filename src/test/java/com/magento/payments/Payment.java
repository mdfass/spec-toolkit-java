package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Represents a payment
 */
public final class Payment {
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
   * Reference to the order
   */
  public final String orderId;

  /**
   * Reference to the payment operation
   */
  public final String operationReference;

  /**
   * New gateway key typically used when a payment is successfully revalidated with a newly created payment.
   * New gateway key that identifies the payment at the payment provider
   */
  public final String newGatewayKey;

  /**
   * List of lines in the payment transaction
   */
  public final List<PaymentLine> lines;

  /**
   * Method details for the payment transaction
   */
  public final PaymentMethodDetails methodDetails;

  /**
   * Gateway command Indentifier
   */
  public final String gatewayCommand;

  /**
   * Raw gateway response for the operation requested
   */
  public final String gatewayResponse;

  /**
   * gateway response execution time for the operation requested
   */
  public final Integer gatewayResponseTime;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Payment(@JsonProperty(value = "gateway", required = true) final String gateway,
      @JsonProperty(value = "gateway_account", required = true) final String gatewayAccount,
      @JsonProperty(value = "gateway_key", required = true) final String gatewayKey,
      @JsonProperty(value = "amount", required = true) final Integer amount,
      @JsonProperty(value = "currency", required = true) final String currency,
      @JsonProperty(value = "order_id", required = false) final String orderId,
      @JsonProperty(value = "operation_reference", required = false) final String operationReference,
      @JsonProperty(value = "new_gateway_key", required = false) final String newGatewayKey,
      @JsonProperty(value = "lines", required = false) final List<PaymentLine> lines,
      @JsonProperty(value = "method_details", required = false) final PaymentMethodDetails methodDetails,
      @JsonProperty(value = "gateway_command", required = false) final String gatewayCommand,
      @JsonProperty(value = "gateway_response", required = false) final String gatewayResponse,
      @JsonProperty(value = "gateway_response_time", required = false) final Integer gatewayResponseTime,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.gateway = gateway;
    this.gatewayAccount = gatewayAccount;
    this.gatewayKey = gatewayKey;
    this.amount = amount;
    this.currency = currency;
    this.orderId = orderId;
    this.operationReference = operationReference;
    this.newGatewayKey = newGatewayKey;
    this.lines = lines;
    this.methodDetails = methodDetails;
    this.gatewayCommand = gatewayCommand;
    this.gatewayResponse = gatewayResponse;
    this.gatewayResponseTime = gatewayResponseTime;
    this.customAttributes = customAttributes;
  }
}
