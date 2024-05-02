package einwohner;

public class Einwohner implements Comparable<Einwohner>{
    private int ID;
    private String name;
    private String bundesland;
    private int geburtsjahr;

    public Einwohner(int ID, String name, String bundesland, int geburtsjahr) {
        this.ID = ID;
        this.name = name;
        this.bundesland = bundesland;
        this.geburtsjahr = geburtsjahr;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBundesland() {
        return bundesland;
    }

    public void setBundesland(String bundesland) {
        this.bundesland = bundesland;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    @Override
    public String toString() {
        return "Einwohner{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", bundesland='" + bundesland + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                '}';
    }

    @Override
    public int compareTo(Einwohner o) {
        int res = this.getName().compareTo(o.getName());
        if (res==0){
            return Integer.compare(this.getID(),o.getID());
        }return res;
    }
}
