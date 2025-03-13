package java8.Q5;

import java.util.*;
import java.util.stream.Collectors;

public class Primitives {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,12,34,25,67,23);

        int max = list.stream()
                .max(Integer::compareTo)
                .orElse(0);

        //converting to IntStream is better when we need to find max min or average and dealing with primitives
        int max2 = list.stream()
                .mapToInt(i->i)
                .max()
                .orElse(0);

        System.out.println(max2);

        int min = list.stream()
                .mapToInt(i->i)
                .min()
                .orElse(0);
        System.out.println(min);

        OptionalDouble average = list.stream()
                .mapToDouble(i->i)
                .average();
        System.out.printf("%.2f\n",average.getAsDouble());

        int sum = list.stream()
                .reduce(0,(a,b) -> a +b);
        System.out.println(sum);

        //return a list with each number with its square
        List<Integer> list3 = list.stream()
                .map(i -> (int)Math.pow(i,2))
                .toList();


        int[] nums = {12,345,45,56,767,1};
        int sum2 = Arrays.stream(nums)
                .sum();
        System.out.println(sum2);



















    }
}
