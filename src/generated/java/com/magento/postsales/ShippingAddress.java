package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Shipping address information
 */
public final class ShippingAddress {
  /**
   * First Name
   */
  @JsonProperty(
      value = "first_name",
      required = true
  )
  public final String firstName;

  /**
   * Last Name
   */
  @JsonProperty(
      value = "last_name",
      required = true
  )
  public final String lastName;

  /**
   * Company name
   */
  @JsonProperty(
      value = "company_name",
      required = false
  )
  public final String companyName;

  /**
   * First line of address description
   */
  @JsonProperty(
      value = "address1",
      required = true
  )
  public final String address1;

  /**
   * Second line of address description
   */
  @JsonProperty(
      value = "address2",
      required = false
  )
  public final String address2;

  /**
   * City of the address
   */
  @JsonProperty(
      value = "city",
      required = true
  )
  public final String city;

  /**
   * Zip code of the address
   */
  @JsonProperty(
      value = "zip",
      required = true
  )
  public final String zip;

  /**
   * State of the address
   */
  @JsonProperty(
      value = "state",
      required = true
  )
  public final String state;

  @JsonCreator
  public ShippingAddress(
      @JsonProperty(value = "first_name", required = true) final String firstName,
      @JsonProperty(value = "last_name", required = true) final String lastName,
      @JsonProperty(value = "company_name", required = false) final String companyName,
      @JsonProperty(value = "address1", required = true) final String address1,
      @JsonProperty(value = "address2", required = false) final String address2,
      @JsonProperty(value = "city", required = true) final String city,
      @JsonProperty(value = "zip", required = true) final String zip,
      @JsonProperty(value = "state", required = true) final String state) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.zip = zip;
    this.state = state;
  }
}
