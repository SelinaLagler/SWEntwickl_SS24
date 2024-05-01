package file_IO.transactions;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class TransDemo implements Serializable {

    public static void main(String[] args) {


        ArrayList<Transactions> transactions;

        {
            try {
                transactions = Transactionloader.loadTransactions("address.txt");

                Collections.sort(transactions, new PriceProductComparator());

                System.out.println(transactions);




            } catch (NotCorrectFormatException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
