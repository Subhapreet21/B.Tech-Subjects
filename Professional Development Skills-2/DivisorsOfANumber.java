
import java.util.Arrays;

public class DivisorsOfANumber {

    public static int[] printDivisors(int n) {
        int[] divisors = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[count++] = i;
            }
        }
        // size[0]=count;
        return divisors;
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(Arrays.toString(printDivisors(n)));
    }
}
