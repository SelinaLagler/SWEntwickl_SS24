package file_IO.versuche;

import java.io.*;

public class test4 {

    public static void main(String[] args) {
        File f = new File("output.txt");
        try (FileInputStream fis = new FileInputStream(f)){
            BufferedInputStream bis= new BufferedInputStream(fis);

            int byteread;


            int counter= 0;
            while ((byteread = fis.read()) != -1){
                char []ch = Character.toChars(byteread);
                System.out.print(ch[0]);

                counter++;


            }
            System.out.println();
            System.out.println("counter = " + counter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
