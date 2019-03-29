package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * The sourcing engine's limited view of an order
 */
public final class SourcingProcessedOrder {
  /**
   * The UUID of the order supplied by MCOM
   */
  @JsonProperty(
      value = "uuid",
      required = true
  )
  public final String uuid;

  /**
   * The number of sourcing requests made for this order
   */
  @JsonProperty(
      value = "number_of_requests",
      required = true
  )
  public final Integer numberOfRequests;

  /**
   * The UUIDs of the requests made for this order
   */
  @JsonProperty(
      value = "sourcing_request_overviews",
      required = true
  )
  public final List<SourcingProcessedRequestOverview> sourcingRequestOverviews;

  @JsonCreator
  public SourcingProcessedOrder(@JsonProperty(value = "uuid", required = true) final String uuid,
      @JsonProperty(value = "number_of_requests", required = true) final Integer numberOfRequests,
      @JsonProperty(value = "sourcing_request_overviews", required = true) final List<SourcingProcessedRequestOverview> sourcingRequestOverviews) {
    this.uuid = uuid;
    this.numberOfRequests = numberOfRequests;
    this.sourcingRequestOverviews = sourcingRequestOverviews;
  }
}
