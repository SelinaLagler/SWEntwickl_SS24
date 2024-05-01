package exceptions.raumschiff;

public class Transporter {



    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException{
        if ((urgent) && (Math.random() < 0.5)){
            throw new TransporterMalfunctionException("Beamen kann nicht ausgeführt werden");
        }else System.out.println(person+" wurde von "+from+" nach "+to+" gebeamt.");

    }

    public void shutdown(){
        System.out.println("Shutdown wird durchgeführt!");
    }
}
