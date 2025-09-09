import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/insert-interval/?envType=study-plan-v2&envId=top-interview-150
 * 57. 插入区间
 */
public class T57_v2 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int len = intervals.length;

        while (i < len && intervals[i][1] < newInterval[0]) { // 当前遍历的是蓝左边的，不重叠的区间
            res.add(intervals[i]);
            i++;
        }

        while (i < len && intervals[i][0] <= newInterval[1]) { // 当前遍历是有重叠的区间
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // 左端取较小者，更新给兰区间的左端
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // 右端取较大者，更新给兰区间的右端
            i++;
        }
        res.add(newInterval); // 循环结束后，兰区间为合并后的区间，推入res

        while (i < len) { // 在蓝右边，没重叠的区间
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}