package exceptions.accout;

public class BankDemo {

    public static void main(String[] args) throws BankException {




        Bank bank= new Bank();

        try {
            bank.addAccount("Selina",10000.30,1000.00);
            bank.addAccount("Karin",100,50);

            bank.transfer("Karin","Selina",100);
            bank.transfer("Karin","Selina",49);

       //     bank.addAccount("Karin",100,10);
        } catch (BankException | AccountNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
