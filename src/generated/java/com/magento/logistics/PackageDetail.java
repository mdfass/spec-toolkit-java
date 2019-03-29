package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Details of package
 */
public final class PackageDetail {
  /**
   * Package name
   */
  @JsonProperty(
      value = "name",
      required = true
  )
  public final String name;

  /**
   * Total weight of products within the package
   */
  @JsonProperty(
      value = "weight",
      required = false
  )
  public final Integer weight;

  /**
   * Unit to be used for weight (kg, gr, pounds...)
   */
  @JsonProperty(
      value = "weight_unit",
      required = false
  )
  public final String weightUnit;

  /**
   * Length of the package
   */
  @JsonProperty(
      value = "length",
      required = true
  )
  public final Integer length;

  /**
   * Width of the package
   */
  @JsonProperty(
      value = "width",
      required = true
  )
  public final Integer width;

  /**
   * Height of the package
   */
  @JsonProperty(
      value = "height",
      required = true
  )
  public final Integer height;

  /**
   * Unit to be used for box dimensions (cm, inches...)
   */
  @JsonProperty(
      value = "dimensions_unit",
      required = true
  )
  public final String dimensionsUnit;

  @JsonCreator
  public PackageDetail(@JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "weight", required = false) final Integer weight,
      @JsonProperty(value = "weight_unit", required = false) final String weightUnit,
      @JsonProperty(value = "length", required = true) final Integer length,
      @JsonProperty(value = "width", required = true) final Integer width,
      @JsonProperty(value = "height", required = true) final Integer height,
      @JsonProperty(value = "dimensions_unit", required = true) final String dimensionsUnit) {
    this.name = name;
    this.weight = weight;
    this.weightUnit = weightUnit;
    this.length = length;
    this.width = width;
    this.height = height;
    this.dimensionsUnit = dimensionsUnit;
  }
}
