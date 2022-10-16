package day4_iq;

import java.util.Arrays;

public class Anagram {
    /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); ->
     */

    public static boolean isAnagram(String str1, String str2){

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        }


    public static void main(String[] args) {
        System.out.println(Anagram.isAnagram("abc", "cab"));
        System.out.println(Anagram.isAnagram("abc", "abb"));
    }


    }


