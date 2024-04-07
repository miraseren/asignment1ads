/**
 * Checks if a string consists only of digits.
 *
 * @param s the input string to be checked
 * @return true if the string consists only of digits, false otherwise
 */
public class Digit {

    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) { // iterates over each character in the string by index
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false; // Ii any character is not a digit, return false
            }
        }
        return true; // if all characters are digits, return true
    }

    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123a12";

        System.out.println(isAllDigits(s1));
        System.out.println(isAllDigits(s2));
    }
}