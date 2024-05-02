package hangman;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1111)) {

            System.out.println("warte auf client");
        Game g = new Game();
        Socket client = serverSocket.accept();
            System.out.println("client ist da ");
        HangmanClient hangmanClient = new HangmanClient(g,client);
        hangmanClient.run();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
