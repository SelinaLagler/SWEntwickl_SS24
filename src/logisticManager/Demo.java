package logisticManager;

public class Demo {

    public static void main(String[] args) {
        Car c1 = new Car("BMW","black",5300.34);
        Car c2 =new Car("VW","grey",4000.0);
        Shirt s1 = new Shirt("Zara",150,"white");

        LogisticManager itemsToMove = new LogisticManager();
        itemsToMove.addMovable(c1);
        itemsToMove.addMovable(c2);
        itemsToMove.addMovable(s1);

        itemsToMove.moveAll("Graz");

        System.out.println();
        System.out.println("Update: ");
        System.out.println();

        itemsToMove.moveAll("St.Johann");
    }
}
