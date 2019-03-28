package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Payment line information
 */
public final class PaymentLine {
  /**
   * Order line Number
   */
  public final Integer lineNumber;

  /**
   * Item name
   */
  public final String itemName;

  /**
   * Item sku identifier
   */
  public final String itemSku;

  /**
   * Type of the item product
   */
  public final String itemType;

  /**
   * Order line quantity
   */
  public final Integer quantity;

  /**
   * Original gross unit price of the item
   */
  public final Integer unitPriceGross;

  /**
   * Gross amount to be refunded
   */
  public final Integer refundAmount;

  /**
   * Tax amount of the order line
   */
  public final Integer taxAmount;

  /**
   * Tax rate applied
   */
  public final Integer taxRate;

  @JsonCreator
  public PaymentLine(@JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "item_name", required = true) final String itemName,
      @JsonProperty(value = "item_sku", required = true) final String itemSku,
      @JsonProperty(value = "item_type", required = true) final String itemType,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "unit_price_gross", required = true) final Integer unitPriceGross,
      @JsonProperty(value = "refund_amount", required = false) final Integer refundAmount,
      @JsonProperty(value = "tax_amount", required = false) final Integer taxAmount,
      @JsonProperty(value = "tax_rate", required = false) final Integer taxRate) {
    this.lineNumber = lineNumber;
    this.itemName = itemName;
    this.itemSku = itemSku;
    this.itemType = itemType;
    this.quantity = quantity;
    this.unitPriceGross = unitPriceGross;
    this.refundAmount = refundAmount;
    this.taxAmount = taxAmount;
    this.taxRate = taxRate;
  }
}
