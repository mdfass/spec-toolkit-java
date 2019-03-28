package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDate;

/**
 * Status of the refund
 */
public final class RefundStatus {
  /**
   * Status Code of the refund
   */
  public final String code;

  /**
   * Status Name of the refund
   */
  public final String name;

  /**
   * Reason code of the refund
   */
  public final String reasonCode;

  /**
   * Reason name of the refund
   */
  public final String reasonName;

  /**
   * Creation date of the refund
   */
  public final LocalDate date;

  @JsonCreator
  public RefundStatus(@JsonProperty(value = "code", required = false) final String code,
      @JsonProperty(value = "name", required = false) final String name,
      @JsonProperty(value = "reason_code", required = false) final String reasonCode,
      @JsonProperty(value = "reason_name", required = false) final String reasonName,
      @JsonProperty(value = "date", required = true) final LocalDate date) {
    this.code = code;
    this.name = name;
    this.reasonCode = reasonCode;
    this.reasonName = reasonName;
    this.date = date;
  }
}
