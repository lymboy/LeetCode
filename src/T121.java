/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-05
 */
public class T121 {

    public int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            min = Math.min(min, price);
            res = Math.max(price-min, res);
        }
        return res;
    }
}
