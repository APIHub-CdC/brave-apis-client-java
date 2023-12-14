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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InsightDataModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-14T22:11:48.456525056Z[GMT]")

public class InsightDataModel {
  @SerializedName("code")
  private String code = null;

  @SerializedName("value")
  private Double value = null;

  @SerializedName("probability")
  private Double probability = null;

  public InsightDataModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Component code
   * @return code
  **/
  @Schema(example = "dummy_insight_01", description = "Component code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InsightDataModel value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Scoring result (type of FICO)
   * @return value
  **/
  @Schema(example = "750.5", description = "Scoring result (type of FICO)")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public InsightDataModel probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Probability of default
   * @return probability
  **/
  @Schema(example = "0.011", description = "Probability of default")
  public Double getProbability() {
    return probability;
  }

  public void setProbability(Double probability) {
    this.probability = probability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightDataModel insightDataModel = (InsightDataModel) o;
    return Objects.equals(this.code, insightDataModel.code) &&
        Objects.equals(this.value, insightDataModel.value) &&
        Objects.equals(this.probability, insightDataModel.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, value, probability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightDataModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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
