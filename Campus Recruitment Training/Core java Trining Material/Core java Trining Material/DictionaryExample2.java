
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryExample2 {

    public static void main(String[] args) {
        Dictionary d = new Hashtable<>();
        d.put("101", "Ramesh");
        d.put("102", "Madhav");
        for (Enumeration e = d.elements(); e.hasMoreElements();) {
            System.out.println("Values in the dictionary: " + e.nextElement());
        }
    }
}
