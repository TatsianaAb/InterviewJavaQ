package day5_iq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortLettersAndNumbers {
    /*
    String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
Ex:
Input: "50DC1GCCCA098911"
OutPut: "CD015ACCCG011899"
     */

    public static String sortAlphanumericString(String input) {
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
            String[] chars = eachSub.split("");//splitting eachSub into separate chars
            //System.out.println(Arrays.toString(chars));
            Arrays.sort(chars);
            for (String eachChar : chars) {
                output += eachChar;
            }
        }
        return output;
    }
    public static void main(String[] args) {

        String sortedStr = SortLettersAndNumbers.sortAlphanumericString("DC501GCCCA098911");
        System.out.println(sortedStr);

        String sortedStr2 = SortLettersAndNumbers.sortAlphanumericString("CBA321FED654IHG987");
        System.out.println(sortedStr2);


    }



}







