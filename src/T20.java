import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-20
 */
public class T20 {

    static class Solution {

        static Map<Character, Character> map = new HashMap<>();

        static {
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');
        }

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c=='{' || c == '[') {
                    stack.push(c);
                } else {
                    if (!stack.empty() && map.get(c).equals(stack.peek())) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.empty();
        }
    }
}
