/*
 * Brave Data Events API
 * Brave Data Events is an API that simulates event logging from mobile devices and web applications for analytical data processing. The client can track the status of the data with the corresponding ID via GET endpoint.<br/><br><img src='https://developer.circulodecredito.com.mx/sites/default/files/2020-10/circulo_de_credito-apihub.png' height='40' width='220'/></p><br/>
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@circulodecredito.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.brave.dataevents.client.api;

import io.brave.dataevents.client.ApiCallback;
import io.brave.dataevents.client.ApiClient;
import io.brave.dataevents.client.ApiException;
import io.brave.dataevents.client.ApiResponse;
import io.brave.dataevents.client.Configuration;
import io.brave.dataevents.client.Pair;
import io.brave.dataevents.client.ProgressRequestBody;
import io.brave.dataevents.client.ProgressResponseBody;
import io.brave.dataevents.client.model.InlineResponse200;
import io.brave.dataevents.client.model.InlineResponse2001;
import io.brave.dataevents.client.model.UploadDataModel;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatasetsApi {
    private ApiClient apiClient;

    public DatasetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatasetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDatasetStatus
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)     
     * @param dataId The identifier of the dataset. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDatasetStatusCall(String xApiKey, String username, String password, String dataId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/{dataId}/status"
            .replaceAll("\\{" + "dataId" + "\\}", apiClient.escapeString(dataId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));        

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
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
    private okhttp3.Call getDatasetStatusValidateBeforeCall(String xApiKey, String username, String password, String dataId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getDatasetStatus(Async)");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getDatasetStatus(Async)");
        }
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getDatasetStatus(Async)");
        }
        // verify the required parameter 'dataId' is set
        if (dataId == null) {
            throw new ApiException("Missing the required parameter 'dataId' when calling getDatasetStatus(Async)");
        }
        
        okhttp3.Call call = getDatasetStatusCall(xApiKey, username, password, dataId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get dataset information
     * Get the information of unique dataset of events previously uploaded to our platform.
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @param dataId The identifier of the dataset. (required)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2001 getDatasetStatus(String xApiKey, String username, String password, String dataId) throws ApiException {
        ApiResponse<InlineResponse2001> resp = getDatasetStatusWithHttpInfo(xApiKey, username, password, dataId);
        return resp.getData();
    }

    /**
     * Get dataset information
     * Get the information of unique dataset of events previously uploaded to our platform.
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @param dataId The identifier of the dataset. (required)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2001> getDatasetStatusWithHttpInfo(String xApiKey, String username, String password, String dataId) throws ApiException {
        okhttp3.Call call = getDatasetStatusValidateBeforeCall(xApiKey, username, password, dataId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get dataset information (asynchronously)
     * Get the information of unique dataset of events previously uploaded to our platform.
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @param dataId The identifier of the dataset. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDatasetStatusAsync(String xApiKey, String username, String password, String dataId, final ApiCallback<InlineResponse2001> callback) throws ApiException {

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

        okhttp3.Call call = getDatasetStatusValidateBeforeCall(xApiKey, username, password, dataId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    /**
     * Build call for uploadDataset
     * @param body Upload request body (required)
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call uploadDatasetCall(UploadDataModel body, String xApiKey, String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/datasets/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
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
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
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
    private okhttp3.Call uploadDatasetValidateBeforeCall(UploadDataModel body, String xApiKey, String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling uploadDataset(Async)");
        }
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling uploadDataset(Async)");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling uploadDataset(Async)");
        }
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling uploadDataset(Async)");
        }
        
        okhttp3.Call call = uploadDatasetCall(body, xApiKey, username, password, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Upload dataset of events
     * Upload dataset of events to our platform with &#x60;dataID&#x60; as identifier for the data processing and analysis.
     * @param body Upload request body (required)
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 uploadDataset(UploadDataModel body, String xApiKey, String username, String password) throws ApiException {
        ApiResponse<InlineResponse200> resp = uploadDatasetWithHttpInfo(body, xApiKey, username, password);
        return resp.getData();
    }

    /**
     * Upload dataset of events
     * Upload dataset of events to our platform with &#x60;dataID&#x60; as identifier for the data processing and analysis.
     * @param body Upload request body (required)
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> uploadDatasetWithHttpInfo(UploadDataModel body, String xApiKey, String username, String password) throws ApiException {
        okhttp3.Call call = uploadDatasetValidateBeforeCall(body, xApiKey, username, password, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload dataset of events (asynchronously)
     * Upload dataset of events to our platform with &#x60;dataID&#x60; as identifier for the data processing and analysis.
     * @param body Upload request body (required)
     * @param xApiKey The Consumer Key assigned to the application you have registered in API Hub. (required)
     * @param username Username provided by Círculo de Crédito (required)
     * @param password Password provided by Círculo de Crédito (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call uploadDatasetAsync(UploadDataModel body, String xApiKey, String username, String password, String xSignature, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        okhttp3.Call call = uploadDatasetValidateBeforeCall(body, xApiKey, username, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}