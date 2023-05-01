package chapter10;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BracketChecker {

    public boolean isValidBrackets(String bracketString) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Deque<Character> stack = new LinkedList<>();
        for (char c : bracketString.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
