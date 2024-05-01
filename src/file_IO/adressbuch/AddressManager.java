package file_IO.adressbuch;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {

    private ArrayList<Address> addresses = new ArrayList<>();

    public void add(Address a){
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "AddressManager{" +
                "Addresses=" + addresses +
                '}';
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }
    public void loadFromCsv(String path, String separator) throws AddressLoadException,AddressLoadException{

        try (BufferedReader br =new BufferedReader(new FileReader(path))){

            String line;
            while ((line = br.readLine()) != null){
                String[] colums = line.split(separator);
                if (colums.length !=4) {
                    throw new AddressesWrongFormatExcpection("Error in line, != 4 colums: " + line);
                }
                Address a = new Address(colums[0],colums[1],colums[2],colums[3]);
                add(a);
            }


        } catch (IOException | AddressesWrongFormatExcpection e) {
            throw new AddressLoadException("Fehler beim Laden "+path);
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportFileAlreadyExistsException {

        File f = new File(path);

        if (f.exists()){
            throw  new AddressExportFileAlreadyExistsException("File existiert bereits");
        }
        try (BufferedWriter br =new BufferedWriter(new FileWriter(path))){

            for (Address a: addresses){
                String line = a.getFirstname()+separator+a.getLastname()+separator+a.getEmail()+separator+a.getMobilNumber();
                br.write(line);
                br.newLine();
            }
            br.flush();





            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
