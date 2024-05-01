package abstract_Klassen;

import java.util.ArrayList;

public class Nature {

    private ArrayList<animal> animals;

    public Nature() {
        animals= new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Nature{" +
                "animals=" + animals +
                '}';
    }

    public void addAnimal(animal a){
        animals.add(a);
    }
    public int countColor (String color){
        int counter = 0;
        for (animal a:animals){
            if (a.getColor().equals(color)){
                counter++;
            }
        }return counter;
    }
}
