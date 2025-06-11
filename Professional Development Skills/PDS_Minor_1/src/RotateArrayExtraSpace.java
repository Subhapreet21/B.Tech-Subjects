import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayExtraSpace {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = rotatedArray[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
} 