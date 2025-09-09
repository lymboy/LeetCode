import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150
 * 128. 最长连续序列
 */
public class T128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int ans = 0;
        for (Integer x:set) {
            while (set.contains(x-1)) {
                continue;
            }
            int y=x+1;
            while (set.contains(y)) {
                y++;
            }
            ans = Math.max(ans, y-x);
        }
        return ans;
    }
}