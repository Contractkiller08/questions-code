package exceptionhandling.Q1.unchecked;

public class Ecomapp {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        //it is up to us if we want to use try block and catch the unchecked exception
        // this will throw exception
        inventoryService.processOrder(150);

    }
}
