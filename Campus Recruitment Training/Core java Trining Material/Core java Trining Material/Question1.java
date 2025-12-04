
public class Question1 {

    public static void testIfA() {
        if (testIfB("True")) {
            System.out.println("True");
        } else {
            System.out.println("Not True");
        }
    }

    public static Boolean testIfB(String str) {
        return Boolean.valueOf(str);
    }

    public static void main(String[] args) {
        testIfA();
        System.out.println(Boolean.valueOf("True"));
        System.out.println(Boolean.valueOf("true"));
    }
}
