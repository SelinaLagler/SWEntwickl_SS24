package file_IO.adressbuch;

public class AddressExportFileAlreadyExistsException extends Exception{
    public AddressExportFileAlreadyExistsException(String message) {
        super(message);
    }
}
