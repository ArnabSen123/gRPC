import java.io.IOException;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import Services.UserService;



public class grpcServer {

    private static final int PORT = 9090;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting server on port " + PORT);

        Server user = ServerBuilder.forPort(PORT)
                .addService(new UserService())
                .build();

        user.start();

        System.out.println("Server started and listening on port " + PORT);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down the server...");
            user.shutdown();
            System.out.println("server shut down.");
        }));

        user.awaitTermination();
    }
}