/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-20
 */
public class TMianShi01 {

    public boolean isUnique(String astr) {
        int n = astr.length();
        if (n <= 1) {
            return true;
        }
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            int index = astr.charAt(i)-'a';
            arr[index]++;
            if (arr[index] > 1) {
                return false;
            }
        }
        return true;
    }
}
