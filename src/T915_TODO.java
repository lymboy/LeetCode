import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-24
 */
public class T915_TODO {

    @Test
    public void test9() {
        int[] nums = {32,57,24,19,0,24,49,67,87,87};
        int i = partitionDisjoint(nums);
        System.out.println(i);
    }

    public int partitionDisjoint(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int tmp = nums[0];
        int index = 0;
        while (i < j) {
            while (i<j && nums[i]<=nums[index]) {
                i++;
            }
            while (i<j && nums[j]>=nums[index]) {
                j--;
            }
            index++;
        }
        return index;
    }

    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
