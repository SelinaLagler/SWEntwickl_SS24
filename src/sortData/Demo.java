package sortData;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo  {

    public static void main(String[] args) {


        int[] arrayInt= {309,27,356,35,92,743,646,420,35};
        String[]arrayString= {"idkhf","oidh","dsikj","d9id","joaw"};
        Student [] studs = {new Student(88765,"aelina","austermann"),
        (new Student(8372,"Karin","Lagler"))};

        System.out.println("Normale Array's sortieren: ");
        System.out.println();
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        Arrays.sort(arrayString);
        for (String array : arrayString){
            System.out.print(array+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Objekte sortieren: ");
        System.out.println("Studenten nach matrNr ");
        System.out.println();
        Arrays.sort(studs);
        System.out.println(Arrays.toString(studs));

        System.out.println();
        System.out.println("2. Übung mit Blumen nach Blätter");

        Flowers flow1 = new Flowers(3,"M","green");
        Flowers flow2 = new Flowers(1,"T","yellow");
        Flowers flow3 = new Flowers(2,"XS","orange");

        Flowers [] flowersToGift = {flow1,flow2,flow3};
        Arrays.sort(flowersToGift);

        System.out.println(Arrays.toString(flowersToGift));
        System.out.println();

        System.out.println(" Lets try class Employee with Collections: ");
        System.out.println();
        Employee emp1 = new Employee(93826,"Sel","3938","Procurement");
        Employee emp2 = new Employee(93821,"Jaqs","3950","Dispatch");

        ArrayList<Employee> emplList = new ArrayList<>();
        emplList.add(emp1);
        emplList.add(emp2);
        Collections.sort(emplList);
        for (Employee e: emplList){
            System.out.println(e);
        }


        System.out.println("try to sort salary with Comparator class: ");
        Collections.sort(emplList, new EmployeeSalaryComparator());
        for (Employee e: emplList){
            System.out.println(e);
        }
        System.out.println( "End of Test Comparator");


    }


}
