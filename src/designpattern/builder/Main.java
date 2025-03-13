package designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Order newOrder = new Order.OrderBuilder()
                .customerName("satyam")
                .orderId("1")
                .price(12)
                .product("car")
                .quantity(1)
                .build();
        System.out.println(newOrder);
    }
}
