package Day6_iq;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class SumOfDigitsInAString {
    /*
     2) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigitsInAString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each + "");
            }
        }
        return sum;
    }



    public static void main(String[] args) {

        System.out.println(SumOfDigitsInAString.sumOfDigitsInAString("A2B3C4"));



    }
}
