import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-12
 */
public class T242 {

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            Map<Character, Integer> m1 = new HashMap<>();
            Map<Character, Integer> m2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (m1.containsKey(c)) {
                    m1.put(c, m1.get(c)+1);
                } else {
                    m1.put(c, 1);
                }
                c = t.charAt(i);
                if (m2.containsKey(c)) {
                    m2.put(c, m2.get(c)+1);
                } else {
                    m2.put(c, 1);
                }
            }
            return m1.equals(m2);
        }
    }
}
