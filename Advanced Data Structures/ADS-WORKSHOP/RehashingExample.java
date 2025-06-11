import java.util.Arrays;
import java.util.LinkedList;

class HashTable4 {
    private LinkedList<Integer>[] data;
    private int size; // Number of elements in the hash table
    private static final double LOAD_FACTOR_THRESHOLD = 0.7; // Load factor threshold for rehashing

    public HashTable4(int initialCapacity) {
        data = new LinkedList[initialCapacity];
        for (int i = 0; i < initialCapacity; i++) {
            data[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hash(int key) {
        return key % data.length;
    }

    public void put(int key) {
        int hashKey = hash(key);
        data[hashKey].add(key);
        size++;

        // Check if rehashing is needed
        if ((double) size / data.length >= LOAD_FACTOR_THRESHOLD) {
            rehash();
        }
    }

    private void rehash() {
        int newSize = data.length * 2;
        LinkedList<Integer>[] newData = new LinkedList[newSize];
        for (int i = 0; i < newSize; i++) {
            newData[i] = new LinkedList<>();
        }

        // Reinsert all elements into the new array
        for (LinkedList<Integer> list : data) {
            for (int key : list) {
                int hashKey = key % newSize;
                newData[hashKey].add(key);
            }
        }

        data = newData;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Index " + i + ": ");
            for (int j : data[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class RehashingExample {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(5);
        ht.put(15);
        ht.put(25);
        ht.put(35);
        ht.put(45);
        ht.put(55);
        ht.put(65);
        ht.put(75);
        ht.put(85);
        ht.put(95);
        ht.put(105); // Trigger rehashing

        ht.display();
    }
}
