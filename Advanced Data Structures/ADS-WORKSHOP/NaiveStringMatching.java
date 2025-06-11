//public class NaiveStringMatching {
//    // Naive string-matching algorithm
//    public static void search(String text, String pattern) {
//        long startTime = System.currentTimeMillis(); // Record the start time
//        int n = text.length();
//        int m = pattern.length();
//        for (int i = 0; i <= n - m; i++) {
//            int j;
//
//            // Check for pattern match starting at position i in the text
//            for (j = 0; j < m; j++) {
//                if (text.charAt(i + j) != pattern.charAt(j)) {
//                    break; // Characters mismatch, move to the next position in the text
//                }
//            }
//
//            // If the inner loop completed without breaking (i.e., all characters matched)
//            if (j == m) {
//                System.out.println("Pattern found at index " + i);
//            }
//        }
//        long endTime = System.currentTimeMillis(); // Record the end time
//        long executionTime = endTime - startTime; // Calculate the execution time
//        System.out.println("Execution Time: " + executionTime + " milliseconds");
//    }
//    public static void main(String[] args) {
//        String text = "Data Structures using Java Programming";
//        String pattern = "Java";
//
//        System.out.println("Text: " + text);
//        System.out.println("Pattern: " + pattern);
//        System.out.println("Pattern Occurrences:");
//        search(text, pattern);
//    }
//}

// Java program for Naive Pattern Searching

public class NaiveStringMatching {

    static void search(String pat, String txt) {
        long startTime = System.currentTimeMillis(); // Record the start time

        int l1 = pat.length();
        int l2 = txt.length();

        for (int i = 0; i <= l1 - l2; i++) {
            if (pat.substring(i, i + l2).equals(txt)) {
                System.out.println("Pattern found at index " + i);
            }
        }

        long endTime = System.currentTimeMillis(); // Record the end time
        long executionTime = endTime - startTime; // Calculate the execution time
        System.out.println("Execution Time: " + executionTime + " milliseconds");
    }


    // Driver's code
    public static void main(String args[]) {
        String txt = "Data Structures using Java Programming";
        String pat = "Java";
        System.out.println("Text: " + txt);
        System.out.println("Pattern: " + pat);
        System.out.println("Pattern Occurrences:");

        // Function call
        search(pat, txt);
    }
}

