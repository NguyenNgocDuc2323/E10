package Exception;

public class NotFoundCustomerNameException  extends RuntimeException{
    public NotFoundCustomerNameException(){
        super();
    }
    public NotFoundCustomerNameException(String message){
        super(message);
    }
    public NotFoundCustomerNameException(String message, Throwable cause){
        super(message, cause);
    }
}
