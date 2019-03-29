package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Transaction of the payment
 */
public final class OrderPaymentTransaction {
  /**
   * Payment method of the transaction
   */
  @JsonProperty(
      value = "payment_method",
      required = true
  )
  public final String paymentMethod;

  /**
   * Payment submethod of the transaction
   */
  @JsonProperty(
      value = "payment_submethod",
      required = false
  )
  public final String paymentSubmethod;

  /**
   * Amount of the transaction
   */
  @JsonProperty(
      value = "amount",
      required = true
  )
  public final Integer amount;

  /**
   * Gateway information about the transaction
   */
  @JsonProperty(
      value = "gateway_information",
      required = true
  )
  public final OrderPaymentTransactionGateway gatewayInformation;

  /**
   * Reference of the address of the transaction
   */
  @JsonProperty(
      value = "billing_address_reference",
      required = true
  )
  public final String billingAddressReference;

  @JsonCreator
  public OrderPaymentTransaction(
      @JsonProperty(value = "payment_method", required = true) final String paymentMethod,
      @JsonProperty(value = "payment_submethod", required = false) final String paymentSubmethod,
      @JsonProperty(value = "amount", required = true) final Integer amount,
      @JsonProperty(value = "gateway_information", required = true) final OrderPaymentTransactionGateway gatewayInformation,
      @JsonProperty(value = "billing_address_reference", required = true) final String billingAddressReference) {
    this.paymentMethod = paymentMethod;
    this.paymentSubmethod = paymentSubmethod;
    this.amount = amount;
    this.gatewayInformation = gatewayInformation;
    this.billingAddressReference = billingAddressReference;
  }
}
