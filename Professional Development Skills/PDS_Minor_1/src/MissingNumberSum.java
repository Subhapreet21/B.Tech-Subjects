import java.util.Scanner;
public class MissingNumberSum {
    public static int findMissingNumber(int[] nums,int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int missingNumber = findMissingNumber(arr,n+1);
        System.out.println(missingNumber);
    }

}