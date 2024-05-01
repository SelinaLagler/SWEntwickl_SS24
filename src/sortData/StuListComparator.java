package sortData;

import java.util.Comparator;

public class StuListComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int sortNr = o1.getLastName().compareTo(o2.getLastName());
        if (sortNr==0){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }return sortNr;

    }
}
