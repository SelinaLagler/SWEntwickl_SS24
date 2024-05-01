package networking.peeps;

import networking.persons.PersonLoadException;

import java.io.*;
import java.util.ArrayList;

public class PersonLoaderr {

    private String path;

    public PersonLoaderr(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<Person> load() throws PersonLoadException {
        ArrayList<Person> p = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String lines;


            while ((lines = br.readLine())!= null){
                String[] colums = lines.split(";");

                int number = Integer.parseInt(colums[0]);

                Person psn = new Person(number,colums[1],colums[2] );
                p.add(psn);



            }

            return p;

        } catch (FileNotFoundException e) {
            throw new PersonLoadException("File kann nicht gefunden werden: "+path,e);
        } catch (IOException e) {
            throw new PersonLoadException("Person kann nicht eingelesen werden",e);
        }

    }
}
