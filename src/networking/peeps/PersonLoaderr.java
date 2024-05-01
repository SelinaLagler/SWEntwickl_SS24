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

        File f = new File(path);
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String lines="";
            ArrayList<Person> p = new ArrayList<>();

            while ((lines = br.readLine())!= null){
                String[] colums = lines.split(";");

                int number = Integer.parseInt(colums[0]);

                Person psn = new Person(number,colums[1],colums[2] );
                p.add(psn);



            }
            System.out.println(p);
            return p;

        } catch (FileNotFoundException e) {
            throw new PersonLoadException("File kann nicht gefunden werden: "+path,e);
        } catch (IOException e) {
            throw new PersonLoadException("Person kann nicht eingelesen werden",e);
        }

    }
}
