package networking.peeps;

import networking.persons.PersonLoadException;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientCommunication implements Runnable{
    private Socket socket = new Socket();

    public ClientCommunication(Socket socket)  {
        this.socket = socket;
    }

    public void run()  {
        ArrayList<Person> persons = null;
        try {
            persons = new PersonLoaderr("beispFolien.txt").load();
        } catch (PersonLoadException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
                String lines;
                while ((lines= bufferedReader.readLine())!= null){
                    if (lines.equalsIgnoreCase("getall")){
                        for (Person person: persons){
                            oos.writeObject(person);
                            oos.flush();
                        }
                    }else if (lines.equalsIgnoreCase("exit")){
                        System.out.println("client meldet sich ab. ");
                        break;

                    }else {
                        String [] clms = lines.split(" ");
                        int id = Integer.parseInt(clms[1]);
                        if (clms[0].equalsIgnoreCase("get")){
                            for (Person person: persons){
                                if (person.getID()==id){
                                    oos.writeObject(person);

                                    oos.flush();
                                }
                            }
                        }
                    }
                }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
