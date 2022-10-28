package day5_iq;

public class Reverse {

    public static void main(String[] args) {


        String str = "AABCD";
        String reverse = "";
        for (int i = str.length()- 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

    }
}
