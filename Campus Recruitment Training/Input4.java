
import java.io.Console;

public class Input4 {

    public static void main(String[] args) {
        Console c = System.console();
        if (c == null) {
            System.out.println("No console available");
            return;
        }
        String username = c.readLine("Enter your usename: ");
        char[] password = c.readPassword("Enter your password"); // No echo
        System.out.println("Username: " + username);
    }
}
