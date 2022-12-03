import java.util.HashSet;
import java.util.Set;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-12
 */
public class T817 {


}
class Solution {
    /**
     * 因为题目说链表节点值是不重复的，所以可以用HashSet存储数组中元素，便于查询
     * flag 变量表示当前元素是否属于某个集合，true: 当前元素属于某个集合（组件）， false: 不属于某个集合（组件）
     * @param head
     * @param nums
     * @return
     */
    public int numComponents(ListNode head, int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        boolean flag = false;
        int ans = 0;
        while (head != null) {
            if (!set.contains(head.val)) {
                flag = false;
            }
            if (set.contains(head.val) && !flag) {
                ans++;
                flag = true;
            }

            head = head.next;
        }

        return ans;
    }
}