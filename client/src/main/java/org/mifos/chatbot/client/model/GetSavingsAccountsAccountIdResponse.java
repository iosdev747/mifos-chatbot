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
import org.mifos.chatbot.client.model.GetSavingsAccountsSummary;
import org.mifos.chatbot.client.model.GetSavingsCurrency;
import org.mifos.chatbot.client.model.GetSavingsInterestCalculationDaysInYearType;
import org.mifos.chatbot.client.model.GetSavingsInterestCalculationType;
import org.mifos.chatbot.client.model.GetSavingsInterestCompoundingPeriodType;
import org.mifos.chatbot.client.model.GetSavingsInterestPostingPeriodType;
import org.mifos.chatbot.client.model.GetSavingsStatus;
import org.mifos.chatbot.client.model.GetSavingsTimeline;
import org.mifos.chatbot.client.model.GetSavingsStatus;

/**
 * GetSavingsAccountsAccountIdResponse
 */

public class GetSavingsAccountsAccountIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("savingsProductId")
  private Integer savingsProductId = null;

  @SerializedName("savingsProductName")
  private String savingsProductName = null;

  @SerializedName("fieldOfficerId")
  private Integer fieldOfficerId = null;

  @SerializedName("status")
  private GetSavingsStatus status = null;

  @SerializedName("timeline")
  private GetSavingsTimeline timeline = null;

  @SerializedName("currency")
  private GetSavingsCurrency currency = null;

  @SerializedName("nominalAnnualInterestRate")
  private Double nominalAnnualInterestRate = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetSavingsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetSavingsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("lastActiveTransactionDate")
  private List<Long> lastActiveTransactionDate = null;

  @SerializedName("summary")
  private GetSavingsAccountsSummary summary = null;

  public GetSavingsAccountsAccountIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSavingsAccountsAccountIdResponse accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  /**
   * Get accountNo
   * @return accountNo
   **/
  @ApiModelProperty(example = "000000001", value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public GetSavingsAccountsAccountIdResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetSavingsAccountsAccountIdResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Get clientName
   * @return clientName
   **/
  @ApiModelProperty(example = "small business", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetSavingsAccountsAccountIdResponse savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

  /**
   * Get savingsProductId
   * @return savingsProductId
   **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetSavingsAccountsAccountIdResponse savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

  /**
   * Get savingsProductName
   * @return savingsProductName
   **/
  @ApiModelProperty(example = "Passbook Savings", value = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetSavingsAccountsAccountIdResponse fieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

  /**
   * Get fieldOfficerId
   * @return fieldOfficerId
   **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }

  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }

  public GetSavingsAccountsAccountIdResponse status(GetSavingsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @ApiModelProperty(value = "")
  public GetSavingsStatus getStatus() {
    return status;
  }

  public void setStatus(GetSavingsStatus status) {
    this.status = status;
  }

  public GetSavingsAccountsAccountIdResponse timeline(GetSavingsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

  /**
   * Get timeline
   * @return timeline
   **/
  @ApiModelProperty(value = "")
  public GetSavingsTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetSavingsTimeline timeline) {
    this.timeline = timeline;
  }

  public GetSavingsAccountsAccountIdResponse currency(GetSavingsCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @ApiModelProperty(value = "")
  public GetSavingsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetSavingsCurrency currency) {
    this.currency = currency;
  }

  public GetSavingsAccountsAccountIdResponse nominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

  /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
   **/
  @ApiModelProperty(example = "5.0", value = "")
  public Double getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }

  public void setNominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }

  public GetSavingsAccountsAccountIdResponse interestCompoundingPeriodType(GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

  /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
   **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetSavingsAccountsAccountIdResponse interestPostingPeriodType(GetSavingsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

  /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
   **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetSavingsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetSavingsAccountsAccountIdResponse interestCalculationType(GetSavingsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

  /**
   * Get interestCalculationType
   * @return interestCalculationType
   **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetSavingsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetSavingsAccountsAccountIdResponse interestCalculationDaysInYearType(GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

  /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
   **/
  @ApiModelProperty(value = "")
  public GetSavingsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetSavingsAccountsAccountIdResponse lastActiveTransactionDate(List<Long> lastActiveTransactionDate) {
    this.lastActiveTransactionDate = lastActiveTransactionDate;
    return this;
  }

  public GetSavingsAccountsAccountIdResponse addLastActiveTransactionDateItem(Long lastActiveTransactionDateItem) {
    if (this.lastActiveTransactionDate == null) {
      this.lastActiveTransactionDate = new ArrayList<Long>();
    }
    this.lastActiveTransactionDate.add(lastActiveTransactionDateItem);
    return this;
  }

  /**
   * Get lastActiveTransactionDate
   * @return lastActiveTransactionDate
   **/
  @ApiModelProperty(value = "")
  public List<Long> getLastActiveTransactionDate() {
    return lastActiveTransactionDate;
  }

  public void setLastActiveTransactionDate(List<Long> lastActiveTransactionDate) {
    this.lastActiveTransactionDate = lastActiveTransactionDate;
  }

  public GetSavingsAccountsAccountIdResponse summary(GetSavingsAccountsSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   **/
  @ApiModelProperty(value = "")
  public GetSavingsAccountsSummary getSummary() {
    return summary;
  }

  public void setSummary(GetSavingsAccountsSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsAccountsAccountIdResponse getSavingsAccountsAccountIdResponse = (GetSavingsAccountsAccountIdResponse) o;
    return Objects.equals(this.id, getSavingsAccountsAccountIdResponse.id) &&
            Objects.equals(this.accountNo, getSavingsAccountsAccountIdResponse.accountNo) &&
            Objects.equals(this.clientId, getSavingsAccountsAccountIdResponse.clientId) &&
            Objects.equals(this.clientName, getSavingsAccountsAccountIdResponse.clientName) &&
            Objects.equals(this.savingsProductId, getSavingsAccountsAccountIdResponse.savingsProductId) &&
            Objects.equals(this.savingsProductName, getSavingsAccountsAccountIdResponse.savingsProductName) &&
            Objects.equals(this.fieldOfficerId, getSavingsAccountsAccountIdResponse.fieldOfficerId) &&
            Objects.equals(this.status, getSavingsAccountsAccountIdResponse.status) &&
            Objects.equals(this.timeline, getSavingsAccountsAccountIdResponse.timeline) &&
            Objects.equals(this.currency, getSavingsAccountsAccountIdResponse.currency) &&
            Objects.equals(this.nominalAnnualInterestRate, getSavingsAccountsAccountIdResponse.nominalAnnualInterestRate) &&
            Objects.equals(this.interestCompoundingPeriodType, getSavingsAccountsAccountIdResponse.interestCompoundingPeriodType) &&
            Objects.equals(this.interestPostingPeriodType, getSavingsAccountsAccountIdResponse.interestPostingPeriodType) &&
            Objects.equals(this.interestCalculationType, getSavingsAccountsAccountIdResponse.interestCalculationType) &&
            Objects.equals(this.interestCalculationDaysInYearType, getSavingsAccountsAccountIdResponse.interestCalculationDaysInYearType) &&
            Objects.equals(this.lastActiveTransactionDate, getSavingsAccountsAccountIdResponse.lastActiveTransactionDate) &&
            Objects.equals(this.summary, getSavingsAccountsAccountIdResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, nominalAnnualInterestRate, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lastActiveTransactionDate, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsAccountsAccountIdResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    lastActiveTransactionDate: ").append(toIndentedString(lastActiveTransactionDate)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

