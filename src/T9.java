/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class T9 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length-1;
        while (i<j) {
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}
