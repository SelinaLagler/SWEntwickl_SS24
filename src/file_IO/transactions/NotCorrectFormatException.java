package file_IO.transactions;

public class NotCorrectFormatException extends Exception{
    public NotCorrectFormatException(String message) {
        super(message);
    }

    public NotCorrectFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
