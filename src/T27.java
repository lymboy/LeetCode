import lombok.SneakyThrows;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-04-28
 */
public class T27 {
    public int removeElement(int[] nums, int val) {

        int len = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                len++;
            }
            i++;
        }
        i = 0;
        int l = 0;
        int r = nums.length - 1;
        while ((i++) < len) {
            while ((l < nums.length) && nums[l] != val ) {
                l++;
            }
            while ((r < nums.length) && nums[r] == val) {
                r--;
            }

            if (l < r) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }
        }
        return len;
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test37() {
        //int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] nums = {2};
        removeElement(nums, 3);

        Arrays.stream(nums).forEach(System.out::println);
    }
}
