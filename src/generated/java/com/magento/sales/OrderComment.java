package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Order Comment
 */
public final class OrderComment {
  /**
   * Order id
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Sales channel identifier
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * Date of the comment
   */
  @JsonProperty(
      value = "created_date",
      required = true
  )
  public final ZonedDateTime createdDate;

  /**
   * User
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
      value = "comment",
      required = true
  )
  public final String comment;

  @JsonCreator
  public OrderComment(@JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "created_date", required = true) final ZonedDateTime createdDate,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "comment", required = true) final String comment) {
    this.orderId = orderId;
    this.salesChannelId = salesChannelId;
    this.createdDate = createdDate;
    this.user = user;
    this.comment = comment;
  }
}
