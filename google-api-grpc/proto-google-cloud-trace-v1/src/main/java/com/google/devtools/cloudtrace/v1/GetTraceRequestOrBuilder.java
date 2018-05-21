// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

public interface GetTraceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.GetTraceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * ID of the trace to return.
   * </pre>
   *
   * <code>string trace_id = 2;</code>
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * ID of the trace to return.
   * </pre>
   *
   * <code>string trace_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();
}
