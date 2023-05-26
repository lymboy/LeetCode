import lombok.SneakyThrows;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-05-26
 */
public class T283 {

    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (i < nums.length && j < nums.length) {
            while (i < nums.length && nums[i] != 0) {
                i++;
            }
            while (j < nums.length && nums[j] == 0) {
                j++;
            }
            if (i < j && j < nums.length) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
            j++;
        }
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test27() {
        int[] nums = {0, 1, 0, 3, 12};
        //int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);


    }
}
