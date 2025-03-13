package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Base {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("satyam",24);
        map.put("chetan",25);
        map.put(null ,null);

        //Iterate using entry set Most preferred
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key:" + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Iterate using key set
        //less preferred as it again needs to search
        for(String key: map.keySet()){
            System.out.println("key : " + key + ", Value: " + map.get(key));
        }

        //using for each
        map.forEach((key, value) -> System.out.println(key + " " + value));

        String str = "Satyam";
        Integer haha = str.hashCode();
        System.out.println(haha);

        Integer index = str.hashCode() & 15;
        System.out.println(index);
    }
}
