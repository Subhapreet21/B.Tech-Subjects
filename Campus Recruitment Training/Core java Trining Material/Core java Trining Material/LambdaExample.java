
public class LambdaExample {

    public static void main(String[] args) {
        // Use a lambda expression with Runnable to print a message
        Runnable printMessage = () -> {
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
        };
        printMessage.run();
    }
}
