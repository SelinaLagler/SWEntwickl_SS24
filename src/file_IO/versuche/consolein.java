package file_IO.versuche;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class consolein {
    public static void main(String[] args) {
        int c;

        try (BufferedOutputStream fos= new BufferedOutputStream(new FileOutputStream("beistpFolien.txt"))){

            while ((c = System.in.read()) != 'x'){
                fos.write(c);
            }
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
