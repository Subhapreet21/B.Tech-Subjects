import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static int[] findSecondLargestAndSmallest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }
        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = findSecondLargestAndSmallest(arr);
        System.out.println("Second Largest: " + result[0]);
        System.out.println("Second Smallest: " + result[1]);
    }
} 