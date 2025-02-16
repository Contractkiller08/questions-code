package java8.Q2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("satyam","chetan","charu");

        Consumer<String> printList = str -> System.out.println(str);
        //for each take a param of type consumer
        list.forEach(printList);
    }
}
