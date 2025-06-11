
public class PalindromeOfNumber {

    public static boolean palindrome(int n) {
        int dup = n;
        int revNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNumber = (revNumber * 10) + lastDigit;
            n = n / 10;
        }
        if (dup == revNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 121121;
        if (palindrome(n)) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }
}
