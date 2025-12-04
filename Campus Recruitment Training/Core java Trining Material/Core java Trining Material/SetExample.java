
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set a = new HashSet();
        a.add("A");
        a.add("M");
        a.add("b");
        a.add(4);
        a.add(1);
        a.add(9);
        System.out.println(a);
        Set b = new LinkedHashSet<>();
        b.add("A");
        b.add("M");
        b.add("b");
        b.add(4);
        b.add(1);
        b.add(9);
        System.out.println(b);
        Set c = new TreeSet<>();
        c.add(1);
        c.add(2);
        c.add(4);
        c.add(4);
        c.add(1);
        c.add(9);
        System.out.println(c);
    }
}
