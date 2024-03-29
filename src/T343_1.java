import org.junit.Test;

public class T343_1 {

    public int integerBreak(int n) {
        int[] memo = new int[n+1];
        for (int i=2; i<=n; i++) {
            for (int j = 1; j <= i - j; j++) {
                memo[i] = max3(memo[i], j*(i-j), j*memo[i-j]);
            }
        }
        return memo[n];
    }

    private int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    @Test
    public void test18() {
        int n = 10;
        System.out.println(integerBreak(n));
    }
}
