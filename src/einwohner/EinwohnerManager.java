package einwohner;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class EinwohnerManager{

    public ArrayList<Einwohner>load() throws DataFileException {
        ArrayList<Einwohner>einwohners = new ArrayList<>();
        String path = "PersonenListe";

        try (BufferedReader br  = new BufferedReader(new FileReader(path))) {

            String line= "";
            br.readLine(); //für header zeile
            while ((line= br.readLine())!= null){
                 String[] personen = line.split(";");
                 int id = Integer.parseInt(personen[0]);
                 int gebjahr = Integer.parseInt(personen[3]);
                 Einwohner e = new Einwohner(id,personen[1],personen[2],gebjahr );
                 einwohners.add(e);

            }
            Collections.sort(einwohners, new EinwohnerComparator().reversed());
            return einwohners;

        } catch (FileNotFoundException e) {
            throw new DataFileException("Personen Liste kann nicht geladen werden: "+path,e);
        } catch (IOException e) {
            throw new DataFileException("Personen Liste kann nicht geladen werden: "+path,e);
        }


    }


}
