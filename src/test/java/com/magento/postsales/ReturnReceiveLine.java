package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Container of data for product items returned
 */
public final class ReturnReceiveLine {
  /**
   * External identifier of the line in the order. It may not be unique
   */
  public final String id;

  /**
   * Unique identifier of the line in the order
   */
  public final Integer lineNumber;

  /**
   * Product SKU identifier of the item
   */
  public final String sku;

  /**
   * Custom attributes at return line level
   */
  public final List<CustomAttribute> customAttributes;

  /**
   * Code of the reason
   */
  public final String reason;

  /**
   * Description of the reason
   */
  public final String reasonDescription;

  /**
   * Condition of the item
   */
  public final String condition;

  /**
   * Description of the condition
   */
  public final String conditionDescription;

  @JsonCreator
  public ReturnReceiveLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "reason", required = true) final String reason,
      @JsonProperty(value = "reason_description", required = true) final String reasonDescription,
      @JsonProperty(value = "condition", required = false) final String condition,
      @JsonProperty(value = "condition_description", required = false) final String conditionDescription) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.sku = sku;
    this.customAttributes = customAttributes;
    this.reason = reason;
    this.reasonDescription = reasonDescription;
    this.condition = condition;
    this.conditionDescription = conditionDescription;
  }
}
