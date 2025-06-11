
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        int prefix = 0;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        for (final int num : nums) {
            prefix += num;
            ans += count.getOrDefault(prefix - k, 0);
            count.merge(prefix, 1, Integer::sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int num2[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(subarraySum(num2, k));
    }
}
