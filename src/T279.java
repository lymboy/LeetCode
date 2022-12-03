import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-07
 */
public class T279 {

    public int numSquares2(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }

    private HashMap<Integer, Integer> memo = new HashMap();
    public int numSquares(int n) {
        if (n <= 1) {
            return 1;
        }
        return f(n, 0);
    }

    private int f(int n, int k) {
        if (n == 0) {
            return k;
        }
        if (memo.containsKey(n)) {
            if (memo.get(n) < k) {
                return memo.get(n);
            }
            else {
                memo.remove(n);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            int tmp = i*i;
            if (n-tmp >= 0) {
                min = Math.min(min, f(n-tmp, k+1));
            }
        }
        memo.put(n, min);
        return min;
    }

    @Test
    public void test36() {

        System.out.println(numSquares2(4));

        //for (int i = 1; i < 10000; i++) {
        //    System.out.println(i + " --- " + numSquares2(i));
        //}
    }
}
