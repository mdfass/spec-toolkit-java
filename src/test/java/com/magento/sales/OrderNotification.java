package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Order Notification
 */
public final class OrderNotification {
  /**
   * Notification Unique Identifier
   */
  public final String id;

  /**
   * Order Unique Identifier
   */
  public final String orderId;

  /**
   * Notification Type
   */
  public final String type;

  /**
   * Recipient
   */
  public final String recipient;

  /**
   * Date and time when notification was sent
   */
  public final LocalDateTime sentOn;

  /**
   * Username or Process which triggered notification
   */
  public final String triggeredBy;

  @JsonCreator
  public OrderNotification(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "recipient", required = true) final String recipient,
      @JsonProperty(value = "sent_on", required = true) final LocalDateTime sentOn,
      @JsonProperty(value = "triggered_by", required = true) final String triggeredBy) {
    this.id = id;
    this.orderId = orderId;
    this.type = type;
    this.recipient = recipient;
    this.sentOn = sentOn;
    this.triggeredBy = triggeredBy;
  }
}
