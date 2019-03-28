package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Adjust line price
 */
public final class Adjustment {
  /**
   * Sales Channel Id
   */
  public final String salesChannelId;

  /**
   * Order Id
   */
  public final String orderId;

  /**
   * User who needs to change the line price
   */
  public final String user;

  /**
   * Order line Number
   */
  public final Integer orderLineNumber;

  /**
   * Gross amount of the order line
   */
  public final Integer grossAmount;

  @JsonCreator
  public Adjustment(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "order_line_number", required = true) final Integer orderLineNumber,
      @JsonProperty(value = "gross_amount", required = true) final Integer grossAmount) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.orderLineNumber = orderLineNumber;
    this.grossAmount = grossAmount;
  }
}
