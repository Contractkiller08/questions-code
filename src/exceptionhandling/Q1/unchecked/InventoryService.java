package exceptionhandling.Q1.unchecked;

public class InventoryService {
    private int availableQuantity = 100;
    public void processOrder(int quantity){
        if(quantity > availableQuantity){
            throw new InsufficientInventoryException("Insufficient inventory");
        }

        //actual processing code goes here
    }
}
