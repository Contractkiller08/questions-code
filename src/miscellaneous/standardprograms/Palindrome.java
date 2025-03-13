package miscellaneous.standardprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Palindrome {
    public static String reverseStr(String string){
        char[] arr = string.toCharArray();
        int i =0, j = string.length();
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j-1];
            arr[j-1] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        //two ways to check if string is palindrome or not
        String text = "abba";
        String result = String.valueOf(new StringBuilder(text).reverse());
        System.out.println(text.equals(result));

        //using two pointer method
        String newStr = Palindrome.reverseStr(text);
        System.out.println(text.equals(newStr));

        // 1 stream question. given a list of string find the length of max palindrome

        List<String> list = Arrays.asList("abc","abba","asdsagd");
        String max_length = list.stream()
                .filter(str -> str !=null && !str.isEmpty())
                .filter(str -> String.valueOf(new StringBuilder(str).reverse()).equals(str))
                .max(Comparator.comparing(String::length))
                .orElse("default");
        System.out.println(max_length);

    }
}
