import java.util.Arrays;

import org.junit.Test;

public class Bag01_1 {

    /**
     * n个物品放进容量为C的背包，使得价值最大
     * 
     * @param w 各个物品的重量
     * @param v 各个物品的价值
     * @param C 背包的总容量
     * @return
     */
    public int knapsack01(int[] w, int[] v, int C) {

        int n = w.length;
        int[][] values = new int[n][C+1];

        for (int i = 0; i <= C; i++) {
            values[0][i] = (i>=w[0]) ? v[0] : 0;
        }

        int value = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <=C; j++) {
                if ((j - w[i]) < 0) {
                    value = values[i - 1][j];
                } else {
                    value = v[i] + values[i - 1][j - w[i]];
                }
                values[i][j] = Math.max(values[i - 1][j], value);
            }
        }

        System.out.println(Arrays.deepToString(values));

        return values[n - 1][C];
    }

    @Test
    public void test28() {
        int[] w = { 1, 2, 3 };
        int[] v = { 6, 10, 12 };
        int C = 5;
        System.out.println(knapsack01(w, v, C));
    }
}
