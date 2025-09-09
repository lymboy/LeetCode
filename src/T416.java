/**
 * https://leetcode.cn/problems/partition-equal-subset-sum/description/
 * 416. 分割等和子集
 */
public class T416 {
    public boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        int sum = 0;
        for (int n:nums) {
            sum += n;
        }
        if (sum%2 == 1) {
            return false;
        }
        int half = sum/2;
        int[][]memo = new int[2][half+1];
        for (int i=0; i<=half; i++) {
            memo[0][i] = (i>=nums[0]) ?nums[0]:0;
        }
        for (int i=1; i<nums.length; i++) {
            for (int j=1; j<=half; j++) {
                memo[i % 2][j] = memo[(i-1) % 2][j];
                if (j >= nums[i]) {
                    memo[i % 2][j] = Math.max(memo[i % 2][j], nums[i] + memo[(i-1) % 2][j - nums[i]]);
                }
            }
        }
        return memo[nums.length%2][half] == half;
    }
}