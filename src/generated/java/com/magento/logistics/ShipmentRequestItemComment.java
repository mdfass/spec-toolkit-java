package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Shipment request item comment
 */
public final class ShipmentRequestItemComment {
  /**
   * ID of comment
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Identifier of the shipment request
   */
  @JsonProperty(
      value = "shipment_request_id",
      required = true
  )
  public final String shipmentRequestId;

  /**
   * Line number of the item in the shipment request
   */
  @JsonProperty(
      value = "shipment_request_line_number",
      required = true
  )
  public final Integer shipmentRequestLineNumber;

  /**
   * Date in which the shipment request item comment was created
   */
  @JsonProperty(
      value = "created_at",
      required = false
  )
  public final ZonedDateTime createdAt;

  /**
   * User name
   */
  @JsonProperty(
      value = "user",
      required = true
  )
  public final String user;

  /**
   * Comment content
   */
  @JsonProperty(
      value = "commentary",
      required = true
  )
  public final String commentary;

  @JsonCreator
  public ShipmentRequestItemComment(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "shipment_request_id", required = true) final String shipmentRequestId,
      @JsonProperty(value = "shipment_request_line_number", required = true) final Integer shipmentRequestLineNumber,
      @JsonProperty(value = "created_at", required = false) final ZonedDateTime createdAt,
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
