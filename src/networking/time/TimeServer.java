package networking.time;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Timestamp;
import java.time.LocalDateTime;

public class TimeServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1112)) {
            while (true){
                System.out.println("warten auf client");
                try(Socket client=serverSocket.accept()) {
                    System.out.println("client ist da ");

                    LocalDateTime dateTime = LocalDateTime.now();
                    System.out.println(dateTime);

                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
