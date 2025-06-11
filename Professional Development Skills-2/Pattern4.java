
public class Pattern4 {

    public static void pattern4(int N) {
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4(5);
    }
}
