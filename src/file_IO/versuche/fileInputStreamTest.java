package file_IO.versuche;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStreamTest {
    public static void main(String[] args) {
        File f = new File("/Users/selinalagler/Desktop/Campus 02/Semester 2/Programmieren 2/output.txt");
        try(FileInputStream fis = new FileInputStream(f)) {

            int charRead;
            int counter=0;
            while ((charRead = fis.read()) != -1){

                char []ch = Character.toChars(charRead);
                System.out.print(ch);
                counter++;



            }
            System.out.println("counter: "+counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
