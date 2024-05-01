package file_IO.products;

public class ProductLoadException extends Exception {
    public ProductLoadException(String message) {
        super(message);
    }

    public ProductLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
