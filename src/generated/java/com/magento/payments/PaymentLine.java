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
  @JsonProperty(
      value = "line_number",
      required = true
  )
  public final Integer lineNumber;

  /**
   * Item name
   */
  @JsonProperty(
      value = "item_name",
      required = true
  )
  public final String itemName;

  /**
   * Item sku identifier
   */
  @JsonProperty(
      value = "item_sku",
      required = true
  )
  public final String itemSku;

  /**
   * Type of the item product
   */
  @JsonProperty(
      value = "item_type",
      required = true
  )
  public final String itemType;

  /**
   * Order line quantity
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * Original gross unit price of the item
   */
  @JsonProperty(
      value = "unit_price_gross",
      required = true
  )
  public final Integer unitPriceGross;

  /**
   * Gross amount to be refunded
   */
  @JsonProperty(
      value = "refund_amount",
      required = false
  )
  public final Integer refundAmount;

  /**
   * Tax amount of the order line
   */
  @JsonProperty(
      value = "tax_amount",
      required = false
  )
  public final Integer taxAmount;

  /**
   * Tax rate applied
   */
  @JsonProperty(
      value = "tax_rate",
      required = false
  )
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
