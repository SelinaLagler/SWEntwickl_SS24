package networking.persons;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class PersonClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost",1111);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){

            br.write("get 10");
            br.flush();



        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
