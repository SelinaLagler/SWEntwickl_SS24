package einwohner;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class EinwohnerLogik implements Runnable{
    private Socket client;

    public EinwohnerLogik(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {


        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream())))
        {

            ArrayList<Einwohner> einwohners = new ArrayList<>();
            String clientInput;
            while ((clientInput=br.readLine())!=null) {
                EinwohnerManager einwohnerManager = new EinwohnerManager();


                if (clientInput.startsWith("GET")) {
                    ArrayList<Einwohner> ew = new ArrayList<>();
                    String[] splidi = br.readLine().split(" ");
                    for (Einwohner einwohner: ew){
                        if (einwohner.getBundesland()==splidi[1]){
                            bw.write(einwohner.toString());

                        }if (einwohner.getGeburtsjahr()==Integer.parseInt(splidi[1])){

                            bw.write(einwohner.toString());

                        }
                    }

                }else if (clientInput.equalsIgnoreCase("EXIT")){
                    bw.write("Auf Wiedersehen! ");
                    break;
                }else {bw.write("Bitte commando erneut eingeben:");
                }

                bw.newLine();
                bw.flush();



            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }private ArrayList<Einwohner> getByBundesland(String bundesland, ArrayList<Einwohner> einwohners) {
        ArrayList<Einwohner> einwohnerFiltered = new ArrayList<>();
        for (Einwohner einwohner : einwohners) {
            if (einwohner.getBundesland().equalsIgnoreCase(bundesland)) {
                einwohnerFiltered.add(einwohner);
            }
        }
        return einwohnerFiltered;
    }

    private ArrayList<Einwohner> getByGeburtsjahr(int geburtsjahr, ArrayList<Einwohner> einwohners) {
        ArrayList<Einwohner> einwohnerFiltered = new ArrayList<>();
        for (Einwohner einwohner : einwohners) {
            if (einwohner.getGeburtsjahr() == geburtsjahr) {
                einwohnerFiltered.add(einwohner);
            }
        }
        // sortiere nach natürlicher Ordnung (compareTo in Einwohner Klasse)
        Collections.sort(einwohnerFiltered);
        return einwohnerFiltered;
    }
}
