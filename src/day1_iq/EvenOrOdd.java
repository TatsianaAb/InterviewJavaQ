package day1_iq;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
    }
}
/*
1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */