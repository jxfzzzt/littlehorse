// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_wfspec.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * Utility used among metadata objects to define their output type. For example, used in
 * TaskDef and ExternalEventDef to represent the output.
 * </pre>
 *
 * Protobuf type {@code littlehorse.ReturnType}
 */
public final class ReturnType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.ReturnType)
    ReturnTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReturnType.newBuilder() to construct.
  private ReturnType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReturnType() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReturnType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.CommonWfspec.internal_static_littlehorse_ReturnType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.CommonWfspec.internal_static_littlehorse_ReturnType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.ReturnType.class, io.littlehorse.sdk.common.proto.ReturnType.Builder.class);
  }

  private int bitField0_;
  public static final int RETURN_TYPE_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.TypeDefinition returnType_;
  /**
   * <pre>
   * The type of the output. If it is not present, it is interpred as the output type
   * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
   * </pre>
   *
   * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
   * @return Whether the returnType field is set.
   */
  @java.lang.Override
  public boolean hasReturnType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The type of the output. If it is not present, it is interpred as the output type
   * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
   * </pre>
   *
   * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
   * @return The returnType.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TypeDefinition getReturnType() {
    return returnType_ == null ? io.littlehorse.sdk.common.proto.TypeDefinition.getDefaultInstance() : returnType_;
  }
  /**
   * <pre>
   * The type of the output. If it is not present, it is interpred as the output type
   * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
   * </pre>
   *
   * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TypeDefinitionOrBuilder getReturnTypeOrBuilder() {
    return returnType_ == null ? io.littlehorse.sdk.common.proto.TypeDefinition.getDefaultInstance() : returnType_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getReturnType());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReturnType());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.littlehorse.sdk.common.proto.ReturnType)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.ReturnType other = (io.littlehorse.sdk.common.proto.ReturnType) obj;

    if (hasReturnType() != other.hasReturnType()) return false;
    if (hasReturnType()) {
      if (!getReturnType()
          .equals(other.getReturnType())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasReturnType()) {
      hash = (37 * hash) + RETURN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getReturnType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.ReturnType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.ReturnType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ReturnType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.ReturnType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Utility used among metadata objects to define their output type. For example, used in
   * TaskDef and ExternalEventDef to represent the output.
   * </pre>
   *
   * Protobuf type {@code littlehorse.ReturnType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.ReturnType)
      io.littlehorse.sdk.common.proto.ReturnTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.CommonWfspec.internal_static_littlehorse_ReturnType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.CommonWfspec.internal_static_littlehorse_ReturnType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.ReturnType.class, io.littlehorse.sdk.common.proto.ReturnType.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.ReturnType.newBuilder()
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
        getReturnTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      returnType_ = null;
      if (returnTypeBuilder_ != null) {
        returnTypeBuilder_.dispose();
        returnTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.CommonWfspec.internal_static_littlehorse_ReturnType_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ReturnType getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.ReturnType.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ReturnType build() {
      io.littlehorse.sdk.common.proto.ReturnType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ReturnType buildPartial() {
      io.littlehorse.sdk.common.proto.ReturnType result = new io.littlehorse.sdk.common.proto.ReturnType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.ReturnType result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.returnType_ = returnTypeBuilder_ == null
            ? returnType_
            : returnTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.littlehorse.sdk.common.proto.ReturnType) {
        return mergeFrom((io.littlehorse.sdk.common.proto.ReturnType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.ReturnType other) {
      if (other == io.littlehorse.sdk.common.proto.ReturnType.getDefaultInstance()) return this;
      if (other.hasReturnType()) {
        mergeReturnType(other.getReturnType());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getReturnTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private io.littlehorse.sdk.common.proto.TypeDefinition returnType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TypeDefinition, io.littlehorse.sdk.common.proto.TypeDefinition.Builder, io.littlehorse.sdk.common.proto.TypeDefinitionOrBuilder> returnTypeBuilder_;
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     * @return Whether the returnType field is set.
     */
    public boolean hasReturnType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     * @return The returnType.
     */
    public io.littlehorse.sdk.common.proto.TypeDefinition getReturnType() {
      if (returnTypeBuilder_ == null) {
        return returnType_ == null ? io.littlehorse.sdk.common.proto.TypeDefinition.getDefaultInstance() : returnType_;
      } else {
        return returnTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    public Builder setReturnType(io.littlehorse.sdk.common.proto.TypeDefinition value) {
      if (returnTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnType_ = value;
      } else {
        returnTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    public Builder setReturnType(
        io.littlehorse.sdk.common.proto.TypeDefinition.Builder builderForValue) {
      if (returnTypeBuilder_ == null) {
        returnType_ = builderForValue.build();
      } else {
        returnTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    public Builder mergeReturnType(io.littlehorse.sdk.common.proto.TypeDefinition value) {
      if (returnTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          returnType_ != null &&
          returnType_ != io.littlehorse.sdk.common.proto.TypeDefinition.getDefaultInstance()) {
          getReturnTypeBuilder().mergeFrom(value);
        } else {
          returnType_ = value;
        }
      } else {
        returnTypeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    public Builder clearReturnType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      returnType_ = null;
      if (returnTypeBuilder_ != null) {
        returnTypeBuilder_.dispose();
        returnTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TypeDefinition.Builder getReturnTypeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReturnTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TypeDefinitionOrBuilder getReturnTypeOrBuilder() {
      if (returnTypeBuilder_ != null) {
        return returnTypeBuilder_.getMessageOrBuilder();
      } else {
        return returnType_ == null ?
            io.littlehorse.sdk.common.proto.TypeDefinition.getDefaultInstance() : returnType_;
      }
    }
    /**
     * <pre>
     * The type of the output. If it is not present, it is interpred as the output type
     * being void: the TaskRun output/ExternalEvent/WorkflowEvent is always empty / NULL.
     * </pre>
     *
     * <code>optional .littlehorse.TypeDefinition return_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TypeDefinition, io.littlehorse.sdk.common.proto.TypeDefinition.Builder, io.littlehorse.sdk.common.proto.TypeDefinitionOrBuilder> 
        getReturnTypeFieldBuilder() {
      if (returnTypeBuilder_ == null) {
        returnTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.TypeDefinition, io.littlehorse.sdk.common.proto.TypeDefinition.Builder, io.littlehorse.sdk.common.proto.TypeDefinitionOrBuilder>(
                getReturnType(),
                getParentForChildren(),
                isClean());
        returnType_ = null;
      }
      return returnTypeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:littlehorse.ReturnType)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.ReturnType)
  private static final io.littlehorse.sdk.common.proto.ReturnType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.ReturnType();
  }

  public static io.littlehorse.sdk.common.proto.ReturnType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReturnType>
      PARSER = new com.google.protobuf.AbstractParser<ReturnType>() {
    @java.lang.Override
    public ReturnType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ReturnType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReturnType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.ReturnType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

