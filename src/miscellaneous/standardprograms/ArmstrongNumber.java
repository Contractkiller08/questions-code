package miscellaneous.standardprograms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    write a java program to check if number is armstrong
    Eg - 153 is 1^3 + 5^3 + 3^3 = 153
 */
public class ArmstrongNumber {
    public static boolean checkForArmstrong(int n){
        int digit = String.valueOf(n).length();
        int sum = 0, temp =n;

        while(temp > 0){
            int lastDigit = temp % 10;
            sum += (int) Math.pow(lastDigit,digit);
            temp /= 10;
        }
        return sum == n;
    }

    @Test
    public void testArmstrongNumber(){
        assertTrue(ArmstrongNumber.checkForArmstrong(153),"true");
    }
}
