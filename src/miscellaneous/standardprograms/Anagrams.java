package miscellaneous.standardprograms;

import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String st1,String st2){
        if( st1 == null || st2 == null || st1.length() != st2.length()) return false;

        char[] arr1 = st1.toLowerCase().toCharArray();
        char[] arr2 = st2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static boolean isAnagram2(String st1,String st2){
        if( st1 == null || st2 == null || st1.length() != st2.length()) return false;

        char[] arr1 = st1.toLowerCase().toCharArray();
        char[] arr2 = st2.toLowerCase().toCharArray();

        int[] count = new int[26];

        for(int i=0;i<st1.length();i++){
            count[arr1[i] - 'a']++;
            count[arr2[i] - 'a']--;
        }
        return Arrays.stream(count).allMatch(i -> i ==0);
    }
    public static void main(String[] args) {
        String word1 = "Listen";
        String word2 = "silent";
        System.out.println(Anagrams.isAnagram(word1,word2));
    }
}
