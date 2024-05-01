package exceptions.accout;

import java.util.HashMap;

public class Bank {

    private HashMap<String,Account> accounts;


    public Bank() {
        accounts= new HashMap<>();
    }

    public void addAccount(String owner, double balance, double overdraftFrame)throws BankException{
        if (accounts.containsKey(owner)){
            throw new BankException("Account existiert bereits");
        }else {
            Account account = new Account(owner, balance, overdraftFrame);
            accounts.put(owner,account);
        }
    }
    public void transfer(String fromOwner, String toOwner,double amount)throws  AccountNotFoundException,BankException{
        if (!accounts.containsKey(fromOwner) || !accounts.containsKey(toOwner)){
            throw new AccountNotFoundException("Kein Account mit diesen Namen gefunden!");
        }
        Account fromAccount = accounts.get(fromOwner);
        Account toAccount = accounts.get(toOwner);

        try {
            fromAccount.debit(amount);
            toAccount.credit(amount);
        } catch (NotEnoughtMoneyExcpection e) {
            throw new BankException("Transaktion nicht möglich");
        }
    }

}
