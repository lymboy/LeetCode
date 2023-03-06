import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-12
 */
public class T781 {

    public int beautySum(String s) {
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int[] arr = new int[26];
                int max = 0;
                int min = len;
                System.out.print(s.substring(i, j + 1));
                for (int k = i; k <= j; k++) {
                    int t = ++arr[s.charAt(k) - 'a'];
                    max = Math.max(max, t);
                }
                for (int k : arr) {
                    if (k != 0) {
                        min = Math.min(min, k);
                    }
                }
                System.out.print("\t--->\t");
                System.out.println(max + " " + min);
                res += (max - min);
            }
        }
        return res;
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test31() {
        String s = "aabcb";
        int i = beautySum(s);
        System.out.println(i);
    }
}
