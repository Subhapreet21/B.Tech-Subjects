import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueueProblem {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = s.nextInt();
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++){
            pq.add(s.nextInt());
            if (i<2){
                System.out.println("Priority Queue: "+pq);
                System.out.println(-1);
            }
            else{
                System.out.println("Priority Queue: "+pq);
                int m1=pq.poll();
                int m2=pq.poll();
                int m3=pq.poll();
                System.out.println("Product of the first three largest numbers in the priority queue: "+(m1*m2*m3));
                pq.add(m1);
                pq.add(m2);
                pq.add(m2);
            }
        }
//        int m1,m2,m3=0;
//        if (n<3){
//            System.out.println(-1);
//        }
//        else{
//            int m1=pq.poll();
//            int m2=pq.poll();
//            int m3=pq.poll();
//            System.out.println(m1*m2*m3);
//        }
//        while (!pq.isEmpty()){
//            if (n<3){
//                System.out.println(-1);
////                pq.poll();
////                break;
//            }
//            else{
//                int m1=pq.poll();
//                int m2=pq.poll();
//                int m3=pq.poll();
//                System.out.println(m1*m2*m3);
//            }
//        }

    }
}
