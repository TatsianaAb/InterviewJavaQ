package day4_iq;

import java.sql.DataTruncation;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);//to get each char of the String
            if (!result.contains((each + ""))) {
                result += each;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicates.removeDuplicates("AAABBBCCCDDD"));
    }

}
