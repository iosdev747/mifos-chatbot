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
import org.mifos.chatbot.client.model.LoanProductProvisioningEntryData;
import org.mifos.chatbot.client.model.PostProvisioningEntriesRequest;
import org.mifos.chatbot.client.model.PostProvisioningEntriesResponse;
import org.mifos.chatbot.client.model.ProvisioningEntryData;
import org.mifos.chatbot.client.model.PutProvisioningEntriesRequest;
import org.mifos.chatbot.client.model.PutProvisioningEntriesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvisioningEntriesApi
 */
@Ignore
public class ProvisioningEntriesApiTest {

    private final ProvisioningEntriesApi api = new ProvisioningEntriesApi();

    
    /**
     * Create new Provisioning Entries
     *
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProvisioningEntriesTest() throws ApiException {
        PostProvisioningEntriesRequest body = null;
        PostProvisioningEntriesResponse response = api.createProvisioningEntries(body);

        // TODO: test validations
    }
    
    /**
     * Recreates Provisioning Entry
     *
     * Recreates Provisioning Entry | createjournalentry.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyProvisioningEntryTest() throws ApiException {
        Long entryId = null;
        String command = null;
        PutProvisioningEntriesRequest body = null;
        PutProvisioningEntriesResponse response = api.modifyProvisioningEntry(entryId, command, body);

        // TODO: test validations
    }
    
    /**
     * List all Provisioning Entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllProvisioningEntriesTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        List<ProvisioningEntryData> response = api.retrieveAllProvisioningEntries(offset, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveProviioningEntriesTest() throws ApiException {
        Long entryId = null;
        Integer offset = null;
        Integer limit = null;
        Long officeId = null;
        Long productId = null;
        Long categoryId = null;
        LoanProductProvisioningEntryData response = api.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId);

        // TODO: test validations
    }
    
    /**
     * Retrieves a Provisioning Entry
     *
     * Returns the details of a generated Provisioning Entry.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveProvisioningEntryTest() throws ApiException {
        Long entryId = null;
        ProvisioningEntryData response = api.retrieveProvisioningEntry(entryId);

        // TODO: test validations
    }
    
}
