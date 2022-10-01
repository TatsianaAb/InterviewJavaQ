package day2_iq;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {

        //Swap two variable values without using the third value

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number, x = ");
        int x = scan.nextInt();
        System.out.println("Enter your second number, y = ");
        int y = scan.nextInt();
        System.out.println("Numbers before swapping: x = " + x + ", y = " + y );
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Numbers after swapping: x = " + x + ", y = " + y );








    }
}
