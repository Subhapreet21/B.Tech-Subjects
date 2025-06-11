import java.util.ArrayList;
import java.util.Scanner;
public class ArraysProblem {
    public static void main(String[] args) {
//        int[] nums={2,7,11,15};
//        int target=9;
//        ArrayList<Integer> r = new ArrayList<>();
//        for (int i=0;i< nums.length;i++){
//            for (int j=0;j< nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    r.add(i);
//                    r.add(j);
//                }
//            }
//            break;
//        }
//        System.out.println(r);

//        Alternative Solution
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= s.nextInt();
        int target=9;
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array(followed by space): ");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for (int i=0;i<n;i++){
            int c=0;
            for (int j=0;j<n;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("["+i+", "+j+"]");
                    c++;
                }
            }
            if (c>0){
                break;
            }
        }
    }
}
