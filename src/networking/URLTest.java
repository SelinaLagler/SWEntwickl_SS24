package networking;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://www.campus02.at/");

            BufferedReader br = new BufferedReader(new InputStreamReader(myUrl.openStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("urlCampus.txt"));

            String linee;

            while ((linee = br.readLine())!= null){

                System.out.println(br.readLine());
                bw.write(linee);
                bw.newLine();

            }

            bw.flush();



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
