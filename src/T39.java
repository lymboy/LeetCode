import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-04
 */
public class T39 {

    List<List<Integer>> res = new LinkedList();
    Map<String, Integer> memo = new HashMap<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }

        Arrays.sort(candidates);
        f(candidates, target, 0, new LinkedList<>());

        return res;
    }

    void f(int[] candidates, int target, int start, LinkedList<Integer> current) {

        // 记忆化搜索，避免重复计算
        if (memo.containsKey(generateKey(current))) {
            return;
        }
        if (target == 0) {
            res.add(current);
            memo.put(generateKey(current), 0);
            return;
        }

        // 因为排序了，所以当当前的target比数组中最小的数还要小时可以认为没有满足的元素了，直接结束当前递归
        if (target < candidates[0]) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.addLast(candidates[i]);

            // start == i表示下次计算仍从i位置开始，因为条件要求可以有重复元素
            f(candidates, target - candidates[i], i, new LinkedList<>(current));
            // 因为i位置的元素已经计算过了，后面再也不会用到了，可以删除
            current.removeLast();
        }

    }

    // 计算key的辅助函数
    String generateKey(LinkedList<Integer> current) {
        current.sort((a, b) -> a - b);
        return current.toString();
    }

    @Test
    public void test47() {
        combinationSum(new int[]{1, 1, 1, 2}, 2).forEach(System.out::println);
    }
}
