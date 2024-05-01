package networking.peeps;

import networking.persons.PersonLoadException;

import java.io.*;
import java.net.Socket;

public class ClientCommunication implements Runnable{
    private Socket socket = new Socket();

    public ClientCommunication(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        PersonLoaderr persons = new PersonLoaderr("beispFolien.txt");

        try {
            persons.load();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
                String lines;
                while ((lines= bufferedReader.readLine())!= null){
                    if (lines.equalsIgnoreCase("getall")){
                        for (Person person: persons.load()){
                            System.out.println(person);
                        }break;
                    }else if (lines.equalsIgnoreCase("exit")){
                        System.out.println("client meldet sich ab. ");
                        break;

                    }else {
                        String [] clms = lines.split(" ");
                        int id = Integer.parseInt(clms[1]);
                        if (clms[0].equalsIgnoreCase("get")){
                            for (Person person: persons.load()){
                                if (person.getID()==id){
                                    System.out.println(person);
                                }
                            }
                        }
                    }
                }

            }

        } catch (PersonLoadException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
