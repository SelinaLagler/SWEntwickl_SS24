package hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Game {
    private char[] currentWord;
    private char[] foundWord;
    private int counter;

    public Game() {
        counter=0;
        loadWord();
    }



    public char[] getCurrentWord() {
        return currentWord;
    }

    public char[] getFoundWord() {
        return foundWord;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Game{" +
                "currentWord=" + Arrays.toString(currentWord) +
                ", foundWord=" + Arrays.toString(foundWord) +
                ", counter=" + counter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        return getCounter() == game.getCounter() && Arrays.equals(getCurrentWord(), game.getCurrentWord()) && Arrays.equals(getFoundWord(), game.getFoundWord());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCounter());
        result = 31 * result + Arrays.hashCode(getCurrentWord());
        result = 31 * result + Arrays.hashCode(getFoundWord());
        return result;
    }

    public void loadWord()  {
        DictionaryLoader dl = new DictionaryLoader();
        try {
            ArrayList<String> strings=dl.load();
            Collections.sort(strings, new StringLenghtComparator());
            if (counter>= strings.size()){
                counter=0;
            }
            String word = strings.get(counter);
            counter++;

            currentWord= word.toCharArray();

            foundWord = new char[currentWord.length];
            for (int i = 0; i< this.foundWord.length; i++){
                foundWord[i]='_';
            }


        } catch (DataFileException e) {
            e.printStackTrace();
        }

    }
    public String tryCharacter(char c){

        //char[] helper = new char[currentWord.length];
        for (int i = 0; i< currentWord.length;i++){
            if (c==currentWord[i]){
                foundWord[i]=currentWord[i];
            }

        }
        String s = String.copyValueOf(foundWord);
        return s;
    }
    public boolean isFinished() {
        String sfound = String.copyValueOf(foundWord);
        String scurrent = String.copyValueOf(currentWord);
        boolean finished = sfound.equals(scurrent);

        if (finished){
            loadWord();
        }return finished;
    }
}
