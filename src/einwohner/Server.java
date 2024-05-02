package einwohner;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(1111)) {

            while (true) {
                System.out.println("Warten auf client: ");
                Socket client = serverSocket.accept();
                EinwohnerLogik server = new EinwohnerLogik(client);
                System.out.println("Client ist da: ");
                server.run();



            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}