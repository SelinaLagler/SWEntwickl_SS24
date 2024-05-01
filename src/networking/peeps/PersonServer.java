package networking.peeps;

import networking.persons.ClientCommunication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonServer {
    public static void main(String[] args) {


        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            while (true){
                System.out.println("warte auf client");
                Socket client = serverSocket.accept();
                System.out.println("client ist da");
                ClientCommunication clientCommunication= new ClientCommunication(client);
                clientCommunication.run();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
