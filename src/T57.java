import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/insert-interval/?envType=study-plan-v2&envId=top-interview-150
 * 57. 插入区间
 */
public class T57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            if (newInterval.length == 0) {
                return new int[0][];
            }
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        int[][] result = new int[intervals.length+1][2];
        for (int i=0; i<intervals.length; i++) {
            result[i] = intervals[i];
        }
        result[intervals.length] = newInterval;
        return merge(result);
    }

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