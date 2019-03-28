package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Order Comment
 */
public final class OrderComment {
  /**
   * Order id
   */
  public final String orderId;

  /**
   * Sales channel identifier
   */
  public final String salesChannelId;

  /**
   * Date of the comment
   */
  public final LocalDateTime createdDate;

  /**
   * User
   */
  public final String user;

  /**
   * Comment content
   */
  public final String comment;

  @JsonCreator
  public OrderComment(@JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "created_date", required = true) final LocalDateTime createdDate,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "comment", required = true) final String comment) {
    this.orderId = orderId;
    this.salesChannelId = salesChannelId;
    this.createdDate = createdDate;
    this.user = user;
    this.comment = comment;
  }
}
