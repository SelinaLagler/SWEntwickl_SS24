package abstract_Klassen;

public class animalDemo {
    public static void main(String[] args) {
        Cat katze1 = new Cat("red",2,"Miauzi");
        Frog frosch1 = new Frog("green",3,"Fröschling");
        Frog f2= new Frog("green",2,"frischling");
        Frog f3 =new Frog("yellow",2,"Frechling");
        //interface probieren
        Fly firstfly = new Frog("green",2,"frogge");

        Nature tiere = new Nature();

        tiere.addAnimal(katze1);
        tiere.addAnimal(frosch1);
        tiere.addAnimal(f2);
        tiere.addAnimal(f3);
        tiere.addAnimal((animal) firstfly);

        System.out.println("test tiere ob Array ausgegeben wird: ");
        System.out.println(tiere);
        System.out.println("ende");

        System.out.println();

        System.out.println("Anzahl der Tiere mit der farbe grün: "+tiere.countColor("green"));


        System.out.println();

        System.out.println("Animals Auflistung: ");
        System.out.println();
        System.out.println("1.: "+katze1);
        katze1.makeNoise();
        katze1.walk();

        System.out.println();

        System.out.println("2.: "+frosch1);
        frosch1.makeNoise();
        frosch1.walk();

        System.out.println();

        System.out.println("3.: "+f2);
        f2.makeNoise();
        f2.walk();

        System.out.println();

        System.out.println("4.: "+f3);
        f3.makeNoise();
        f3.walk();

        System.out.println();

        // keine Ahnung was umcasten heißen soll ^^
        System.out.println();
        animal a = frosch1;
        System.out.println(a);
        a.makeNoise();
        a.walk();
        System.out.println();
       // System.out.println("Is frosch1 still existing? "+frosch1);

        //interface probieren


    }

}

