package day3_iq;

public class PrimeNumber {

    /*
    Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber.isPrime(18));
    }
}

