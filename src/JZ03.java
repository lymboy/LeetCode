import org.junit.Test;

import java.util.Arrays;
import java.util.BitSet;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-17
 */
public class JZ03 {

    public int findRepeatNumber(int[] nums) {
        BitSet bs = new BitSet(nums.length);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            boolean b = bs.get(nums[i]);
            if (b) {
                return nums[i];
            } else {
                bs.set(nums[i]);
            }
        }
        return -1;
    }

    @Test
    public void test28() {

    }
}
