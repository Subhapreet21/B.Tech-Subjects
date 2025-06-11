// Write a java program to check balance of parenthesis over {,},[,],(,)
// Example: Input: {[()]}  Output: Yes,      Input: {[(]])}}}}    Output: No

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{')
                        || (ch == ']' && top != '[')
                        || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println("Input: " + input1 + " Output: " + (isBalanced(input1) ? "Yes" : "No"));
    }
}
