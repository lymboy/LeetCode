import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-07
 */
public class JZII119 {

    public int longestConsecutive(int[] nums) {
        if(nums == null  || nums.length == 0) {
            return 0;
        }
        return new UF(nums).getMaxSize();
    }

    @Test
    public void test16() {
        System.out.println(longestConsecutive(new int[]{0, 0, -1}));
    }

}

class UF {

    private Map<Integer, Integer> map = new HashMap<>();
    private Map<Integer, Integer> size = new HashMap<>();
    private int max = 1;

    UF(int[] nums) {
        Arrays.sort(nums);
        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }
            if (map.containsKey(num - 1)) {
                int parent = find(num-1);
                map.put(num, parent);
                if (max < size.get(parent) + 1) {
                    max = size.get(parent) + 1;
                }
                size.put(parent, size.get(parent) + 1);

            } else {
                map.put(num, num);
                size.put(num, 1);
            }
        }
    }

    public Integer find(Integer p) {
        while (p != null && !p.equals(map.get(p))) {
            p = map.get(p);
        }
        return p;
    }

    public Integer getMaxSize() {
        //Integer max = Integer.MIN_VALUE;
        //for (Map.Entry<Integer, Integer> entry : size.entrySet()) {
        //    if (max < entry.getValue()) {
        //        max = entry.getValue();
        //    }
        //}
        return max;
    }
}
