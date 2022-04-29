import org.junit.Test;

public class T343 {

    int[] record = null;
    public int integerBreak(int n) {
        record = new int[n+1];
        return breakInteger(n);
    }

    private int breakInteger(int n) {
        if (n == 1) {
            return 1;
        }
        if (record[n] != 0) {
            return record[n];
        }

        int res = -1;
        for (int i=1; i<n; i++) {
            res = max3(res, i*(n-i), i*breakInteger(n-i));
        }
        record[n] = res;
        return res;
    }

    private int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    @Test
    public void test8() {
        int n = 10;
        System.out.println(integerBreak(n));
    }
}
