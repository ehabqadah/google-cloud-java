// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface AnnotateVideoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.AnnotateVideoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input video location. Currently, only
   * [Google Cloud Storage](https://cloud.google.com/storage/) URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see
   * [Request URIs](/storage/docs/reference-uris).
   * A video URI may include wildcards in `object-id`, and thus identify
   * multiple videos. Supported wildcards: '*' to match 0 or more characters;
   * '?' to match 1 character. If unset, the input video should be embedded
   * in the request as `input_content`. If set, `input_content` should be unset.
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  java.lang.String getInputUri();
  /**
   * <pre>
   * Input video location. Currently, only
   * [Google Cloud Storage](https://cloud.google.com/storage/) URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see
   * [Request URIs](/storage/docs/reference-uris).
   * A video URI may include wildcards in `object-id`, and thus identify
   * multiple videos. Supported wildcards: '*' to match 0 or more characters;
   * '?' to match 1 character. If unset, the input video should be embedded
   * in the request as `input_content`. If set, `input_content` should be unset.
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getInputUriBytes();

  /**
   * <pre>
   * The video data bytes.
   * If unset, the input video(s) should be specified via `input_uri`.
   * If set, `input_uri` should be unset.
   * </pre>
   *
   * <code>bytes input_content = 6;</code>
   */
  com.google.protobuf.ByteString getInputContent();

  /**
   * <pre>
   * Requested video annotation features.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.Feature features = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.Feature> getFeaturesList();
  /**
   * <pre>
   * Requested video annotation features.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.Feature features = 2;</code>
   */
  int getFeaturesCount();
  /**
   * <pre>
   * Requested video annotation features.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.Feature features = 2;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.Feature getFeatures(int index);
  /**
   * <pre>
   * Requested video annotation features.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.Feature features = 2;</code>
   */
  java.util.List<java.lang.Integer>
  getFeaturesValueList();
  /**
   * <pre>
   * Requested video annotation features.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.Feature features = 2;</code>
   */
  int getFeaturesValue(int index);

  /**
   * <pre>
   * Additional video context and/or feature-specific parameters.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.VideoContext video_context = 3;</code>
   */
  boolean hasVideoContext();
  /**
   * <pre>
   * Additional video context and/or feature-specific parameters.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.VideoContext video_context = 3;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.VideoContext getVideoContext();
  /**
   * <pre>
   * Additional video context and/or feature-specific parameters.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.VideoContext video_context = 3;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.VideoContextOrBuilder getVideoContextOrBuilder();

  /**
   * <pre>
   * Optional location where the output (in JSON format) should be stored.
   * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
   * URIs are supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see
   * [Request URIs](/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string output_uri = 4;</code>
   */
  java.lang.String getOutputUri();
  /**
   * <pre>
   * Optional location where the output (in JSON format) should be stored.
   * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
   * URIs are supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see
   * [Request URIs](/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string output_uri = 4;</code>
   */
  com.google.protobuf.ByteString
      getOutputUriBytes();

  /**
   * <pre>
   * Optional cloud region where annotation should take place. Supported cloud
   * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region
   * is specified, a region will be determined based on video file location.
   * </pre>
   *
   * <code>string location_id = 5;</code>
   */
  java.lang.String getLocationId();
  /**
   * <pre>
   * Optional cloud region where annotation should take place. Supported cloud
   * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region
   * is specified, a region will be determined based on video file location.
   * </pre>
   *
   * <code>string location_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getLocationIdBytes();
}
