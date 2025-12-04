
import java.util.*;

public class ArrayList2 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
        int sum = l.stream().filter(i -> i % 2 == 0).reduce(0, (i, c) -> i + c);
        System.out.println(sum);
    }
}
