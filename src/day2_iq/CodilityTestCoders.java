package day2_iq;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {
        /*
        Write a program that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
        Codility = if num is divisible by 2
        Test = if num is divisible by 3
        Coders = if num is divisible by 5
        If any number is divisible by more than one of the numbers above, concatenate strings.
      */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any number:");
        int num = scan.nextInt();

        while(num <= 0){
            System.err.println("Number can not be zero or negative number!");
            System.out.println("Please enter any number: ");
            num = scan.nextInt();
        }

        String by2 = "Codility";
        String by3 = "Test";
        String by5 = "Coders";


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(by2 + by3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(by2 + by5);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(by3 + by5);
            } else if (i % 2 == 0) {
                System.out.println(by2);
            } else if (i % 3 == 0) {
                System.out.println(by3);
            } else if (i % 5 == 0) {
                System.out.println(by5);
            } else {
                System.out.println(i);
            }
        }


    }
}
