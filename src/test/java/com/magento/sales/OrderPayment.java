package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Information of the payment of the order
 */
public final class OrderPayment {
  /**
   * Reference of the payment
   */
  public final String reference;

  /**
   * Currency of the payment
   */
  public final String currency;

  /**
   * Only one transaction per order is currently supported by Magento Order Management. If more than 1 transaction is sent, the order may be rejected and payments won't be processed as expected.
   * Transactions of the payment - only one transaction per order
   */
  public final List<OrderPaymentTransaction> transactions;

  @JsonCreator
  public OrderPayment(@JsonProperty(value = "reference", required = true) final String reference,
      @JsonProperty(value = "currency", required = true) final String currency,
      @JsonProperty(value = "transactions", required = false) final List<OrderPaymentTransaction> transactions) {
    this.reference = reference;
    this.currency = currency;
    this.transactions = transactions;
  }
}
