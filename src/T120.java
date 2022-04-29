import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class T120 {

    // 存储计算结果
    private Map<String, Integer> results = new HashMap<>();

    public int minimumTotal(List<List<Integer>> triangle) {
        return cal(triangle, 0, 0);
    }

    private int cal(List<List<Integer>> triangle, int index, int column) {

        // 临界条件
        if (triangle.size() <= index) {
            return 0;
        }

        int currentValue = triangle.get(index).get(column);

        if (index == (triangle.size() - 1)) {
            return currentValue;
        }

        int a = 0;
        int b = 0;

        // 判断是否已经计算过
        if (!results.containsKey((index + 1) + ":" + column)) {
            // 递归调用(index+1, column)
            a = currentValue + cal(triangle, index + 1, column);
        } else {
            a = currentValue + results.get((index + 1) + ":" + column);
        }
        // 判断是否已经计算过
        if (!results.containsKey((index + 1) + ":" + (column+1))) {
            // 递归调用(index+1, column)
            b = currentValue + cal(triangle, index + 1, column + 1);
        } else {
            b = currentValue + results.get((index + 1) + ":" + (column+1));
        }
        // 比较，取最小值
        if (a <= b) {
            // 存入容器
            results.put(index + ":" + column, a);
            return a;
        } else {
            results.put(index + ":" + column, b);
            return b;
        }
    }

    @Test
    public void test27() {

        List<Integer> l1 = Arrays.asList(2);
        List<Integer> l2 = Arrays.asList(3, 4);
        List<Integer> l3 = Arrays.asList(6, 5, 7);
        List<Integer> l4 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> input = new ArrayList<>();
        input.add(l1);
        input.add(l2);
        input.add(l3);
        input.add(l4);
        int ret = minimumTotal(input);
        System.out.println(ret);
    }
}
