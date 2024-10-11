package Exception;

public class NotFoundOrderIdException extends RuntimeException {
    public NotFoundOrderIdException() {
        super();
    }
    public NotFoundOrderIdException(String message) {
        super(message);
    }
    public NotFoundOrderIdException(String message,Throwable cause){
        super(message,cause);
    }
}
