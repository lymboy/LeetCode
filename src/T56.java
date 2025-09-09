import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-interview-150
 * 56. 合并区间
 */
public class T56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, (a, b)-> {
            return a[0]-b[0];
        });
        List<int[]> result = new ArrayList<>();
        for (int i=0; i<intervals.length; i++) {
            int L=intervals[i][0];
            int R=intervals[i][1];
            if (result.size() == 0 || result.get(result.size() - 1)[1] < L) {
                result.add(new int[]{L, R});
            } else {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], R);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}