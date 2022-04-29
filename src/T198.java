import org.junit.Test;

public class T198 {

    int[] memo = null;
    
    public int rob(int[] nums) {
        memo = new int[nums.length+2];
        return cal(nums, 0);
    }

    private int cal(int[] nums, int start) {
        if (start > (nums.length-1)) {
            return 0;
        }
        if (start == nums.length-1) {
            return nums[start];
        }
        if (memo[start] != 0) {
            return memo[start];
        }
        int res = -1;
        for (int i=start; i<nums.length; i++) {
            res = Math.max(res, nums[i]+cal(nums, i+2));
        }
        memo[start] = res;
        return res;
    }

    @Test
    public void test30() {
        // int[] nums = new int[]{2, 7, 9, 3, 1};
        int[] nums = new int[]{2, 1, 1, 2};
        System.out.println(rob(nums));
    }
}
