package exceptions.stack.exceptions;

public class StackFullException extends Exception{
    public StackFullException(String message) {
        super(message);
    }

    public StackFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
