import java.util.Arrays;

import org.junit.Test;

public class T2563 {

    @Test
    public void test7() {
        // long res = new Solution222().countFairPairs(new int[] { 0,0,0,0,0,0 }, 0, 0);
        long res = new Solution222().countFairPairs(new int[] { 0,1,7,4,4,5 }, 3, 6);
        System.out.println(res);
    }
}

class Solution222 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;
        int r = nums.length - 1;
        int l = 0;
        while (l < r) {
            int t = nums[l] + nums[r];
            if (t >= lower && t <= upper) {
                if (nums[l] == 0) {
                    res += r - l ;
                    l++;
                } else {
                    res++;
                    r--;
                }
                continue;
            }
            if (t < lower) {
                l++;
                continue;
            }
            if (t > upper) {
                r--;
                continue;
            }
        }
        return res;
    }
}
