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
import org.mifos.chatbot.client.model.Header;
import org.mifos.chatbot.client.model.PostBodyRequestSwagger;
import org.mifos.chatbot.client.model.Header;

import java.util.ArrayList;
import java.util.List;

/**
 * PostBatchesRequest
 */

public class PostBatchesRequest {
  @SerializedName("requestId")
  private Long requestId = null;

  @SerializedName("relativeUrl")
  private String relativeUrl = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("headers")
  private List<Header> headers = null;

  @SerializedName("reference")
  private Long reference = null;

  @SerializedName("body")
  private PostBodyRequestSwagger body = null;

  public PostBatchesRequest requestId(Long requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getRequestId() {
    return requestId;
  }

  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  public PostBatchesRequest relativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
    return this;
  }

   /**
   * Get relativeUrl
   * @return relativeUrl
  **/
  @ApiModelProperty(example = "clients", value = "")
  public String getRelativeUrl() {
    return relativeUrl;
  }

  public void setRelativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
  }

  public PostBatchesRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "POST", value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public PostBatchesRequest headers(List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public PostBatchesRequest addHeadersItem(Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<Header>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public List<Header> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }

  public PostBatchesRequest reference(Long reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getReference() {
    return reference;
  }

  public void setReference(Long reference) {
    this.reference = reference;
  }

  public PostBatchesRequest body(PostBodyRequestSwagger body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public PostBodyRequestSwagger getBody() {
    return body;
  }

  public void setBody(PostBodyRequestSwagger body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBatchesRequest postBatchesRequest = (PostBatchesRequest) o;
    return Objects.equals(this.requestId, postBatchesRequest.requestId) &&
        Objects.equals(this.relativeUrl, postBatchesRequest.relativeUrl) &&
        Objects.equals(this.method, postBatchesRequest.method) &&
        Objects.equals(this.headers, postBatchesRequest.headers) &&
        Objects.equals(this.reference, postBatchesRequest.reference) &&
        Objects.equals(this.body, postBatchesRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, relativeUrl, method, headers, reference, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBatchesRequest {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    relativeUrl: ").append(toIndentedString(relativeUrl)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

