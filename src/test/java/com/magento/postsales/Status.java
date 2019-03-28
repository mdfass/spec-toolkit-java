package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Status of the return
 */
public final class Status {
  /**
   * Code of return
   */
  public final String code;

  /**
   * Name of return
   */
  public final String name;

  /**
   * Reason code of return
   */
  public final String reasonCode;

  /**
   * Reason name of return
   */
  public final String reasonName;

  /**
   * Creation date of return
   */
  public final LocalDateTime date;

  @JsonCreator
  public Status(@JsonProperty(value = "code", required = true) final String code,
      @JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "reason_code", required = true) final String reasonCode,
      @JsonProperty(value = "reason_name", required = true) final String reasonName,
      @JsonProperty(value = "date", required = true) final LocalDateTime date) {
    this.code = code;
    this.name = name;
    this.reasonCode = reasonCode;
    this.reasonName = reasonName;
    this.date = date;
  }
}
