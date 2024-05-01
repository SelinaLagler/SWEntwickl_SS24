package bubbleSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] arrayToSort = {5,1,3,4};

        ArrayHelper.arrangeOrder(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        int[] arraToSort2 = {93,25,4736,62,27,547,25,1,43,75,46,7};

        //Mit Hilfsklasse
        //Arrays.sort(arraToSort2);

        ArrayHelper.arrangeOrder(arraToSort2);
        System.out.println(Arrays.toString(arraToSort2));
    }



}
