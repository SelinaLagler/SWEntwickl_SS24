package file_IO.versuche;

import java.io.*;

public class fileOutputStreamTest {

    public static void main(String[] args) {
        File f = new File("/Users/selinalagler/Desktop/Campus 02/Semester 2/Programmieren 2/output.txt");

        try (FileOutputStream fos = new FileOutputStream(f)){
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String outputText = "Hello File - I'll put something into you";
            for (char c : outputText.toCharArray()) {

                bos.write((int) c);
                System.out.print(c);

            }

            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
