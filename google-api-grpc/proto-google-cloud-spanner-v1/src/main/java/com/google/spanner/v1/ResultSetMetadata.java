// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/result_set.proto

package com.google.spanner.v1;

/**
 * <pre>
 * Metadata about a [ResultSet][google.spanner.v1.ResultSet] or [PartialResultSet][google.spanner.v1.PartialResultSet].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.ResultSetMetadata}
 */
public  final class ResultSetMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.ResultSetMetadata)
    ResultSetMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultSetMetadata.newBuilder() to construct.
  private ResultSetMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultSetMetadata() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultSetMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.spanner.v1.StructType.Builder subBuilder = null;
            if (rowType_ != null) {
              subBuilder = rowType_.toBuilder();
            }
            rowType_ = input.readMessage(com.google.spanner.v1.StructType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rowType_);
              rowType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.spanner.v1.Transaction.Builder subBuilder = null;
            if (transaction_ != null) {
              subBuilder = transaction_.toBuilder();
            }
            transaction_ = input.readMessage(com.google.spanner.v1.Transaction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transaction_);
              transaction_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.ResultSetMetadata.class, com.google.spanner.v1.ResultSetMetadata.Builder.class);
  }

  public static final int ROW_TYPE_FIELD_NUMBER = 1;
  private com.google.spanner.v1.StructType rowType_;
  /**
   * <pre>
   * Indicates the field names and types for the rows in the result
   * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
   * Users"` could return a `row_type` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType row_type = 1;</code>
   */
  public boolean hasRowType() {
    return rowType_ != null;
  }
  /**
   * <pre>
   * Indicates the field names and types for the rows in the result
   * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
   * Users"` could return a `row_type` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType row_type = 1;</code>
   */
  public com.google.spanner.v1.StructType getRowType() {
    return rowType_ == null ? com.google.spanner.v1.StructType.getDefaultInstance() : rowType_;
  }
  /**
   * <pre>
   * Indicates the field names and types for the rows in the result
   * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
   * Users"` could return a `row_type` value like:
   *     "fields": [
   *       { "name": "UserId", "type": { "code": "INT64" } },
   *       { "name": "UserName", "type": { "code": "STRING" } },
   *     ]
   * </pre>
   *
   * <code>.google.spanner.v1.StructType row_type = 1;</code>
   */
  public com.google.spanner.v1.StructTypeOrBuilder getRowTypeOrBuilder() {
    return getRowType();
  }

  public static final int TRANSACTION_FIELD_NUMBER = 2;
  private com.google.spanner.v1.Transaction transaction_;
  /**
   * <pre>
   * If the read or SQL query began a transaction as a side-effect, the
   * information about the new transaction is yielded here.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  public boolean hasTransaction() {
    return transaction_ != null;
  }
  /**
   * <pre>
   * If the read or SQL query began a transaction as a side-effect, the
   * information about the new transaction is yielded here.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  public com.google.spanner.v1.Transaction getTransaction() {
    return transaction_ == null ? com.google.spanner.v1.Transaction.getDefaultInstance() : transaction_;
  }
  /**
   * <pre>
   * If the read or SQL query began a transaction as a side-effect, the
   * information about the new transaction is yielded here.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  public com.google.spanner.v1.TransactionOrBuilder getTransactionOrBuilder() {
    return getTransaction();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (rowType_ != null) {
      output.writeMessage(1, getRowType());
    }
    if (transaction_ != null) {
      output.writeMessage(2, getTransaction());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rowType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRowType());
    }
    if (transaction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransaction());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.spanner.v1.ResultSetMetadata)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.ResultSetMetadata other = (com.google.spanner.v1.ResultSetMetadata) obj;

    boolean result = true;
    result = result && (hasRowType() == other.hasRowType());
    if (hasRowType()) {
      result = result && getRowType()
          .equals(other.getRowType());
    }
    result = result && (hasTransaction() == other.hasTransaction());
    if (hasTransaction()) {
      result = result && getTransaction()
          .equals(other.getTransaction());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRowType()) {
      hash = (37 * hash) + ROW_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRowType().hashCode();
    }
    if (hasTransaction()) {
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.ResultSetMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.spanner.v1.ResultSetMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Metadata about a [ResultSet][google.spanner.v1.ResultSet] or [PartialResultSet][google.spanner.v1.PartialResultSet].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.ResultSetMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.ResultSetMetadata)
      com.google.spanner.v1.ResultSetMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.ResultSetMetadata.class, com.google.spanner.v1.ResultSetMetadata.Builder.class);
    }

    // Construct using com.google.spanner.v1.ResultSetMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (rowTypeBuilder_ == null) {
        rowType_ = null;
      } else {
        rowType_ = null;
        rowTypeBuilder_ = null;
      }
      if (transactionBuilder_ == null) {
        transaction_ = null;
      } else {
        transaction_ = null;
        transactionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetMetadata_descriptor;
    }

    public com.google.spanner.v1.ResultSetMetadata getDefaultInstanceForType() {
      return com.google.spanner.v1.ResultSetMetadata.getDefaultInstance();
    }

    public com.google.spanner.v1.ResultSetMetadata build() {
      com.google.spanner.v1.ResultSetMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.v1.ResultSetMetadata buildPartial() {
      com.google.spanner.v1.ResultSetMetadata result = new com.google.spanner.v1.ResultSetMetadata(this);
      if (rowTypeBuilder_ == null) {
        result.rowType_ = rowType_;
      } else {
        result.rowType_ = rowTypeBuilder_.build();
      }
      if (transactionBuilder_ == null) {
        result.transaction_ = transaction_;
      } else {
        result.transaction_ = transactionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.ResultSetMetadata) {
        return mergeFrom((com.google.spanner.v1.ResultSetMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.ResultSetMetadata other) {
      if (other == com.google.spanner.v1.ResultSetMetadata.getDefaultInstance()) return this;
      if (other.hasRowType()) {
        mergeRowType(other.getRowType());
      }
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.v1.ResultSetMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.ResultSetMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.spanner.v1.StructType rowType_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.StructType, com.google.spanner.v1.StructType.Builder, com.google.spanner.v1.StructTypeOrBuilder> rowTypeBuilder_;
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public boolean hasRowType() {
      return rowTypeBuilder_ != null || rowType_ != null;
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public com.google.spanner.v1.StructType getRowType() {
      if (rowTypeBuilder_ == null) {
        return rowType_ == null ? com.google.spanner.v1.StructType.getDefaultInstance() : rowType_;
      } else {
        return rowTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public Builder setRowType(com.google.spanner.v1.StructType value) {
      if (rowTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rowType_ = value;
        onChanged();
      } else {
        rowTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public Builder setRowType(
        com.google.spanner.v1.StructType.Builder builderForValue) {
      if (rowTypeBuilder_ == null) {
        rowType_ = builderForValue.build();
        onChanged();
      } else {
        rowTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public Builder mergeRowType(com.google.spanner.v1.StructType value) {
      if (rowTypeBuilder_ == null) {
        if (rowType_ != null) {
          rowType_ =
            com.google.spanner.v1.StructType.newBuilder(rowType_).mergeFrom(value).buildPartial();
        } else {
          rowType_ = value;
        }
        onChanged();
      } else {
        rowTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public Builder clearRowType() {
      if (rowTypeBuilder_ == null) {
        rowType_ = null;
        onChanged();
      } else {
        rowType_ = null;
        rowTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public com.google.spanner.v1.StructType.Builder getRowTypeBuilder() {
      
      onChanged();
      return getRowTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    public com.google.spanner.v1.StructTypeOrBuilder getRowTypeOrBuilder() {
      if (rowTypeBuilder_ != null) {
        return rowTypeBuilder_.getMessageOrBuilder();
      } else {
        return rowType_ == null ?
            com.google.spanner.v1.StructType.getDefaultInstance() : rowType_;
      }
    }
    /**
     * <pre>
     * Indicates the field names and types for the rows in the result
     * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
     * Users"` could return a `row_type` value like:
     *     "fields": [
     *       { "name": "UserId", "type": { "code": "INT64" } },
     *       { "name": "UserName", "type": { "code": "STRING" } },
     *     ]
     * </pre>
     *
     * <code>.google.spanner.v1.StructType row_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.StructType, com.google.spanner.v1.StructType.Builder, com.google.spanner.v1.StructTypeOrBuilder> 
        getRowTypeFieldBuilder() {
      if (rowTypeBuilder_ == null) {
        rowTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.StructType, com.google.spanner.v1.StructType.Builder, com.google.spanner.v1.StructTypeOrBuilder>(
                getRowType(),
                getParentForChildren(),
                isClean());
        rowType_ = null;
      }
      return rowTypeBuilder_;
    }

    private com.google.spanner.v1.Transaction transaction_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.Transaction, com.google.spanner.v1.Transaction.Builder, com.google.spanner.v1.TransactionOrBuilder> transactionBuilder_;
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public boolean hasTransaction() {
      return transactionBuilder_ != null || transaction_ != null;
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public com.google.spanner.v1.Transaction getTransaction() {
      if (transactionBuilder_ == null) {
        return transaction_ == null ? com.google.spanner.v1.Transaction.getDefaultInstance() : transaction_;
      } else {
        return transactionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder setTransaction(com.google.spanner.v1.Transaction value) {
      if (transactionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transaction_ = value;
        onChanged();
      } else {
        transactionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder setTransaction(
        com.google.spanner.v1.Transaction.Builder builderForValue) {
      if (transactionBuilder_ == null) {
        transaction_ = builderForValue.build();
        onChanged();
      } else {
        transactionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder mergeTransaction(com.google.spanner.v1.Transaction value) {
      if (transactionBuilder_ == null) {
        if (transaction_ != null) {
          transaction_ =
            com.google.spanner.v1.Transaction.newBuilder(transaction_).mergeFrom(value).buildPartial();
        } else {
          transaction_ = value;
        }
        onChanged();
      } else {
        transactionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder clearTransaction() {
      if (transactionBuilder_ == null) {
        transaction_ = null;
        onChanged();
      } else {
        transaction_ = null;
        transactionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public com.google.spanner.v1.Transaction.Builder getTransactionBuilder() {
      
      onChanged();
      return getTransactionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public com.google.spanner.v1.TransactionOrBuilder getTransactionOrBuilder() {
      if (transactionBuilder_ != null) {
        return transactionBuilder_.getMessageOrBuilder();
      } else {
        return transaction_ == null ?
            com.google.spanner.v1.Transaction.getDefaultInstance() : transaction_;
      }
    }
    /**
     * <pre>
     * If the read or SQL query began a transaction as a side-effect, the
     * information about the new transaction is yielded here.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.Transaction, com.google.spanner.v1.Transaction.Builder, com.google.spanner.v1.TransactionOrBuilder> 
        getTransactionFieldBuilder() {
      if (transactionBuilder_ == null) {
        transactionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.Transaction, com.google.spanner.v1.Transaction.Builder, com.google.spanner.v1.TransactionOrBuilder>(
                getTransaction(),
                getParentForChildren(),
                isClean());
        transaction_ = null;
      }
      return transactionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.v1.ResultSetMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.ResultSetMetadata)
  private static final com.google.spanner.v1.ResultSetMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.ResultSetMetadata();
  }

  public static com.google.spanner.v1.ResultSetMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultSetMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ResultSetMetadata>() {
    public ResultSetMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultSetMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultSetMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultSetMetadata> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.v1.ResultSetMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

