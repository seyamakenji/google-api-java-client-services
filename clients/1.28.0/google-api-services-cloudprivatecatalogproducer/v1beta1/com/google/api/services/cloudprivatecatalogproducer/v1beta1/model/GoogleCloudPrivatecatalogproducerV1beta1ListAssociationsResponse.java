/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudprivatecatalogproducer.v1beta1.model;

/**
 * Model definition for GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Private Catalog Producer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The returned `Association` resources from the list call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPrivatecatalogproducerV1beta1Association> associations;

  static {
    // hack to force ProGuard to consider GoogleCloudPrivatecatalogproducerV1beta1Association used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudPrivatecatalogproducerV1beta1Association.class);
  }

  /**
   * A pagination token returned from a previous call to `ListAssociations` that indicates where the
   * listing should continue from. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The returned `Association` resources from the list call.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPrivatecatalogproducerV1beta1Association> getAssociations() {
    return associations;
  }

  /**
   * The returned `Association` resources from the list call.
   * @param associations associations or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse setAssociations(java.util.List<GoogleCloudPrivatecatalogproducerV1beta1Association> associations) {
    this.associations = associations;
    return this;
  }

  /**
   * A pagination token returned from a previous call to `ListAssociations` that indicates where the
   * listing should continue from. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token returned from a previous call to `ListAssociations` that indicates where the
   * listing should continue from. This field is optional.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse set(String fieldName, Object value) {
    return (GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse clone() {
    return (GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse) super.clone();
  }

}