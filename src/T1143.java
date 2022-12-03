/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-13
 */
public class T1143 {

    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int m = text1.length();
            int n = text2.length();

            int[][] LCS = new int[m+1][n+1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (text1.charAt(i-1) == text2.charAt(j-1)) {
                        LCS[i][j] = LCS[i - 1][j - 1] + 1;
                    } else {
                        LCS[i][j] = Math.max(LCS[i][j - 1], LCS[i - 1][j]);
                    }
                }
            }
            return LCS[m][n];
        }
    }
}

