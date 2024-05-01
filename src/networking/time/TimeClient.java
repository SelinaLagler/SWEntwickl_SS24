package networking.time;

import java.io.*;
import java.net.Socket;

public class TimeClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",1112);
        {


            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line = " ";
            while ((line = br.readLine()) != null) {
                System.out.println("Server: " + line);

            }


        }
    }
}
