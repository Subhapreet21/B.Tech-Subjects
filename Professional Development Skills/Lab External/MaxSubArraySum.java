// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// Example:  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]      Output: 6

import java.util.*;
public class MaxSubArraySum {
    public static int maxSum(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxSum(arr));
    }
}