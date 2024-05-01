package exceptions.accout;

public class NotEnoughtMoneyExcpection extends Exception{
    public NotEnoughtMoneyExcpection(String message) {
        super("Nicht genug Geld am Konto");
    }
}
