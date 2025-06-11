import java.util.Scanner;
public class CheckSortedArray {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        boolean ascending = isSorted(arr);
        if (ascending) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}