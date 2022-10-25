package day5_iq;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortedAlphanumericString {

    public static void main(String[] args) {

        String input = "DC501GCCCA098911";

        ArrayList<String> subStr = new ArrayList<>();//we are creating ArrayList to store each sequence of characters or numbers in it

        int index = 0; // index for iteration

        while (index < input.length()) { //using while loop, because we do not know how long our string will be
            String str1 = ""; //creating String variable to store characters if they are letters
            while (index < input.length() && Character.isLetter(input.charAt(index))) { //going through the strings and verifying if character is letter
                str1 += input.charAt(index); //if it is letter, we add it to str1
                index++;//iterating until we hit a digit, when we have a digit, the loop exits
            }
            if (!str1.isEmpty()) { //if str1 is not empty, we add it to ArrayList subStr
                subStr.add(str1);
            }
            String str2 = ""; //creating String variable to store characters if they are digits
            while (index < input.length() && Character.isDigit(input.charAt(index))) { //going through the strings and verifying if character is digit
                str2 += input.charAt(index); //adding digit characters into str2
                index++; //iterating through the string until we hit a letter
            }
            if (!str2.isEmpty()) { //if str2 is not empty, we are adding it to the ArrayList subStr
                subStr.add(str2);
            }
        }
        System.out.println(subStr);

        String output = "";

        for (String eachSub : subStr) { //creating a loop to iterate through ArrayList subStr
            String[] chars = eachSub.split("");//adding separate chars of substrings into String []
            //System.out.println(Arrays.toString(chars));
            Arrays.sort(chars); // sorting chars
            for (String eachChar : chars) {
                output += eachChar;
            }
        }
        System.out.println(output);
    }







}
