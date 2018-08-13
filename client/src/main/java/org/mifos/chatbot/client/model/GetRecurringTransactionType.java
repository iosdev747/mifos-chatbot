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
import java.io.IOException;

/**
 * GetRecurringTransactionType
 */

public class GetRecurringTransactionType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("deposit")
  private Boolean deposit = null;

  @SerializedName("withdrawal")
  private Boolean withdrawal = null;

  @SerializedName("interestPosting")
  private Boolean interestPosting = null;

  @SerializedName("feeDeduction")
  private Boolean feeDeduction = null;

  @SerializedName("initiateTransfer")
  private Boolean initiateTransfer = null;

  @SerializedName("approveTransfer")
  private Boolean approveTransfer = null;

  @SerializedName("withdrawTransfer")
  private Boolean withdrawTransfer = null;

  @SerializedName("rejectTransfer")
  private Boolean rejectTransfer = null;

  @SerializedName("overdraftInterest")
  private Boolean overdraftInterest = null;

  @SerializedName("writtenoff")
  private Boolean writtenoff = null;

  @SerializedName("overdraftFee")
  private Boolean overdraftFee = null;

  public GetRecurringTransactionType id(Integer id) {
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

  public GetRecurringTransactionType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "savingsAccountTransactionType.deposit", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetRecurringTransactionType value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "Deposit", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GetRecurringTransactionType deposit(Boolean deposit) {
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isDeposit() {
    return deposit;
  }

  public void setDeposit(Boolean deposit) {
    this.deposit = deposit;
  }

  public GetRecurringTransactionType withdrawal(Boolean withdrawal) {
    this.withdrawal = withdrawal;
    return this;
  }

   /**
   * Get withdrawal
   * @return withdrawal
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWithdrawal() {
    return withdrawal;
  }

  public void setWithdrawal(Boolean withdrawal) {
    this.withdrawal = withdrawal;
  }

  public GetRecurringTransactionType interestPosting(Boolean interestPosting) {
    this.interestPosting = interestPosting;
    return this;
  }

   /**
   * Get interestPosting
   * @return interestPosting
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isInterestPosting() {
    return interestPosting;
  }

  public void setInterestPosting(Boolean interestPosting) {
    this.interestPosting = interestPosting;
  }

  public GetRecurringTransactionType feeDeduction(Boolean feeDeduction) {
    this.feeDeduction = feeDeduction;
    return this;
  }

   /**
   * Get feeDeduction
   * @return feeDeduction
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isFeeDeduction() {
    return feeDeduction;
  }

  public void setFeeDeduction(Boolean feeDeduction) {
    this.feeDeduction = feeDeduction;
  }

  public GetRecurringTransactionType initiateTransfer(Boolean initiateTransfer) {
    this.initiateTransfer = initiateTransfer;
    return this;
  }

   /**
   * Get initiateTransfer
   * @return initiateTransfer
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isInitiateTransfer() {
    return initiateTransfer;
  }

  public void setInitiateTransfer(Boolean initiateTransfer) {
    this.initiateTransfer = initiateTransfer;
  }

  public GetRecurringTransactionType approveTransfer(Boolean approveTransfer) {
    this.approveTransfer = approveTransfer;
    return this;
  }

   /**
   * Get approveTransfer
   * @return approveTransfer
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isApproveTransfer() {
    return approveTransfer;
  }

  public void setApproveTransfer(Boolean approveTransfer) {
    this.approveTransfer = approveTransfer;
  }

  public GetRecurringTransactionType withdrawTransfer(Boolean withdrawTransfer) {
    this.withdrawTransfer = withdrawTransfer;
    return this;
  }

   /**
   * Get withdrawTransfer
   * @return withdrawTransfer
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWithdrawTransfer() {
    return withdrawTransfer;
  }

  public void setWithdrawTransfer(Boolean withdrawTransfer) {
    this.withdrawTransfer = withdrawTransfer;
  }

  public GetRecurringTransactionType rejectTransfer(Boolean rejectTransfer) {
    this.rejectTransfer = rejectTransfer;
    return this;
  }

   /**
   * Get rejectTransfer
   * @return rejectTransfer
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isRejectTransfer() {
    return rejectTransfer;
  }

  public void setRejectTransfer(Boolean rejectTransfer) {
    this.rejectTransfer = rejectTransfer;
  }

  public GetRecurringTransactionType overdraftInterest(Boolean overdraftInterest) {
    this.overdraftInterest = overdraftInterest;
    return this;
  }

   /**
   * Get overdraftInterest
   * @return overdraftInterest
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isOverdraftInterest() {
    return overdraftInterest;
  }

  public void setOverdraftInterest(Boolean overdraftInterest) {
    this.overdraftInterest = overdraftInterest;
  }

  public GetRecurringTransactionType writtenoff(Boolean writtenoff) {
    this.writtenoff = writtenoff;
    return this;
  }

   /**
   * Get writtenoff
   * @return writtenoff
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWrittenoff() {
    return writtenoff;
  }

  public void setWrittenoff(Boolean writtenoff) {
    this.writtenoff = writtenoff;
  }

  public GetRecurringTransactionType overdraftFee(Boolean overdraftFee) {
    this.overdraftFee = overdraftFee;
    return this;
  }

   /**
   * Get overdraftFee
   * @return overdraftFee
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isOverdraftFee() {
    return overdraftFee;
  }

  public void setOverdraftFee(Boolean overdraftFee) {
    this.overdraftFee = overdraftFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringTransactionType getRecurringTransactionType = (GetRecurringTransactionType) o;
    return Objects.equals(this.id, getRecurringTransactionType.id) &&
        Objects.equals(this.code, getRecurringTransactionType.code) &&
        Objects.equals(this.value, getRecurringTransactionType.value) &&
        Objects.equals(this.deposit, getRecurringTransactionType.deposit) &&
        Objects.equals(this.withdrawal, getRecurringTransactionType.withdrawal) &&
        Objects.equals(this.interestPosting, getRecurringTransactionType.interestPosting) &&
        Objects.equals(this.feeDeduction, getRecurringTransactionType.feeDeduction) &&
        Objects.equals(this.initiateTransfer, getRecurringTransactionType.initiateTransfer) &&
        Objects.equals(this.approveTransfer, getRecurringTransactionType.approveTransfer) &&
        Objects.equals(this.withdrawTransfer, getRecurringTransactionType.withdrawTransfer) &&
        Objects.equals(this.rejectTransfer, getRecurringTransactionType.rejectTransfer) &&
        Objects.equals(this.overdraftInterest, getRecurringTransactionType.overdraftInterest) &&
        Objects.equals(this.writtenoff, getRecurringTransactionType.writtenoff) &&
        Objects.equals(this.overdraftFee, getRecurringTransactionType.overdraftFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, value, deposit, withdrawal, interestPosting, feeDeduction, initiateTransfer, approveTransfer, withdrawTransfer, rejectTransfer, overdraftInterest, writtenoff, overdraftFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringTransactionType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
    sb.append("    interestPosting: ").append(toIndentedString(interestPosting)).append("\n");
    sb.append("    feeDeduction: ").append(toIndentedString(feeDeduction)).append("\n");
    sb.append("    initiateTransfer: ").append(toIndentedString(initiateTransfer)).append("\n");
    sb.append("    approveTransfer: ").append(toIndentedString(approveTransfer)).append("\n");
    sb.append("    withdrawTransfer: ").append(toIndentedString(withdrawTransfer)).append("\n");
    sb.append("    rejectTransfer: ").append(toIndentedString(rejectTransfer)).append("\n");
    sb.append("    overdraftInterest: ").append(toIndentedString(overdraftInterest)).append("\n");
    sb.append("    writtenoff: ").append(toIndentedString(writtenoff)).append("\n");
    sb.append("    overdraftFee: ").append(toIndentedString(overdraftFee)).append("\n");
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

