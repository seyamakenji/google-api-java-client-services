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

package com.google.api.services.monitoring.v3.model;

/**
 * The result of a single uptime check execution. For group checks, this corresponds to one member
 * of the group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UptimeCheckResult extends com.google.api.client.json.GenericJson {

  /**
   * True if the resource passed the check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean checkPassed;

  /**
   * True if the response had content that did not match the check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean contentMismatch;

  /**
   * For HTTP checks, error, if any, that prevented contact with the resource (ex: DNS_NAME_UNKNOWN,
   * INVALID_URL).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * For HTTP checks, HTTP response code returned by the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer httpStatus;

  /**
   * The monitored resource (https://cloud.google.com/monitoring/api/resources) for the Uptime check
   * result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource monitoredResource;

  /**
   * The request latency when executing the uptime check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String requestLatency;

  /**
   * True if the resource passed the check.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCheckPassed() {
    return checkPassed;
  }

  /**
   * True if the resource passed the check.
   * @param checkPassed checkPassed or {@code null} for none
   */
  public UptimeCheckResult setCheckPassed(java.lang.Boolean checkPassed) {
    this.checkPassed = checkPassed;
    return this;
  }

  /**
   * True if the response had content that did not match the check.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContentMismatch() {
    return contentMismatch;
  }

  /**
   * True if the response had content that did not match the check.
   * @param contentMismatch contentMismatch or {@code null} for none
   */
  public UptimeCheckResult setContentMismatch(java.lang.Boolean contentMismatch) {
    this.contentMismatch = contentMismatch;
    return this;
  }

  /**
   * For HTTP checks, error, if any, that prevented contact with the resource (ex: DNS_NAME_UNKNOWN,
   * INVALID_URL).
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * For HTTP checks, error, if any, that prevented contact with the resource (ex: DNS_NAME_UNKNOWN,
   * INVALID_URL).
   * @param errorCode errorCode or {@code null} for none
   */
  public UptimeCheckResult setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * For HTTP checks, HTTP response code returned by the resource.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHttpStatus() {
    return httpStatus;
  }

  /**
   * For HTTP checks, HTTP response code returned by the resource.
   * @param httpStatus httpStatus or {@code null} for none
   */
  public UptimeCheckResult setHttpStatus(java.lang.Integer httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * The monitored resource (https://cloud.google.com/monitoring/api/resources) for the Uptime check
   * result.
   * @return value or {@code null} for none
   */
  public MonitoredResource getMonitoredResource() {
    return monitoredResource;
  }

  /**
   * The monitored resource (https://cloud.google.com/monitoring/api/resources) for the Uptime check
   * result.
   * @param monitoredResource monitoredResource or {@code null} for none
   */
  public UptimeCheckResult setMonitoredResource(MonitoredResource monitoredResource) {
    this.monitoredResource = monitoredResource;
    return this;
  }

  /**
   * The request latency when executing the uptime check.
   * @return value or {@code null} for none
   */
  public String getRequestLatency() {
    return requestLatency;
  }

  /**
   * The request latency when executing the uptime check.
   * @param requestLatency requestLatency or {@code null} for none
   */
  public UptimeCheckResult setRequestLatency(String requestLatency) {
    this.requestLatency = requestLatency;
    return this;
  }

  @Override
  public UptimeCheckResult set(String fieldName, Object value) {
    return (UptimeCheckResult) super.set(fieldName, value);
  }

  @Override
  public UptimeCheckResult clone() {
    return (UptimeCheckResult) super.clone();
  }

}
