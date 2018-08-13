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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.EnumOptionData;
import org.mifos.chatbot.client.model.EnumOptionData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GetAccountNumberFormatsResponseTemplate
 */

public class GetAccountNumberFormatsResponseTemplate {
  @SerializedName("accountTypeOptions")
  private List<EnumOptionData> accountTypeOptions = null;

  @SerializedName("prefixTypeOptions")
  private Map<String, List<EnumOptionData>> prefixTypeOptions = null;

  public GetAccountNumberFormatsResponseTemplate accountTypeOptions(List<EnumOptionData> accountTypeOptions) {
    this.accountTypeOptions = accountTypeOptions;
    return this;
  }

  public GetAccountNumberFormatsResponseTemplate addAccountTypeOptionsItem(EnumOptionData accountTypeOptionsItem) {
    if (this.accountTypeOptions == null) {
      this.accountTypeOptions = new ArrayList<EnumOptionData>();
    }
    this.accountTypeOptions.add(accountTypeOptionsItem);
    return this;
  }

   /**
   * Get accountTypeOptions
   * @return accountTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<EnumOptionData> getAccountTypeOptions() {
    return accountTypeOptions;
  }

  public void setAccountTypeOptions(List<EnumOptionData> accountTypeOptions) {
    this.accountTypeOptions = accountTypeOptions;
  }

  public GetAccountNumberFormatsResponseTemplate prefixTypeOptions(Map<String, List<EnumOptionData>> prefixTypeOptions) {
    this.prefixTypeOptions = prefixTypeOptions;
    return this;
  }

  public GetAccountNumberFormatsResponseTemplate putPrefixTypeOptionsItem(String key, List<EnumOptionData> prefixTypeOptionsItem) {
    if (this.prefixTypeOptions == null) {
      this.prefixTypeOptions = new HashMap<String, List<EnumOptionData>>();
    }
    this.prefixTypeOptions.put(key, prefixTypeOptionsItem);
    return this;
  }

   /**
   * Get prefixTypeOptions
   * @return prefixTypeOptions
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<EnumOptionData>> getPrefixTypeOptions() {
    return prefixTypeOptions;
  }

  public void setPrefixTypeOptions(Map<String, List<EnumOptionData>> prefixTypeOptions) {
    this.prefixTypeOptions = prefixTypeOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountNumberFormatsResponseTemplate getAccountNumberFormatsResponseTemplate = (GetAccountNumberFormatsResponseTemplate) o;
    return Objects.equals(this.accountTypeOptions, getAccountNumberFormatsResponseTemplate.accountTypeOptions) &&
        Objects.equals(this.prefixTypeOptions, getAccountNumberFormatsResponseTemplate.prefixTypeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTypeOptions, prefixTypeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountNumberFormatsResponseTemplate {\n");
    
    sb.append("    accountTypeOptions: ").append(toIndentedString(accountTypeOptions)).append("\n");
    sb.append("    prefixTypeOptions: ").append(toIndentedString(prefixTypeOptions)).append("\n");
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

