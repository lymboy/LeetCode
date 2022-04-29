
public class Bag01 {

    private int[][] memo;

    /**
     * n个物品放进容量为C的背包，使得价值最大
     * @param w 各个物品的重量
     * @param v 各个物品的价值
     * @param C 背包的总容量
     * @return
     */
    public int knapsack01(int[] w, int[] v, int C) {
        int n = w.length;

        /**
         * memo 是为了解决重叠子问题， (index, c) 组合可能会出现很多次
         * 初始化为-1表示这样的组合没出现过
         */
        memo = new int[n][C+1];
        for (int i=0; i<n; i++) {
            for (int j=0; j<C+1; j++) {
                memo[i][j] = -1;
            }
        }
        return bestValue(w, v, n-1, C);
    }

    /**
     * 用[0....index] 的物品填充容积为C的背包的最大价值
     * @param w
     * @param v
     * @param index
     * @param c
     * @return 最大价值
     */
    private int bestValue(int[] w, int[] v, int index, int c) {
        if (index < 0 || c <= 0) {
            return 0; 
        }
        if (memo[index][c] != -1) {
            return memo[index][c];
        }
        int res = bestValue(w, v, index-1, c);
        if (c >= w[index]) {
            res = Math.max(res, bestValue(w, v, index-1, c-w[index]));
        }
        memo[index][c] = res;
        return res;
    }

    public static void main(String[] args) {
        
    }
}