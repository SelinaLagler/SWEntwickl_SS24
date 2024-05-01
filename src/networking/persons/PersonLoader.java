package networking.persons;

import java.io.*;
import java.util.ArrayList;

public class PersonLoader {

    private String path;

    public PersonLoader(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<Person> load() throws PersonLoadException {
        File f =new File(getPath());

        ArrayList<Person> persons = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(f))){

            String line;
            while ((line = br.readLine())!=null){
                String [] data= line.split(";");

                int id = Integer.parseInt(data[0]);
                String fistname = data[1];
                String lastname = data[2];

                Person p = new Person(id,fistname,lastname);
                persons.add(p);
            }



        } catch (FileNotFoundException e) {
            throw new PersonLoadException("File nicht existierend",e);
        } catch (IOException e) {
            throw new PersonLoadException("Can not read file ",e);
        }
        return persons;
    }
}
