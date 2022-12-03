/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-23
 * @link <code>https://leetcode.cn/problems/merge-strings-alternately/</code>
 */
public class T1768 {

    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int n = Math.min(n1, n2);
        StringBuilder sb = new StringBuilder();
        int i=0;
        for ( ; i < n; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (i<n1) {
            sb.append(word1, i, n1);
        } else {
            sb.append(word2, i, n2);
        }
        return sb.toString();
    }
}
