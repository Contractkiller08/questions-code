package java8.Q2;

@FunctionalInterface
interface Supplier<T>{
    T get();
}
public class SupplierEx {
    public static void main(String[] args) {
        // using a supplier to generate random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        double randomNumber = randomNumberSupplier.get();
        System.out.printf("%.2f%n",randomNumber);
    }
}
