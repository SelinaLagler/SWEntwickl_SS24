package hangman;

import java.util.Comparator;

public class StringLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int comp = ((Integer)o1.length()).compareTo(o2.length());
        if (comp ==0){
            comp =o1.compareTo(o2);
        }return comp;
    }
}
