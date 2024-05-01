package file_IO.versuche;

import java.io.*;

public class test3out {
    public static void main(String[] args) {

        File file = new File("beispFolien.txt");

        try {
            FileOutputStream fos= new FileOutputStream(file);

            String outputtext = "Erste Zeile \nzweite Zeile";

            for (char c : outputtext.toCharArray()){
                fos.write((int) c);
                System.out.print(c);
            }

            fos.close();
            fos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
