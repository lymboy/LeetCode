import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-08
 */
public class T91 {

    static class Solution {
        public int numDecodings(String s) {

            return f(s, 0, 1) + f(s, 0, 2);
        }

        private int f(String str, int start, int end) {
            if (start >= str.length() || end > str.length()) {
                return 0;
            }
            System.out.println("(" + start + ", " + end + ") ---- " + str.substring(start, end));
            int num = Integer.valueOf(str.substring(start, end));
            if (end == str.length() && (num >= 1 && num <= 26)) {
                return 1;
            }
            //if (num % 10 == 0) {
            //    return f(str, start + 1, start + 2) + f(str, start + 1, start + 3);
            //}
            if (str.charAt(start) == '0' || num > 26) {
                return f(str, start + 1, start + 2) + f(str, start + 1, start + 3);
            }
            return f(str, start + 1, start + 2) + f(str, start + 1, start + 3);
        }
    }

    @Test
    public void test22() {
        int n = new Solution().numDecodings("11106");
        System.out.println(n);
    }

    @Test
    public void test46() {
        System.out.println("11106".substring(0, 2));
    }
}
