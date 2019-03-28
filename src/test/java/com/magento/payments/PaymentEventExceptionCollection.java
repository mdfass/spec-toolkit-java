package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Payment Event Exception Collection
 */
public final class PaymentEventExceptionCollection {
  /**
   * Search result offset
   */
  public final Integer offset;

  /**
   * Max number of entries
   */
  public final Integer size;

  /**
   * Total number of records matching search query
   */
  public final Integer total;

  /**
   * Matching orders
   */
  public final List<PaymentEventException> items;

  @JsonCreator
  public PaymentEventExceptionCollection(
      @JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<PaymentEventException> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
