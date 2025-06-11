import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> l = new ArrayList<>();
//        ArrayList<String> l = new ArrayList<>();
        l.add("Apple");
        l.add("Banana");
        l.add("Orange");
        l.add(78);
        l.add(78.90);
        l.add('d');
        System.out.println("Element at index 0: "+l.get(0));
        System.out.println("Elements in the ArrayList:");
//        for (String item:l)
        for (Object item :l){
            System.out.println(item);
        }
        l.remove("Banana");
        System.out.println(l);
        System.out.println("Size of the ArrayList after removal: "+l.size());
    }
}
