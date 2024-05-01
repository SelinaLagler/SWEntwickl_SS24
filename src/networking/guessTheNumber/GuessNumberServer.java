package networking.guessTheNumber;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class GuessNumberServer {

    public static void main(String[] args) {


        try (ServerSocket server = new ServerSocket(2222)){
            System.out.println("warten auf Client...");
            while (true){
                Socket clientSocket = server.accept();
                System.out.println("Client ist verbunden! :-)");

                try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter pr = new PrintWriter(clientSocket.getOutputStream(),true)) {
                    int random = new Random().nextInt(32) + 1;

                    int guess = Integer.parseInt(br.readLine());
                    String response = "";
                    if (guess > random) {
                        response = "Die Zahrl ist zu groß";
                    } else if (guess < random) {

                        response = "Die Zahl ist zu klein";
                    } else response = "Gratulation. Die Zahl wurde gefunden ";


                    pr.println(response);

                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
