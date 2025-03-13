package Java_General.Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final public class Employee {
    //made all fields as private
    private String name;
    private int age;
    private Address address;
    private List<String> phoneNumbers;
    private Map<String,String> metadata;

    //made all arg constructor
    public Employee(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.metadata = metadata;
    }

    //only getters and no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // need to make a clone as it is a custom class
    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity());
    }

    // return a deep copy so that no can modify
    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", metadata=" + metadata +
                '}';
    }
}
