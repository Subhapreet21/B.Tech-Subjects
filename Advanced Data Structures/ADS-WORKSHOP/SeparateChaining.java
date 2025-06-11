import java.util.LinkedList;

class HashTable1{
    private LinkedList<Integer>[] data;
    public HashTable1(int size) {
        data = new LinkedList[size];
        for(int i = 0; i < size; i++) {
            data[i] = new LinkedList<>();
        }
    }
    private int hash(int key) {
        return key % data.length;
    }
    public void put(int key) {
        int hashKey = hash(key);
        data[hashKey].add(key);
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
public class SeparateChaining {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashTable ht = new HashTable(10);
        ht.put(5);
        ht.put(15);
        ht.display();
    }

}
