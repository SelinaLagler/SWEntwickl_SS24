package file_IO.adressbuch;

public class AddressDemo {

    public static void main(String[] args) {
        Address a = new Address("Selina", "Lagler", "06644335149", "laglerselina@gmail.com");
        Address a2 = new Address("Karin", "Lagler", "066460826214", "karin.lagler@gmx.at");


        AddressManager addressManager = new AddressManager();

        addressManager.add(a);
        addressManager.add(a2);

        try {
            addressManager.loadFromCsv("address.txt",", ");


        } catch (AddressLoadException ex) {
            throw new RuntimeException(ex);
        }
    }

}
