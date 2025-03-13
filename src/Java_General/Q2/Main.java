package Java_General.Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("7","Atlanta");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("27391319");
        Map<String,String> metadata = new HashMap<>();
        metadata.put("Hobby","watching movies");
        Employee e = new Employee("Satyam",24,address,phoneNumbers,metadata);
        System.out.println(e);

        e.getPhoneNumbers().add("2472642");
        e.getMetadata().remove("Hobby");
        System.out.println(e);
    }
}
