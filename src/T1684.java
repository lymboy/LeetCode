/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-08
 */
public class T1684 {
    public int countConsistentStrings(String allowed, String[] words) {

        int res = 0;
        int[] memo = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            memo[allowed.charAt(i)-'a']++;
        }
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i)-'a';
                if (memo[index]==0) {
                    flag = false;
                }
            }
            if (flag) {
                res++;
            }
        }
        return res;
    }
}
