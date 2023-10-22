package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.User.LogInRequest,
      org.example.User.LogInResponse> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogIn",
      requestType = org.example.User.LogInRequest.class,
      responseType = org.example.User.LogInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.User.LogInRequest,
      org.example.User.LogInResponse> getLogInMethod() {
    io.grpc.MethodDescriptor<org.example.User.LogInRequest, org.example.User.LogInResponse> getLogInMethod;
    if ((getLogInMethod = userGrpc.getLogInMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogInMethod = userGrpc.getLogInMethod) == null) {
          userGrpc.getLogInMethod = getLogInMethod = 
              io.grpc.MethodDescriptor.<org.example.User.LogInRequest, org.example.User.LogInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "LogIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.LogInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.LogInResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("LogIn"))
                  .build();
          }
        }
     }
     return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.User.SignUpRequest,
      org.example.User.SignUpResponse> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUp",
      requestType = org.example.User.SignUpRequest.class,
      responseType = org.example.User.SignUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.User.SignUpRequest,
      org.example.User.SignUpResponse> getSignUpMethod() {
    io.grpc.MethodDescriptor<org.example.User.SignUpRequest, org.example.User.SignUpResponse> getSignUpMethod;
    if ((getSignUpMethod = userGrpc.getSignUpMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSignUpMethod = userGrpc.getSignUpMethod) == null) {
          userGrpc.getSignUpMethod = getSignUpMethod = 
              io.grpc.MethodDescriptor.<org.example.User.SignUpRequest, org.example.User.SignUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.SignUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.SignUpResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("SignUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.User.CreateProfileRequest,
      org.example.User.CreateProfileResponse> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProfile",
      requestType = org.example.User.CreateProfileRequest.class,
      responseType = org.example.User.CreateProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.User.CreateProfileRequest,
      org.example.User.CreateProfileResponse> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<org.example.User.CreateProfileRequest, org.example.User.CreateProfileResponse> getCreateProfileMethod;
    if ((getCreateProfileMethod = userGrpc.getCreateProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getCreateProfileMethod = userGrpc.getCreateProfileMethod) == null) {
          userGrpc.getCreateProfileMethod = getCreateProfileMethod = 
              io.grpc.MethodDescriptor.<org.example.User.CreateProfileRequest, org.example.User.CreateProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "CreateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.CreateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.CreateProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("CreateProfile"))
                  .build();
          }
        }
     }
     return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.User.UpdateProfileRequest,
      org.example.User.UpdateProfileResponse> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfile",
      requestType = org.example.User.UpdateProfileRequest.class,
      responseType = org.example.User.UpdateProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.User.UpdateProfileRequest,
      org.example.User.UpdateProfileResponse> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<org.example.User.UpdateProfileRequest, org.example.User.UpdateProfileResponse> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = userGrpc.getUpdateProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateProfileMethod = userGrpc.getUpdateProfileMethod) == null) {
          userGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<org.example.User.UpdateProfileRequest, org.example.User.UpdateProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "UpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.UpdateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.UpdateProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("UpdateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.User.SeeProfileRequest,
      org.example.User.SeeProfileResponse> getSeeProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeeProfile",
      requestType = org.example.User.SeeProfileRequest.class,
      responseType = org.example.User.SeeProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.User.SeeProfileRequest,
      org.example.User.SeeProfileResponse> getSeeProfileMethod() {
    io.grpc.MethodDescriptor<org.example.User.SeeProfileRequest, org.example.User.SeeProfileResponse> getSeeProfileMethod;
    if ((getSeeProfileMethod = userGrpc.getSeeProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSeeProfileMethod = userGrpc.getSeeProfileMethod) == null) {
          userGrpc.getSeeProfileMethod = getSeeProfileMethod = 
              io.grpc.MethodDescriptor.<org.example.User.SeeProfileRequest, org.example.User.SeeProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "SeeProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.SeeProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.User.SeeProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("SeeProfile"))
                  .build();
          }
        }
     }
     return getSeeProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void logIn(org.example.User.LogInRequest request,
        io.grpc.stub.StreamObserver<org.example.User.LogInResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     */
    public void signUp(org.example.User.SignUpRequest request,
        io.grpc.stub.StreamObserver<org.example.User.SignUpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    public void createProfile(org.example.User.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<org.example.User.CreateProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(org.example.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<org.example.User.UpdateProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void seeProfile(org.example.User.SeeProfileRequest request,
        io.grpc.stub.StreamObserver<org.example.User.SeeProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSeeProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.User.LogInRequest,
                org.example.User.LogInResponse>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.User.SignUpRequest,
                org.example.User.SignUpResponse>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getCreateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.User.CreateProfileRequest,
                org.example.User.CreateProfileResponse>(
                  this, METHODID_CREATE_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.User.UpdateProfileRequest,
                org.example.User.UpdateProfileResponse>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getSeeProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.User.SeeProfileRequest,
                org.example.User.SeeProfileResponse>(
                  this, METHODID_SEE_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void logIn(org.example.User.LogInRequest request,
        io.grpc.stub.StreamObserver<org.example.User.LogInResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(org.example.User.SignUpRequest request,
        io.grpc.stub.StreamObserver<org.example.User.SignUpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProfile(org.example.User.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<org.example.User.CreateProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(org.example.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<org.example.User.UpdateProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seeProfile(org.example.User.SeeProfileRequest request,
        io.grpc.stub.StreamObserver<org.example.User.SeeProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeeProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.User.LogInResponse logIn(org.example.User.LogInRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.User.SignUpResponse signUp(org.example.User.SignUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.User.CreateProfileResponse createProfile(org.example.User.CreateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.User.UpdateProfileResponse updateProfile(org.example.User.UpdateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.User.SeeProfileResponse seeProfile(org.example.User.SeeProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getSeeProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.User.LogInResponse> logIn(
        org.example.User.LogInRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.User.SignUpResponse> signUp(
        org.example.User.SignUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.User.CreateProfileResponse> createProfile(
        org.example.User.CreateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.User.UpdateProfileResponse> updateProfile(
        org.example.User.UpdateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.User.SeeProfileResponse> seeProfile(
        org.example.User.SeeProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSeeProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_IN = 0;
  private static final int METHODID_SIGN_UP = 1;
  private static final int METHODID_CREATE_PROFILE = 2;
  private static final int METHODID_UPDATE_PROFILE = 3;
  private static final int METHODID_SEE_PROFILE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG_IN:
          serviceImpl.logIn((org.example.User.LogInRequest) request,
              (io.grpc.stub.StreamObserver<org.example.User.LogInResponse>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((org.example.User.SignUpRequest) request,
              (io.grpc.stub.StreamObserver<org.example.User.SignUpResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((org.example.User.CreateProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.example.User.CreateProfileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((org.example.User.UpdateProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.example.User.UpdateProfileResponse>) responseObserver);
          break;
        case METHODID_SEE_PROFILE:
          serviceImpl.seeProfile((org.example.User.SeeProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.example.User.SeeProfileResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getLogInMethod())
              .addMethod(getSignUpMethod())
              .addMethod(getCreateProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getSeeProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
