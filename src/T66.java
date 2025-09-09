import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class T66 {
    public int[] plusOne(int[] digits) {
        Deque<Integer> stack = new ArrayDeque<>();
        int t = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            t = digits[i]+t;
            stack.push(t%10);
            t /= 10;
        }
        if (t > 0) {
            stack.push(t);
        }
        int i = 0;
        int[] result = new int[stack.size()];
        while (!stack.isEmpty()) {
            result[i++] = stack.pop();
        }
        return result;
    }
}