package abstract_Klassen;

public class Cat extends animal{
    public Cat(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }


    @Override
    public void walk() {
        System.out.println("A Cat walks on her 4 paws.");
    }

    @Override
    public void makeNoise() {
        System.out.println(" A cat 'MIAAAUUUS' continuesly" );
    }

    @Override
    public void fly() {
        System.out.println("the cat is flying");
    }
}
