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

import org.mifos.chatbot.client.model.ReportParameterData;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.ReportParameterData;

import java.util.ArrayList;
import java.util.List;

/**
 * PostRepostRequest
 */

public class PostRepostRequest {
  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("reportType")
  private String reportType = null;

  @SerializedName("reportSubType")
  private String reportSubType = null;

  @SerializedName("reportCategory")
  private String reportCategory = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("reportSql")
  private String reportSql = null;

  @SerializedName("reportParameters")
  private List<ReportParameterData> reportParameters = null;

  public PostRepostRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @ApiModelProperty(example = "Completely New Report", value = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public PostRepostRequest reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(example = "Table", value = "")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public PostRepostRequest reportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
    return this;
  }

   /**
   * Get reportSubType
   * @return reportSubType
  **/
  @ApiModelProperty(value = "")
  public String getReportSubType() {
    return reportSubType;
  }

  public void setReportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
  }

  public PostRepostRequest reportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @ApiModelProperty(example = "Loan", value = "")
  public String getReportCategory() {
    return reportCategory;
  }

  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }

  public PostRepostRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Just An Example", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostRepostRequest reportSql(String reportSql) {
    this.reportSql = reportSql;
    return this;
  }

   /**
   * Get reportSql
   * @return reportSql
  **/
  @ApiModelProperty(example = "select 'very good sql' as AComment", value = "")
  public String getReportSql() {
    return reportSql;
  }

  public void setReportSql(String reportSql) {
    this.reportSql = reportSql;
  }

  public PostRepostRequest reportParameters(List<ReportParameterData> reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

  public PostRepostRequest addReportParametersItem(ReportParameterData reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new ArrayList<ReportParameterData>();
    }
    this.reportParameters.add(reportParametersItem);
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @ApiModelProperty(value = "")
  public List<ReportParameterData> getReportParameters() {
    return reportParameters;
  }

  public void setReportParameters(List<ReportParameterData> reportParameters) {
    this.reportParameters = reportParameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRepostRequest postRepostRequest = (PostRepostRequest) o;
    return Objects.equals(this.reportName, postRepostRequest.reportName) &&
        Objects.equals(this.reportType, postRepostRequest.reportType) &&
        Objects.equals(this.reportSubType, postRepostRequest.reportSubType) &&
        Objects.equals(this.reportCategory, postRepostRequest.reportCategory) &&
        Objects.equals(this.description, postRepostRequest.description) &&
        Objects.equals(this.reportSql, postRepostRequest.reportSql) &&
        Objects.equals(this.reportParameters, postRepostRequest.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportName, reportType, reportSubType, reportCategory, description, reportSql, reportParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRepostRequest {\n");
    
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportSubType: ").append(toIndentedString(reportSubType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportSql: ").append(toIndentedString(reportSql)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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

