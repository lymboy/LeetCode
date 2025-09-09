import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 力扣：三数之和
 * https://leetcode.cn/problems/3sum/
 */
public class T15_v2 {
    public List<List<Integer>> threeSum(int[] nums) {
/**
 *  双指针法
 */

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // 前置判断
        if (nums.length < 3) {
            return result;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 取相反数
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (target == sum) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 快速跳重复值
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 快速跳重复值
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // left++;
                    right--;
                }else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new T15_v2().threeSum(new int[] { -2, 0, 1, 1, 2 });
    }
}