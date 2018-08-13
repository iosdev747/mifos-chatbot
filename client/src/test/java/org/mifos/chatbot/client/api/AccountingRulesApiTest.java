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


package org.mifos.chatbot.client.api;

import org.mifos.chatbot.client.ApiException;
import org.mifos.chatbot.client.model.AccountingRuleData;
import org.mifos.chatbot.client.model.DeleteAccountingRulesResponse;
import org.mifos.chatbot.client.model.GetAccountRulesResponse;
import org.mifos.chatbot.client.model.GetAccountRulesTemplateResponse;
import org.mifos.chatbot.client.model.PostAccountingRulesRequest;
import org.mifos.chatbot.client.model.PostAccountingRulesResponse;
import org.mifos.chatbot.client.model.PutAccountingRulesRequest;
import org.mifos.chatbot.client.model.PutAccountingRulesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountingRulesApi
 */
@Ignore
public class AccountingRulesApiTest {

    private final AccountingRulesApi api = new AccountingRulesApi();

    
    /**
     * Create/Define a Accounting rule
     *
     * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountingRuleTest() throws ApiException {
        PostAccountingRulesRequest body = null;
        PostAccountingRulesResponse response = api.createAccountingRule(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Accounting Rule
     *
     * Deletes a Accounting rule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountingRuleTest() throws ApiException {
        Long accountingRuleId = null;
        DeleteAccountingRulesResponse response = api.deleteAccountingRule(accountingRuleId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Accounting rule
     *
     * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retreiveAccountingRuleTest() throws ApiException {
        Long accountingRuleId = null;
        AccountingRuleData response = api.retreiveAccountingRule(accountingRuleId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Accounting Rules
     *
     * Returns the list of defined accounting rules.  Example Requests:  accountingrules
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllAccountingRulesTest() throws ApiException {
        List<GetAccountRulesResponse> response = api.retrieveAllAccountingRules();

        // TODO: test validations
    }
    
    /**
     * Retrieve Accounting Rule Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTemplateTest() throws ApiException {
        GetAccountRulesTemplateResponse response = api.retrieveTemplate();

        // TODO: test validations
    }
    
    /**
     * Update a Accounting Rule
     *
     * Updates the details of a Accounting rule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountingRuleTest() throws ApiException {
        Long accountingRuleId = null;
        PutAccountingRulesRequest body = null;
        PutAccountingRulesResponse response = api.updateAccountingRule(accountingRuleId, body);

        // TODO: test validations
    }
    
}
