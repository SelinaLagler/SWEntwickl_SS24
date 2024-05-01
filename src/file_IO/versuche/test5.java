package file_IO.versuche;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test5 {

    public static void main(String[] args) {


        File file = new File("newfileforooutput.txt");

        try (
                FileOutputStream fos = new FileOutputStream(file)) {
            String outtext = "Hallo file";
            for (char c : outtext.toCharArray()){
                fos.write((int)c);
            }
            fos.flush();




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
