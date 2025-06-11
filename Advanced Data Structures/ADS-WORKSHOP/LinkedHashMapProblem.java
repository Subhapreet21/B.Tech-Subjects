import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapProblem {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array(followed by space): ");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for (int i =0;i<n;i++){
            int key = arr[i];
            if (!h.containsKey(key)){
                h.put(key,1);
            }
            else{
                int value = h.get(key);
                h.put(key,value+1);
            }
        }
        System.out.println(h);
        for (int i=0;i<n;i++){
            if (h.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
