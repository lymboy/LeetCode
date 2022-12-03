import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-17
 */
public class T739 {

    @Test
    public void test12() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] arr = new Solution().dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(arr));
    }

    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] res = new int[n];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                    res[stack.peek()] = i-stack.pop();
                }
                stack.push(i);
            }
            return res;
        }
    }
}
