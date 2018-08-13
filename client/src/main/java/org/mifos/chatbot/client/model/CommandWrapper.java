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

/**
 * CommandWrapper
 */

public class CommandWrapper {
  @SerializedName("groupId")
  private Long groupId = null;

  @SerializedName("clientId")
  private Long clientId = null;

  @SerializedName("loanId")
  private Long loanId = null;

  @SerializedName("savingsId")
  private Long savingsId = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("taskPermissionName")
  private String taskPermissionName = null;

  @SerializedName("entityId")
  private Long entityId = null;

  @SerializedName("subentityId")
  private Long subentityId = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("json")
  private String json = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("productId")
  private Long productId = null;

  @SerializedName("creditBureauId")
  private Long creditBureauId = null;

  @SerializedName("organisationCreditBureauId")
  private Long organisationCreditBureauId = null;

  @SerializedName("update")
  private Boolean update = null;

  @SerializedName("create")
  private Boolean create = null;

  @SerializedName("delete")
  private Boolean delete = null;

  @SerializedName("updateOperation")
  private Boolean updateOperation = null;

  @SerializedName("updateDatatable")
  private Boolean updateDatatable = null;

  @SerializedName("datatableResource")
  private Boolean datatableResource = null;

  @SerializedName("createDatatable")
  private Boolean createDatatable = null;

  @SerializedName("deleteDatatable")
  private Boolean deleteDatatable = null;

  @SerializedName("updateMultiple")
  private Boolean updateMultiple = null;

  @SerializedName("updateOneToOne")
  private Boolean updateOneToOne = null;

  @SerializedName("deleteMultiple")
  private Boolean deleteMultiple = null;

  @SerializedName("deleteOneToOne")
  private Boolean deleteOneToOne = null;

  @SerializedName("registerDatatable")
  private Boolean registerDatatable = null;

  @SerializedName("noteResource")
  private Boolean noteResource = null;

  @SerializedName("surveyResource")
  private Boolean surveyResource = null;

  @SerializedName("registerSurvey")
  private Boolean registerSurvey = null;

  @SerializedName("fullFilSurvey")
  private Boolean fullFilSurvey = null;

  @SerializedName("loanDisburseDetailResource")
  private Boolean loanDisburseDetailResource = null;

  @SerializedName("updateDisbursementDate")
  private Boolean updateDisbursementDate = null;

  @SerializedName("userResource")
  private Boolean userResource = null;

  @SerializedName("deleteOperation")
  private Boolean deleteOperation = null;

  @SerializedName("permissionResource")
  private Boolean permissionResource = null;

  @SerializedName("currencyResource")
  private Boolean currencyResource = null;

  @SerializedName("cacheResource")
  private Boolean cacheResource = null;

  @SerializedName("workingDaysResource")
  private Boolean workingDaysResource = null;

  @SerializedName("passwordPreferencesResource")
  private Boolean passwordPreferencesResource = null;

  public CommandWrapper groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public CommandWrapper clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public CommandWrapper loanId(Long loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @ApiModelProperty(value = "")
  public Long getLoanId() {
    return loanId;
  }

  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }

  public CommandWrapper savingsId(Long savingsId) {
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @ApiModelProperty(value = "")
  public Long getSavingsId() {
    return savingsId;
  }

  public void setSavingsId(Long savingsId) {
    this.savingsId = savingsId;
  }

  public CommandWrapper entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(value = "")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public CommandWrapper taskPermissionName(String taskPermissionName) {
    this.taskPermissionName = taskPermissionName;
    return this;
  }

   /**
   * Get taskPermissionName
   * @return taskPermissionName
  **/
  @ApiModelProperty(value = "")
  public String getTaskPermissionName() {
    return taskPermissionName;
  }

  public void setTaskPermissionName(String taskPermissionName) {
    this.taskPermissionName = taskPermissionName;
  }

  public CommandWrapper entityId(Long entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(value = "")
  public Long getEntityId() {
    return entityId;
  }

  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }

  public CommandWrapper subentityId(Long subentityId) {
    this.subentityId = subentityId;
    return this;
  }

   /**
   * Get subentityId
   * @return subentityId
  **/
  @ApiModelProperty(value = "")
  public Long getSubentityId() {
    return subentityId;
  }

  public void setSubentityId(Long subentityId) {
    this.subentityId = subentityId;
  }

  public CommandWrapper href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CommandWrapper json(String json) {
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @ApiModelProperty(value = "")
  public String getJson() {
    return json;
  }

  public void setJson(String json) {
    this.json = json;
  }

  public CommandWrapper transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public CommandWrapper productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public CommandWrapper creditBureauId(Long creditBureauId) {
    this.creditBureauId = creditBureauId;
    return this;
  }

   /**
   * Get creditBureauId
   * @return creditBureauId
  **/
  @ApiModelProperty(value = "")
  public Long getCreditBureauId() {
    return creditBureauId;
  }

  public void setCreditBureauId(Long creditBureauId) {
    this.creditBureauId = creditBureauId;
  }

  public CommandWrapper organisationCreditBureauId(Long organisationCreditBureauId) {
    this.organisationCreditBureauId = organisationCreditBureauId;
    return this;
  }

   /**
   * Get organisationCreditBureauId
   * @return organisationCreditBureauId
  **/
  @ApiModelProperty(value = "")
  public Long getOrganisationCreditBureauId() {
    return organisationCreditBureauId;
  }

  public void setOrganisationCreditBureauId(Long organisationCreditBureauId) {
    this.organisationCreditBureauId = organisationCreditBureauId;
  }

  public CommandWrapper update(Boolean update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdate() {
    return update;
  }

  public void setUpdate(Boolean update) {
    this.update = update;
  }

  public CommandWrapper create(Boolean create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreate() {
    return create;
  }

  public void setCreate(Boolean create) {
    this.create = create;
  }

  public CommandWrapper delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(value = "")
  public Boolean isDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public CommandWrapper updateOperation(Boolean updateOperation) {
    this.updateOperation = updateOperation;
    return this;
  }

   /**
   * Get updateOperation
   * @return updateOperation
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateOperation() {
    return updateOperation;
  }

  public void setUpdateOperation(Boolean updateOperation) {
    this.updateOperation = updateOperation;
  }

  public CommandWrapper updateDatatable(Boolean updateDatatable) {
    this.updateDatatable = updateDatatable;
    return this;
  }

   /**
   * Get updateDatatable
   * @return updateDatatable
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateDatatable() {
    return updateDatatable;
  }

  public void setUpdateDatatable(Boolean updateDatatable) {
    this.updateDatatable = updateDatatable;
  }

  public CommandWrapper datatableResource(Boolean datatableResource) {
    this.datatableResource = datatableResource;
    return this;
  }

   /**
   * Get datatableResource
   * @return datatableResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isDatatableResource() {
    return datatableResource;
  }

  public void setDatatableResource(Boolean datatableResource) {
    this.datatableResource = datatableResource;
  }

  public CommandWrapper createDatatable(Boolean createDatatable) {
    this.createDatatable = createDatatable;
    return this;
  }

   /**
   * Get createDatatable
   * @return createDatatable
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateDatatable() {
    return createDatatable;
  }

  public void setCreateDatatable(Boolean createDatatable) {
    this.createDatatable = createDatatable;
  }

  public CommandWrapper deleteDatatable(Boolean deleteDatatable) {
    this.deleteDatatable = deleteDatatable;
    return this;
  }

   /**
   * Get deleteDatatable
   * @return deleteDatatable
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleteDatatable() {
    return deleteDatatable;
  }

  public void setDeleteDatatable(Boolean deleteDatatable) {
    this.deleteDatatable = deleteDatatable;
  }

  public CommandWrapper updateMultiple(Boolean updateMultiple) {
    this.updateMultiple = updateMultiple;
    return this;
  }

   /**
   * Get updateMultiple
   * @return updateMultiple
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateMultiple() {
    return updateMultiple;
  }

  public void setUpdateMultiple(Boolean updateMultiple) {
    this.updateMultiple = updateMultiple;
  }

  public CommandWrapper updateOneToOne(Boolean updateOneToOne) {
    this.updateOneToOne = updateOneToOne;
    return this;
  }

   /**
   * Get updateOneToOne
   * @return updateOneToOne
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateOneToOne() {
    return updateOneToOne;
  }

  public void setUpdateOneToOne(Boolean updateOneToOne) {
    this.updateOneToOne = updateOneToOne;
  }

  public CommandWrapper deleteMultiple(Boolean deleteMultiple) {
    this.deleteMultiple = deleteMultiple;
    return this;
  }

   /**
   * Get deleteMultiple
   * @return deleteMultiple
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleteMultiple() {
    return deleteMultiple;
  }

  public void setDeleteMultiple(Boolean deleteMultiple) {
    this.deleteMultiple = deleteMultiple;
  }

  public CommandWrapper deleteOneToOne(Boolean deleteOneToOne) {
    this.deleteOneToOne = deleteOneToOne;
    return this;
  }

   /**
   * Get deleteOneToOne
   * @return deleteOneToOne
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleteOneToOne() {
    return deleteOneToOne;
  }

  public void setDeleteOneToOne(Boolean deleteOneToOne) {
    this.deleteOneToOne = deleteOneToOne;
  }

  public CommandWrapper registerDatatable(Boolean registerDatatable) {
    this.registerDatatable = registerDatatable;
    return this;
  }

   /**
   * Get registerDatatable
   * @return registerDatatable
  **/
  @ApiModelProperty(value = "")
  public Boolean isRegisterDatatable() {
    return registerDatatable;
  }

  public void setRegisterDatatable(Boolean registerDatatable) {
    this.registerDatatable = registerDatatable;
  }

  public CommandWrapper noteResource(Boolean noteResource) {
    this.noteResource = noteResource;
    return this;
  }

   /**
   * Get noteResource
   * @return noteResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isNoteResource() {
    return noteResource;
  }

  public void setNoteResource(Boolean noteResource) {
    this.noteResource = noteResource;
  }

  public CommandWrapper surveyResource(Boolean surveyResource) {
    this.surveyResource = surveyResource;
    return this;
  }

   /**
   * Get surveyResource
   * @return surveyResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isSurveyResource() {
    return surveyResource;
  }

  public void setSurveyResource(Boolean surveyResource) {
    this.surveyResource = surveyResource;
  }

  public CommandWrapper registerSurvey(Boolean registerSurvey) {
    this.registerSurvey = registerSurvey;
    return this;
  }

   /**
   * Get registerSurvey
   * @return registerSurvey
  **/
  @ApiModelProperty(value = "")
  public Boolean isRegisterSurvey() {
    return registerSurvey;
  }

  public void setRegisterSurvey(Boolean registerSurvey) {
    this.registerSurvey = registerSurvey;
  }

  public CommandWrapper fullFilSurvey(Boolean fullFilSurvey) {
    this.fullFilSurvey = fullFilSurvey;
    return this;
  }

   /**
   * Get fullFilSurvey
   * @return fullFilSurvey
  **/
  @ApiModelProperty(value = "")
  public Boolean isFullFilSurvey() {
    return fullFilSurvey;
  }

  public void setFullFilSurvey(Boolean fullFilSurvey) {
    this.fullFilSurvey = fullFilSurvey;
  }

  public CommandWrapper loanDisburseDetailResource(Boolean loanDisburseDetailResource) {
    this.loanDisburseDetailResource = loanDisburseDetailResource;
    return this;
  }

   /**
   * Get loanDisburseDetailResource
   * @return loanDisburseDetailResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isLoanDisburseDetailResource() {
    return loanDisburseDetailResource;
  }

  public void setLoanDisburseDetailResource(Boolean loanDisburseDetailResource) {
    this.loanDisburseDetailResource = loanDisburseDetailResource;
  }

  public CommandWrapper updateDisbursementDate(Boolean updateDisbursementDate) {
    this.updateDisbursementDate = updateDisbursementDate;
    return this;
  }

   /**
   * Get updateDisbursementDate
   * @return updateDisbursementDate
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateDisbursementDate() {
    return updateDisbursementDate;
  }

  public void setUpdateDisbursementDate(Boolean updateDisbursementDate) {
    this.updateDisbursementDate = updateDisbursementDate;
  }

  public CommandWrapper userResource(Boolean userResource) {
    this.userResource = userResource;
    return this;
  }

   /**
   * Get userResource
   * @return userResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isUserResource() {
    return userResource;
  }

  public void setUserResource(Boolean userResource) {
    this.userResource = userResource;
  }

  public CommandWrapper deleteOperation(Boolean deleteOperation) {
    this.deleteOperation = deleteOperation;
    return this;
  }

   /**
   * Get deleteOperation
   * @return deleteOperation
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleteOperation() {
    return deleteOperation;
  }

  public void setDeleteOperation(Boolean deleteOperation) {
    this.deleteOperation = deleteOperation;
  }

  public CommandWrapper permissionResource(Boolean permissionResource) {
    this.permissionResource = permissionResource;
    return this;
  }

   /**
   * Get permissionResource
   * @return permissionResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isPermissionResource() {
    return permissionResource;
  }

  public void setPermissionResource(Boolean permissionResource) {
    this.permissionResource = permissionResource;
  }

  public CommandWrapper currencyResource(Boolean currencyResource) {
    this.currencyResource = currencyResource;
    return this;
  }

   /**
   * Get currencyResource
   * @return currencyResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isCurrencyResource() {
    return currencyResource;
  }

  public void setCurrencyResource(Boolean currencyResource) {
    this.currencyResource = currencyResource;
  }

  public CommandWrapper cacheResource(Boolean cacheResource) {
    this.cacheResource = cacheResource;
    return this;
  }

   /**
   * Get cacheResource
   * @return cacheResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isCacheResource() {
    return cacheResource;
  }

  public void setCacheResource(Boolean cacheResource) {
    this.cacheResource = cacheResource;
  }

  public CommandWrapper workingDaysResource(Boolean workingDaysResource) {
    this.workingDaysResource = workingDaysResource;
    return this;
  }

   /**
   * Get workingDaysResource
   * @return workingDaysResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isWorkingDaysResource() {
    return workingDaysResource;
  }

  public void setWorkingDaysResource(Boolean workingDaysResource) {
    this.workingDaysResource = workingDaysResource;
  }

  public CommandWrapper passwordPreferencesResource(Boolean passwordPreferencesResource) {
    this.passwordPreferencesResource = passwordPreferencesResource;
    return this;
  }

   /**
   * Get passwordPreferencesResource
   * @return passwordPreferencesResource
  **/
  @ApiModelProperty(value = "")
  public Boolean isPasswordPreferencesResource() {
    return passwordPreferencesResource;
  }

  public void setPasswordPreferencesResource(Boolean passwordPreferencesResource) {
    this.passwordPreferencesResource = passwordPreferencesResource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandWrapper commandWrapper = (CommandWrapper) o;
    return Objects.equals(this.groupId, commandWrapper.groupId) &&
        Objects.equals(this.clientId, commandWrapper.clientId) &&
        Objects.equals(this.loanId, commandWrapper.loanId) &&
        Objects.equals(this.savingsId, commandWrapper.savingsId) &&
        Objects.equals(this.entityName, commandWrapper.entityName) &&
        Objects.equals(this.taskPermissionName, commandWrapper.taskPermissionName) &&
        Objects.equals(this.entityId, commandWrapper.entityId) &&
        Objects.equals(this.subentityId, commandWrapper.subentityId) &&
        Objects.equals(this.href, commandWrapper.href) &&
        Objects.equals(this.json, commandWrapper.json) &&
        Objects.equals(this.transactionId, commandWrapper.transactionId) &&
        Objects.equals(this.productId, commandWrapper.productId) &&
        Objects.equals(this.creditBureauId, commandWrapper.creditBureauId) &&
        Objects.equals(this.organisationCreditBureauId, commandWrapper.organisationCreditBureauId) &&
        Objects.equals(this.update, commandWrapper.update) &&
        Objects.equals(this.create, commandWrapper.create) &&
        Objects.equals(this.delete, commandWrapper.delete) &&
        Objects.equals(this.updateOperation, commandWrapper.updateOperation) &&
        Objects.equals(this.updateDatatable, commandWrapper.updateDatatable) &&
        Objects.equals(this.datatableResource, commandWrapper.datatableResource) &&
        Objects.equals(this.createDatatable, commandWrapper.createDatatable) &&
        Objects.equals(this.deleteDatatable, commandWrapper.deleteDatatable) &&
        Objects.equals(this.updateMultiple, commandWrapper.updateMultiple) &&
        Objects.equals(this.updateOneToOne, commandWrapper.updateOneToOne) &&
        Objects.equals(this.deleteMultiple, commandWrapper.deleteMultiple) &&
        Objects.equals(this.deleteOneToOne, commandWrapper.deleteOneToOne) &&
        Objects.equals(this.registerDatatable, commandWrapper.registerDatatable) &&
        Objects.equals(this.noteResource, commandWrapper.noteResource) &&
        Objects.equals(this.surveyResource, commandWrapper.surveyResource) &&
        Objects.equals(this.registerSurvey, commandWrapper.registerSurvey) &&
        Objects.equals(this.fullFilSurvey, commandWrapper.fullFilSurvey) &&
        Objects.equals(this.loanDisburseDetailResource, commandWrapper.loanDisburseDetailResource) &&
        Objects.equals(this.updateDisbursementDate, commandWrapper.updateDisbursementDate) &&
        Objects.equals(this.userResource, commandWrapper.userResource) &&
        Objects.equals(this.deleteOperation, commandWrapper.deleteOperation) &&
        Objects.equals(this.permissionResource, commandWrapper.permissionResource) &&
        Objects.equals(this.currencyResource, commandWrapper.currencyResource) &&
        Objects.equals(this.cacheResource, commandWrapper.cacheResource) &&
        Objects.equals(this.workingDaysResource, commandWrapper.workingDaysResource) &&
        Objects.equals(this.passwordPreferencesResource, commandWrapper.passwordPreferencesResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, clientId, loanId, savingsId, entityName, taskPermissionName, entityId, subentityId, href, json, transactionId, productId, creditBureauId, organisationCreditBureauId, update, create, delete, updateOperation, updateDatatable, datatableResource, createDatatable, deleteDatatable, updateMultiple, updateOneToOne, deleteMultiple, deleteOneToOne, registerDatatable, noteResource, surveyResource, registerSurvey, fullFilSurvey, loanDisburseDetailResource, updateDisbursementDate, userResource, deleteOperation, permissionResource, currencyResource, cacheResource, workingDaysResource, passwordPreferencesResource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandWrapper {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    taskPermissionName: ").append(toIndentedString(taskPermissionName)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    subentityId: ").append(toIndentedString(subentityId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    creditBureauId: ").append(toIndentedString(creditBureauId)).append("\n");
    sb.append("    organisationCreditBureauId: ").append(toIndentedString(organisationCreditBureauId)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    updateOperation: ").append(toIndentedString(updateOperation)).append("\n");
    sb.append("    updateDatatable: ").append(toIndentedString(updateDatatable)).append("\n");
    sb.append("    datatableResource: ").append(toIndentedString(datatableResource)).append("\n");
    sb.append("    createDatatable: ").append(toIndentedString(createDatatable)).append("\n");
    sb.append("    deleteDatatable: ").append(toIndentedString(deleteDatatable)).append("\n");
    sb.append("    updateMultiple: ").append(toIndentedString(updateMultiple)).append("\n");
    sb.append("    updateOneToOne: ").append(toIndentedString(updateOneToOne)).append("\n");
    sb.append("    deleteMultiple: ").append(toIndentedString(deleteMultiple)).append("\n");
    sb.append("    deleteOneToOne: ").append(toIndentedString(deleteOneToOne)).append("\n");
    sb.append("    registerDatatable: ").append(toIndentedString(registerDatatable)).append("\n");
    sb.append("    noteResource: ").append(toIndentedString(noteResource)).append("\n");
    sb.append("    surveyResource: ").append(toIndentedString(surveyResource)).append("\n");
    sb.append("    registerSurvey: ").append(toIndentedString(registerSurvey)).append("\n");
    sb.append("    fullFilSurvey: ").append(toIndentedString(fullFilSurvey)).append("\n");
    sb.append("    loanDisburseDetailResource: ").append(toIndentedString(loanDisburseDetailResource)).append("\n");
    sb.append("    updateDisbursementDate: ").append(toIndentedString(updateDisbursementDate)).append("\n");
    sb.append("    userResource: ").append(toIndentedString(userResource)).append("\n");
    sb.append("    deleteOperation: ").append(toIndentedString(deleteOperation)).append("\n");
    sb.append("    permissionResource: ").append(toIndentedString(permissionResource)).append("\n");
    sb.append("    currencyResource: ").append(toIndentedString(currencyResource)).append("\n");
    sb.append("    cacheResource: ").append(toIndentedString(cacheResource)).append("\n");
    sb.append("    workingDaysResource: ").append(toIndentedString(workingDaysResource)).append("\n");
    sb.append("    passwordPreferencesResource: ").append(toIndentedString(passwordPreferencesResource)).append("\n");
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

