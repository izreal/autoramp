package io.nuvalence.autoramp.service;

import io.grpc.stub.StreamObserver;
import io.nuvalence.autoramp.grpc.hello.GreeterGrpc;
import io.nuvalence.autoramp.grpc.hello.HelloReply;
import io.nuvalence.autoramp.grpc.hello.HelloRequest;

public class HelloWorldService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String message = sayHelloTo(request.getName());
        responseObserver.onNext(HelloReply.newBuilder().setMessage(message).build());
        responseObserver.onCompleted();
    }

    private String sayHelloTo(String name) {
        return String.format("Hello, %s!", name);
    }
}
