// Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
// Example: Input: Arr[]={7,4,8,2,9}         Output: 3     

import java.util.*;

public class CountGreaterElements {
    public static int countGreater(int[] arr) {
        int count = 0;  // To count the desired elements
        int maxSoFar = Integer.MIN_VALUE; // Initialize with the smallest possible value

        for (int num : arr) {
            if (num > maxSoFar) {
                count++;            // Increment the count
                maxSoFar = num;     // Update the maximum value
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = countGreater(arr);
        System.out.println("Output: " + result); // Output the result
    }
}
