
public class Pattern3 {

    public static void pattern3(int N) {
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3(5);
    }
}
