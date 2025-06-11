import java.util.*;

public class MonkAndStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            HashSet<Long> candySet = new HashSet<>();
            for (int i = 0; i < N; i++) {
                long candy = scanner.nextLong();
                candySet.add(candy);
            }
            for (int i = 0; i < M; i++) {
                long newCandy = scanner.nextLong();
                if (candySet.contains(newCandy)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}