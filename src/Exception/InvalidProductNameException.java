package Exception;

public class InvalidProductNameException extends RuntimeException{
    public InvalidProductNameException(){
        super();
    }
    public InvalidProductNameException(String message){
        super(message);
    }
    public InvalidProductNameException(String message, Throwable cause){
        super(message, cause);
    }
}
