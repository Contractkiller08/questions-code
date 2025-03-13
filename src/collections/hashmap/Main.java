package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();

        Person p1 = new Person("satyam",12);
        Person p2 = new Person("satyam",12);
        map.put(p1,"Engineer");
        map.put(p2,"doctor");

        System.out.println(map.containsKey(p1));
        System.out.println(map.get(p1));

        for(Map.Entry<Person,String> entry: map.entrySet()){
            System.out.println(entry.getKey().getName() + " " + entry.getValue());
        }

    }
}
