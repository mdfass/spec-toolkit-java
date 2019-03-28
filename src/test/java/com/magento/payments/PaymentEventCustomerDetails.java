package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Custom details related to a Payment event
 * Custom details related to a Payment event
 */
public final class PaymentEventCustomerDetails {
  /**
   * First name of Customer
   */
  public final String firstName;

  /**
   * Last name of Customer
   */
  public final String lastName;

  @JsonCreator
  public PaymentEventCustomerDetails(
      @JsonProperty(value = "first_name", required = false) final String firstName,
      @JsonProperty(value = "last_name", required = false) final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
