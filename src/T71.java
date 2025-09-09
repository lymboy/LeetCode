import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * https://leetcode.cn/problems/simplify-path/?envType=study-plan-v2&envId=top-interview-150
 * 71. 简化路径
 */
public class T71 {
    public String simplifyPath(String path) {
        String[] splits = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : splits) {
            if (s.equals("..")) {
                if (stack.size() >= 1) {
                    stack.pop();
                    continue;
                }
            } else if (s.equals(".")) {
                continue;
            } else if (s.equals("")) {
                continue;
            } else {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new T71().simplifyPath("/../");
    }
}