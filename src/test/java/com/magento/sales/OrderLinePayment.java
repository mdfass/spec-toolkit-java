package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Payment information of the line
 */
public final class OrderLinePayment {
  /**
   * Identifier of the payment for the line payment
   */
  public final String paymentReference;

  /**
   * Net amount of the line payment
   */
  public final Integer netAmount;

  /**
   * Gross amount of the line payment
   */
  public final Integer grossAmount;

  /**
   * Total tax amount of the line payment
   */
  public final Integer taxAmount;

  /**
   * Total tax rate
   */
  public final Integer taxRate;

  /**
   * Detailed list of taxes applied to the line payment
   */
  public final List<OrderLinePaymentTax> taxes;

  /**
   * Currency of the line payment
   */
  public final String currency;

  /**
   * The status of the line payment
   */
  public final String status;

  /**
   * The date of the line payment status change
   */
  public final LocalDateTime statusDate;

  @JsonCreator
  public OrderLinePayment(
      @JsonProperty(value = "payment_reference", required = true) final String paymentReference,
      @JsonProperty(value = "net_amount", required = true) final Integer netAmount,
      @JsonProperty(value = "gross_amount", required = true) final Integer grossAmount,
      @JsonProperty(value = "tax_amount", required = true) final Integer taxAmount,
      @JsonProperty(value = "tax_rate", required = false) final Integer taxRate,
      @JsonProperty(value = "taxes", required = true) final List<OrderLinePaymentTax> taxes,
      @JsonProperty(value = "currency", required = true) final String currency,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "status_date", required = false) final LocalDateTime statusDate) {
    this.paymentReference = paymentReference;
    this.netAmount = netAmount;
    this.grossAmount = grossAmount;
    this.taxAmount = taxAmount;
    this.taxRate = taxRate;
    this.taxes = taxes;
    this.currency = currency;
    this.status = status;
    this.statusDate = statusDate;
  }
}
