package file_IO.versuche;

import java.io.*;

public class test1 {
    public static void main(String[] args) {

        String [] names = {"Selina","Karin","Chris","Simone"};


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("//Users//selinalagler//Desktop//Campus 02//Semester 2//Programmieren 2//output.txt"));

            writer.write("Hallo");
            writer.write("\nhere is another line \ntrying to put a 3rd line down there\nhere are Names stored in String 'names': \n");

            for (String name: names){
                writer.write("\n"+name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("//Users//selinalagler//Desktop//Campus 02//Semester 2//Programmieren 2//output.txt"))) {
            String line;
            while ((line= reader.readLine())  != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
