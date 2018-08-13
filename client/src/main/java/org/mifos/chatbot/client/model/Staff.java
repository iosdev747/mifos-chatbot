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
import org.mifos.chatbot.client.model.Image;

/**
 * Staff
 */

public class Staff {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("loanOfficer")
  private Boolean loanOfficer = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("image")
  private Image image = null;

  @SerializedName("notLoanOfficer")
  private Boolean notLoanOfficer = null;

  @SerializedName("notActive")
  private Boolean notActive = null;

  @SerializedName("new")
  private Boolean _new = null;

  public Staff id(Long id) {
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

  public Staff loanOfficer(Boolean loanOfficer) {
    this.loanOfficer = loanOfficer;
    return this;
  }

   /**
   * Get loanOfficer
   * @return loanOfficer
  **/
  @ApiModelProperty(value = "")
  public Boolean isLoanOfficer() {
    return loanOfficer;
  }

  public void setLoanOfficer(Boolean loanOfficer) {
    this.loanOfficer = loanOfficer;
  }

  public Staff active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Staff image(Image image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public Staff notLoanOfficer(Boolean notLoanOfficer) {
    this.notLoanOfficer = notLoanOfficer;
    return this;
  }

   /**
   * Get notLoanOfficer
   * @return notLoanOfficer
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotLoanOfficer() {
    return notLoanOfficer;
  }

  public void setNotLoanOfficer(Boolean notLoanOfficer) {
    this.notLoanOfficer = notLoanOfficer;
  }

  public Staff notActive(Boolean notActive) {
    this.notActive = notActive;
    return this;
  }

   /**
   * Get notActive
   * @return notActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotActive() {
    return notActive;
  }

  public void setNotActive(Boolean notActive) {
    this.notActive = notActive;
  }

  public Staff _new(Boolean _new) {
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
    Staff staff = (Staff) o;
    return Objects.equals(this.id, staff.id) &&
        Objects.equals(this.loanOfficer, staff.loanOfficer) &&
        Objects.equals(this.active, staff.active) &&
        Objects.equals(this.image, staff.image) &&
        Objects.equals(this.notLoanOfficer, staff.notLoanOfficer) &&
        Objects.equals(this.notActive, staff.notActive) &&
        Objects.equals(this._new, staff._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, loanOfficer, active, image, notLoanOfficer, notActive, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Staff {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loanOfficer: ").append(toIndentedString(loanOfficer)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    notLoanOfficer: ").append(toIndentedString(notLoanOfficer)).append("\n");
    sb.append("    notActive: ").append(toIndentedString(notActive)).append("\n");
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

