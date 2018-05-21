// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public interface ValueRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ValueRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_closed = 1;</code>
   */
  com.google.protobuf.ByteString getStartValueClosed();

  /**
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_open = 2;</code>
   */
  com.google.protobuf.ByteString getStartValueOpen();

  /**
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_closed = 3;</code>
   */
  com.google.protobuf.ByteString getEndValueClosed();

  /**
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_open = 4;</code>
   */
  com.google.protobuf.ByteString getEndValueOpen();

  public com.google.bigtable.v2.ValueRange.StartValueCase getStartValueCase();

  public com.google.bigtable.v2.ValueRange.EndValueCase getEndValueCase();
}
