package io.graphoenix.showcase.order;

import io.graphoenix.showcase.user.dto.inputObjectType.grpc.UserInput;
import io.graphoenix.showcase.user.grpc.MutationUserListRequest;
import io.graphoenix.showcase.user.grpc.MutationUserListResponse;
import io.graphoenix.showcase.user.grpc.ReactorMutationServiceGrpc;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;

public class GrpcTest {

    @Test
    void grpcClientTest() {
        ReactorMutationServiceGrpc.ReactorMutationServiceStub reactorMutationServiceStub = ReactorMutationServiceGrpc.newReactorStub(ManagedChannelBuilder.forAddress("127.0.0.1", 50051).usePlaintext().build());
        reactorMutationServiceStub
                .userList(
                        MutationUserListRequest.newBuilder()
                                .addList(
                                        UserInput.newBuilder()
                                                .setName("n666")
                                                .setLogin("l666")
                                                .setPassword("p666")
                                                .build()
                                )
                                .addList(
                                        UserInput.newBuilder()
                                                .setName("n777")
                                                .setLogin("l777")
                                                .setPassword("p777")
                                                .build()
                                )
                                .build()
                )
                .map(MutationUserListResponse::getUserListList)
                .map(users -> users)
                .block();

    }
}
