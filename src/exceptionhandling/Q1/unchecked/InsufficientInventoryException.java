package exceptionhandling.Q1.unchecked;

public class InsufficientInventoryException extends RuntimeException{
    public InsufficientInventoryException(String message) {
        super(message);
    }
}
