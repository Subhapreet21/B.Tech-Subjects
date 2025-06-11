import java.util.*;

public class RemoveDuplicatesFromSortedArray{
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        int index = 0;
        for (int num : uniqueElements) {
            nums[index++] = num;
        }
        return uniqueElements.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int newLength = removeDuplicates(nums);
        System.out.print(newLength+", nums="+Arrays.toString(nums));
    }
} 