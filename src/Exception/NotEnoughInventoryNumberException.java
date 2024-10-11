package Exception;

public class NotEnoughInventoryNumberException extends RuntimeException {
    public NotEnoughInventoryNumberException() {
        super();
    }
    public NotEnoughInventoryNumberException(String message) {
        super(message);
    }
    public NotEnoughInventoryNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
