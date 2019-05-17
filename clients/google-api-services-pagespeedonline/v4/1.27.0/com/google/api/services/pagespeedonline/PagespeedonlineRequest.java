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

package com.google.api.services.pagespeedonline;

/**
 * Pagespeedonline request.
 *
 * @since 1.3
 */
@SuppressWarnings("javadoc")
public abstract class PagespeedonlineRequest<T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

  /**
   * @param client Google client
   * @param method HTTP Method
   * @param uriTemplate URI template for the path relative to the base URL. If it starts with a "/"
   *        the base path from the base URL will be stripped out. The URI template can also be a
   *        full URL. URI template expansion is done using
   *        {@link com.google.api.client.http.UriTemplate#expand(String, String, Object, boolean)}
   * @param content A POJO that can be serialized into JSON or {@code null} for none
   * @param responseClass response class to parse into
   */
  public PagespeedonlineRequest(
      Pagespeedonline client, String method, String uriTemplate, Object content, Class<T> responseClass) {
    super(
        client,
        method,
        uriTemplate,
        content,
        responseClass);
  }

  /** Data format for the response. */
  @com.google.api.client.util.Key
  private java.lang.String alt;

  /**
   * Data format for the response. [default: json]
   */
  public java.lang.String getAlt() {
    return alt;
  }

  /** Data format for the response. */
  public PagespeedonlineRequest<T> setAlt(java.lang.String alt) {
    this.alt = alt;
    return this;
  }

  /** Selector specifying which fields to include in a partial response. */
  @com.google.api.client.util.Key
  private java.lang.String fields;

  /**
   * Selector specifying which fields to include in a partial response.
   */
  public java.lang.String getFields() {
    return fields;
  }

  /** Selector specifying which fields to include in a partial response. */
  public PagespeedonlineRequest<T> setFields(java.lang.String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  public PagespeedonlineRequest<T> setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /** OAuth 2.0 token for the current user. */
  @com.google.api.client.util.Key("oauth_token")
  private java.lang.String oauthToken;

  /**
   * OAuth 2.0 token for the current user.
   */
  public java.lang.String getOauthToken() {
    return oauthToken;
  }

  /** OAuth 2.0 token for the current user. */
  public PagespeedonlineRequest<T> setOauthToken(java.lang.String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  /** Returns response with indentations and line breaks. */
  @com.google.api.client.util.Key
  private java.lang.Boolean prettyPrint;

  /**
   * Returns response with indentations and line breaks. [default: true]
   */
  public java.lang.Boolean getPrettyPrint() {
    return prettyPrint;
  }

  /** Returns response with indentations and line breaks. */
  public PagespeedonlineRequest<T> setPrettyPrint(java.lang.Boolean prettyPrint) {
    this.prettyPrint = prettyPrint;
    return this;
  }

  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  @com.google.api.client.util.Key
  private java.lang.String quotaUser;

  /**
   * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
   */
  public java.lang.String getQuotaUser() {
    return quotaUser;
  }

  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  public PagespeedonlineRequest<T> setQuotaUser(java.lang.String quotaUser) {
    this.quotaUser = quotaUser;
    return this;
  }

  /** Deprecated. Please use quotaUser instead. */
  @com.google.api.client.util.Key
  private java.lang.String userIp;

  /**
   * Deprecated. Please use quotaUser instead.
   */
  public java.lang.String getUserIp() {
    return userIp;
  }

  /** Deprecated. Please use quotaUser instead. */
  public PagespeedonlineRequest<T> setUserIp(java.lang.String userIp) {
    this.userIp = userIp;
    return this;
  }

  @Override
  public final Pagespeedonline getAbstractGoogleClient() {
    return (Pagespeedonline) super.getAbstractGoogleClient();
  }

  @Override
  public PagespeedonlineRequest<T> setDisableGZipContent(boolean disableGZipContent) {
    return (PagespeedonlineRequest<T>) super.setDisableGZipContent(disableGZipContent);
  }

  @Override
  public PagespeedonlineRequest<T> setRequestHeaders(com.google.api.client.http.HttpHeaders headers) {
    return (PagespeedonlineRequest<T>) super.setRequestHeaders(headers);
  }

  @Override
  public PagespeedonlineRequest<T> set(String parameterName, Object value) {
    return (PagespeedonlineRequest<T>) super.set(parameterName, value);
  }
}