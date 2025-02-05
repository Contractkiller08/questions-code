package java8.Q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList
                (new Person("charu",32),new Person("satyam",26));

        // using comparable to sort the person object. we defined sorting method in class itself

        Collections.sort(persons);
        persons.forEach(System.out::println);

        // using comparator to compare on name and age or any field
        //here we can use Integer to compare since we are comparing int values
        Comparator<Person> byAge = (p1,p2) -> {
            return Integer.compare(p1.getAge(),p2.getAge());
        };

        // we can compare by name
        Comparator<Person> byName = (p1,p2) -> {
            return p1.getName().compareTo(p2.getName());
        };
        Collections.sort(persons,byName);
        persons.forEach(System.out::println);

    }
}
