package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity representing multiple lines forced to be sourced
 */
public final class ForceSourcing {
  /**
   * external order id
   */
  public final String orderId;

  /**
   * Sales Channel ID
   */
  public final String salesChannelId;

  /**
   * When the sourcing happened
   */
  public final LocalDateTime sourcedOn;

  /**
   * User who triggered the force action
   */
  public final String user;

  /**
   * Order Lines that have been sourced by force
   */
  public final List<ForceSourcingLine> lines;

  @JsonCreator
  public ForceSourcing(@JsonProperty(value = "order_id", required = false) final String orderId,
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "sourced_on", required = true) final LocalDateTime sourcedOn,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "lines", required = true) final List<ForceSourcingLine> lines) {
    this.orderId = orderId;
    this.salesChannelId = salesChannelId;
    this.sourcedOn = sourcedOn;
    this.user = user;
    this.lines = lines;
  }
}
