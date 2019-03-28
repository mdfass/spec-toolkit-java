package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * The lines related to the appeasement
 */
public final class AppeasementLine {
  /**
   * External identifier of the line in the order. It may not be unique
   */
  public final String id;

  /**
   * Unique identifier of the line in the order
   */
  public final Integer lineNumber;

  /**
   * The amount of the appeasement line
   */
  public final Integer amount;

  /**
   * The reason code of the appeasement line
   */
  public final String reason;

  /**
   * The reason description of the appeasement line
   */
  public final String reasonDescription;

  /**
   * Custom Attributes of the appeasement line
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public AppeasementLine(@JsonProperty(value = "id", required = false) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "amount", required = true) final Integer amount,
      @JsonProperty(value = "reason", required = true) final String reason,
      @JsonProperty(value = "reason_description", required = true) final String reasonDescription,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.amount = amount;
    this.reason = reason;
    this.reasonDescription = reasonDescription;
    this.customAttributes = customAttributes;
  }
}
