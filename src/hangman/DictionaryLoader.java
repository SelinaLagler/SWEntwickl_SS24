package hangman;

import java.io.*;
import java.util.ArrayList;

public class DictionaryLoader {

    public ArrayList<String> load() throws DataFileException {

        ArrayList<String> result = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(
                new FileReader("hangmantxt"))){
            String line;
            while ((line=br.readLine())!=null){
                result.add(line);
            }return result;

        } catch (IOException e) {
            throw new DataFileException("Fehler beim einlesen",e);
        }


    }
}
