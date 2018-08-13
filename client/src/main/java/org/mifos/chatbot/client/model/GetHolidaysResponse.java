/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.EnumOptionData;

import org.mifos.chatbot.client.model.EnumOptionData;
import org.threeten.bp.LocalDate;

/**
 * GetHolidaysResponse
 */

public class GetHolidaysResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("fromDate")
  private List<Long> fromDate = null;

  @SerializedName("toDate")
  private List<Long> toDate = null;

  @SerializedName("repaymentsRescheduledTo")
  private List<Long> repaymentsRescheduledTo = null;

  @SerializedName("status")
  private EnumOptionData status = null;

  @SerializedName("reschedulingType")
  private Long reschedulingType = null;

  public GetHolidaysResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetHolidaysResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @ApiModelProperty(example = "Good Friday", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetHolidaysResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(example = "This is the detailed info about Holiday", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetHolidaysResponse fromDate(List<Long> fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  public GetHolidaysResponse addFromDateItem(Long fromDateItem) {
    if (this.fromDate == null) {
      this.fromDate = new ArrayList<Long>();
    }
    this.fromDate.add(fromDateItem);
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
   **/
  @ApiModelProperty(example = "[2013,10,26]", value = "")
  public List<Long> getFromDate() {
    return fromDate;
  }

  public void setFromDate(List<Long> fromDate) {
    this.fromDate = fromDate;
  }

  public GetHolidaysResponse toDate(List<Long> toDate) {
    this.toDate = toDate;
    return this;
  }

  public GetHolidaysResponse addToDateItem(Long toDateItem) {
    if (this.toDate == null) {
      this.toDate = new ArrayList<Long>();
    }
    this.toDate.add(toDateItem);
    return this;
  }

  /**
   * Get toDate
   * @return toDate
   **/
  @ApiModelProperty(example = "[2013,10,26]", value = "")
  public List<Long> getToDate() {
    return toDate;
  }

  public void setToDate(List<Long> toDate) {
    this.toDate = toDate;
  }

  public GetHolidaysResponse repaymentsRescheduledTo(List<Long> repaymentsRescheduledTo) {
    this.repaymentsRescheduledTo = repaymentsRescheduledTo;
    return this;
  }

  public GetHolidaysResponse addRepaymentsRescheduledToItem(Long repaymentsRescheduledToItem) {
    if (this.repaymentsRescheduledTo == null) {
      this.repaymentsRescheduledTo = new ArrayList<Long>();
    }
    this.repaymentsRescheduledTo.add(repaymentsRescheduledToItem);
    return this;
  }

  /**
   * Get repaymentsRescheduledTo
   * @return repaymentsRescheduledTo
   **/
  @ApiModelProperty(example = "[2013,10,27]", value = "")
  public List<Long> getRepaymentsRescheduledTo() {
    return repaymentsRescheduledTo;
  }

  public void setRepaymentsRescheduledTo(List<Long> repaymentsRescheduledTo) {
    this.repaymentsRescheduledTo = repaymentsRescheduledTo;
  }

  public GetHolidaysResponse status(EnumOptionData status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @ApiModelProperty(value = "")
  public EnumOptionData getStatus() {
    return status;
  }

  public void setStatus(EnumOptionData status) {
    this.status = status;
  }

  public GetHolidaysResponse reschedulingType(Long reschedulingType) {
    this.reschedulingType = reschedulingType;
    return this;
  }

  /**
   * Get reschedulingType
   * @return reschedulingType
   **/
  @ApiModelProperty(example = "1", value = "")
  public Long getReschedulingType() {
    return reschedulingType;
  }

  public void setReschedulingType(Long reschedulingType) {
    this.reschedulingType = reschedulingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHolidaysResponse getHolidaysResponse = (GetHolidaysResponse) o;
    return Objects.equals(this.id, getHolidaysResponse.id) &&
            Objects.equals(this.name, getHolidaysResponse.name) &&
            Objects.equals(this.description, getHolidaysResponse.description) &&
            Objects.equals(this.fromDate, getHolidaysResponse.fromDate) &&
            Objects.equals(this.toDate, getHolidaysResponse.toDate) &&
            Objects.equals(this.repaymentsRescheduledTo, getHolidaysResponse.repaymentsRescheduledTo) &&
            Objects.equals(this.status, getHolidaysResponse.status) &&
            Objects.equals(this.reschedulingType, getHolidaysResponse.reschedulingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, fromDate, toDate, repaymentsRescheduledTo, status, reschedulingType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHolidaysResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    repaymentsRescheduledTo: ").append(toIndentedString(repaymentsRescheduledTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reschedulingType: ").append(toIndentedString(reschedulingType)).append("\n");
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

