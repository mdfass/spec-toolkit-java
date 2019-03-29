package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Message
 */
public final class Message {
  /**
   * Unique ID for Message
   */
  @JsonProperty(
      value = "delivery_id",
      required = false
  )
  public final String deliveryId;

  /**
   * Time when message was received
   */
  @JsonProperty(
      value = "received_at",
      required = false
  )
  public final String receivedAt;

  /**
   * Endpoint
   */
  @JsonProperty(
      value = "endpoint",
      required = false
  )
  public final String endpoint;

  /**
   * Method
   */
  @JsonProperty(
      value = "method",
      required = false
  )
  public final String method;

  /**
   * JSON serialized parameters
   */
  @JsonProperty(
      value = "params",
      required = false
  )
  public final String params;

  /**
   *
   *                         Possible statuses:
   *                         - delivering - message received and yet not delivered to integration
   *                         - success - message successfully received by integration
   *                         - error - message delivered to integration but integration replied with an error response
   *                         - failure - message was not delivered to integration
   *                     
   * Status
   */
  @JsonProperty(
      value = "status",
      required = false
  )
  public final MessageStatus status;

  /**
   * Host which received message
   */
  @JsonProperty(
      value = "host",
      required = false
  )
  public final String host;

  /**
   * Client IP which sent the message
   */
  @JsonProperty(
      value = "client_ip",
      required = false
  )
  public final String clientIp;

  @JsonCreator
  public Message(@JsonProperty(value = "delivery_id", required = false) final String deliveryId,
      @JsonProperty(value = "received_at", required = false) final String receivedAt,
      @JsonProperty(value = "endpoint", required = false) final String endpoint,
      @JsonProperty(value = "method", required = false) final String method,
      @JsonProperty(value = "params", required = false) final String params,
      @JsonProperty(value = "status", required = false) final MessageStatus status,
      @JsonProperty(value = "host", required = false) final String host,
      @JsonProperty(value = "client_ip", required = false) final String clientIp) {
    this.deliveryId = deliveryId;
    this.receivedAt = receivedAt;
    this.endpoint = endpoint;
    this.method = method;
    this.params = params;
    this.status = status;
    this.host = host;
    this.clientIp = clientIp;
  }
}
