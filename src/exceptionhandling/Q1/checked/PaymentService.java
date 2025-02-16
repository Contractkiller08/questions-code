package exceptionhandling.Q1.checked;

public class PaymentService {
    public void processPayment(double amount) throws PaymentException {
        if(amount <= 0){
            throw new PaymentException("Invalid payment amount" + amount);
        }

        //actual payment logic goes here
    }
}
