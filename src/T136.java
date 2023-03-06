import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-05
 */
public class T136 {

    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> memo = new HashMap<>();
        for (int num : nums) {
            if (memo.containsKey(num)) {
                memo.remove(num);
            } else {
                memo.put(num, true);
            }
        }
        // 按照题意，最后只会剩下一个元素
        return memo.keySet().iterator().next();
    }


    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
