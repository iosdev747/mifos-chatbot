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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.PostInterestRateChartsChartIdChartSlabsIncentives;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostInterestRateChartsChartIdChartSlabsRequest
 */

public class PostInterestRateChartsChartIdChartSlabsRequest {
  @SerializedName("periodType")
  private Integer periodType = null;

  @SerializedName("fromPeriod")
  private Integer fromPeriod = null;

  @SerializedName("toPeriod")
  private Integer toPeriod = null;

  @SerializedName("annualInterestRate")
  private Double annualInterestRate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("incentives")
  private List<PostInterestRateChartsChartIdChartSlabsIncentives> incentives = null;

  public PostInterestRateChartsChartIdChartSlabsRequest periodType(Integer periodType) {
    this.periodType = periodType;
    return this;
  }

   /**
   * Get periodType
   * @return periodType
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getPeriodType() {
    return periodType;
  }

  public void setPeriodType(Integer periodType) {
    this.periodType = periodType;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest fromPeriod(Integer fromPeriod) {
    this.fromPeriod = fromPeriod;
    return this;
  }

   /**
   * Get fromPeriod
   * @return fromPeriod
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getFromPeriod() {
    return fromPeriod;
  }

  public void setFromPeriod(Integer fromPeriod) {
    this.fromPeriod = fromPeriod;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest toPeriod(Integer toPeriod) {
    this.toPeriod = toPeriod;
    return this;
  }

   /**
   * Get toPeriod
   * @return toPeriod
  **/
  @ApiModelProperty(example = "180", value = "")
  public Integer getToPeriod() {
    return toPeriod;
  }

  public void setToPeriod(Integer toPeriod) {
    this.toPeriod = toPeriod;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest annualInterestRate(Double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @ApiModelProperty(example = "5.0", value = "")
  public Double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(Double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "5% interest from 1 day till 180 days of deposit", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest incentives(List<PostInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    this.incentives = incentives;
    return this;
  }

  public PostInterestRateChartsChartIdChartSlabsRequest addIncentivesItem(PostInterestRateChartsChartIdChartSlabsIncentives incentivesItem) {
    if (this.incentives == null) {
      this.incentives = new ArrayList<PostInterestRateChartsChartIdChartSlabsIncentives>();
    }
    this.incentives.add(incentivesItem);
    return this;
  }

   /**
   * Get incentives
   * @return incentives
  **/
  @ApiModelProperty(value = "")
  public List<PostInterestRateChartsChartIdChartSlabsIncentives> getIncentives() {
    return incentives;
  }

  public void setIncentives(List<PostInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    this.incentives = incentives;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInterestRateChartsChartIdChartSlabsRequest postInterestRateChartsChartIdChartSlabsRequest = (PostInterestRateChartsChartIdChartSlabsRequest) o;
    return Objects.equals(this.periodType, postInterestRateChartsChartIdChartSlabsRequest.periodType) &&
        Objects.equals(this.fromPeriod, postInterestRateChartsChartIdChartSlabsRequest.fromPeriod) &&
        Objects.equals(this.toPeriod, postInterestRateChartsChartIdChartSlabsRequest.toPeriod) &&
        Objects.equals(this.annualInterestRate, postInterestRateChartsChartIdChartSlabsRequest.annualInterestRate) &&
        Objects.equals(this.description, postInterestRateChartsChartIdChartSlabsRequest.description) &&
        Objects.equals(this.locale, postInterestRateChartsChartIdChartSlabsRequest.locale) &&
        Objects.equals(this.incentives, postInterestRateChartsChartIdChartSlabsRequest.incentives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodType, fromPeriod, toPeriod, annualInterestRate, description, locale, incentives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInterestRateChartsChartIdChartSlabsRequest {\n");
    
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
    sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    incentives: ").append(toIndentedString(incentives)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

