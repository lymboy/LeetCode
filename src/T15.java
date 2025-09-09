import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class T15 {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }
        int s = 0;
        int e = nums.length-1;

        Arrays.sort(nums);
        if (nums[e] < 0 || nums[s] > 0) {
            return result;
        }

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        // List<Integer> list = Arrays.asList(nums).stream().map(Integer::valueOf);

        while (s < e) {
            int p = list.indexOf(-(list.get(s) + list.get(e)));
            if (p>=0 && p<nums.length && p!=s && p!= e) {
                result.add(Arrays.asList(nums[s], nums[p], nums[e]));
            }
            if (nums[s] + nums[e]<=0) {
                s++;
            } else if ((nums[s] + nums[e])>0) {
                e--;
            }
        }

        return result;
    }

    @Test
    public void test43() {
        int[] nums = Arrays.asList(-1,0,1,2,-1,-4).stream().mapToInt(Integer::intValue).toArray();
        System.out.println(threeSum(nums));
    }
    
}