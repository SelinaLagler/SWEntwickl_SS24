package abstract_Klassen;

public abstract class animal implements Fly{

    private String color;
    private int countEyes;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public void setCountEyes(int countEyes) {
        this.countEyes = countEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public animal(String color, int countEyes, String name) {
        this.color = color;
        this.countEyes = countEyes;
        this.name = name;
    }
    @Override
    public String toString() {
        return "animal{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void walk();

    public abstract void makeNoise();
}
