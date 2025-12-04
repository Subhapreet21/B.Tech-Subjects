
import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3, 2, 15, 5, 6, 11, 13);
        int sum = 0;
        for (Integer i : l) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
