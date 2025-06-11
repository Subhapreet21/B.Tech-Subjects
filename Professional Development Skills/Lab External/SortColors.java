// Given an array containing integers 0, 1, and 2 represent colors red, white, and blue, respectively, sort the array in-place such that objects of the same color are adjacent, and the colors appear in the order red, white, and blue.
// Example: Input: nums = [2,0,2,1,1,0]                Output: [0,0,1,1,2,2]

import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 2) {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
