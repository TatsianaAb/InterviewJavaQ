package day2_iq;

import javax.sound.midi.Soundbank;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        /*
        Write a program that can print numbers between 1 ~ 100 that can be divisible by 3, 5, and 15
        Divisible by 15: divisible by  3, 5, 15
        Divisible by 3: divisible by 3, but not 15
        Divisible by 5: divisible by 5, but not 15
         */
        String result3 = "";
        String result5 = "";
        String result15 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                result15 += i + " ";
            } else if (i % 3 == 0 && !(i % 15 == 0)) {
                result3 += i + " ";
            } else if (i % 5 == 0 && !(i % 15 == 0)) {
                result5 += i + " ";
            }
        }
        System.out.print("Divisible by 3: " + result3);
        System.out.print("\nDivisible by 5: " + result5);
        System.out.print("\nDivisible by 15: " + result15);
    }
}
