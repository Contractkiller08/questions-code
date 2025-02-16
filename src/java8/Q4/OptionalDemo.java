package java8.Q4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //will give NPE
        Student st = null;
        System.out.println(st.getAge());

        //To handle NPE optional was introduced
        Optional<Student> st2 = Optional.of(new Student("satyam",23,1));

        //don't try to get directly
        if(st2.isPresent()){
            Student st3 = st2.get();
            System.out.println(st3.getName());
        }

        // can throw exception as well
        Student st4 = st2.orElseThrow(() -> new RuntimeException("No student"));


        // Note scenario
        Optional<Student> student = Optional.ofNullable(null);
        System.out.println(student);

    }
}
