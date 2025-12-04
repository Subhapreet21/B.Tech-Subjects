
public class StringFunctions {

    public static void main(String[] args) {
        // Create a sample string
        String str = "Hello, World! 123";

        // 1. toUpperCase()
        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + str.toUpperCase());

        // 2. toLowerCase()
        System.out.println("\nLowercase String: " + str.toLowerCase());

        // 3. substring()
        System.out.println("\nSubstring from index 7 to 12: " + str.substring(7, 12));

        // 4. indexOf()
        System.out.println("\nIndex of 'World' in the string: " + str.indexOf("World"));

        // 5. lastIndexOf()
        System.out.println("\nLast Index of 'World' in the string: " + str.lastIndexOf("World"));

        // 6. replace()
        System.out.println("\nString after replacing all occurrences of '123' with '#': " + str.replace("123",
                "#"));

        // 7. split()
        String[] words = str.split("\\s+"); // Split by one or more whitespace characters
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // 8. contains()
        System.out.println("\nString contains 'Hello': " + str.contains("Hello"));

        // 9. startsWith() and endsWith()
        System.out.println("\nString starts with 'H' and ends with '!': " + str.startsWith("H") + ", " + str.endsWith("!"));
    }
}
