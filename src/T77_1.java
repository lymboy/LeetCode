import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-04
 */
public class T77_1 {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        if (n < k) {
            return res;
        }

        f(n, 1, k, new LinkedList<>());

        return res;
    }

    void f(int n, int index, int k, LinkedList<Integer> current) {
        // 如果当前结果已经满足了k个数，就保存到最终结果集中
        if (k == current.size()) {
            res.add(current);
            return;
        }

        // 当遍历到第 index 个数时
        for (int i = index; i <= n-(k-current.size()) + 1; i++) {
            // 将这个数添加到结果末尾，继续递归
            current.addLast(i);
            f(n, i + 1, k, new LinkedList<>(current));
            current.removeLast();
        }

    }

    @Test
    public void test45() {
        combine(4, 2).forEach(System.out::println);
    }

}
