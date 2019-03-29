package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Represents a pick-list of one or several items
 */
public final class PickList {
  /**
   * Pick-list ID
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Source ID to which the pick list belongs to
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * Pick-list status
   */
  @JsonProperty(
      value = "status",
      required = true
  )
  public final String status;

  /**
   * Date in which the pick list was generated
   */
  @JsonProperty(
      value = "origin_date",
      required = false
  )
  public final ZonedDateTime originDate;

  /**
   * List of Pick-list items related to one sku (see pick_list_item structure)
   */
  @JsonProperty(
      value = "items",
      required = true
  )
  public final List<PickListItem> items;

  /**
   * List of shipment requests included on this pick list
   */
  @JsonProperty(
      value = "shipment_requests",
      required = true
  )
  public final List<ShipmentRequest> shipmentRequests;

  @JsonCreator
  public PickList(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "origin_date", required = false) final ZonedDateTime originDate,
      @JsonProperty(value = "items", required = true) final List<PickListItem> items,
      @JsonProperty(value = "shipment_requests", required = true) final List<ShipmentRequest> shipmentRequests) {
    this.id = id;
    this.sourceId = sourceId;
    this.status = status;
    this.originDate = originDate;
    this.items = items;
    this.shipmentRequests = shipmentRequests;
  }
}
