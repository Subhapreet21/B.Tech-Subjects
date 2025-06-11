// Given an sorted integer array 'arr' of size 'n', remove the duplicates from the array such that each element appears only once. Return the length of this new array.
// Example: Input: 'n' = 5, 'arr' = [1 2 2 2 3].         Output: 3 

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
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
        System.out.print(newLength + ", nums=" + Arrays.toString(nums));
    }
}
