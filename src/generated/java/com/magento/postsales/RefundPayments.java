package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Payment
 */
public final class RefundPayments {
  /**
   * Reference
   */
  @JsonProperty(
      value = "ref",
      required = true
  )
  public final String ref;

  /**
   * Payment details
   */
  @JsonProperty(
      value = "details",
      required = true
  )
  public final RefundPaymentDetails details;

  /**
   * Payments
   */
  @JsonProperty(
      value = "status",
      required = false
  )
  public final RefundPaymentStatus status;

  @JsonCreator
  public RefundPayments(@JsonProperty(value = "ref", required = true) final String ref,
      @JsonProperty(value = "details", required = true) final RefundPaymentDetails details,
      @JsonProperty(value = "status", required = false) final RefundPaymentStatus status) {
    this.ref = ref;
    this.details = details;
    this.status = status;
  }
}
