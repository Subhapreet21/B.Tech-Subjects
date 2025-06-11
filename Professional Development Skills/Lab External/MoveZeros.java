// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array of N number of integer values. The task is to find the empty packets (0) of chocolate and push it to the end of the conveyor belt (array).          1<=N<=10^5
// Example:  Input: N=8 and A=[4,5,0,1,9,0,5,0]. Output: A=[4,5,1,9,5,0,0,0]

import java.util.*;
public class MoveZeros {
    public static void moveZerosToEnd(int[] nums) {
        int n = nums.length;
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
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
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}