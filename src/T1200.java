import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-04
 */
public class T1200 {

    /**
     * 排序后使用一前一后两个指针
     * 1. 如果当前的两个数绝对差小于最小的绝对差清空之前的结果集并作为新结果添加到结果集中，同时右指针右移
     * 2. 如果当前的两个数绝对差等于最小的绝对差则添加到结果集中，同时左右指针同时右移
     * 3. 如果当前的两个数绝对差大于最小的绝对差则左指针右移（注意判断指针是否重叠）
     * @param arr
     * @return
     */
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int i=0, j=1;
        int absmin = Math.abs(arr[i]-arr[j]);
        while (i<j && j<arr.length) {
            int tmp = Math.abs(arr[i]-arr[j]);
            if (tmp > absmin) {
                i++;
                if (i == j) {
                    j++;
                }
            } else if (tmp < absmin) {
                absmin = tmp;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[j]));
                j++;
            } else {
                result.add(Arrays.asList(arr[i], arr[j]));
                j++;
                i++;
            }
        }

        return result;
    }

    @Test
    public void test37() {
        int []arr = {40,11,26,27,-20};
        List<List<Integer>> lists = minimumAbsDifference(arr);
        lists.forEach(n->{
            for (int i = 0; i < n.size(); i++) {
                System.out.print(n.get(i));
                System.out.print(" ");
            }
            System.out.println();
        });
    }
}
