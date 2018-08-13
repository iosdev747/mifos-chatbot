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

import org.mifos.chatbot.client.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.Charge;
import org.mifos.chatbot.client.model.LoanProductConfigurableAttributes;
import org.mifos.chatbot.client.model.LoanProductFloatingRates;
import org.mifos.chatbot.client.model.LoanProductGuaranteeDetails;
import org.mifos.chatbot.client.model.LoanProductInterestRecalculationDetails;
import org.mifos.chatbot.client.model.LoanProductRelatedDetail;
import org.mifos.chatbot.client.model.LoanTransactionProcessingStrategy;
import org.mifos.chatbot.client.model.MonetaryCurrency;
import org.mifos.chatbot.client.model.Money;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * LoanProduct
 */

public class LoanProduct {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("shortName")
  private String shortName = null;

  @SerializedName("loanProductRelatedDetail")
  private LoanProductRelatedDetail loanProductRelatedDetail = null;

  @SerializedName("includeInBorrowerCycle")
  private Boolean includeInBorrowerCycle = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("closeDate")
  private LocalDate closeDate = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("minimumDaysBetweenDisbursalAndFirstRepayment")
  private Integer minimumDaysBetweenDisbursalAndFirstRepayment = null;

  @SerializedName("productInterestRecalculationDetails")
  private LoanProductInterestRecalculationDetails productInterestRecalculationDetails = null;

  @SerializedName("loanProductGuaranteeDetails")
  private LoanProductGuaranteeDetails loanProductGuaranteeDetails = null;

  @SerializedName("principalThresholdForLastInstallment")
  private BigDecimal principalThresholdForLastInstallment = null;

  @SerializedName("installmentAmountInMultiplesOf")
  private Integer installmentAmountInMultiplesOf = null;

  @SerializedName("floatingRates")
  private LoanProductFloatingRates floatingRates = null;

  @SerializedName("interestRecalculationEnabled")
  private Boolean interestRecalculationEnabled = null;

  @SerializedName("equalAmortization")
  private Boolean equalAmortization = null;

  @SerializedName("currency")
  private MonetaryCurrency currency = null;

  @SerializedName("arrearsBasedOnOriginalSchedule")
  private Boolean arrearsBasedOnOriginalSchedule = null;

  @SerializedName("upfrontAccrualAccountingEnabled")
  private Boolean upfrontAccrualAccountingEnabled = null;

  @SerializedName("accountingDisabled")
  private Boolean accountingDisabled = null;

  @SerializedName("periodicAccrualAccountingEnabled")
  private Boolean periodicAccrualAccountingEnabled = null;

  @SerializedName("cashBasedAccountingEnabled")
  private Boolean cashBasedAccountingEnabled = null;

  @SerializedName("linkedToFloatingInterestRate")
  private Boolean linkedToFloatingInterestRate = null;

  @SerializedName("multiDisburseLoan")
  private Boolean multiDisburseLoan = null;

  @SerializedName("nominalInterestRatePerPeriod")
  private BigDecimal nominalInterestRatePerPeriod = null;

  @SerializedName("minPrincipalAmount")
  private Money minPrincipalAmount = null;

  @SerializedName("maxPrincipalAmount")
  private Money maxPrincipalAmount = null;

  @SerializedName("minNumberOfRepayments")
  private Integer minNumberOfRepayments = null;

  @SerializedName("maxNumberOfRepayments")
  private Integer maxNumberOfRepayments = null;

  /**
   * Gets or Sets interestPeriodFrequencyType
   */
  @JsonAdapter(InterestPeriodFrequencyTypeEnum.Adapter.class)
  public enum InterestPeriodFrequencyTypeEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS"),
    
    YEARS("YEARS"),
    
    INVALID("INVALID");

    private String value;

    InterestPeriodFrequencyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterestPeriodFrequencyTypeEnum fromValue(String text) {
      for (InterestPeriodFrequencyTypeEnum b : InterestPeriodFrequencyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InterestPeriodFrequencyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterestPeriodFrequencyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterestPeriodFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InterestPeriodFrequencyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("interestPeriodFrequencyType")
  private InterestPeriodFrequencyTypeEnum interestPeriodFrequencyType = null;

  @SerializedName("numberOfRepayments")
  private Integer numberOfRepayments = null;

  @SerializedName("holdGuaranteeFundsEnabled")
  private Boolean holdGuaranteeFundsEnabled = null;

  @SerializedName("loanProductConfigurableAttributes")
  private LoanProductConfigurableAttributes loanProductConfigurableAttributes = null;

  @SerializedName("repaymentStrategy")
  private LoanTransactionProcessingStrategy repaymentStrategy = null;

  @SerializedName("accountingType")
  private Integer accountingType = null;

  @SerializedName("minNominalInterestRatePerPeriod")
  private BigDecimal minNominalInterestRatePerPeriod = null;

  @SerializedName("maxNominalInterestRatePerPeriod")
  private BigDecimal maxNominalInterestRatePerPeriod = null;

  @SerializedName("principalAmount")
  private Money principalAmount = null;

  @SerializedName("loanProductCharges")
  private List<Charge> loanProductCharges = null;

  @SerializedName("accrualBasedAccountingEnabled")
  private Boolean accrualBasedAccountingEnabled = null;

  @SerializedName("new")
  private Boolean _new = null;

  public LoanProduct id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LoanProduct shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public LoanProduct loanProductRelatedDetail(LoanProductRelatedDetail loanProductRelatedDetail) {
    this.loanProductRelatedDetail = loanProductRelatedDetail;
    return this;
  }

   /**
   * Get loanProductRelatedDetail
   * @return loanProductRelatedDetail
  **/
  @ApiModelProperty(value = "")
  public LoanProductRelatedDetail getLoanProductRelatedDetail() {
    return loanProductRelatedDetail;
  }

  public void setLoanProductRelatedDetail(LoanProductRelatedDetail loanProductRelatedDetail) {
    this.loanProductRelatedDetail = loanProductRelatedDetail;
  }

  public LoanProduct includeInBorrowerCycle(Boolean includeInBorrowerCycle) {
    this.includeInBorrowerCycle = includeInBorrowerCycle;
    return this;
  }

   /**
   * Get includeInBorrowerCycle
   * @return includeInBorrowerCycle
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeInBorrowerCycle() {
    return includeInBorrowerCycle;
  }

  public void setIncludeInBorrowerCycle(Boolean includeInBorrowerCycle) {
    this.includeInBorrowerCycle = includeInBorrowerCycle;
  }

  public LoanProduct startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LoanProduct closeDate(LocalDate closeDate) {
    this.closeDate = closeDate;
    return this;
  }

   /**
   * Get closeDate
   * @return closeDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(LocalDate closeDate) {
    this.closeDate = closeDate;
  }

  public LoanProduct externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public LoanProduct minimumDaysBetweenDisbursalAndFirstRepayment(Integer minimumDaysBetweenDisbursalAndFirstRepayment) {
    this.minimumDaysBetweenDisbursalAndFirstRepayment = minimumDaysBetweenDisbursalAndFirstRepayment;
    return this;
  }

   /**
   * Get minimumDaysBetweenDisbursalAndFirstRepayment
   * @return minimumDaysBetweenDisbursalAndFirstRepayment
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimumDaysBetweenDisbursalAndFirstRepayment() {
    return minimumDaysBetweenDisbursalAndFirstRepayment;
  }

  public void setMinimumDaysBetweenDisbursalAndFirstRepayment(Integer minimumDaysBetweenDisbursalAndFirstRepayment) {
    this.minimumDaysBetweenDisbursalAndFirstRepayment = minimumDaysBetweenDisbursalAndFirstRepayment;
  }

  public LoanProduct productInterestRecalculationDetails(LoanProductInterestRecalculationDetails productInterestRecalculationDetails) {
    this.productInterestRecalculationDetails = productInterestRecalculationDetails;
    return this;
  }

   /**
   * Get productInterestRecalculationDetails
   * @return productInterestRecalculationDetails
  **/
  @ApiModelProperty(value = "")
  public LoanProductInterestRecalculationDetails getProductInterestRecalculationDetails() {
    return productInterestRecalculationDetails;
  }

  public void setProductInterestRecalculationDetails(LoanProductInterestRecalculationDetails productInterestRecalculationDetails) {
    this.productInterestRecalculationDetails = productInterestRecalculationDetails;
  }

  public LoanProduct loanProductGuaranteeDetails(LoanProductGuaranteeDetails loanProductGuaranteeDetails) {
    this.loanProductGuaranteeDetails = loanProductGuaranteeDetails;
    return this;
  }

   /**
   * Get loanProductGuaranteeDetails
   * @return loanProductGuaranteeDetails
  **/
  @ApiModelProperty(value = "")
  public LoanProductGuaranteeDetails getLoanProductGuaranteeDetails() {
    return loanProductGuaranteeDetails;
  }

  public void setLoanProductGuaranteeDetails(LoanProductGuaranteeDetails loanProductGuaranteeDetails) {
    this.loanProductGuaranteeDetails = loanProductGuaranteeDetails;
  }

  public LoanProduct principalThresholdForLastInstallment(BigDecimal principalThresholdForLastInstallment) {
    this.principalThresholdForLastInstallment = principalThresholdForLastInstallment;
    return this;
  }

   /**
   * Get principalThresholdForLastInstallment
   * @return principalThresholdForLastInstallment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrincipalThresholdForLastInstallment() {
    return principalThresholdForLastInstallment;
  }

  public void setPrincipalThresholdForLastInstallment(BigDecimal principalThresholdForLastInstallment) {
    this.principalThresholdForLastInstallment = principalThresholdForLastInstallment;
  }

  public LoanProduct installmentAmountInMultiplesOf(Integer installmentAmountInMultiplesOf) {
    this.installmentAmountInMultiplesOf = installmentAmountInMultiplesOf;
    return this;
  }

   /**
   * Get installmentAmountInMultiplesOf
   * @return installmentAmountInMultiplesOf
  **/
  @ApiModelProperty(value = "")
  public Integer getInstallmentAmountInMultiplesOf() {
    return installmentAmountInMultiplesOf;
  }

  public void setInstallmentAmountInMultiplesOf(Integer installmentAmountInMultiplesOf) {
    this.installmentAmountInMultiplesOf = installmentAmountInMultiplesOf;
  }

  public LoanProduct floatingRates(LoanProductFloatingRates floatingRates) {
    this.floatingRates = floatingRates;
    return this;
  }

   /**
   * Get floatingRates
   * @return floatingRates
  **/
  @ApiModelProperty(value = "")
  public LoanProductFloatingRates getFloatingRates() {
    return floatingRates;
  }

  public void setFloatingRates(LoanProductFloatingRates floatingRates) {
    this.floatingRates = floatingRates;
  }

  public LoanProduct interestRecalculationEnabled(Boolean interestRecalculationEnabled) {
    this.interestRecalculationEnabled = interestRecalculationEnabled;
    return this;
  }

   /**
   * Get interestRecalculationEnabled
   * @return interestRecalculationEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isInterestRecalculationEnabled() {
    return interestRecalculationEnabled;
  }

  public void setInterestRecalculationEnabled(Boolean interestRecalculationEnabled) {
    this.interestRecalculationEnabled = interestRecalculationEnabled;
  }

  public LoanProduct equalAmortization(Boolean equalAmortization) {
    this.equalAmortization = equalAmortization;
    return this;
  }

   /**
   * Get equalAmortization
   * @return equalAmortization
  **/
  @ApiModelProperty(value = "")
  public Boolean isEqualAmortization() {
    return equalAmortization;
  }

  public void setEqualAmortization(Boolean equalAmortization) {
    this.equalAmortization = equalAmortization;
  }

  public LoanProduct currency(MonetaryCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public MonetaryCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(MonetaryCurrency currency) {
    this.currency = currency;
  }

  public LoanProduct arrearsBasedOnOriginalSchedule(Boolean arrearsBasedOnOriginalSchedule) {
    this.arrearsBasedOnOriginalSchedule = arrearsBasedOnOriginalSchedule;
    return this;
  }

   /**
   * Get arrearsBasedOnOriginalSchedule
   * @return arrearsBasedOnOriginalSchedule
  **/
  @ApiModelProperty(value = "")
  public Boolean isArrearsBasedOnOriginalSchedule() {
    return arrearsBasedOnOriginalSchedule;
  }

  public void setArrearsBasedOnOriginalSchedule(Boolean arrearsBasedOnOriginalSchedule) {
    this.arrearsBasedOnOriginalSchedule = arrearsBasedOnOriginalSchedule;
  }

  public LoanProduct upfrontAccrualAccountingEnabled(Boolean upfrontAccrualAccountingEnabled) {
    this.upfrontAccrualAccountingEnabled = upfrontAccrualAccountingEnabled;
    return this;
  }

   /**
   * Get upfrontAccrualAccountingEnabled
   * @return upfrontAccrualAccountingEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpfrontAccrualAccountingEnabled() {
    return upfrontAccrualAccountingEnabled;
  }

  public void setUpfrontAccrualAccountingEnabled(Boolean upfrontAccrualAccountingEnabled) {
    this.upfrontAccrualAccountingEnabled = upfrontAccrualAccountingEnabled;
  }

  public LoanProduct accountingDisabled(Boolean accountingDisabled) {
    this.accountingDisabled = accountingDisabled;
    return this;
  }

   /**
   * Get accountingDisabled
   * @return accountingDisabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAccountingDisabled() {
    return accountingDisabled;
  }

  public void setAccountingDisabled(Boolean accountingDisabled) {
    this.accountingDisabled = accountingDisabled;
  }

  public LoanProduct periodicAccrualAccountingEnabled(Boolean periodicAccrualAccountingEnabled) {
    this.periodicAccrualAccountingEnabled = periodicAccrualAccountingEnabled;
    return this;
  }

   /**
   * Get periodicAccrualAccountingEnabled
   * @return periodicAccrualAccountingEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isPeriodicAccrualAccountingEnabled() {
    return periodicAccrualAccountingEnabled;
  }

  public void setPeriodicAccrualAccountingEnabled(Boolean periodicAccrualAccountingEnabled) {
    this.periodicAccrualAccountingEnabled = periodicAccrualAccountingEnabled;
  }

  public LoanProduct cashBasedAccountingEnabled(Boolean cashBasedAccountingEnabled) {
    this.cashBasedAccountingEnabled = cashBasedAccountingEnabled;
    return this;
  }

   /**
   * Get cashBasedAccountingEnabled
   * @return cashBasedAccountingEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isCashBasedAccountingEnabled() {
    return cashBasedAccountingEnabled;
  }

  public void setCashBasedAccountingEnabled(Boolean cashBasedAccountingEnabled) {
    this.cashBasedAccountingEnabled = cashBasedAccountingEnabled;
  }

  public LoanProduct linkedToFloatingInterestRate(Boolean linkedToFloatingInterestRate) {
    this.linkedToFloatingInterestRate = linkedToFloatingInterestRate;
    return this;
  }

   /**
   * Get linkedToFloatingInterestRate
   * @return linkedToFloatingInterestRate
  **/
  @ApiModelProperty(value = "")
  public Boolean isLinkedToFloatingInterestRate() {
    return linkedToFloatingInterestRate;
  }

  public void setLinkedToFloatingInterestRate(Boolean linkedToFloatingInterestRate) {
    this.linkedToFloatingInterestRate = linkedToFloatingInterestRate;
  }

  public LoanProduct multiDisburseLoan(Boolean multiDisburseLoan) {
    this.multiDisburseLoan = multiDisburseLoan;
    return this;
  }

   /**
   * Get multiDisburseLoan
   * @return multiDisburseLoan
  **/
  @ApiModelProperty(value = "")
  public Boolean isMultiDisburseLoan() {
    return multiDisburseLoan;
  }

  public void setMultiDisburseLoan(Boolean multiDisburseLoan) {
    this.multiDisburseLoan = multiDisburseLoan;
  }

  public LoanProduct nominalInterestRatePerPeriod(BigDecimal nominalInterestRatePerPeriod) {
    this.nominalInterestRatePerPeriod = nominalInterestRatePerPeriod;
    return this;
  }

   /**
   * Get nominalInterestRatePerPeriod
   * @return nominalInterestRatePerPeriod
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNominalInterestRatePerPeriod() {
    return nominalInterestRatePerPeriod;
  }

  public void setNominalInterestRatePerPeriod(BigDecimal nominalInterestRatePerPeriod) {
    this.nominalInterestRatePerPeriod = nominalInterestRatePerPeriod;
  }

  public LoanProduct minPrincipalAmount(Money minPrincipalAmount) {
    this.minPrincipalAmount = minPrincipalAmount;
    return this;
  }

   /**
   * Get minPrincipalAmount
   * @return minPrincipalAmount
  **/
  @ApiModelProperty(value = "")
  public Money getMinPrincipalAmount() {
    return minPrincipalAmount;
  }

  public void setMinPrincipalAmount(Money minPrincipalAmount) {
    this.minPrincipalAmount = minPrincipalAmount;
  }

  public LoanProduct maxPrincipalAmount(Money maxPrincipalAmount) {
    this.maxPrincipalAmount = maxPrincipalAmount;
    return this;
  }

   /**
   * Get maxPrincipalAmount
   * @return maxPrincipalAmount
  **/
  @ApiModelProperty(value = "")
  public Money getMaxPrincipalAmount() {
    return maxPrincipalAmount;
  }

  public void setMaxPrincipalAmount(Money maxPrincipalAmount) {
    this.maxPrincipalAmount = maxPrincipalAmount;
  }

  public LoanProduct minNumberOfRepayments(Integer minNumberOfRepayments) {
    this.minNumberOfRepayments = minNumberOfRepayments;
    return this;
  }

   /**
   * Get minNumberOfRepayments
   * @return minNumberOfRepayments
  **/
  @ApiModelProperty(value = "")
  public Integer getMinNumberOfRepayments() {
    return minNumberOfRepayments;
  }

  public void setMinNumberOfRepayments(Integer minNumberOfRepayments) {
    this.minNumberOfRepayments = minNumberOfRepayments;
  }

  public LoanProduct maxNumberOfRepayments(Integer maxNumberOfRepayments) {
    this.maxNumberOfRepayments = maxNumberOfRepayments;
    return this;
  }

   /**
   * Get maxNumberOfRepayments
   * @return maxNumberOfRepayments
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxNumberOfRepayments() {
    return maxNumberOfRepayments;
  }

  public void setMaxNumberOfRepayments(Integer maxNumberOfRepayments) {
    this.maxNumberOfRepayments = maxNumberOfRepayments;
  }

  public LoanProduct interestPeriodFrequencyType(InterestPeriodFrequencyTypeEnum interestPeriodFrequencyType) {
    this.interestPeriodFrequencyType = interestPeriodFrequencyType;
    return this;
  }

   /**
   * Get interestPeriodFrequencyType
   * @return interestPeriodFrequencyType
  **/
  @ApiModelProperty(value = "")
  public InterestPeriodFrequencyTypeEnum getInterestPeriodFrequencyType() {
    return interestPeriodFrequencyType;
  }

  public void setInterestPeriodFrequencyType(InterestPeriodFrequencyTypeEnum interestPeriodFrequencyType) {
    this.interestPeriodFrequencyType = interestPeriodFrequencyType;
  }

  public LoanProduct numberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Get numberOfRepayments
   * @return numberOfRepayments
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }

  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }

  public LoanProduct holdGuaranteeFundsEnabled(Boolean holdGuaranteeFundsEnabled) {
    this.holdGuaranteeFundsEnabled = holdGuaranteeFundsEnabled;
    return this;
  }

   /**
   * Get holdGuaranteeFundsEnabled
   * @return holdGuaranteeFundsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isHoldGuaranteeFundsEnabled() {
    return holdGuaranteeFundsEnabled;
  }

  public void setHoldGuaranteeFundsEnabled(Boolean holdGuaranteeFundsEnabled) {
    this.holdGuaranteeFundsEnabled = holdGuaranteeFundsEnabled;
  }

  public LoanProduct loanProductConfigurableAttributes(LoanProductConfigurableAttributes loanProductConfigurableAttributes) {
    this.loanProductConfigurableAttributes = loanProductConfigurableAttributes;
    return this;
  }

   /**
   * Get loanProductConfigurableAttributes
   * @return loanProductConfigurableAttributes
  **/
  @ApiModelProperty(value = "")
  public LoanProductConfigurableAttributes getLoanProductConfigurableAttributes() {
    return loanProductConfigurableAttributes;
  }

  public void setLoanProductConfigurableAttributes(LoanProductConfigurableAttributes loanProductConfigurableAttributes) {
    this.loanProductConfigurableAttributes = loanProductConfigurableAttributes;
  }

  public LoanProduct repaymentStrategy(LoanTransactionProcessingStrategy repaymentStrategy) {
    this.repaymentStrategy = repaymentStrategy;
    return this;
  }

   /**
   * Get repaymentStrategy
   * @return repaymentStrategy
  **/
  @ApiModelProperty(value = "")
  public LoanTransactionProcessingStrategy getRepaymentStrategy() {
    return repaymentStrategy;
  }

  public void setRepaymentStrategy(LoanTransactionProcessingStrategy repaymentStrategy) {
    this.repaymentStrategy = repaymentStrategy;
  }

  public LoanProduct accountingType(Integer accountingType) {
    this.accountingType = accountingType;
    return this;
  }

   /**
   * Get accountingType
   * @return accountingType
  **/
  @ApiModelProperty(value = "")
  public Integer getAccountingType() {
    return accountingType;
  }

  public void setAccountingType(Integer accountingType) {
    this.accountingType = accountingType;
  }

  public LoanProduct minNominalInterestRatePerPeriod(BigDecimal minNominalInterestRatePerPeriod) {
    this.minNominalInterestRatePerPeriod = minNominalInterestRatePerPeriod;
    return this;
  }

   /**
   * Get minNominalInterestRatePerPeriod
   * @return minNominalInterestRatePerPeriod
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinNominalInterestRatePerPeriod() {
    return minNominalInterestRatePerPeriod;
  }

  public void setMinNominalInterestRatePerPeriod(BigDecimal minNominalInterestRatePerPeriod) {
    this.minNominalInterestRatePerPeriod = minNominalInterestRatePerPeriod;
  }

  public LoanProduct maxNominalInterestRatePerPeriod(BigDecimal maxNominalInterestRatePerPeriod) {
    this.maxNominalInterestRatePerPeriod = maxNominalInterestRatePerPeriod;
    return this;
  }

   /**
   * Get maxNominalInterestRatePerPeriod
   * @return maxNominalInterestRatePerPeriod
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxNominalInterestRatePerPeriod() {
    return maxNominalInterestRatePerPeriod;
  }

  public void setMaxNominalInterestRatePerPeriod(BigDecimal maxNominalInterestRatePerPeriod) {
    this.maxNominalInterestRatePerPeriod = maxNominalInterestRatePerPeriod;
  }

  public LoanProduct principalAmount(Money principalAmount) {
    this.principalAmount = principalAmount;
    return this;
  }

   /**
   * Get principalAmount
   * @return principalAmount
  **/
  @ApiModelProperty(value = "")
  public Money getPrincipalAmount() {
    return principalAmount;
  }

  public void setPrincipalAmount(Money principalAmount) {
    this.principalAmount = principalAmount;
  }

  public LoanProduct loanProductCharges(List<Charge> loanProductCharges) {
    this.loanProductCharges = loanProductCharges;
    return this;
  }

  public LoanProduct addLoanProductChargesItem(Charge loanProductChargesItem) {
    if (this.loanProductCharges == null) {
      this.loanProductCharges = new ArrayList<Charge>();
    }
    this.loanProductCharges.add(loanProductChargesItem);
    return this;
  }

   /**
   * Get loanProductCharges
   * @return loanProductCharges
  **/
  @ApiModelProperty(value = "")
  public List<Charge> getLoanProductCharges() {
    return loanProductCharges;
  }

  public void setLoanProductCharges(List<Charge> loanProductCharges) {
    this.loanProductCharges = loanProductCharges;
  }

  public LoanProduct accrualBasedAccountingEnabled(Boolean accrualBasedAccountingEnabled) {
    this.accrualBasedAccountingEnabled = accrualBasedAccountingEnabled;
    return this;
  }

   /**
   * Get accrualBasedAccountingEnabled
   * @return accrualBasedAccountingEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAccrualBasedAccountingEnabled() {
    return accrualBasedAccountingEnabled;
  }

  public void setAccrualBasedAccountingEnabled(Boolean accrualBasedAccountingEnabled) {
    this.accrualBasedAccountingEnabled = accrualBasedAccountingEnabled;
  }

  public LoanProduct _new(Boolean _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(value = "")
  public Boolean isNew() {
    return _new;
  }

  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProduct loanProduct = (LoanProduct) o;
    return Objects.equals(this.id, loanProduct.id) &&
        Objects.equals(this.shortName, loanProduct.shortName) &&
        Objects.equals(this.loanProductRelatedDetail, loanProduct.loanProductRelatedDetail) &&
        Objects.equals(this.includeInBorrowerCycle, loanProduct.includeInBorrowerCycle) &&
        Objects.equals(this.startDate, loanProduct.startDate) &&
        Objects.equals(this.closeDate, loanProduct.closeDate) &&
        Objects.equals(this.externalId, loanProduct.externalId) &&
        Objects.equals(this.minimumDaysBetweenDisbursalAndFirstRepayment, loanProduct.minimumDaysBetweenDisbursalAndFirstRepayment) &&
        Objects.equals(this.productInterestRecalculationDetails, loanProduct.productInterestRecalculationDetails) &&
        Objects.equals(this.loanProductGuaranteeDetails, loanProduct.loanProductGuaranteeDetails) &&
        Objects.equals(this.principalThresholdForLastInstallment, loanProduct.principalThresholdForLastInstallment) &&
        Objects.equals(this.installmentAmountInMultiplesOf, loanProduct.installmentAmountInMultiplesOf) &&
        Objects.equals(this.floatingRates, loanProduct.floatingRates) &&
        Objects.equals(this.interestRecalculationEnabled, loanProduct.interestRecalculationEnabled) &&
        Objects.equals(this.equalAmortization, loanProduct.equalAmortization) &&
        Objects.equals(this.currency, loanProduct.currency) &&
        Objects.equals(this.arrearsBasedOnOriginalSchedule, loanProduct.arrearsBasedOnOriginalSchedule) &&
        Objects.equals(this.upfrontAccrualAccountingEnabled, loanProduct.upfrontAccrualAccountingEnabled) &&
        Objects.equals(this.accountingDisabled, loanProduct.accountingDisabled) &&
        Objects.equals(this.periodicAccrualAccountingEnabled, loanProduct.periodicAccrualAccountingEnabled) &&
        Objects.equals(this.cashBasedAccountingEnabled, loanProduct.cashBasedAccountingEnabled) &&
        Objects.equals(this.linkedToFloatingInterestRate, loanProduct.linkedToFloatingInterestRate) &&
        Objects.equals(this.multiDisburseLoan, loanProduct.multiDisburseLoan) &&
        Objects.equals(this.nominalInterestRatePerPeriod, loanProduct.nominalInterestRatePerPeriod) &&
        Objects.equals(this.minPrincipalAmount, loanProduct.minPrincipalAmount) &&
        Objects.equals(this.maxPrincipalAmount, loanProduct.maxPrincipalAmount) &&
        Objects.equals(this.minNumberOfRepayments, loanProduct.minNumberOfRepayments) &&
        Objects.equals(this.maxNumberOfRepayments, loanProduct.maxNumberOfRepayments) &&
        Objects.equals(this.interestPeriodFrequencyType, loanProduct.interestPeriodFrequencyType) &&
        Objects.equals(this.numberOfRepayments, loanProduct.numberOfRepayments) &&
        Objects.equals(this.holdGuaranteeFundsEnabled, loanProduct.holdGuaranteeFundsEnabled) &&
        Objects.equals(this.loanProductConfigurableAttributes, loanProduct.loanProductConfigurableAttributes) &&
        Objects.equals(this.repaymentStrategy, loanProduct.repaymentStrategy) &&
        Objects.equals(this.accountingType, loanProduct.accountingType) &&
        Objects.equals(this.minNominalInterestRatePerPeriod, loanProduct.minNominalInterestRatePerPeriod) &&
        Objects.equals(this.maxNominalInterestRatePerPeriod, loanProduct.maxNominalInterestRatePerPeriod) &&
        Objects.equals(this.principalAmount, loanProduct.principalAmount) &&
        Objects.equals(this.loanProductCharges, loanProduct.loanProductCharges) &&
        Objects.equals(this.accrualBasedAccountingEnabled, loanProduct.accrualBasedAccountingEnabled) &&
        Objects.equals(this._new, loanProduct._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortName, loanProductRelatedDetail, includeInBorrowerCycle, startDate, closeDate, externalId, minimumDaysBetweenDisbursalAndFirstRepayment, productInterestRecalculationDetails, loanProductGuaranteeDetails, principalThresholdForLastInstallment, installmentAmountInMultiplesOf, floatingRates, interestRecalculationEnabled, equalAmortization, currency, arrearsBasedOnOriginalSchedule, upfrontAccrualAccountingEnabled, accountingDisabled, periodicAccrualAccountingEnabled, cashBasedAccountingEnabled, linkedToFloatingInterestRate, multiDisburseLoan, nominalInterestRatePerPeriod, minPrincipalAmount, maxPrincipalAmount, minNumberOfRepayments, maxNumberOfRepayments, interestPeriodFrequencyType, numberOfRepayments, holdGuaranteeFundsEnabled, loanProductConfigurableAttributes, repaymentStrategy, accountingType, minNominalInterestRatePerPeriod, maxNominalInterestRatePerPeriod, principalAmount, loanProductCharges, accrualBasedAccountingEnabled, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    loanProductRelatedDetail: ").append(toIndentedString(loanProductRelatedDetail)).append("\n");
    sb.append("    includeInBorrowerCycle: ").append(toIndentedString(includeInBorrowerCycle)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    minimumDaysBetweenDisbursalAndFirstRepayment: ").append(toIndentedString(minimumDaysBetweenDisbursalAndFirstRepayment)).append("\n");
    sb.append("    productInterestRecalculationDetails: ").append(toIndentedString(productInterestRecalculationDetails)).append("\n");
    sb.append("    loanProductGuaranteeDetails: ").append(toIndentedString(loanProductGuaranteeDetails)).append("\n");
    sb.append("    principalThresholdForLastInstallment: ").append(toIndentedString(principalThresholdForLastInstallment)).append("\n");
    sb.append("    installmentAmountInMultiplesOf: ").append(toIndentedString(installmentAmountInMultiplesOf)).append("\n");
    sb.append("    floatingRates: ").append(toIndentedString(floatingRates)).append("\n");
    sb.append("    interestRecalculationEnabled: ").append(toIndentedString(interestRecalculationEnabled)).append("\n");
    sb.append("    equalAmortization: ").append(toIndentedString(equalAmortization)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    arrearsBasedOnOriginalSchedule: ").append(toIndentedString(arrearsBasedOnOriginalSchedule)).append("\n");
    sb.append("    upfrontAccrualAccountingEnabled: ").append(toIndentedString(upfrontAccrualAccountingEnabled)).append("\n");
    sb.append("    accountingDisabled: ").append(toIndentedString(accountingDisabled)).append("\n");
    sb.append("    periodicAccrualAccountingEnabled: ").append(toIndentedString(periodicAccrualAccountingEnabled)).append("\n");
    sb.append("    cashBasedAccountingEnabled: ").append(toIndentedString(cashBasedAccountingEnabled)).append("\n");
    sb.append("    linkedToFloatingInterestRate: ").append(toIndentedString(linkedToFloatingInterestRate)).append("\n");
    sb.append("    multiDisburseLoan: ").append(toIndentedString(multiDisburseLoan)).append("\n");
    sb.append("    nominalInterestRatePerPeriod: ").append(toIndentedString(nominalInterestRatePerPeriod)).append("\n");
    sb.append("    minPrincipalAmount: ").append(toIndentedString(minPrincipalAmount)).append("\n");
    sb.append("    maxPrincipalAmount: ").append(toIndentedString(maxPrincipalAmount)).append("\n");
    sb.append("    minNumberOfRepayments: ").append(toIndentedString(minNumberOfRepayments)).append("\n");
    sb.append("    maxNumberOfRepayments: ").append(toIndentedString(maxNumberOfRepayments)).append("\n");
    sb.append("    interestPeriodFrequencyType: ").append(toIndentedString(interestPeriodFrequencyType)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    holdGuaranteeFundsEnabled: ").append(toIndentedString(holdGuaranteeFundsEnabled)).append("\n");
    sb.append("    loanProductConfigurableAttributes: ").append(toIndentedString(loanProductConfigurableAttributes)).append("\n");
    sb.append("    repaymentStrategy: ").append(toIndentedString(repaymentStrategy)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    minNominalInterestRatePerPeriod: ").append(toIndentedString(minNominalInterestRatePerPeriod)).append("\n");
    sb.append("    maxNominalInterestRatePerPeriod: ").append(toIndentedString(maxNominalInterestRatePerPeriod)).append("\n");
    sb.append("    principalAmount: ").append(toIndentedString(principalAmount)).append("\n");
    sb.append("    loanProductCharges: ").append(toIndentedString(loanProductCharges)).append("\n");
    sb.append("    accrualBasedAccountingEnabled: ").append(toIndentedString(accrualBasedAccountingEnabled)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

