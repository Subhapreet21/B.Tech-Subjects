import java.util.*;
class HashTable{
    private int[] data;
    public HashTable(int size){
        data = new int[size];
        Arrays.fill(data,-1);
    }
    private int hash(int key){
        return key%data.length;
    }
    public void put(int key){
        int hashKey = hash(key);
        int index = hashKey;
        while (data[index]!=-1){
            index = (index+1)%data.length;
            if (index==hashKey){
                System.out.println("Hash table is full, unable to insert key: "+key);
                return;
            }
        }
        data[index]=key;
    }
    public void display(){
        for (int i=0;i<data.length;i++){
            System.out.println("Index "+i+": "+data[i]);
        }
    }
}
public class LinearProbing {
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
        ht.put(105);
        ht.display();
    }
}
