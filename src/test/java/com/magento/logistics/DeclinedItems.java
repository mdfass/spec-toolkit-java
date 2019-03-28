package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Declined item
 */
public final class DeclinedItems {
  /**
   * Amount to decline
   */
  public final Integer qty;

  /**
   * Reason
   */
  public final String reason;

  @JsonCreator
  public DeclinedItems(@JsonProperty(value = "qty", required = true) final Integer qty,
      @JsonProperty(value = "reason", required = false) final String reason) {
    this.qty = qty;
    this.reason = reason;
  }
}
