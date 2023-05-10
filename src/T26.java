import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-05-10
 */
public class T26 {

    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (i <= j && j < nums.length) {
            while (j < nums.length && nums[i] == nums[j] && i != j) {
                nums[j] = Integer.MIN_VALUE;
                j++;
            }
            while (i < j && nums[i] != Integer.MIN_VALUE) {
                i++;
            }
            if (j < nums.length) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        return nums[i] == Integer.MIN_VALUE ? i : i + 1;
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test30() {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int[] nums = {1,2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
}
