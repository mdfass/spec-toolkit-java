package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Gateway information of the transaction
 */
public final class OrderPaymentTransactionGateway {
  /**
   * Identifier of the gateway
   */
  @JsonProperty(
      value = "gateway_id",
      required = true
  )
  public final String gatewayId;

  /**
   * Account used in the gateway
   */
  @JsonProperty(
      value = "account",
      required = true
  )
  public final String account;

  /**
   * Identifier of the transaction inside the gateway
   */
  @JsonProperty(
      value = "transaction_id",
      required = true
  )
  public final String transactionId;

  /**
   * Status of the payment authorization for this transaction
   */
  @JsonProperty(
      value = "authorization_status",
      required = false
  )
  public final String authorizationStatus;

  /**
   * Original Request Identifier of the payment in the gateway
   */
  @JsonProperty(
      value = "original_auth_request_id",
      required = false
  )
  public final String originalAuthRequestId;

  /**
   * Payment Account Unique Id of the transaction
   */
  @JsonProperty(
      value = "payment_account_unique_id",
      required = false
  )
  public final String paymentAccountUniqueId;

  /**
   * Additional gateway information
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public OrderPaymentTransactionGateway(
      @JsonProperty(value = "gateway_id", required = true) final String gatewayId,
      @JsonProperty(value = "account", required = true) final String account,
      @JsonProperty(value = "transaction_id", required = true) final String transactionId,
      @JsonProperty(value = "authorization_status", required = false) final String authorizationStatus,
      @JsonProperty(value = "original_auth_request_id", required = false) final String originalAuthRequestId,
      @JsonProperty(value = "payment_account_unique_id", required = false) final String paymentAccountUniqueId,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.gatewayId = gatewayId;
    this.account = account;
    this.transactionId = transactionId;
    this.authorizationStatus = authorizationStatus;
    this.originalAuthRequestId = originalAuthRequestId;
    this.paymentAccountUniqueId = paymentAccountUniqueId;
    this.customAttributes = customAttributes;
  }
}
