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
import org.mifos.chatbot.client.model.GetSavingsCurrency;
import org.mifos.chatbot.client.model.GetSavingsProductsAccountingRule;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestCalculationDaysInYearType;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestCalculationType;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestCompoundingPeriodType;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestPostingPeriodType;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * GetSavingsProductsResponse
 */

public class GetSavingsProductsResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shortName")
  private String shortName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currency")
  private GetSavingsCurrency currency = null;

  @SerializedName("nominalAnnualInterestRate")
  private BigDecimal nominalAnnualInterestRate = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetSavingsProductsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetSavingsProductsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("withdrawalFeeForTransfers")
  private Boolean withdrawalFeeForTransfers = null;

  @SerializedName("accountingRule")
  private GetSavingsProductsAccountingRule accountingRule = null;

  public GetSavingsProductsResponse id(Integer id) {
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

  public GetSavingsProductsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Savings product", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSavingsProductsResponse shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(example = "sa1", value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public GetSavingsProductsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "gtasga", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetSavingsProductsResponse currency(GetSavingsCurrency currency) {
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

  public GetSavingsProductsResponse nominalAnnualInterestRate(BigDecimal nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @ApiModelProperty(example = "5.0", value = "")
  public BigDecimal getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }

  public void setNominalAnnualInterestRate(BigDecimal nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }

  public GetSavingsProductsResponse interestCompoundingPeriodType(GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetSavingsProductsResponse interestPostingPeriodType(GetSavingsProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetSavingsProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetSavingsProductsResponse interestCalculationType(GetSavingsProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetSavingsProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetSavingsProductsResponse interestCalculationDaysInYearType(GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetSavingsProductsResponse withdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
    return this;
  }

   /**
   * Get withdrawalFeeForTransfers
   * @return withdrawalFeeForTransfers
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWithdrawalFeeForTransfers() {
    return withdrawalFeeForTransfers;
  }

  public void setWithdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
    this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
  }

  public GetSavingsProductsResponse accountingRule(GetSavingsProductsAccountingRule accountingRule) {
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsAccountingRule getAccountingRule() {
    return accountingRule;
  }

  public void setAccountingRule(GetSavingsProductsAccountingRule accountingRule) {
    this.accountingRule = accountingRule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsResponse getSavingsProductsResponse = (GetSavingsProductsResponse) o;
    return Objects.equals(this.id, getSavingsProductsResponse.id) &&
        Objects.equals(this.name, getSavingsProductsResponse.name) &&
        Objects.equals(this.shortName, getSavingsProductsResponse.shortName) &&
        Objects.equals(this.description, getSavingsProductsResponse.description) &&
        Objects.equals(this.currency, getSavingsProductsResponse.currency) &&
        Objects.equals(this.nominalAnnualInterestRate, getSavingsProductsResponse.nominalAnnualInterestRate) &&
        Objects.equals(this.interestCompoundingPeriodType, getSavingsProductsResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getSavingsProductsResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getSavingsProductsResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getSavingsProductsResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.withdrawalFeeForTransfers, getSavingsProductsResponse.withdrawalFeeForTransfers) &&
        Objects.equals(this.accountingRule, getSavingsProductsResponse.accountingRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, description, currency, nominalAnnualInterestRate, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, withdrawalFeeForTransfers, accountingRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    withdrawalFeeForTransfers: ").append(toIndentedString(withdrawalFeeForTransfers)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
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

