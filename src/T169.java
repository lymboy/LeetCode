import java.util.Arrays;

/**
 * https://leetcode.cn/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
 * 169. 多数元素
 * 排序后多数元素必然在中间位置上
 */
public class T169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}