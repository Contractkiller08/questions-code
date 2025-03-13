package java8.streams.strings;

import java.util.Arrays;
import java.util.List;

/*
    Find words that start and end with the same letter(case insensitive)
 */
public class Q4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("level","lol","medium","hehe",null,"");

        List<String> result = list.stream()
                .filter(str -> str != null && !str.isEmpty())
                .filter(str -> str.charAt(0) == str.charAt(str.length()-1))
                .toList();
        System.out.println(result);

        // consider scenario of case-sensitive
        List<String> list2 = Arrays.asList("Level","loL","mediuM","hehe");

        List<String> result2 = list2.stream()
                .filter( str -> {
                    String lc = str.toLowerCase();
                    return lc.charAt(0) == lc.charAt(str.length() - 1);
                })
                .toList();
        System.out.println(result2);
    }
}
