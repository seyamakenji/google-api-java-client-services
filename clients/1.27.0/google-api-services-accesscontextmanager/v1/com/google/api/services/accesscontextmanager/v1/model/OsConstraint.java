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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * A restriction on the OS type and version of devices making requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OsConstraint extends com.google.api.client.json.GenericJson {

  /**
   * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint.
   * Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimumVersion;

  /**
   * Required. The allowed OS type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osType;

  /**
   * Only allows requests from devices with a verified Chrome OS. Verifications includes
   * requirements that the device is enterprise-managed, conformant to Dasher domain policies, and
   * the caller has permission to call the API targeted by the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireVerifiedChromeOs;

  /**
   * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint.
   * Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimumVersion() {
    return minimumVersion;
  }

  /**
   * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint.
   * Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
   * @param minimumVersion minimumVersion or {@code null} for none
   */
  public OsConstraint setMinimumVersion(java.lang.String minimumVersion) {
    this.minimumVersion = minimumVersion;
    return this;
  }

  /**
   * Required. The allowed OS type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOsType() {
    return osType;
  }

  /**
   * Required. The allowed OS type.
   * @param osType osType or {@code null} for none
   */
  public OsConstraint setOsType(java.lang.String osType) {
    this.osType = osType;
    return this;
  }

  /**
   * Only allows requests from devices with a verified Chrome OS. Verifications includes
   * requirements that the device is enterprise-managed, conformant to Dasher domain policies, and
   * the caller has permission to call the API targeted by the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireVerifiedChromeOs() {
    return requireVerifiedChromeOs;
  }

  /**
   * Only allows requests from devices with a verified Chrome OS. Verifications includes
   * requirements that the device is enterprise-managed, conformant to Dasher domain policies, and
   * the caller has permission to call the API targeted by the request.
   * @param requireVerifiedChromeOs requireVerifiedChromeOs or {@code null} for none
   */
  public OsConstraint setRequireVerifiedChromeOs(java.lang.Boolean requireVerifiedChromeOs) {
    this.requireVerifiedChromeOs = requireVerifiedChromeOs;
    return this;
  }

  @Override
  public OsConstraint set(String fieldName, Object value) {
    return (OsConstraint) super.set(fieldName, value);
  }

  @Override
  public OsConstraint clone() {
    return (OsConstraint) super.clone();
  }

}
