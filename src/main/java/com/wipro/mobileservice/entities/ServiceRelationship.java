/*
 * MobileAccess v1.3.0
 *  ##### **NaaS API Version:** 2.4.0 ##### **mobileAccess service version:** 1.2.3 ## OVERVIEW TMF 640 - Activation and Configuration API. This is a strategic mobileAccess service aiming to provide network capabilities to products.   **Note: Enum values are case sensitive**
 *
 * OpenAPI spec version: 2.4.5
 * Contact: D1701045@team.telstra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.wipro.mobileservice.entities;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wipro.mobileservice.entities.ServiceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example). This is an optional Reference to related services (e.g. components of a service chain).
 */
@Schema(description = "A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example). This is an optional Reference to related services (e.g. components of a service chain).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-11T13:23:04.291Z[GMT]")
public class ServiceRelationship {
  @SerializedName("type")
  private String type = null;

  @SerializedName("service")
  private ServiceRef service = null;

  public ServiceRelationship type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Describes links with services of the same category (useful for bundled services, e.g. to describe relies on relationship between services).
   * @return type
  **/
  @Schema(required = true, description = "Describes links with services of the same category (useful for bundled services, e.g. to describe relies on relationship between services).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServiceRelationship service(ServiceRef service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(required = true, description = "")
  public ServiceRef getService() {
    return service;
  }

  public void setService(ServiceRef service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRelationship serviceRelationship = (ServiceRelationship) o;
    return Objects.equals(this.type, serviceRelationship.type) &&
        Objects.equals(this.service, serviceRelationship.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRelationship {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
