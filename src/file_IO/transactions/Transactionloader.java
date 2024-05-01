package file_IO.transactions;

import java.io.*;
import java.util.ArrayList;

public class Transactionloader implements Serializable{

    public static ArrayList<Transactions> loadTransactions (String path)
            throws NotCorrectFormatException {

        File f = new File(path);


        try (BufferedReader br = new BufferedReader(new FileReader(f))){

            String lines;
            String line = br.readLine();  //header einlesen

            ArrayList<Transactions> transactions= new ArrayList<>();
            while ((lines= br.readLine()) != null){

                String[]coums = line.split(";");
                if (coums.length !=8){
                    throw new NotCorrectFormatException ("Fehler beim einlesen der Zeile: "+line);

                }

                double price = Double.parseDouble(coums[2]);

                Transactions transactions1 = new Transactions(coums[0],coums[1],price,coums[3],coums[4],coums[5],coums[6],coums[7] );

                transactions.add(transactions1);



            }
            br.close();

            return transactions;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotCorrectFormatException e) {
            throw new NotCorrectFormatException("Kann Zeile nicht einlesen -falsches Format");
        }
        return null;
    }
}
