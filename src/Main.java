
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"satyam","chetan","satyam"};
        //remove the duplicates from array and return it in list
        List<String> result = Arrays.stream(arr)
                .distinct()
                .toList();
        System.out.println(result);

        String str = "abcd";
        //return bcde
        char[] arr2 = str.toCharArray();
        for(int i =0; i < str.length(); i++){
           arr2[i]++;
        }
        System.out.println(new String(arr2));

        //filter alternate prime numbe
    }
}