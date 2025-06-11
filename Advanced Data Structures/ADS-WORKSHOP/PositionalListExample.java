import java.util.ArrayList;
interface PositionalList<E>{
    void insert(E element,int index);
    void remove(int index);
    void set(int index, E element);
    E get(int index);
    boolean isEmpty();
    int size();
}
class ArrayListPositionalList<E> implements PositionalList<E>{
    private final ArrayList<E> list;
    public ArrayListPositionalList(){
        list = new ArrayList<>();
    }
    @Override
    public void insert(E element, int index){
        list.add(index,element);
    }
    @Override
    public void remove(int index) {
        list.remove(index);
    }
    @Override
    public void set(int index, E element) {
        list.set(index,element);
    }
    @Override
    public E get(int index) {
        return list.get(index);
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public int size() {
        return list.size();
    }
}
public class PositionalListExample{
    public static void main(String[] args) {
//        PositionalList<String> l = new ArrayListPositionalList<>();
        PositionalList<Object> l=new ArrayListPositionalList<>();
        l.insert("a",0);
        l.insert("b",1);
        l.insert("c",2);
        l.insert(45,3);
        l.remove(1);
        l.set(0,"d");
//        String element = l.get(1);
        Object element = l.get(2);
        boolean empty = l.isEmpty();
        int size = l.size();
        System.out.println("List after operations:");
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("Is List empty?: "+empty);
        System.out.println("Size of the List: "+size);
        System.out.println("Element at index=2: "+element);
    }
}