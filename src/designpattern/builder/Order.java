package designpattern.builder;

public class Order {
    private final String orderId;
    private final String customerName;
    private final String product;
    private final int quantity;
    private final double price;

    //making constructor private to enforce object creation via builder
    private Order(OrderBuilder builder) {
        this.orderId =builder.orderId;
        this.customerName = builder.customerName;
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.price = builder.price;
    }

    //static inner builder clas
    public static class OrderBuilder{
        private String orderId;
        private String customerName;
        private String product;
        private int quantity;
        private double price;

        public OrderBuilder orderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder customerName(String customerName){
            this.customerName = customerName;
            return this;
        }

        public OrderBuilder product(String product){
            this.product = product;
            return this;
        }

        public OrderBuilder quantity(int quantity){
            this.quantity = quantity;
            return  this;
        }

        public OrderBuilder price(int price){
            this.price = price;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
