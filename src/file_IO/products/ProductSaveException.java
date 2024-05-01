package file_IO.products;

public class ProductSaveException extends Exception {
    public ProductSaveException(String message) {
        super(message);
    }

    public ProductSaveException(String message, Throwable cause) {
        super(message, cause);
    }
}
