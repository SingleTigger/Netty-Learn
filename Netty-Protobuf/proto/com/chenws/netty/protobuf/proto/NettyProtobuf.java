// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NettyProtobuf.proto

package com.chenws.netty.protobuf.proto;

public final class NettyProtobuf {
  private NettyProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PeopleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:People)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     *年龄
     * </pre>
     *
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();

    /**
     * <pre>
     *性别
     * </pre>
     *
     * <code>string gender = 3;</code>
     * @return The gender.
     */
    java.lang.String getGender();
    /**
     * <pre>
     *性别
     * </pre>
     *
     * <code>string gender = 3;</code>
     * @return The bytes for gender.
     */
    com.google.protobuf.ByteString
        getGenderBytes();

    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string address = 4;</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string address = 4;</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();
  }
  /**
   * Protobuf type {@code People}
   */
  public  static final class People extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:People)
      PeopleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use People.newBuilder() to construct.
    private People(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private People() {
      name_ = "";
      gender_ = "";
      address_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new People();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private People(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              age_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              gender_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              address_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
      return com.chenws.netty.protobuf.proto.NettyProtobuf.internal_static_People_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chenws.netty.protobuf.proto.NettyProtobuf.internal_static_People_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chenws.netty.protobuf.proto.NettyProtobuf.People.class, com.chenws.netty.protobuf.proto.NettyProtobuf.People.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *姓名
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <pre>
     *年龄
     * </pre>
     *
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    public int getAge() {
      return age_;
    }

    public static final int GENDER_FIELD_NUMBER = 3;
    private volatile java.lang.Object gender_;
    /**
     * <pre>
     *性别
     * </pre>
     *
     * <code>string gender = 3;</code>
     * @return The gender.
     */
    public java.lang.String getGender() {
      java.lang.Object ref = gender_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gender_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *性别
     * </pre>
     *
     * <code>string gender = 3;</code>
     * @return The bytes for gender.
     */
    public com.google.protobuf.ByteString
        getGenderBytes() {
      java.lang.Object ref = gender_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDRESS_FIELD_NUMBER = 4;
    private volatile java.lang.Object address_;
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string address = 4;</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string address = 4;</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      if (!getGenderBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gender_);
      }
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, address_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (!getGenderBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gender_);
      }
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, address_);
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
      if (!(obj instanceof com.chenws.netty.protobuf.proto.NettyProtobuf.People)) {
        return super.equals(obj);
      }
      com.chenws.netty.protobuf.proto.NettyProtobuf.People other = (com.chenws.netty.protobuf.proto.NettyProtobuf.People) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (!getGender()
          .equals(other.getGender())) return false;
      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (37 * hash) + GENDER_FIELD_NUMBER;
      hash = (53 * hash) + getGender().hashCode();
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People parseFrom(
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
    public static Builder newBuilder(com.chenws.netty.protobuf.proto.NettyProtobuf.People prototype) {
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
     * Protobuf type {@code People}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:People)
        com.chenws.netty.protobuf.proto.NettyProtobuf.PeopleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chenws.netty.protobuf.proto.NettyProtobuf.internal_static_People_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chenws.netty.protobuf.proto.NettyProtobuf.internal_static_People_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chenws.netty.protobuf.proto.NettyProtobuf.People.class, com.chenws.netty.protobuf.proto.NettyProtobuf.People.Builder.class);
      }

      // Construct using com.chenws.netty.protobuf.proto.NettyProtobuf.People.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        gender_ = "";

        address_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chenws.netty.protobuf.proto.NettyProtobuf.internal_static_People_descriptor;
      }

      @java.lang.Override
      public com.chenws.netty.protobuf.proto.NettyProtobuf.People getDefaultInstanceForType() {
        return com.chenws.netty.protobuf.proto.NettyProtobuf.People.getDefaultInstance();
      }

      @java.lang.Override
      public com.chenws.netty.protobuf.proto.NettyProtobuf.People build() {
        com.chenws.netty.protobuf.proto.NettyProtobuf.People result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.chenws.netty.protobuf.proto.NettyProtobuf.People buildPartial() {
        com.chenws.netty.protobuf.proto.NettyProtobuf.People result = new com.chenws.netty.protobuf.proto.NettyProtobuf.People(this);
        result.name_ = name_;
        result.age_ = age_;
        result.gender_ = gender_;
        result.address_ = address_;
        onBuilt();
        return result;
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
        if (other instanceof com.chenws.netty.protobuf.proto.NettyProtobuf.People) {
          return mergeFrom((com.chenws.netty.protobuf.proto.NettyProtobuf.People)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chenws.netty.protobuf.proto.NettyProtobuf.People other) {
        if (other == com.chenws.netty.protobuf.proto.NettyProtobuf.People.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (!other.getGender().isEmpty()) {
          gender_ = other.gender_;
          onChanged();
        }
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.chenws.netty.protobuf.proto.NettyProtobuf.People parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chenws.netty.protobuf.proto.NettyProtobuf.People) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       *姓名
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *姓名
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *姓名
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *姓名
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *姓名
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <pre>
       *年龄
       * </pre>
       *
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      public int getAge() {
        return age_;
      }
      /**
       * <pre>
       *年龄
       * </pre>
       *
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *年龄
       * </pre>
       *
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object gender_ = "";
      /**
       * <pre>
       *性别
       * </pre>
       *
       * <code>string gender = 3;</code>
       * @return The gender.
       */
      public java.lang.String getGender() {
        java.lang.Object ref = gender_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          gender_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *性别
       * </pre>
       *
       * <code>string gender = 3;</code>
       * @return The bytes for gender.
       */
      public com.google.protobuf.ByteString
          getGenderBytes() {
        java.lang.Object ref = gender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *性别
       * </pre>
       *
       * <code>string gender = 3;</code>
       * @param value The gender to set.
       * @return This builder for chaining.
       */
      public Builder setGender(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        gender_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *性别
       * </pre>
       *
       * <code>string gender = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGender() {
        
        gender_ = getDefaultInstance().getGender();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *性别
       * </pre>
       *
       * <code>string gender = 3;</code>
       * @param value The bytes for gender to set.
       * @return This builder for chaining.
       */
      public Builder setGenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        gender_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object address_ = "";
      /**
       * <pre>
       *地址
       * </pre>
       *
       * <code>string address = 4;</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *地址
       * </pre>
       *
       * <code>string address = 4;</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *地址
       * </pre>
       *
       * <code>string address = 4;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *地址
       * </pre>
       *
       * <code>string address = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *地址
       * </pre>
       *
       * <code>string address = 4;</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:People)
    }

    // @@protoc_insertion_point(class_scope:People)
    private static final com.chenws.netty.protobuf.proto.NettyProtobuf.People DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.chenws.netty.protobuf.proto.NettyProtobuf.People();
    }

    public static com.chenws.netty.protobuf.proto.NettyProtobuf.People getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<People>
        PARSER = new com.google.protobuf.AbstractParser<People>() {
      @java.lang.Override
      public People parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new People(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<People> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<People> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.chenws.netty.protobuf.proto.NettyProtobuf.People getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_People_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_People_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023NettyProtobuf.proto\"D\n\006People\022\014\n\004name\030" +
      "\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\016\n\006gender\030\003 \001(\t\022\017\n\007ad" +
      "dress\030\004 \001(\tB0\n\037com.chenws.netty.protobuf" +
      ".protoB\rNettyProtobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_People_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_People_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_People_descriptor,
        new java.lang.String[] { "Name", "Age", "Gender", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
