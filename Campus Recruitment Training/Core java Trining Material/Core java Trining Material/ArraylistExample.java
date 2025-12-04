
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l.addAll(1, l2);
        System.out.println(l.get(2));;
        l.set(3, 7);
        l.remove(1);
        Object[] arr = l.toArray();
        System.out.println(l.indexOf(2));
        System.out.println(l.lastIndexOf(2));
        System.out.println(l.subList(1, 3));
        Iterator i = l.listIterator(1);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (int it = 0; it < l.size(); it++) {
            System.out.println(l.get(it));
        }
        for (Object e : l) {
            System.out.println(e);
        }
    }
}
