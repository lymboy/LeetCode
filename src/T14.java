/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-27
 */
public class T14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = 0;
        String s = String.valueOf(strs[0]);
        for (String str : strs) {
            while (!str.startsWith(s)) {
                if (s.length() == 0) return "";
                s = s.substring(0, s.length()-1);
            }
        }
        return s;
    }
}
