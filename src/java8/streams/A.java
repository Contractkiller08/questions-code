package java8.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        String test = "this is test";
        //output = "thiS iS tesT"
        String result = Arrays.stream(test.split(" "))
                .map(st -> st.substring(0,st.length() -1) + String.valueOf(Character.toUpperCase(st.charAt(st.length() -1))))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
