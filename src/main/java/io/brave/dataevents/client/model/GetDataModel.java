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

package io.brave.dataevents.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Get Dataset
 */
@Schema(description = "Get Dataset")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-28T21:38:54.271769326Z[GMT]")

public class GetDataModel {
  @SerializedName("dataId")
  private String dataId = null;

  @SerializedName("lenderKey")
  private String lenderKey = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("createDate")
  private String createDate = null;

  public GetDataModel dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

   /**
   * Identifier of dataset
   * @return dataId
  **/
  @Schema(example = "web-570e8420-e29b-41d4-a436-126610440900", required = true, description = "Identifier of dataset")
  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  public GetDataModel lenderKey(String lenderKey) {
    this.lenderKey = lenderKey;
    return this;
  }

   /**
   * Identifier of account
   * @return lenderKey
  **/
  @Schema(example = "circulodecredito@demo.com.mx", required = true, description = "Identifier of account")
  public String getLenderKey() {
    return lenderKey;
  }

  public void setLenderKey(String lenderKey) {
    this.lenderKey = lenderKey;
  }

  public GetDataModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of dataset: \&quot;Complete\&quot; for a complete submission of the data set and \&quot;incomplete\&quot; for data pending submission
   * @return status
  **/
  @Schema(example = "Complete", required = true, description = "Status of dataset: \"Complete\" for a complete submission of the data set and \"incomplete\" for data pending submission")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetDataModel createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Creation date of data
   * @return createDate
  **/
  @Schema(example = "2023-06-02T21:50:53.000Z", required = true, description = "Creation date of data")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDataModel getDataModel = (GetDataModel) o;
    return Objects.equals(this.dataId, getDataModel.dataId) &&
        Objects.equals(this.lenderKey, getDataModel.lenderKey) &&
        Objects.equals(this.status, getDataModel.status) &&
        Objects.equals(this.createDate, getDataModel.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataId, lenderKey, status, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataModel {\n");
    
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
    sb.append("    lenderKey: ").append(toIndentedString(lenderKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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