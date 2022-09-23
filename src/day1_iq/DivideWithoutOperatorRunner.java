package day1_iq;

import java.util.Scanner;

public class DivideWithoutOperatorRunner {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter first number: ");
                int x = scan.nextInt();
                x = Math.abs(x);//-4 abs(-4) = 4

                System.out.println("Enter second number: ");
                int y = scan.nextInt();
                y = Math.abs(y);

                //10/2=5
                //10-2 = 8


                int count = 0;
                while (x>=y){
                    x=x-y;
                    count++;
                }

                System.out.println(count);
            }


        }
