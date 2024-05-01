package exceptions.raumschiff;

public class Episode42Demo {

    public static void main(String[] args) {
        Transporter enterprise = new Transporter();
        try {
            enterprise.beam("Kirk","Riga IV","Enterprise",true);

        } catch (TransporterMalfunctionException e) {
            throw new RuntimeException(e);
        }
    }
}
