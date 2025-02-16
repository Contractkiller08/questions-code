package java8.Q1;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList
                (new Person("charu",32),new Person("satyam",28));

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

        // scenario - lets say we have to sort by age and if age is same sort by name.
        Comparator<Person> byAgeAndThenName = Comparator
                .comparing(Person::getAge)
                .thenComparing(Person::getName);

        //lambda implementation of above
        Comparator<Person> xx = (p1,p2) ->{
            int ageComp = Integer.compare(p1.getAge(),p2.getAge());
            if( ageComp ==0){
                return p1.getName().compareTo(p2.getName());
            }
            return ageComp;
        };
    }
}
