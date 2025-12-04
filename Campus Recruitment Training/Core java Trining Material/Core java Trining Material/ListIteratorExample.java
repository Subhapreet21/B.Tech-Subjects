
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Forward Traversal:");
        forwardTraversal(list);

        System.out.println("\nBackward Traversal:");
        backwardTraversal(list);
    }

    /**
     * Performs a forward traversal of the list.
     *
     * @param list The list to traverse
     */
    public static void forwardTraversal(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    /**
     * Performs a backward traversal of the list.
     *
     * @param list The list to traverse
     */
    public static void backwardTraversal(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
