import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-07
 */
public class T343_2 {

    public int integerBreak(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int max = -1;
        for (int i = 1; i < n; i++) {
            max = max3(max, i*(n-i), i*integerBreak(n-i));
        }
        return max;
    }

    private int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    @Test
    public void test20() {
        int n = 10 ;
        System.out.println(integerBreak(n));
    }
}
