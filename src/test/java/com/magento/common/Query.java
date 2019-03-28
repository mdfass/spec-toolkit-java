package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * Search Query
 */
public final class Query {
  /**
   * Number of first record to return
   * Offset
   */
  public final Integer offset;

  /**
   * Number of records to return
   */
  public final Integer size;

  /**
   * Search criteria
   */
  public final Expression criteria;

  /**
   * Specify list of extension attributes to be included into records
   */
  public final List<String> include;

  /**
   * Sort order
   */
  public final Map<String, OrderDirection> order;

  @JsonCreator
  public Query(@JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "criteria", required = false) final Expression criteria,
      @JsonProperty(value = "include", required = false) final List<String> include,
      @JsonProperty(value = "order", required = false) final Map<String, OrderDirection> order) {
    this.offset = offset;
    this.size = size;
    this.criteria = criteria;
    this.include = include;
    this.order = order;
  }
}
