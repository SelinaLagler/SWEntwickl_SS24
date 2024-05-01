package logisticManager;

import java.util.ArrayList;

public class LogisticManager{
   private ArrayList<Moveable> moveables;

    public LogisticManager() {
        moveables = new ArrayList<>();
    }

    public void addMovable (Moveable m){
        moveables.add(m);
    }
    public void moveAll(String destination){
        for (Moveable moveable:moveables){
            moveable.move(destination);
        }
    }

}
