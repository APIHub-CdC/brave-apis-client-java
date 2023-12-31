/*
 * Brave Data Insights API
 * Brave Data Insights is an API that delivers real-time insights for better risk and fraud decisions. Our API can obtains one or more insights based on data collected from the user's mobile devices or web applications.<br/><br><img src='https://developer.circulodecredito.com.mx/sites/default/files/2020-10/circulo_de_credito-apihub.png' height='40' width='220'/></p><br/>
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@circulodecredito.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.brave.dataevents.client.api;

import io.brave.dataevents.client.ApiClient;
import io.brave.dataevents.client.api.DatasetsApiTest;
import io.brave.dataevents.client.model.Errors;
import io.brave.dataevents.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Before;

import okhttp3.OkHttpClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * API tests for InsightsApi
 */
public class InsightsApiTest {

    private final InsightsApi api = new InsightsApi();

    private Logger logger = LoggerFactory.getLogger(InsightsApi.class.getName());

    private String username = "IHM0915CMI";
    private String password = "pr3uBa8l";
    
    private String url = "https://circulodecredito-dev.apigee.net/brave/data-insights/v1";
    private String xApiKey = "xO8sAURZypiGbPIOyZwFpHgYqYiMttHC";

    @Before()
    public void setUp() {
    	ApiClient apiClient = api.getApiClient();
        apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(new SignerInterceptor()).build();
		apiClient.setHttpClient(okHttpClient);
    }

    /**
     * Get dataset insights
     *
     * This API endpoint is used to return information about dataset insights. The insight response can be fully customized based on your request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInsightTest() {        
        String dataId = "android-f9ad48d4-93b8-45bb-998d-e7f4141133b3";
        try {
            InlineResponse200 response = api.getInsight(xApiKey, username, password, dataId);
            logger.info(response.toString());
            Assert.assertTrue(response.getCode() != null);

        } catch (Exception e) {
            logger.info(e.getMessage());
        }        
    }
}
