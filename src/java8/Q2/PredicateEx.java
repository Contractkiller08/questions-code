package java8.Q2;

@FunctionalInterface
interface Predicate<T>{
    boolean test(T t);
}
public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> isEeven = i -> i % 2 == 0;
        System.out.println(isEeven.test(11));
    }
}
