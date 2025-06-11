

public class SimpleVowelWords {

    public static boolean isVowelWord(String word) {
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        return isVowel(first) && isVowel(last);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        int[] results = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            int count = 0;
            for (int i = start; i <= end; i++) {
                if (isVowelWord(words[i])) {
                    count++;
                }
            }
            results[q] = count;
        }
        for (int result : results) {
            System.out.println(result);
        }
    }
}
