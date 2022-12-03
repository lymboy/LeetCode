import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-17
 */
public class T53 {


    @Test
    public void test9() {
        int t = new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(t);
    }

    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int[] dp = new int[n];
            dp[0] = nums[0];
            int max = nums[0];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
                max = Math.max(max, dp[i]);
            }
            return max;
        }
    }
}
