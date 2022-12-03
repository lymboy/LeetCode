import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-03
 */
public class T46_1 {

    private List<List<Integer>> res = new LinkedList<>();


    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return res;
        }

        f(nums, 0, new LinkedList<>());

        return res;
    }

    void f(int[] nums, int index, LinkedList<Integer> current) {
        if (index == nums.length) {
            res.add(current);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!current.contains(nums[i])) {
                current.addLast(nums[i]);
                //f(nums, index + 1, new LinkedList<>(current));
                f(nums, index + 1, current);
                current.removeLast();
            }
        }
    }

    @Test
    public void test39() {
        permute(new int[]{1, 2, 3}).forEach(System.out::println);
    }
}
