package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Physical address information
 */
public final class Address {
  /**
   * Reference of the address
   */
  public final String reference;

  /**
   * Type of the address
   */
  public final String addressType;

  /**
   * First Name of the source
   */
  public final String firstName;

  /**
   * Last Name of the source
   */
  public final String lastName;

  /**
   * First line of address description
   */
  public final String address1;

  /**
   * Second line of address description
   */
  public final String address2;

  /**
   * City of the address
   */
  public final String city;

  /**
   * State of the address
   */
  public final String state;

  /**
   * Zip code of the address
   */
  public final String zip;

  /**
   * Country code of the address
   */
  public final String countryCode;

  /**
   * Phone of the source
   */
  public final String phone;

  /**
   * Email of the source
   */
  public final String email;

  /**
   * Latitude coordinates
   */
  public final String latitude;

  /**
   * Longitude coordinates
   */
  public final String longitude;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Address(@JsonProperty(value = "reference", required = true) final String reference,
      @JsonProperty(value = "address_type", required = false) final String addressType,
      @JsonProperty(value = "first_name", required = true) final String firstName,
      @JsonProperty(value = "last_name", required = true) final String lastName,
      @JsonProperty(value = "address1", required = true) final String address1,
      @JsonProperty(value = "address2", required = false) final String address2,
      @JsonProperty(value = "city", required = true) final String city,
      @JsonProperty(value = "state", required = false) final String state,
      @JsonProperty(value = "zip", required = false) final String zip,
      @JsonProperty(value = "country_code", required = true) final String countryCode,
      @JsonProperty(value = "phone", required = false) final String phone,
      @JsonProperty(value = "email", required = false) final String email,
      @JsonProperty(value = "latitude", required = false) final String latitude,
      @JsonProperty(value = "longitude", required = false) final String longitude,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.reference = reference;
    this.addressType = addressType;
    this.firstName = firstName;
    this.lastName = lastName;
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
