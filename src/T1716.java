import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-06
 */
public class T1716 {

    public int totalMoney(int n) {
        int a = n / 7;
        int b = n % 7;
        return 28*a + 7*a*(a-1)/2 + b*(a+1+a+b)/2;
    }

    @Test
    public void test16() {
        System.out.println(totalMoney(26));
    }

}
