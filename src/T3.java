import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-11
 */
public class T3 {

    public int lengthOfLongestSubstring(String s) {

        int len = s.length();

        // 特判
        if (len < 2) {
            return len;
        }

        int res = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < len; right++) {
            Character c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(c, right);
            res = Math.max(res, right - left + 1);
        }

        return res;
    }


    @Test
    public void test37() {
        lengthOfLongestSubstring("abcabcb");
    }
}
