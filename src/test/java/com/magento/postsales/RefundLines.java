package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * The order lines related to the refund
 */
public final class RefundLines {
  /**
   * Reference to the order line
   */
  public final String orderLine;

  /**
   * Details of item
   */
  public final String orderItemId;

  /**
   * Refund reason
   */
  public final String reason;

  /**
   * Refund reason description
   */
  public final String reasonDescription;

  /**
   * Payments
   */
  public final List<RefundPayments> payments;

  @JsonCreator
  public RefundLines(@JsonProperty(value = "order_line", required = true) final String orderLine,
      @JsonProperty(value = "order_item_id", required = false) final String orderItemId,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "reason_description", required = true) final String reasonDescription,
      @JsonProperty(value = "payments", required = true) final List<RefundPayments> payments) {
    this.orderLine = orderLine;
    this.orderItemId = orderItemId;
    this.reason = reason;
    this.reasonDescription = reasonDescription;
    this.payments = payments;
  }
}
