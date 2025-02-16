package exceptionhandling.Q1.checked;

public class PaymentException extends Exception{
    public PaymentException(String message) {
        super(message);
    }
}
