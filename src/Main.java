
import java.lang.invoke.CallSite;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Integer> x = a -> (int) Math.pow(a,2);
        int result  = x.apply(9);
        System.out.println(result);

        BiFunction<Integer,Integer,Integer> sum = (a,b) -> a + b;
        System.out.println(sum.apply(2,3));

        List<String> list = Arrays.asList("Shraddha","Satyam","rahul","Racecar");

        List<String> list2 = list.stream()
                .filter( str -> String.valueOf(new StringBuilder(str).reverse()).equalsIgnoreCase(str))
                .peek(System.out::println)
                .toList();
        list2.forEach(System.out::println);

        var i = 12.5;
        System.out.println(i);
    }
}