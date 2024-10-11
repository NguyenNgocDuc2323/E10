package Exception;

public class NotFoundCustomerIdException extends RuntimeException {
    public NotFoundCustomerIdException() {
        super();
    }
    public NotFoundCustomerIdException(String message) {
        super(message);
    }
    public NotFoundCustomerIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
