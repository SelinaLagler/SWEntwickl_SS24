package file_IO.versuche;

import java.io.*;

public class test6 {
    public static void main(String[] args) {
        File f = new File("output.txt");
        try (FileReader fl = new FileReader(f)) {

            BufferedReader br =new BufferedReader(fl);
            String readlinee;
            while ((readlinee = br.readLine()) !=null){
                System.out.println(readlinee);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
