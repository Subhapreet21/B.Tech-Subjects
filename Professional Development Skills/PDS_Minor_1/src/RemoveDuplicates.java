import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;
public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        int[] uniqueArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArray[i] = result.get(i);
        }
        return uniqueArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int[] uniqueArray = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }
}