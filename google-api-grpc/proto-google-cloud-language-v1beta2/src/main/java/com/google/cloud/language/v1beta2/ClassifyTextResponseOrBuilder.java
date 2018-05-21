// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface ClassifyTextResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.ClassifyTextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory categories = 1;</code>
   */
  java.util.List<com.google.cloud.language.v1beta2.ClassificationCategory> 
      getCategoriesList();
  /**
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory categories = 1;</code>
   */
  com.google.cloud.language.v1beta2.ClassificationCategory getCategories(int index);
  /**
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory categories = 1;</code>
   */
  int getCategoriesCount();
  /**
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory categories = 1;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder> 
      getCategoriesOrBuilderList();
  /**
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.ClassificationCategory categories = 1;</code>
   */
  com.google.cloud.language.v1beta2.ClassificationCategoryOrBuilder getCategoriesOrBuilder(
      int index);
}
