import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T46 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return ans;
        }

        func(nums, 0, new LinkedList<>());
        return ans;
    }

    private void func(int[] nums, int index, LinkedList<Integer> list) {
        if (index == nums.length) {
            ans.add(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.addLast(nums[i]);
                func(nums, index + 1, new LinkedList<>(list));
                list.removeLast();
            }

        }
    }

    public static void main(String[] args) {
        T46 t = new T46();
        t.permute(new int[] { 1, 2, 3, 4, 5, 6 });
        for (List<Integer> l : t.ans) {
            for (Integer i : l) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("总数量：" + t.ans.size());
    }
}
