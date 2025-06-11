public class StringMatchingComparison {

    // Naive string-matching algorithm
    public static void naiveSearch(String text, String pattern) {
        long startTime = System.currentTimeMillis();

        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Check for pattern match starting at position i in the text
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Characters mismatch, move to the next position in the text
                }
            }

            // If the inner loop completed without breaking (i.e., all characters matched)
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Naive Search Time: " + (endTime - startTime) + " milliseconds");
    }

    // KMP pattern searching algorithm
    public static void kmpSearch(String text, String pattern) {
        long startTime = System.currentTimeMillis();

        int M = pattern.length();
        int N = text.length();

        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0; // index for pattern

        // Preprocess the pattern (calculate lps[]
        // array)
        computeLPSArray(pattern, M, lps);

        int i = 0; // index for text
        while ((N - i) >= (M - j)) {
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("KMP Search Time: " + (endTime - startTime) + " milliseconds");
    }

    // Preprocess the pattern for KMP algorithm
    private static void computeLPSArray(String pat, int M, int lps[]) {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        String text = "Data Structures using Java Programming";
        String pattern = "Java";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);

        System.out.println("Pattern Occurrences (Naive Search):");
        naiveSearch(text, pattern);

        System.out.println("Pattern Occurrences (KMP Search):");
        kmpSearch(text, pattern);
    }
}
