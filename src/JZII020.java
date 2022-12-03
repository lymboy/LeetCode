import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @link https://leetcode.cn/problems/a7VOhD/
 * @since 2022-09-02
 */
public class JZII020 {

    Map<String, Integer> memo = new HashMap<>();

    public int countSubstrings(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }


        return 0;
    }

    private int f(String s, int left, int right) {
        String key = left + "" + right;
        if (left >= right) return 0;
        String t = s.substring(left, right);
        if (t.equals(new StringBuilder(t).reverse().toString())) {
            memo.put(key, 1);
        } else {
            int res = 0;
            for (int i=left; i<=right; i++) {
            }
        }

        return 0;
    }

    @Test
    public void test14() {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}
