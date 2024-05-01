package networking.persons;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientCommunication implements Runnable{

   private Socket client;

    public ClientCommunication(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {



    }

    public void handleCommands() throws PersonLoadException{

        ArrayList<Person>people= new PersonLoader("beispFolien.txt").load();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            ObjectOutputStream oos= new ObjectOutputStream(client.getOutputStream())
        ){


            String command;

            while ((command = br.readLine()) != null){

                if (command.equalsIgnoreCase("EXIT")){
                    System.out.println("client wants to exit. bye...");
                    break;
                }

                else if (command.equalsIgnoreCase("gettall")){
                    for (Person person:people){
                        oos.writeObject(person);
                    }
                    oos.writeObject(null);
                    oos.flush();
                }

                else {
                    String[]cmds = command.split(" ");

                    int personID = Integer.parseInt(cmds[1]);

                    if (cmds[0].equalsIgnoreCase("get")){
                        for (Person person:people){
                            if (person.getID()==personID){
                                oos.writeObject(person);
                                oos.flush();

                            }
                        }

                    }
                 }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
