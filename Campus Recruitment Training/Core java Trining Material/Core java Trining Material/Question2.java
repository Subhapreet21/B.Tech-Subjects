
public class Question2 {

    public static String makingString() {
        String s = "Fred";
        s = s + "47";
        s = s.substring(2, 5);
        s = s.toUpperCase();
        return s.toString();
    }

    public static void main(String[] args) {
        makingString();
    }
}
