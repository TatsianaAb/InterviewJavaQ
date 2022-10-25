package day5_iq;

public class FindUniqueChar {
    /*
    String -- Find the unique
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String findUniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if(counter == 1){
                result += str.charAt(i);
        }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FindUniqueChar.findUniqueChars("AAABBBCCCDEF"));

    }


}
