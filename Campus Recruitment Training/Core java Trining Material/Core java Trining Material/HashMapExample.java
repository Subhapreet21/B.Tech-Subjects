
import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(2, "Two");
        numbers.put(1, "One");
        numbers.put(4, "Four");
        numbers.put(3, "Three");
        numbers.put(6, "Six");
        numbers.put(5, "Five");
        System.out.println("Map: " + numbers);
        System.out.println("Keys: " + numbers.keySet());
        System.out.println("Values: " + numbers.values());
        System.out.println("Entries: " + numbers.entrySet());
        System.out.println("Removed Value: " + numbers.remove(2));
        //Traversing Map  
        Set set = numbers.entrySet();//Converting to Set so that we can traverse  
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry to print key and value separately  
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
