public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int a=20;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        int c = i.intValue();
        int d = j;
        System.out.println(a+" "+i+" "+j);
    }
}