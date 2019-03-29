package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Order Notification
 */
public final class OrderNotification {
  /**
   * Notification Unique Identifier
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Order Unique Identifier
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Notification Type
   */
  @JsonProperty(
      value = "type",
      required = true
  )
  public final String type;

  /**
   * Recipient
   */
  @JsonProperty(
      value = "recipient",
      required = true
  )
  public final String recipient;

  /**
   * Date and time when notification was sent
   */
  @JsonProperty(
      value = "sent_on",
      required = true
  )
  public final ZonedDateTime sentOn;

  /**
   * Username or Process which triggered notification
   */
  @JsonProperty(
      value = "triggered_by",
      required = true
  )
  public final String triggeredBy;

  @JsonCreator
  public OrderNotification(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "recipient", required = true) final String recipient,
      @JsonProperty(value = "sent_on", required = true) final ZonedDateTime sentOn,
      @JsonProperty(value = "triggered_by", required = true) final String triggeredBy) {
    this.id = id;
    this.orderId = orderId;
    this.type = type;
    this.recipient = recipient;
    this.sentOn = sentOn;
    this.triggeredBy = triggeredBy;
  }
}
