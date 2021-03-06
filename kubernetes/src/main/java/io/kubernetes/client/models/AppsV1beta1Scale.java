/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.AppsV1beta1ScaleSpec;
import io.kubernetes.client.models.AppsV1beta1ScaleStatus;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Scale represents a scaling request for a resource.
 */
@ApiModel(description = "Scale represents a scaling request for a resource.")

public class AppsV1beta1Scale {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private AppsV1beta1ScaleSpec spec = null;

  @SerializedName("status")
  private AppsV1beta1ScaleStatus status = null;

  public AppsV1beta1Scale apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public AppsV1beta1Scale kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AppsV1beta1Scale metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public AppsV1beta1Scale spec(AppsV1beta1ScaleSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * defines the behavior of the scale. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
   * @return spec
  **/
  @ApiModelProperty(value = "defines the behavior of the scale. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.")
  public AppsV1beta1ScaleSpec getSpec() {
    return spec;
  }

  public void setSpec(AppsV1beta1ScaleSpec spec) {
    this.spec = spec;
  }

  public AppsV1beta1Scale status(AppsV1beta1ScaleStatus status) {
    this.status = status;
    return this;
  }

   /**
   * current status of the scale. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status. Read-only.
   * @return status
  **/
  @ApiModelProperty(value = "current status of the scale. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status. Read-only.")
  public AppsV1beta1ScaleStatus getStatus() {
    return status;
  }

  public void setStatus(AppsV1beta1ScaleStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsV1beta1Scale appsV1beta1Scale = (AppsV1beta1Scale) o;
    return Objects.equals(this.apiVersion, appsV1beta1Scale.apiVersion) &&
        Objects.equals(this.kind, appsV1beta1Scale.kind) &&
        Objects.equals(this.metadata, appsV1beta1Scale.metadata) &&
        Objects.equals(this.spec, appsV1beta1Scale.spec) &&
        Objects.equals(this.status, appsV1beta1Scale.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsV1beta1Scale {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

