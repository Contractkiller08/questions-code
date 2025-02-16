package miscellaneous.streammedium;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        //Q1. Find list of students whose name starts with A
        List<Student> ls = list.stream()
                .filter(s -> s.getFirstName().startsWith("A"))
                .toList();
        ls.forEach(System.out::println);

        //Q2. Group the students by department names
        Map<String, List<Student>> mapData = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName));
        System.out.println(mapData);

        //Q3. find the total count of student using stream
        int count = (int) list.stream()
                .mapToLong(Student::getId)
                .count();
        System.out.println(count);

        //or
        long count2 = list.stream().count();
        System.out.println(count2);


        //Q4. find the max age of student
        OptionalInt max = list.stream()
                .mapToInt(Student::getAge)
                .max();
        System.out.println(max.getAsInt());

        //Q5. Find all the department names
        List<String> lst = list.stream()
                .map(Student::getDepartmentName)
                .distinct()
                .toList();
        System.out.println(lst);

        //Q6. Find the count in each department
        Map<String,Long> mapSt = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        mapSt.forEach((key,value) -> System.out.println(key + ":" + value));

        //Q7. Find the list of students whose age is less than 30
        List<Student> listOfSt = list.stream()
                .filter( i -> i.getAge() < 30)
                .toList();
        System.out.println(listOfSt);

        // find the list of names whose age is < 30
        List<String> names = list.stream()
                .filter(i -> i.getAge() < 30)
                .map(Student::getFirstName)
                .toList();
        System.out.println(names);

        // Q8. Find the list of students rank btw 50 and 100
        List<Student> rank = list.stream()
                .filter( st -> st.getRank() > 30 & st.getRank() < 100)
                .toList();

        rank.forEach( st -> System.out.println( st.getFirstName() + ":" + st.getRank()));

        //Q9. find average age of male and female

    }
}
