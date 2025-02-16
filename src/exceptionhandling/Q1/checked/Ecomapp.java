package exceptionhandling.Q1.checked;

/*
    This should be unchecked exception. This is a programming error. This example is just
    to show code of checked exception. More appropriate checked exception can be when we are
    making a call to external API gateway and we are expecting a failure.
 */
public class Ecomapp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        //here caller must catch the exception if not use throws keyword to propagate
        try{
            paymentService.processPayment(-100);
        }catch (PaymentException e){
            System.out.println("Payment failed" + e.getMessage());
            // we can write further logic
        }
    }
}
