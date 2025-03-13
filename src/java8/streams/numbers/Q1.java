package java8.streams.numbers;

import java.util.function.BiFunction;

/*
    Given two numbers find the sum using lambda function (TCS interview)
 */
public class Q1 {
    public static void main(String[] args) {
        // can use BiFunction to take two integer and return an integer
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a + b;
        int result = add.apply(12,12);
        System.out.println(result);
    }
}
