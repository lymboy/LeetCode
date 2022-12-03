import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-16
 */
public class T102 {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> list = new LinkedList<>();
            if (root == null) {
                return  list;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                LinkedList<Integer> p = new LinkedList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    p.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                list.add(p);
            }
            return list;
        }
    }
}
