/**
 * https://leetcode.cn/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
 * 392. 判断子序列
 */
public class T392 {
    /**
     * @param s 子序列
     * @param t 原始的长字符序列
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int i=0;
        int j=0;
        while (i<lenS && j<lenT) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==lenS;
    }
}