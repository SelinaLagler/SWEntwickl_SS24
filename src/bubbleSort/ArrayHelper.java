package bubbleSort;

import java.util.ArrayList;

public class ArrayHelper {
    public static void  arrangeOrder(int[] numbers){
        for (int i=0;i<numbers.length;i++){
            int help= 0;
            for (int y= i+1;y< numbers.length;y++){
                if (numbers[i]>numbers[y]){
                    help=numbers[y];
                    numbers[y]=numbers[i];
                    numbers[i]=help;
                }
            }
        }
    }
/* Erweiter im Nachgang nochmal anschauen --> you can't break the flow

   public static void  arrangeOrderObjekts(ArrayList<Car> car){
        for (int i=0;i<car.get(car.);i++){
            int help= 0;
            for (int y= i+1;y< numbers.length;y++){
                if (numbers[i]>numbers[y]){
                    help=numbers[y];
                    numbers[y]=numbers[i];
                    numbers[i]=help;
                }
            }
        }
    }*/
}
