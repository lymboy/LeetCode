import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-08
 */
public class T27_TODO {

    public int removeElement(int[] nums, int val) {

        int len = nums.length;
        int l = 0;
        for (int num : nums) {
            if (num == val) {
                l++;
            }
        }
        int i = 0;
        int j = 0;
        while (i < l) {
            while (j < len) {
                if (val != nums[j]) {
                    j++;
                } else {
                    break;
                }
            }
            for (int k = j + 1; k < len; k++) {
                if (val == nums[k]) {
                    int tmp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = tmp;
                    break;
                }
            }
            i++;
        }
        return l;
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test40() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);
    }
}
