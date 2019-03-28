package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a pick-list of one or several items
 */
public final class PickList {
  /**
   * Pick-list ID
   */
  public final String id;

  /**
   * Source ID to which the pick list belongs to
   */
  public final String sourceId;

  /**
   * Pick-list status
   */
  public final String status;

  /**
   * Date in which the pick list was generated
   */
  public final LocalDateTime originDate;

  /**
   * List of Pick-list items related to one sku (see pick_list_item structure)
   */
  public final List<PickListItem> items;

  /**
   * List of shipment requests included on this pick list
   */
  public final List<ShipmentRequest> shipmentRequests;

  @JsonCreator
  public PickList(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "origin_date", required = false) final LocalDateTime originDate,
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
