package day1_iq;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Please enter your second number:");
        int num2 = scan.nextInt();

        int count = 0;
        if (num1 < num2) {
            System.out.println("Dividend can not be smaller than divisor");
        } else {
            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println(count + " with the remainder of " + num1);
        }



    }
}
/*
2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator

 */
