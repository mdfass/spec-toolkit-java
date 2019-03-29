package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Search Criteria
 */
public final class Expression {
  /**
   * Type of the expression
   */
  @JsonProperty(
      value = "exp",
      required = false
  )
  public final String exp;

  /**
   * Arguments
   */
  @JsonProperty(
      value = "args",
      required = false
  )
  public final List<Expression> args;

  /**
   * Constant value expression
   */
  @JsonProperty(
      value = "value",
      required = false
  )
  public final String value;

  /**
   * Type of the constant value
   */
  @JsonProperty(
      value = "type",
      required = false
  )
  public final String type;

  @JsonCreator
  public Expression(@JsonProperty(value = "exp", required = false) final String exp,
      @JsonProperty(value = "args", required = false) final List<Expression> args,
      @JsonProperty(value = "value", required = false) final String value,
      @JsonProperty(value = "type", required = false) final String type) {
    this.exp = exp;
    this.args = args;
    this.value = value;
    this.type = type;
  }
}
