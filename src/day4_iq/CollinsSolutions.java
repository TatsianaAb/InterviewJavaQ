package day4_iq;

public class CollinsSolutions {

    public static int frequencyOfCharacter(String str, char ch) {
            int count = 0;
            for (char each : str.toCharArray()) { // each: represents each character of str
                if(each == ch){
                    count++;
                }
            }
            return count;
        }

        public static String removeDup(String str){ // "AABBBCC"
            String result = "";   //"ABB"

            for (char ch : str.toCharArray() ) { //{'A', 'A', 'B', 'B', 'B', 'C', 'C'}

                if( !result.contains( ""+ch)){  //result.indexOf(ch) < 0
                    // if the character is not contained in the result, then concate the character
                    result += ch;
                }
            }
            return result;
        }


    public static String frequencyOfChars(String str){
        String result = ""; //A3B2C4
        //str= AAABBCDD
        //removeDup()= ABCD
        //tocharArray() == {A,B,C,D}
        // //==ABCD  == A, B, C, D
        //A3
        //B2

        for (char each : CollinsSolutions.removeDup(str).toCharArray()) { // each: A, B C
            int frequency =  CollinsSolutions.frequencyOfCharacter(str, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(CollinsSolutions.frequencyOfCharacter("AAAAVBBVFF", 'A'));

        System.out.println(CollinsSolutions.frequencyOfChars("AAABBBCCDDEE"));

    }

    }





