package file_IO.versuche;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) {
        File file = new File("//Users//selinalagler//Desktop//Campus 02//Semester 2//Programmieren 2//test2File.txt");
        try  {
            FileInputStream fis = new FileInputStream(file);
            int byteRead;
            while ((byteRead=fis.read()) != -1){
                char[] ch = Character.toChars(byteRead);
                System.out.print(ch[0]);



            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
