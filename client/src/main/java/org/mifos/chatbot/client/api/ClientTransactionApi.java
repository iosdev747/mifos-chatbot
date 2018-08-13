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

import org.mifos.chatbot.client.ApiCallback;
import org.mifos.chatbot.client.ApiClient;
import org.mifos.chatbot.client.ApiException;
import org.mifos.chatbot.client.ApiResponse;
import org.mifos.chatbot.client.Configuration;
import org.mifos.chatbot.client.Pair;
import org.mifos.chatbot.client.ProgressRequestBody;
import org.mifos.chatbot.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.mifos.chatbot.client.model.GetClientsClientIdTransactionsResponse;
import org.mifos.chatbot.client.model.GetClientsClientIdTransactionsTransactionIdResponse;
import org.mifos.chatbot.client.model.PostClientsClientIdTransactionsTransactionIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientTransactionApi {
    private ApiClient apiClient;

    public ClientTransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientTransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for retrieveAllClientTransactions
     * @param clientId clientId (required)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAllClientTransactionsCall(Long clientId, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clients/{clientId}/transactions"
            .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveAllClientTransactionsValidateBeforeCall(Long clientId, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling retrieveAllClientTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveAllClientTransactionsCall(clientId, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     * @param clientId clientId (required)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return GetClientsClientIdTransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetClientsClientIdTransactionsResponse retrieveAllClientTransactions(Long clientId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<GetClientsClientIdTransactionsResponse> resp = retrieveAllClientTransactionsWithHttpInfo(clientId, offset, limit);
        return resp.getData();
    }

    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     * @param clientId clientId (required)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return ApiResponse&lt;GetClientsClientIdTransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetClientsClientIdTransactionsResponse> retrieveAllClientTransactionsWithHttpInfo(Long clientId, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAllClientTransactionsValidateBeforeCall(clientId, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<GetClientsClientIdTransactionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Client Transactions (asynchronously)
     * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     * @param clientId clientId (required)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAllClientTransactionsAsync(Long clientId, Integer offset, Integer limit, final ApiCallback<GetClientsClientIdTransactionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveAllClientTransactionsValidateBeforeCall(clientId, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetClientsClientIdTransactionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveClientTransaction
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveClientTransactionCall(Long clientId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clients/{clientId}/transactions/{transactionId}"
            .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveClientTransactionValidateBeforeCall(Long clientId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling retrieveClientTransaction(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling retrieveClientTransaction(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveClientTransactionCall(clientId, transactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @return GetClientsClientIdTransactionsTransactionIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetClientsClientIdTransactionsTransactionIdResponse retrieveClientTransaction(Long clientId, Long transactionId) throws ApiException {
        ApiResponse<GetClientsClientIdTransactionsTransactionIdResponse> resp = retrieveClientTransactionWithHttpInfo(clientId, transactionId);
        return resp.getData();
    }

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @return ApiResponse&lt;GetClientsClientIdTransactionsTransactionIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransactionWithHttpInfo(Long clientId, Long transactionId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveClientTransactionValidateBeforeCall(clientId, transactionId, null, null);
        Type localVarReturnType = new TypeToken<GetClientsClientIdTransactionsTransactionIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a Client Transaction (asynchronously)
     * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveClientTransactionAsync(Long clientId, Long transactionId, final ApiCallback<GetClientsClientIdTransactionsTransactionIdResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveClientTransactionValidateBeforeCall(clientId, transactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetClientsClientIdTransactionsTransactionIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for undoClientTransaction
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @param command command (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call undoClientTransactionCall(Long clientId, Long transactionId, String command, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clients/{clientId}/transactions/{transactionId}"
            .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (command != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("command", command));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call undoClientTransactionValidateBeforeCall(Long clientId, Long transactionId, String command, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling undoClientTransaction(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling undoClientTransaction(Async)");
        }
        

        com.squareup.okhttp.Call call = undoClientTransactionCall(clientId, transactionId, command, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @param command command (optional)
     * @return PostClientsClientIdTransactionsTransactionIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostClientsClientIdTransactionsTransactionIdResponse undoClientTransaction(Long clientId, Long transactionId, String command) throws ApiException {
        ApiResponse<PostClientsClientIdTransactionsTransactionIdResponse> resp = undoClientTransactionWithHttpInfo(clientId, transactionId, command);
        return resp.getData();
    }

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @param command command (optional)
     * @return ApiResponse&lt;PostClientsClientIdTransactionsTransactionIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostClientsClientIdTransactionsTransactionIdResponse> undoClientTransactionWithHttpInfo(Long clientId, Long transactionId, String command) throws ApiException {
        com.squareup.okhttp.Call call = undoClientTransactionValidateBeforeCall(clientId, transactionId, command, null, null);
        Type localVarReturnType = new TypeToken<PostClientsClientIdTransactionsTransactionIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Undo a Client Transaction (asynchronously)
     * Undoes a Client Transaction
     * @param clientId clientId (required)
     * @param transactionId transactionId (required)
     * @param command command (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call undoClientTransactionAsync(Long clientId, Long transactionId, String command, final ApiCallback<PostClientsClientIdTransactionsTransactionIdResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = undoClientTransactionValidateBeforeCall(clientId, transactionId, command, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostClientsClientIdTransactionsTransactionIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
