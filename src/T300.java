import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-13
 */
public class T300 {

    @Test
    public void test9() {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(new Solution().lengthOfLIS(nums));
    }

    class Solution {
        public int lengthOfLIS(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }

            int res = 1;
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = 1;
                for (int j = 0; j <= i; j++) {
                    if (nums[j] < nums[i]) {
                        p[i] = Math.max(p[i], p[j] + 1);
                        if (p[i] > res) {
                            res = p[i];
                        }
                    }
                }
            }
            return res;
        }
    }
}