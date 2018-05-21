// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface ListClustersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListClustersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the cluster
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the cluster
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 4;</code>
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 4;</code>
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Optional. A filter constraining the clusters to list. Filters are
   * case-sensitive and have the following syntax:
   * field = value [AND [field = value]] ...
   * where **field** is one of `status.state`, `clusterName`, or `labels.[KEY]`,
   * and `[KEY]` is a label key. **value** can be `*` to match all values.
   * `status.state` can be one of the following: `ACTIVE`, `INACTIVE`,
   * `CREATING`, `RUNNING`, `ERROR`, `DELETING`, or `UPDATING`. `ACTIVE`
   * contains the `CREATING`, `UPDATING`, and `RUNNING` states. `INACTIVE`
   * contains the `DELETING` and `ERROR` states.
   * `clusterName` is the name of the cluster provided at creation time.
   * Only the logical `AND` operator is supported; space-separated items are
   * treated as having an implicit `AND` operator.
   * Example filter:
   * status.state = ACTIVE AND clusterName = mycluster
   * AND labels.env = staging AND labels.starred = *
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. A filter constraining the clusters to list. Filters are
   * case-sensitive and have the following syntax:
   * field = value [AND [field = value]] ...
   * where **field** is one of `status.state`, `clusterName`, or `labels.[KEY]`,
   * and `[KEY]` is a label key. **value** can be `*` to match all values.
   * `status.state` can be one of the following: `ACTIVE`, `INACTIVE`,
   * `CREATING`, `RUNNING`, `ERROR`, `DELETING`, or `UPDATING`. `ACTIVE`
   * contains the `CREATING`, `UPDATING`, and `RUNNING` states. `INACTIVE`
   * contains the `DELETING` and `ERROR` states.
   * `clusterName` is the name of the cluster provided at creation time.
   * Only the logical `AND` operator is supported; space-separated items are
   * treated as having an implicit `AND` operator.
   * Example filter:
   * status.state = ACTIVE AND clusterName = mycluster
   * AND labels.env = staging AND labels.starred = *
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. The standard List page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The standard List page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The standard List page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
