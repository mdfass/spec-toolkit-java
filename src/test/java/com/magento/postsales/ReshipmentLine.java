package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Represents a reshipment line
 */
public final class ReshipmentLine {
  /**
   * Identifier of the line
   */
  public final String id;

  /**
   * Order line number
   */
  public final Integer lineNumber;

  /**
   * Code of the reason
   */
  public final String reason;

  /**
   * Description of the reason
   */
  public final String reasonDescription;

  @JsonCreator
  public ReshipmentLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "reason_description", required = false) final String reasonDescription) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.reason = reason;
    this.reasonDescription = reasonDescription;
  }
}
