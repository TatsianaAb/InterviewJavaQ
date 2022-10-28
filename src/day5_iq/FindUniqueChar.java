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

    public static String uniqueChars(String str){


        String result = "";

        for(int i =0; i<= str.length()-1; i++){//0

            char ch = str.charAt(i); //A A A B B B C C C D E F
                                     //0 1 2 3 4 5 6 7 8 9 1011
            boolean isUnique =  str.indexOf(ch) == str.lastIndexOf(ch); //true
            //  if the first and last index numbers of the character are same , then the character is unique

            if(isUnique){ // if the character is unique
                result += ch;
            }

        }

        return result;
    }



    public static void main(String[] args) {
        System.out.println(FindUniqueChar.findUniqueChars("AAABBBCCCDEF"));


        System.out.println(FindUniqueChar.uniqueChars("AAABBBCCCDRT"));
    }


}
