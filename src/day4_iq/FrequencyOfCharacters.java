package day4_iq;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChars(String str) {
        int counter;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i) + "" + counter;
            }
        }
        return result;
    }

    public static Map<Character, Integer> frequencyOfCharacters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }else{
                //this is the first time we are seeing this char, it is not in the map yet
                map.put(key, 1);
            }
        }
        return map;
    }
    

    public static void main(String[] args) {

        System.out.println(FrequencyOfCharacters.frequencyOfChars("AAABBCDD"));
        System.out.println(FrequencyOfCharacters.frequencyOfCharacters("AAABBCDD"));

    }
}
