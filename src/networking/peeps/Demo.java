package networking.peeps;

import networking.persons.PersonLoadException;

public class Demo {

    public static void main(String[] args) {
        PersonLoaderr personLoader = new PersonLoaderr("beispFolien.txt");
        try {
            personLoader.load();
        } catch (PersonLoadException e) {
            throw new RuntimeException(e);
        }
    }
}
