// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CreateDlpJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CreateDlpJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <code>.google.privacy.dlp.v2.InspectJobConfig inspect_job = 2;</code>
   */
  boolean hasInspectJob();
  /**
   * <code>.google.privacy.dlp.v2.InspectJobConfig inspect_job = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectJobConfig getInspectJob();
  /**
   * <code>.google.privacy.dlp.v2.InspectJobConfig inspect_job = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectJobConfigOrBuilder getInspectJobOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.RiskAnalysisJobConfig risk_job = 3;</code>
   */
  boolean hasRiskJob();
  /**
   * <code>.google.privacy.dlp.v2.RiskAnalysisJobConfig risk_job = 3;</code>
   */
  com.google.privacy.dlp.v2.RiskAnalysisJobConfig getRiskJob();
  /**
   * <code>.google.privacy.dlp.v2.RiskAnalysisJobConfig risk_job = 3;</code>
   */
  com.google.privacy.dlp.v2.RiskAnalysisJobConfigOrBuilder getRiskJobOrBuilder();

  /**
   * <pre>
   * The job id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string job_id = 4;</code>
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * The job id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string job_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  public com.google.privacy.dlp.v2.CreateDlpJobRequest.JobCase getJobCase();
}
