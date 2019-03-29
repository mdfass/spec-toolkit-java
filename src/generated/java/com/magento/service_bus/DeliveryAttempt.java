package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 * Delivery Attempt
 */
public final class DeliveryAttempt {
  /**
   * Unique ID for Message
   */
  @JsonProperty(
      value = "delivery_id",
      required = false
  )
  public final String deliveryId;

  /**
   * Time when attempt was sent
   */
  @JsonProperty(
      value = "sent_at",
      required = false
  )
  public final String sentAt;

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
   * Response Body
   */
  @JsonProperty(
      value = "response",
      required = false
  )
  public final String response;

  /**
   * Error Message
   */
  @JsonProperty(
      value = "error_message",
      required = false
  )
  public final String errorMessage;

  /**
   * Flag if attempt could reach the server
   */
  @JsonProperty(
      value = "is_delivered",
      required = false
  )
  public final Boolean isDelivered;

  /**
   * Flag if attempt is a retry
   */
  @JsonProperty(
      value = "is_retry",
      required = false
  )
  public final Boolean isRetry;

  /**
   * Amount of time request took (in ms)
   */
  @JsonProperty(
      value = "latency",
      required = false
  )
  public final Integer latency;

  /**
   * Host which made the attempt
   */
  @JsonProperty(
      value = "host",
      required = false
  )
  public final String host;

  /**
   * Client IP which sent the initial message
   */
  @JsonProperty(
      value = "client_ip",
      required = false
  )
  public final String clientIp;

  @JsonCreator
  public DeliveryAttempt(
      @JsonProperty(value = "delivery_id", required = false) final String deliveryId,
      @JsonProperty(value = "sent_at", required = false) final String sentAt,
      @JsonProperty(value = "endpoint", required = false) final String endpoint,
      @JsonProperty(value = "method", required = false) final String method,
      @JsonProperty(value = "response", required = false) final String response,
      @JsonProperty(value = "error_message", required = false) final String errorMessage,
      @JsonProperty(value = "is_delivered", required = false) final Boolean isDelivered,
      @JsonProperty(value = "is_retry", required = false) final Boolean isRetry,
      @JsonProperty(value = "latency", required = false) final Integer latency,
      @JsonProperty(value = "host", required = false) final String host,
      @JsonProperty(value = "client_ip", required = false) final String clientIp) {
    this.deliveryId = deliveryId;
    this.sentAt = sentAt;
    this.endpoint = endpoint;
    this.method = method;
    this.response = response;
    this.errorMessage = errorMessage;
    this.isDelivered = isDelivered;
    this.isRetry = isRetry;
    this.latency = latency;
    this.host = host;
    this.clientIp = clientIp;
  }
}
