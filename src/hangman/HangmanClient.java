package hangman;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

public class HangmanClient implements Runnable{

    private Game game;
    private Socket client;
    private String name;

    public HangmanClient(Game game, Socket client) {
        this.game = game;
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HangmanClient that)) return false;
        return Objects.equals(getGame(), that.getGame()) && Objects.equals(getClient(), that.getClient()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGame(), getClient(), getName());
    }

    public Game getGame() {
        return game;
    }

    public Socket getClient() {
        return client;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HangmanClient{" +
                "game=" + game +
                ", client=" + client +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {

            bw.write("Welcome to Hangman. What's your name?");
            bw.newLine();
            bw.flush();

            String command;
            while ((command = br.readLine()) != null){
                System.out.println("received >> " + command);

                String[] commandParts = command.split(" ");
                if (commandParts[0].equals("EXIT")) {
                    break;
                }
                else if (commandParts[0].equals("NAME")) {
                    this.name = commandParts[1];
                    System.out.println("Name: " + name);
                }
                else if (commandParts[0].equals("TRY")) {
                    char c = commandParts[1].charAt(0);

                    String foundWord = game.tryCharacter(c);
                    bw.write(foundWord);
                    bw.newLine();
                    bw.flush();

                    if (game.isFinished()){
                        bw.write("Gratulation, das gesuchte Wort wurde gefunden. Neues Game startet");
                        bw.newLine();
                        bw.flush();
                    }

                }
                else {
                    System.out.println("unkown command >> " + command);
                    bw.write("unknown command");
                    bw.flush();
                }
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
