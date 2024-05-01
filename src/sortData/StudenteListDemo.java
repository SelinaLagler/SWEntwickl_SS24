package sortData;

import java.util.ArrayList;
import java.util.Collections;

public class StudenteListDemo {
    public static void main(String[] args) {
        Student anna = new Student(598233,"Anna","Maier");
        Student anna2 = new Student(4038957,"Anna","Maber");
        Student Selina = new Student(984375,"Selina","Lagler");
        Student michaela = new Student(493845,"Michaela","Maier");

        ArrayList<Student> students = new ArrayList<>();
        students.add(anna2);
        students.add(anna);
        students.add(Selina);
        students.add(michaela);

        Collections.sort(students, new StuListComparator());
        for (Student student:students){
            System.out.println(student);
        }

    }
}
