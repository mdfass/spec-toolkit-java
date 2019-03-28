package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Information about the promotion at order line level
 */
public final class OrderLinePromotionInformation {
  /**
   * Original price of the line
   */
  public final Integer originalPrice;

  /**
   * Promotions applied to the line
   */
  public final List<OrderLinePromotion> promotions;

  @JsonCreator
  public OrderLinePromotionInformation(
      @JsonProperty(value = "original_price", required = true) final Integer originalPrice,
      @JsonProperty(value = "promotions", required = true) final List<OrderLinePromotion> promotions) {
    this.originalPrice = originalPrice;
    this.promotions = promotions;
  }
}
