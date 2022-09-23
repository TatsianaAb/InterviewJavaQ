package day1_iq;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter dividend:");
        int dividend = scan.nextInt();

        System.out.println("Enter divisor:");
        int divisor = scan.nextInt();

        System.out.println(divide(dividend,divisor));

    }



    public static int divide(int dividend, int divisor)
    {
        // handle divisibility by 0
        if (divisor == 0)
        {
            System.out.printf("Error!! Divisible by 0");
            System.exit(1);
        }

        // store sign of the result
        int sign = 1;
        if (dividend * divisor < 0) {//4*-2 =-8
            sign = -1;
        }

        // convert both dividend and divisor to positive
        dividend = Math.abs(dividend);//-4
        divisor = Math.abs(divisor);//-2

        // initialize quotient by 0
        int quotient = 0;

        // loop till dividend `x` becomes less than divisor `y`
        while (dividend >= divisor)//4/2   4-2 2-2 0
        {
            dividend = dividend - divisor;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }

        System.out.println("The remainder is " + dividend);
        return sign * quotient;
    }
}

