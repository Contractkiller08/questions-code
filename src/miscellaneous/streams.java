package miscellaneous;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class streams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Satyam","Chetan","Vibhor","Satyam");
        List<Integer> list2 = Arrays.asList(21,1,34,45,32,67,88,75,464);
        List<Person> list3 = Arrays.asList(new Person(12),new Person(14),new Person(16));

        //find the sum of all elements in list
        int sum = list2.stream()
                .reduce(0, (x,y) -> x + y);
        System.out.println(sum);

        // find average
        OptionalDouble average = list2.stream()
                .mapToDouble(i -> i)
                .average();
        System.out.println(average.isPresent() ? String.format("%.2f",average.getAsDouble()) : "No Data");

        //return average age of list of persons
        double averageAge = list3.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(averageAge);

        //given a list of string find the frequency of each word
        Map<String, Long> wordFrequency = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        wordFrequency.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
