
public class Factorial {

    public static int calc(int n) {
        if (n >= 1) {
            return n * calc(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
