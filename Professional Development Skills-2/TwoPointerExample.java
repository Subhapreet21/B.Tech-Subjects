
public class TwoPointerExample {

    public static boolean twoSum(int[] arr, int target) {
        {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        boolean result = twoSum(arr, target);
        System.out.println("Result: " + result);
    }
}
