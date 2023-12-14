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

package io.brave.dataevents.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.brave.dataevents.client.model.DatasetBasicDataModel;
import io.brave.dataevents.client.model.InsightDataModel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DatasetInsightDataModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-14T22:11:48.456525056Z[GMT]")

public class DatasetInsightDataModel {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("lenderKey")
  private String lenderKey = null;

  @SerializedName("requestDate")
  private String requestDate = null;

  @SerializedName("datasetInfo")
  private DatasetBasicDataModel datasetInfo = null;

  @SerializedName("insights")
  private List<InsightDataModel> insights = null;

  @SerializedName("modules")
  private List<OneOfDatasetInsightDataModelModulesItems> modules = null;

  public DatasetInsightDataModel requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique transaction identifier
   * @return requestId
  **/
  @Schema(example = "NXA6cD384NNH7SCGTh1LF93w", description = "Unique transaction identifier")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DatasetInsightDataModel lenderKey(String lenderKey) {
    this.lenderKey = lenderKey;
    return this;
  }

   /**
   * Dataset insight requestor
   * @return lenderKey
  **/
  @Schema(example = "circulo@circulodecredito.com.mx", description = "Dataset insight requestor")
  public String getLenderKey() {
    return lenderKey;
  }

  public void setLenderKey(String lenderKey) {
    this.lenderKey = lenderKey;
  }

  public DatasetInsightDataModel requestDate(String requestDate) {
    this.requestDate = requestDate;
    return this;
  }

   /**
   * Requested date
   * @return requestDate
  **/
  @Schema(example = "2023-06-02T21:50Z", description = "Requested date")
  public String getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(String requestDate) {
    this.requestDate = requestDate;
  }

  public DatasetInsightDataModel datasetInfo(DatasetBasicDataModel datasetInfo) {
    this.datasetInfo = datasetInfo;
    return this;
  }

   /**
   * Get datasetInfo
   * @return datasetInfo
  **/
  @Schema(description = "")
  public DatasetBasicDataModel getDatasetInfo() {
    return datasetInfo;
  }

  public void setDatasetInfo(DatasetBasicDataModel datasetInfo) {
    this.datasetInfo = datasetInfo;
  }

  public DatasetInsightDataModel insights(List<InsightDataModel> insights) {
    this.insights = insights;
    return this;
  }

  public DatasetInsightDataModel addInsightsItem(InsightDataModel insightsItem) {
    if (this.insights == null) {
      this.insights = new ArrayList<InsightDataModel>();
    }
    this.insights.add(insightsItem);
    return this;
  }

   /**
   * Calculated Scoring Results
   * @return insights
  **/
  @Schema(description = "Calculated Scoring Results")
  public List<InsightDataModel> getInsights() {
    return insights;
  }

  public void setInsights(List<InsightDataModel> insights) {
    this.insights = insights;
  }

  public DatasetInsightDataModel modules(List<OneOfDatasetInsightDataModelModulesItems> modules) {
    this.modules = modules;
    return this;
  }

  public DatasetInsightDataModel addModulesItem(OneOfDatasetInsightDataModelModulesItems modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<OneOfDatasetInsightDataModelModulesItems>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * Extracted Fragment Results
   * @return modules
  **/
  @Schema(description = "Extracted Fragment Results")
  public List<OneOfDatasetInsightDataModelModulesItems> getModules() {
    return modules;
  }

  public void setModules(List<OneOfDatasetInsightDataModelModulesItems> modules) {
    this.modules = modules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetInsightDataModel datasetInsightDataModel = (DatasetInsightDataModel) o;
    return Objects.equals(this.requestId, datasetInsightDataModel.requestId) &&
        Objects.equals(this.lenderKey, datasetInsightDataModel.lenderKey) &&
        Objects.equals(this.requestDate, datasetInsightDataModel.requestDate) &&
        Objects.equals(this.datasetInfo, datasetInsightDataModel.datasetInfo) &&
        Objects.equals(this.insights, datasetInsightDataModel.insights) &&
        Objects.equals(this.modules, datasetInsightDataModel.modules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, lenderKey, requestDate, datasetInfo, insights, modules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetInsightDataModel {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    lenderKey: ").append(toIndentedString(lenderKey)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    datasetInfo: ").append(toIndentedString(datasetInfo)).append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
