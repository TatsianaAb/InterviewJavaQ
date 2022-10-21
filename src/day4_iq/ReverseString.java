package day4_iq;

public class ReverseString {

    public static String reversString(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = ReverseString.reversString("Java is my life");
        System.out.println(str);
    }
}
