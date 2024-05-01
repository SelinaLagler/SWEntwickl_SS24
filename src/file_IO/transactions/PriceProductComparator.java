package file_IO.transactions;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class PriceProductComparator implements Comparator<Transactions> {


    @Override
    public int compare(Transactions o1, Transactions o2) {
        int erg = Double.compare(o1.getPrice(),o2.getPrice());
            if (erg==0){
                return o2.getProduct().compareTo(o1.getProduct());

            }return erg;
        }


}
