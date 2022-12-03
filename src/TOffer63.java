import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-23
 */
public class TOffer63 {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if ((prices[i]-minPrice) > maxProfit) {
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }

    @Test
    public void test24() {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
