package abstract_Klassen;

public class Frog  extends animal{
    public Frog(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("The frog is hopping around.");
    }

    @Override
    public void makeNoise() {
        System.out.println( " He makes some 'QUAAAAK' noises");
    }

    @Override
    public void fly() {
        System.out.println("the frog is flying");
    }
}
