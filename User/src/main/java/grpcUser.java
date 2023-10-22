import org.example.User;
import org.example.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Scanner;

public class grpcUser {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        userGrpc.userBlockingStub blockingStub = userGrpc.newBlockingStub(channel);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Log In");
            System.out.println("2. Sign Up");
            System.out.println("3. Create Profile");
            System.out.println("4. Update Profile");
            System.out.println("5. See Profile");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    logIn(blockingStub, scanner);
                    break;
                case 2:
                    signUp(blockingStub, scanner);
                    break;
                case 3:
                    createProfile(blockingStub, scanner);
                    break;
                case 4:
                    updateProfile(blockingStub, scanner);
                    break;
                case 5:
                    seeProfile(blockingStub, scanner);
                    break;
                case 6:
                    exit(channel);
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void logIn(userGrpc.userBlockingStub blockingStub, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        User.LogInRequest request = User.LogInRequest.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .build();

        try {
            User.LogInResponse response = blockingStub.logIn(request);
            System.out.println("Log-In Result: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            System.out.println("Error during Log-In: " + e.getStatus().getDescription());
        }
    }

    private static void signUp(userGrpc.userBlockingStub blockingStub, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        User.SignUpRequest request = User.SignUpRequest.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .build();

        try {
            User.SignUpResponse response = blockingStub.signUp(request);
            System.out.println("Sign-Up Result: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            System.out.println("Error during Sign-Up: " + e.getStatus().getDescription());
        }
    }

    private static void createProfile(userGrpc.userBlockingStub blockingStub, Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();
        String nothing = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        User.CreateProfileRequest request = User.CreateProfileRequest.newBuilder()
                .setUsername(username)
                .setName(name)
                .build();

        try {
            User.CreateProfileResponse response = blockingStub.createProfile(request);
            System.out.println("Create Profile Result: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            System.out.println("Error during Create Profile: " + e.getStatus().getDescription());
        }
    }





    private static void updateProfile(userGrpc.userBlockingStub blockingStub, Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();
        String nothing = scanner.nextLine();

        System.out.print("Update your name: ");
        String name = scanner.nextLine();


        User.UpdateProfileRequest request = User.UpdateProfileRequest.newBuilder()
                .setUsername(username)
                .setName(name)
                .build();

        try {
            User.UpdateProfileResponse response = blockingStub.updateProfile(request);
            System.out.println("Update Profile Result: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            System.out.println("Error during Update Profile: " + e.getStatus().getDescription());
        }
    }

    private static void seeProfile(userGrpc.userBlockingStub blockingStub, Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        User.SeeProfileRequest request = User.SeeProfileRequest.newBuilder()
                .setUsername(username)
                .build();

        try {
            User.SeeProfileResponse response = blockingStub.seeProfile(request);
            if (response.getSuccess()) {
                System.out.println("Name: " + response.getName());
            } else {
                System.out.println("Profile not found for this user: " + response.getMessage());
            }
        } catch (StatusRuntimeException e) {
            System.out.println("Error during See Profile: " + e.getStatus().getDescription());
        }
    }

    private static void exit(ManagedChannel channel) {
        channel.shutdown();
        System.out.println("grpcConsumer Client exited.");
    }
}