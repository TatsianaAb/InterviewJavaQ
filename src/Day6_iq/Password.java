package Day6_iq;

public class Password {
    /*
     1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
     */


    public static boolean verifyPassword(String password) {
        int totalChars = password.length();
        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;
        int countNegativeOrPlusSigns = 0;
        int countSpecial = 0;


        for (int i = 0; i < password.length(); i++) {
            Character each = password.charAt(i);
            if (Character.isUpperCase(each)) {
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else if (each.equals('-') || each.equals('+')) {
                countNegativeOrPlusSigns++;
            } else {
                countSpecial++;
            }
        }

        if (totalChars >= 6 && countUpper >= 1 && countLower >= 1 && countDigits >= 1 && countSpecial >= 1 && countNegativeOrPlusSigns == 0) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(Password.verifyPassword("Hello1234@"));
        System.out.println(Password.verifyPassword("123456"));
        System.out.println(Password.verifyPassword("hello"));
        System.out.println(Password.verifyPassword(""));
        System.out.println(Password.verifyPassword("-1#Hello"));
        System.out.println(Password.verifyPassword("+1234Hello&"));


    }
}

