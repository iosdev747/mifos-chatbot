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
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsCurrency;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsDepositPeriodFrequency;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsInterestCalculationDaysInYearType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsInterestCalculationType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsInterestCompoundingPeriodType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsInterestPostingPeriodType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsMaxDepositTermType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsMinDepositTermType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsRecurringDepositFrequencyType;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsStatus;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsSummary;
import org.mifos.chatbot.client.model.GetRecurringDepositAccountsTimeline;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetRecurringDepositAccountsResponse
 */

public class GetRecurringDepositAccountsResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

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
  private GetRecurringDepositAccountsStatus status = null;

  @SerializedName("timeline")
  private GetRecurringDepositAccountsTimeline timeline = null;

  @SerializedName("currency")
  private GetRecurringDepositAccountsCurrency currency = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetRecurringDepositAccountsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("summary")
  private GetRecurringDepositAccountsSummary summary = null;

  @SerializedName("depositAmount")
  private Float depositAmount = null;

  @SerializedName("maturityAmount")
  private Float maturityAmount = null;

  @SerializedName("maturityDate")
  private LocalDate maturityDate = null;

  @SerializedName("recurringDepositAmount")
  private Integer recurringDepositAmount = null;

  @SerializedName("recurringDepositFrequency")
  private Integer recurringDepositFrequency = null;

  @SerializedName("recurringDepositFrequencyType")
  private GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType = null;

  @SerializedName("preClosurePenalApplicable")
  private Boolean preClosurePenalApplicable = null;

  @SerializedName("minDepositTerm")
  private Integer minDepositTerm = null;

  @SerializedName("maxDepositTerm")
  private Integer maxDepositTerm = null;

  @SerializedName("minDepositTermType")
  private GetRecurringDepositAccountsMinDepositTermType minDepositTermType = null;

  @SerializedName("maxDepositTermType")
  private GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType = null;

  @SerializedName("depositPeriod")
  private Integer depositPeriod = null;

  @SerializedName("depositPeriodFrequency")
  private GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency = null;

  public GetRecurringDepositAccountsResponse id(Integer id) {
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

  public GetRecurringDepositAccountsResponse accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetRecurringDepositAccountsResponse clientId(Integer clientId) {
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

  public GetRecurringDepositAccountsResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "Sangamesh N", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetRecurringDepositAccountsResponse savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetRecurringDepositAccountsResponse savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @ApiModelProperty(example = "RD01", value = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetRecurringDepositAccountsResponse fieldOfficerId(Integer fieldOfficerId) {
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

  public GetRecurringDepositAccountsResponse status(GetRecurringDepositAccountsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsStatus getStatus() {
    return status;
  }

  public void setStatus(GetRecurringDepositAccountsStatus status) {
    this.status = status;
  }

  public GetRecurringDepositAccountsResponse timeline(GetRecurringDepositAccountsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetRecurringDepositAccountsTimeline timeline) {
    this.timeline = timeline;
  }

  public GetRecurringDepositAccountsResponse currency(GetRecurringDepositAccountsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetRecurringDepositAccountsCurrency currency) {
    this.currency = currency;
  }

  public GetRecurringDepositAccountsResponse interestCompoundingPeriodType(GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetRecurringDepositAccountsResponse interestPostingPeriodType(GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetRecurringDepositAccountsResponse interestCalculationType(GetRecurringDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetRecurringDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetRecurringDepositAccountsResponse interestCalculationDaysInYearType(GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetRecurringDepositAccountsResponse summary(GetRecurringDepositAccountsSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsSummary getSummary() {
    return summary;
  }

  public void setSummary(GetRecurringDepositAccountsSummary summary) {
    this.summary = summary;
  }

  public GetRecurringDepositAccountsResponse depositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @ApiModelProperty(example = "1150.0", value = "")
  public Float getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
  }

  public GetRecurringDepositAccountsResponse maturityAmount(Float maturityAmount) {
    this.maturityAmount = maturityAmount;
    return this;
  }

   /**
   * Get maturityAmount
   * @return maturityAmount
  **/
  @ApiModelProperty(example = "252.59", value = "")
  public Float getMaturityAmount() {
    return maturityAmount;
  }

  public void setMaturityAmount(Float maturityAmount) {
    this.maturityAmount = maturityAmount;
  }

  public GetRecurringDepositAccountsResponse maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Get maturityDate
   * @return maturityDate
  **/
  @ApiModelProperty(example = "[2014, 4, 3]", value = "")
  public LocalDate getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }

  public GetRecurringDepositAccountsResponse recurringDepositAmount(Integer recurringDepositAmount) {
    this.recurringDepositAmount = recurringDepositAmount;
    return this;
  }

   /**
   * Get recurringDepositAmount
   * @return recurringDepositAmount
  **/
  @ApiModelProperty(example = "100", value = "")
  public Integer getRecurringDepositAmount() {
    return recurringDepositAmount;
  }

  public void setRecurringDepositAmount(Integer recurringDepositAmount) {
    this.recurringDepositAmount = recurringDepositAmount;
  }

  public GetRecurringDepositAccountsResponse recurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
    return this;
  }

   /**
   * Get recurringDepositFrequency
   * @return recurringDepositFrequency
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getRecurringDepositFrequency() {
    return recurringDepositFrequency;
  }

  public void setRecurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
  }

  public GetRecurringDepositAccountsResponse recurringDepositFrequencyType(GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
    return this;
  }

   /**
   * Get recurringDepositFrequencyType
   * @return recurringDepositFrequencyType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsRecurringDepositFrequencyType getRecurringDepositFrequencyType() {
    return recurringDepositFrequencyType;
  }

  public void setRecurringDepositFrequencyType(GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
  }

  public GetRecurringDepositAccountsResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }

  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }

  public GetRecurringDepositAccountsResponse minDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }

  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }

  public GetRecurringDepositAccountsResponse maxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @ApiModelProperty(example = "4", value = "")
  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }

  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }

  public GetRecurringDepositAccountsResponse minDepositTermType(GetRecurringDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }

  public void setMinDepositTermType(GetRecurringDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }

  public GetRecurringDepositAccountsResponse maxDepositTermType(GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }

  public void setMaxDepositTermType(GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }

  public GetRecurringDepositAccountsResponse depositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getDepositPeriod() {
    return depositPeriod;
  }

  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }

  public GetRecurringDepositAccountsResponse depositPeriodFrequency(GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
    return this;
  }

   /**
   * Get depositPeriodFrequency
   * @return depositPeriodFrequency
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsDepositPeriodFrequency getDepositPeriodFrequency() {
    return depositPeriodFrequency;
  }

  public void setDepositPeriodFrequency(GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsResponse getRecurringDepositAccountsResponse = (GetRecurringDepositAccountsResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsResponse.id) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsResponse.accountNo) &&
        Objects.equals(this.clientId, getRecurringDepositAccountsResponse.clientId) &&
        Objects.equals(this.clientName, getRecurringDepositAccountsResponse.clientName) &&
        Objects.equals(this.savingsProductId, getRecurringDepositAccountsResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getRecurringDepositAccountsResponse.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getRecurringDepositAccountsResponse.fieldOfficerId) &&
        Objects.equals(this.status, getRecurringDepositAccountsResponse.status) &&
        Objects.equals(this.timeline, getRecurringDepositAccountsResponse.timeline) &&
        Objects.equals(this.currency, getRecurringDepositAccountsResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getRecurringDepositAccountsResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getRecurringDepositAccountsResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getRecurringDepositAccountsResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getRecurringDepositAccountsResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.summary, getRecurringDepositAccountsResponse.summary) &&
        Objects.equals(this.depositAmount, getRecurringDepositAccountsResponse.depositAmount) &&
        Objects.equals(this.maturityAmount, getRecurringDepositAccountsResponse.maturityAmount) &&
        Objects.equals(this.maturityDate, getRecurringDepositAccountsResponse.maturityDate) &&
        Objects.equals(this.recurringDepositAmount, getRecurringDepositAccountsResponse.recurringDepositAmount) &&
        Objects.equals(this.recurringDepositFrequency, getRecurringDepositAccountsResponse.recurringDepositFrequency) &&
        Objects.equals(this.recurringDepositFrequencyType, getRecurringDepositAccountsResponse.recurringDepositFrequencyType) &&
        Objects.equals(this.preClosurePenalApplicable, getRecurringDepositAccountsResponse.preClosurePenalApplicable) &&
        Objects.equals(this.minDepositTerm, getRecurringDepositAccountsResponse.minDepositTerm) &&
        Objects.equals(this.maxDepositTerm, getRecurringDepositAccountsResponse.maxDepositTerm) &&
        Objects.equals(this.minDepositTermType, getRecurringDepositAccountsResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTermType, getRecurringDepositAccountsResponse.maxDepositTermType) &&
        Objects.equals(this.depositPeriod, getRecurringDepositAccountsResponse.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequency, getRecurringDepositAccountsResponse.depositPeriodFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, summary, depositAmount, maturityAmount, maturityDate, recurringDepositAmount, recurringDepositFrequency, recurringDepositFrequencyType, preClosurePenalApplicable, minDepositTerm, maxDepositTerm, minDepositTermType, maxDepositTermType, depositPeriod, depositPeriodFrequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsResponse {\n");
    
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
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    recurringDepositAmount: ").append(toIndentedString(recurringDepositAmount)).append("\n");
    sb.append("    recurringDepositFrequency: ").append(toIndentedString(recurringDepositFrequency)).append("\n");
    sb.append("    recurringDepositFrequencyType: ").append(toIndentedString(recurringDepositFrequencyType)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequency: ").append(toIndentedString(depositPeriodFrequency)).append("\n");
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

