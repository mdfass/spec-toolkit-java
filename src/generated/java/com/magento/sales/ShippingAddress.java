package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Shipping address information for order modification actions
 */
public final class ShippingAddress {
  /**
   * This identifier should be provided by the same system where the order was placed,
   *                         otherwise although MOM will store it the front end won't be able to process or recognize it.
   *                         Also mention it could be empty in some cases (for instance if the order modification is
   *                         initiated by a CS agent using the MOM CS application)
   *                     
   * Reference of the new address. It may not be unique or empty
   */
  @JsonProperty(
      value = "reference",
      required = false
  )
  public final String reference;

  /**
   * First Name of the source
   */
  @JsonProperty(
      value = "first_name",
      required = true
  )
  public final String firstName;

  /**
   * Last Name of the source
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
   * State of the address
   */
  @JsonProperty(
      value = "state",
      required = false
  )
  public final String state;

  /**
   * Zip code of the address
   */
  @JsonProperty(
      value = "zip",
      required = false
  )
  public final String zip;

  /**
   * Country code of the address
   */
  @JsonProperty(
      value = "country_code",
      required = true
  )
  public final String countryCode;

  /**
   * Phone of the source
   */
  @JsonProperty(
      value = "phone",
      required = false
  )
  public final String phone;

  /**
   * Email of the source
   */
  @JsonProperty(
      value = "email",
      required = true
  )
  public final String email;

  /**
   * Latitude coordinates
   */
  @JsonProperty(
      value = "latitude",
      required = false
  )
  public final String latitude;

  /**
   * Longitude coordinates
   */
  @JsonProperty(
      value = "longitude",
      required = false
  )
  public final String longitude;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public ShippingAddress(
      @JsonProperty(value = "reference", required = false) final String reference,
      @JsonProperty(value = "first_name", required = true) final String firstName,
      @JsonProperty(value = "last_name", required = true) final String lastName,
      @JsonProperty(value = "company_name", required = false) final String companyName,
      @JsonProperty(value = "address1", required = true) final String address1,
      @JsonProperty(value = "address2", required = false) final String address2,
      @JsonProperty(value = "city", required = true) final String city,
      @JsonProperty(value = "state", required = false) final String state,
      @JsonProperty(value = "zip", required = false) final String zip,
      @JsonProperty(value = "country_code", required = true) final String countryCode,
      @JsonProperty(value = "phone", required = false) final String phone,
      @JsonProperty(value = "email", required = true) final String email,
      @JsonProperty(value = "latitude", required = false) final String latitude,
      @JsonProperty(value = "longitude", required = false) final String longitude,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.reference = reference;
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.countryCode = countryCode;
    this.phone = phone;
    this.email = email;
    this.latitude = latitude;
    this.longitude = longitude;
    this.customAttributes = customAttributes;
  }
}
