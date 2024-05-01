package hangman;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) throws DataFileException {
        try {
            ArrayList<String> words = new DictionaryLoader().load();
            System.out.println(words);

            System.out.println();
            System.out.println("Sortiert: ");
            Collections.sort(words, new StringLenghtComparator());
            System.out.println(words);




        } catch (DataFileException e) {
            throw new RuntimeException(e);
        }
    }
}
