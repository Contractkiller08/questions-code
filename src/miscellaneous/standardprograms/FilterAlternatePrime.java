package miscellaneous.standardprograms;

import java.util.List;
import java.util.stream.IntStream;

/*
    given a number between 1 and 100 print alternate primes
 */
public class FilterAlternatePrime {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count =0;
        for(int i =2;i<=100;i++){
            if(isPrime(i)) {
                if (count % 2 == 0) {
                    System.out.printf(i + " ");
                }
                count++;
            }
        }

    }
}
