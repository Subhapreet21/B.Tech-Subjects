
public class Pattern5 {

    public static void pattern5(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5(5);
    }
}
