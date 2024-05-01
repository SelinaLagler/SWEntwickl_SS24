package file_IO.versuche;

import java.io.*;

public class consolein2 {

    public static void main(String[] args) {

        int c;

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("consolein.txt"))){

            while (( c =System.in.read())!='x'){
                bos.write(c);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
