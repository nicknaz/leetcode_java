package Easy.ValidParentheses;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("([)]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (parentheses.size() == 0 || parentheses.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (parentheses.size() == 0 || parentheses.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (parentheses.size() == 0 || parentheses.pop() != '[')
                        return false;
                    break;
                default:
                    parentheses.push(s.charAt(i));
                    break;
            }
        }

        if (parentheses.size() != 0)
            return false;

        return true;

    }

}
