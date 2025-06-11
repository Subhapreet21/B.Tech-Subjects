import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
//        PriorityQueue<Object> pq = new PriorityQueue<Object>();
        PriorityQueue<Object> pq = new PriorityQueue<Object>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
