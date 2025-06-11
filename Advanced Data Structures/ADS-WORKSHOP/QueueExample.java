import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
        Queue<Object> q = new LinkedList<>();
        q.offer(1);
        q.add(2);
        q.add("HELLO");
//        q.poll();
        System.out.println(q);
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
