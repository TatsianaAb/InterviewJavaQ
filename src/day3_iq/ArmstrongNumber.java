package day3_iq;

public class ArmstrongNumber {
    /*
    Numbers -- Armstrong numbers
Write a method that can check if a number is
Armstrong number
     */

    public static boolean isArmstrong(int number) {
        int temp = number;
        int cubedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;//3   5   1
            cubedNumber = cubedNumber + (remainder * remainder * remainder); //27 + 125 + 1
            number = number / 10;
        }
        if (temp == cubedNumber) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        System.out.println(ArmstrongNumber.isArmstrong(154));
        }
    }





