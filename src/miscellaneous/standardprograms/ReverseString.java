package miscellaneous.standardprograms;

public class ReverseString {
    public static void main(String[] args) {
        String test = "satyam";
        // two ways to reverse the string
        //1. using string builder
        String reversed = String.valueOf(new StringBuilder(test).reverse());
        System.out.println(reversed);

        //2. using two pointer method
        String reversed2 = ReverseString.reverseString(test);
        System.out.println(reversed2);
    }

    public static String reverseString(String str){
        char[] arr = str.toCharArray();
        int i = 0, j = str.length();
        while( i < j){
            char temp = arr[i];
            arr[i] = arr[j -1];
            arr[j -1] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
