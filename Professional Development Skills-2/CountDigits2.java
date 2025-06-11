
public class CountDigits2 {

    public static int countDigits(int n) {
        int count = (int) (Math.log10(n) + 1);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(202172112));
    }
}
