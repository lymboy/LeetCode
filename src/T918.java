/**
 * https://leetcode.cn/problems/maximum-sum-circular-subarray/description/?envType=study-plan-v2&envId=top-interview-150
 * 918. 环形子数组的最大和
 */
public class T918 {
    public int maxSubarraySumCircular(int[] nums) {
        int cur_max=nums[0];
        int cur_min=nums[0];
        int global_max=nums[0];
        int global_min=nums[0];
        int sum=nums[0];
        for (int i=0; i<nums.length; i++) {
            cur_max = Math.max(nums[i], cur_max+nums[i]);
            cur_min = Math.min(nums[i], cur_min+nums[i]);
            global_max = Math.max(cur_max, global_max);
            global_min = Math.min(cur_min, global_min);
            sum += nums[i];
        }
        return sum==global_min?global_max:Math.max(global_max, sum-global_min);
    }
}