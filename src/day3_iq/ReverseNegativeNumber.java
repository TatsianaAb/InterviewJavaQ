package day3_iq;

import java.util.Map;
import java.util.Scanner;

public class ReverseNegativeNumber {
    /*
    Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */

    public static int reverseNegativeNumber(int number) {
        number = number * -1;
        String numb = String.valueOf(number);
        String reverse = "";
        for (int i = numb.length() - 1; i >= 0; i--) {
            reverse += numb.charAt(i);
        }
        int result = Integer.parseInt(reverse);

        return result * -1;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a negative number to reverse: ");
        int num = scan.nextInt();
        while (num >= 0) {
            System.out.println("Please enter a negative number");
            num = scan.nextInt();
        }
        System.out.println(ReverseNegativeNumber.reverseNegativeNumber(num));

    }

}
