
public class ReversingANumber {

    public static void reverseDigits(int n) {
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(revNum);
    }

    public static void main(String[] args) {
        reverseDigits(202172112);
    }
}
