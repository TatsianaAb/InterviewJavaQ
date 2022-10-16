package day4_iq;

public class FrequencyOfCharacters {
    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChars (String str){
        int counter=0;
        String result="";
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

    public static void main(String[] args) {

        System.out.println(FrequencyOfCharacters.frequencyOfChars("AAABBCDD"));


    }
}
