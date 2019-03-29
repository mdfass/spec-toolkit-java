package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Represents an exchange line
 */
public final class ExchangeLine {
  /**
   * Identifier of the line
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Order line number
   */
  @JsonProperty(
      value = "line_number",
      required = true
  )
  public final Integer lineNumber;

  /**
   * New SKU
   */
  @JsonProperty(
      value = "new_sku",
      required = true
  )
  public final String newSku;

  /**
   * Code of the reason
   */
  @JsonProperty(
      value = "reason",
      required = false
  )
  public final String reason;

  /**
   * Description of the reason
   */
  @JsonProperty(
      value = "reason_description",
      required = false
  )
  public final String reasonDescription;

  @JsonCreator
  public ExchangeLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "new_sku", required = true) final String newSku,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "reason_description", required = false) final String reasonDescription) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.newSku = newSku;
    this.reason = reason;
    this.reasonDescription = reasonDescription;
  }
}
