import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-19
 */
public class T150 {

    @FunctionalInterface
    interface Func {
        int cal(int a, int b);
    }

   static Map<String, Func> map = new HashMap<>();
   static {
       map.put("+", (a, b) -> a+b);
       map.put("-", (a, b) -> a-b);
       map.put("*", (a, b) -> a*b);
       map.put("/", (a, b) -> a/b);
   }

    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();
        for (String token : tokens) {
            if (!map.containsKey(token)) {
                s.push(Integer.valueOf(token));
            } else {
                int b = s.pop();
                int a = s.pop();
                s.push(map.get(token).cal(a, b));
            }
        }
        return s.pop();
    }
}
