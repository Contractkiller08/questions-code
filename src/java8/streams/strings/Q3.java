package java8.streams.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        String test = "this is test";
        //output = "thiS iS tesT"
        String result = Arrays.stream(test.split(" "))
                .map(st -> {
                    String st2 = st.toLowerCase();
                    return st2.substring(0,st.length() -1) + Character.toUpperCase(st2.charAt(st.length() - 1));})
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
