import java.util.*;
public class ReversingQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i=10;i<=100;i+=10){
            q.add(i);
        }
        System.out.println("Initial Queue: "+q);
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            s.push(q.poll());
        }
        System.out.println("Stack: "+s);
//        Queue<Integer> q1 = new ArrayDeque<>();
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println("Reversed Queue: "+q);
    }
}
