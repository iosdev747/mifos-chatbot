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
import org.mifos.chatbot.client.model.PostProductsChargesSelected;
import org.mifos.chatbot.client.model.PostProductsMarketPricePeriods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostProductsTypeRequest
 */

public class PostProductsTypeRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("shortName")
  private String shortName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("digitsAfterDecimal")
  private Integer digitsAfterDecimal = null;

  @SerializedName("inMultiplesOf")
  private Integer inMultiplesOf = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("totalShares")
  private Integer totalShares = null;

  @SerializedName("sharesIssued")
  private Integer sharesIssued = null;

  @SerializedName("unitPrice")
  private Integer unitPrice = null;

  @SerializedName("minimumShares")
  private Integer minimumShares = null;

  @SerializedName("nominalShares")
  private Integer nominalShares = null;

  @SerializedName("maximumShares")
  private Integer maximumShares = null;

  @SerializedName("minimumActivePeriodForDividends")
  private Integer minimumActivePeriodForDividends = null;

  @SerializedName("minimumactiveperiodFrequencyType")
  private Integer minimumactiveperiodFrequencyType = null;

  @SerializedName("lockinPeriodFrequency")
  private Integer lockinPeriodFrequency = null;

  @SerializedName("lockinPeriodFrequencyType")
  private Integer lockinPeriodFrequencyType = null;

  @SerializedName("allowDividendCalculationForInactiveClients")
  private Boolean allowDividendCalculationForInactiveClients = null;

  @SerializedName("marketPricePeriods")
  private List<PostProductsMarketPricePeriods> marketPricePeriods = null;

  @SerializedName("chargesSelected")
  private List<PostProductsChargesSelected> chargesSelected = null;

  @SerializedName("accountingRule")
  private Integer accountingRule = null;

  public PostProductsTypeRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Share Product", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostProductsTypeRequest shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(example = "SP", value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public PostProductsTypeRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Description", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostProductsTypeRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PostProductsTypeRequest digitsAfterDecimal(Integer digitsAfterDecimal) {
    this.digitsAfterDecimal = digitsAfterDecimal;
    return this;
  }

   /**
   * Get digitsAfterDecimal
   * @return digitsAfterDecimal
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getDigitsAfterDecimal() {
    return digitsAfterDecimal;
  }

  public void setDigitsAfterDecimal(Integer digitsAfterDecimal) {
    this.digitsAfterDecimal = digitsAfterDecimal;
  }

  public PostProductsTypeRequest inMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
    return this;
  }

   /**
   * Get inMultiplesOf
   * @return inMultiplesOf
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getInMultiplesOf() {
    return inMultiplesOf;
  }

  public void setInMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
  }

  public PostProductsTypeRequest locale(String locale) {
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

  public PostProductsTypeRequest totalShares(Integer totalShares) {
    this.totalShares = totalShares;
    return this;
  }

   /**
   * Get totalShares
   * @return totalShares
  **/
  @ApiModelProperty(example = "1000", value = "")
  public Integer getTotalShares() {
    return totalShares;
  }

  public void setTotalShares(Integer totalShares) {
    this.totalShares = totalShares;
  }

  public PostProductsTypeRequest sharesIssued(Integer sharesIssued) {
    this.sharesIssued = sharesIssued;
    return this;
  }

   /**
   * Get sharesIssued
   * @return sharesIssued
  **/
  @ApiModelProperty(example = "1000", value = "")
  public Integer getSharesIssued() {
    return sharesIssued;
  }

  public void setSharesIssued(Integer sharesIssued) {
    this.sharesIssued = sharesIssued;
  }

  public PostProductsTypeRequest unitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }

  public PostProductsTypeRequest minimumShares(Integer minimumShares) {
    this.minimumShares = minimumShares;
    return this;
  }

   /**
   * Get minimumShares
   * @return minimumShares
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getMinimumShares() {
    return minimumShares;
  }

  public void setMinimumShares(Integer minimumShares) {
    this.minimumShares = minimumShares;
  }

  public PostProductsTypeRequest nominalShares(Integer nominalShares) {
    this.nominalShares = nominalShares;
    return this;
  }

   /**
   * Get nominalShares
   * @return nominalShares
  **/
  @ApiModelProperty(example = "20", value = "")
  public Integer getNominalShares() {
    return nominalShares;
  }

  public void setNominalShares(Integer nominalShares) {
    this.nominalShares = nominalShares;
  }

  public PostProductsTypeRequest maximumShares(Integer maximumShares) {
    this.maximumShares = maximumShares;
    return this;
  }

   /**
   * Get maximumShares
   * @return maximumShares
  **/
  @ApiModelProperty(example = "30", value = "")
  public Integer getMaximumShares() {
    return maximumShares;
  }

  public void setMaximumShares(Integer maximumShares) {
    this.maximumShares = maximumShares;
  }

  public PostProductsTypeRequest minimumActivePeriodForDividends(Integer minimumActivePeriodForDividends) {
    this.minimumActivePeriodForDividends = minimumActivePeriodForDividends;
    return this;
  }

   /**
   * Get minimumActivePeriodForDividends
   * @return minimumActivePeriodForDividends
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getMinimumActivePeriodForDividends() {
    return minimumActivePeriodForDividends;
  }

  public void setMinimumActivePeriodForDividends(Integer minimumActivePeriodForDividends) {
    this.minimumActivePeriodForDividends = minimumActivePeriodForDividends;
  }

  public PostProductsTypeRequest minimumactiveperiodFrequencyType(Integer minimumactiveperiodFrequencyType) {
    this.minimumactiveperiodFrequencyType = minimumactiveperiodFrequencyType;
    return this;
  }

   /**
   * Get minimumactiveperiodFrequencyType
   * @return minimumactiveperiodFrequencyType
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getMinimumactiveperiodFrequencyType() {
    return minimumactiveperiodFrequencyType;
  }

  public void setMinimumactiveperiodFrequencyType(Integer minimumactiveperiodFrequencyType) {
    this.minimumactiveperiodFrequencyType = minimumactiveperiodFrequencyType;
  }

  public PostProductsTypeRequest lockinPeriodFrequency(Integer lockinPeriodFrequency) {
    this.lockinPeriodFrequency = lockinPeriodFrequency;
    return this;
  }

   /**
   * Get lockinPeriodFrequency
   * @return lockinPeriodFrequency
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getLockinPeriodFrequency() {
    return lockinPeriodFrequency;
  }

  public void setLockinPeriodFrequency(Integer lockinPeriodFrequency) {
    this.lockinPeriodFrequency = lockinPeriodFrequency;
  }

  public PostProductsTypeRequest lockinPeriodFrequencyType(Integer lockinPeriodFrequencyType) {
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
    return this;
  }

   /**
   * Get lockinPeriodFrequencyType
   * @return lockinPeriodFrequencyType
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getLockinPeriodFrequencyType() {
    return lockinPeriodFrequencyType;
  }

  public void setLockinPeriodFrequencyType(Integer lockinPeriodFrequencyType) {
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
  }

  public PostProductsTypeRequest allowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
    return this;
  }

   /**
   * Get allowDividendCalculationForInactiveClients
   * @return allowDividendCalculationForInactiveClients
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isAllowDividendCalculationForInactiveClients() {
    return allowDividendCalculationForInactiveClients;
  }

  public void setAllowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
  }

  public PostProductsTypeRequest marketPricePeriods(List<PostProductsMarketPricePeriods> marketPricePeriods) {
    this.marketPricePeriods = marketPricePeriods;
    return this;
  }

  public PostProductsTypeRequest addMarketPricePeriodsItem(PostProductsMarketPricePeriods marketPricePeriodsItem) {
    if (this.marketPricePeriods == null) {
      this.marketPricePeriods = new ArrayList<PostProductsMarketPricePeriods>();
    }
    this.marketPricePeriods.add(marketPricePeriodsItem);
    return this;
  }

   /**
   * Get marketPricePeriods
   * @return marketPricePeriods
  **/
  @ApiModelProperty(value = "")
  public List<PostProductsMarketPricePeriods> getMarketPricePeriods() {
    return marketPricePeriods;
  }

  public void setMarketPricePeriods(List<PostProductsMarketPricePeriods> marketPricePeriods) {
    this.marketPricePeriods = marketPricePeriods;
  }

  public PostProductsTypeRequest chargesSelected(List<PostProductsChargesSelected> chargesSelected) {
    this.chargesSelected = chargesSelected;
    return this;
  }

  public PostProductsTypeRequest addChargesSelectedItem(PostProductsChargesSelected chargesSelectedItem) {
    if (this.chargesSelected == null) {
      this.chargesSelected = new ArrayList<PostProductsChargesSelected>();
    }
    this.chargesSelected.add(chargesSelectedItem);
    return this;
  }

   /**
   * Get chargesSelected
   * @return chargesSelected
  **/
  @ApiModelProperty(value = "")
  public List<PostProductsChargesSelected> getChargesSelected() {
    return chargesSelected;
  }

  public void setChargesSelected(List<PostProductsChargesSelected> chargesSelected) {
    this.chargesSelected = chargesSelected;
  }

  public PostProductsTypeRequest accountingRule(Integer accountingRule) {
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getAccountingRule() {
    return accountingRule;
  }

  public void setAccountingRule(Integer accountingRule) {
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
    PostProductsTypeRequest postProductsTypeRequest = (PostProductsTypeRequest) o;
    return Objects.equals(this.name, postProductsTypeRequest.name) &&
        Objects.equals(this.shortName, postProductsTypeRequest.shortName) &&
        Objects.equals(this.description, postProductsTypeRequest.description) &&
        Objects.equals(this.currencyCode, postProductsTypeRequest.currencyCode) &&
        Objects.equals(this.digitsAfterDecimal, postProductsTypeRequest.digitsAfterDecimal) &&
        Objects.equals(this.inMultiplesOf, postProductsTypeRequest.inMultiplesOf) &&
        Objects.equals(this.locale, postProductsTypeRequest.locale) &&
        Objects.equals(this.totalShares, postProductsTypeRequest.totalShares) &&
        Objects.equals(this.sharesIssued, postProductsTypeRequest.sharesIssued) &&
        Objects.equals(this.unitPrice, postProductsTypeRequest.unitPrice) &&
        Objects.equals(this.minimumShares, postProductsTypeRequest.minimumShares) &&
        Objects.equals(this.nominalShares, postProductsTypeRequest.nominalShares) &&
        Objects.equals(this.maximumShares, postProductsTypeRequest.maximumShares) &&
        Objects.equals(this.minimumActivePeriodForDividends, postProductsTypeRequest.minimumActivePeriodForDividends) &&
        Objects.equals(this.minimumactiveperiodFrequencyType, postProductsTypeRequest.minimumactiveperiodFrequencyType) &&
        Objects.equals(this.lockinPeriodFrequency, postProductsTypeRequest.lockinPeriodFrequency) &&
        Objects.equals(this.lockinPeriodFrequencyType, postProductsTypeRequest.lockinPeriodFrequencyType) &&
        Objects.equals(this.allowDividendCalculationForInactiveClients, postProductsTypeRequest.allowDividendCalculationForInactiveClients) &&
        Objects.equals(this.marketPricePeriods, postProductsTypeRequest.marketPricePeriods) &&
        Objects.equals(this.chargesSelected, postProductsTypeRequest.chargesSelected) &&
        Objects.equals(this.accountingRule, postProductsTypeRequest.accountingRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortName, description, currencyCode, digitsAfterDecimal, inMultiplesOf, locale, totalShares, sharesIssued, unitPrice, minimumShares, nominalShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, allowDividendCalculationForInactiveClients, marketPricePeriods, chargesSelected, accountingRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProductsTypeRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    digitsAfterDecimal: ").append(toIndentedString(digitsAfterDecimal)).append("\n");
    sb.append("    inMultiplesOf: ").append(toIndentedString(inMultiplesOf)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    totalShares: ").append(toIndentedString(totalShares)).append("\n");
    sb.append("    sharesIssued: ").append(toIndentedString(sharesIssued)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    minimumShares: ").append(toIndentedString(minimumShares)).append("\n");
    sb.append("    nominalShares: ").append(toIndentedString(nominalShares)).append("\n");
    sb.append("    maximumShares: ").append(toIndentedString(maximumShares)).append("\n");
    sb.append("    minimumActivePeriodForDividends: ").append(toIndentedString(minimumActivePeriodForDividends)).append("\n");
    sb.append("    minimumactiveperiodFrequencyType: ").append(toIndentedString(minimumactiveperiodFrequencyType)).append("\n");
    sb.append("    lockinPeriodFrequency: ").append(toIndentedString(lockinPeriodFrequency)).append("\n");
    sb.append("    lockinPeriodFrequencyType: ").append(toIndentedString(lockinPeriodFrequencyType)).append("\n");
    sb.append("    allowDividendCalculationForInactiveClients: ").append(toIndentedString(allowDividendCalculationForInactiveClients)).append("\n");
    sb.append("    marketPricePeriods: ").append(toIndentedString(marketPricePeriods)).append("\n");
    sb.append("    chargesSelected: ").append(toIndentedString(chargesSelected)).append("\n");
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

