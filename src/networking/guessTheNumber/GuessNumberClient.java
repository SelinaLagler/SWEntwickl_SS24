package networking.guessTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class GuessNumberClient {


    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 2222);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            System.out.println("Verbunden mit 'Guess my number'. Versuchen sie die geheimzahl zu erraten");

            String response= in.readLine();
            while (!response.startsWith("Gratulation")){

            System.out.println("Geben Sie eine Zahl zwischen 1 und 33 ein: ");
            String guess = br.readLine();
            out.println(guess);

            System.out.println("Server: "+response);}







        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}