import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-13
 */
public class T50 {

    public double myPow(double x, int n) {

        if (n == 0) {
            return 1.0;
        }
        if (n == 1) {
            return x;
        }
        long N = n;
        if (N < 0) {
            N = -N;
        }

        double ans = myPow(x,  new Long(N/2).intValue());
        ans = ans*ans;
        if (N%2 != 0) {
            ans = x*ans;
        }

        return n>0?ans:1.0/ans;
    }

    @Test
    public void test20() {

        System.out.println(Integer.MIN_VALUE);
        //System.out.println(myPow(2.00000,-2147483648));
    }

    public double myPow2(double x, int n) {
        long N = n;
        if (N >= 0) {
            return quickMul(x, N);
        } else {
            return 1.0 / quickMul(x, -N);
        }
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    @Test
    public void test62() {
        int n = 5;
        while (n>=1) {
            System.out.println(n&1);
            n = n >> 1;
        }
    }

}
