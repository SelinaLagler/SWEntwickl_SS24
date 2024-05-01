package exceptions.raumschiff;

public class Starship {
    private String name;
    private Transporter transporter;

    public Starship(String name, Transporter transporter) {
        this.name = name;
        this.transporter = transporter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
    }

    @Override
    public String toString() {
        return "Starship{" +
                "name='" + name + '\'' +
                ", transporter=" + transporter +
                '}';
    }

    public void beamUp(String person, String from){
        try {
            transporter.beam(person,from,name,true);
        } catch (TransporterMalfunctionException e) {
            System.out.println("beam-Vorgang fehlgeschlagen");
        }finally {
            transporter.shutdown();
        }
    }
}
