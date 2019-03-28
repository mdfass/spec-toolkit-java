package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Shipment request item comment
 */
public final class ShipmentRequestItemComment {
  /**
   * ID of comment
   */
  public final String id;

  /**
   * Identifier of the shipment request
   */
  public final String shipmentRequestId;

  /**
   * Line number of the item in the shipment request
   */
  public final Integer shipmentRequestLineNumber;

  /**
   * Date in which the shipment request item comment was created
   */
  public final LocalDateTime createdAt;

  /**
   * User name
   */
  public final String user;

  /**
   * Comment content
   */
  public final String commentary;

  @JsonCreator
  public ShipmentRequestItemComment(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "shipment_request_id", required = true) final String shipmentRequestId,
      @JsonProperty(value = "shipment_request_line_number", required = true) final Integer shipmentRequestLineNumber,
      @JsonProperty(value = "created_at", required = false) final LocalDateTime createdAt,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "commentary", required = true) final String commentary) {
    this.id = id;
    this.shipmentRequestId = shipmentRequestId;
    this.shipmentRequestLineNumber = shipmentRequestLineNumber;
    this.createdAt = createdAt;
    this.user = user;
    this.commentary = commentary;
  }
}
