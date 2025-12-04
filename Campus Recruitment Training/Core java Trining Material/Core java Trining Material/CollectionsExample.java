
import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(2);
        Collections.sort(l);
        Iterator i = l.listIterator();
        while (i.hasNext()) {
            System.out.print(i.next());
        }
    }
}
