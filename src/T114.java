import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-19
 */
public class T114 {

    class Solution {
        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }
            List<TreeNode> list = new LinkedList<>();
            solve(root, list);
            int size = list.size();
            for (int i = 0; i < size-1; i++) {
                TreeNode node = list.get(i);
                TreeNode next = list.get(i + 1);
                node.right = next;
                node.left = null;
            }
        }

        private void solve(TreeNode root, List<TreeNode> list) {
            if (root == null) {
                return;
            }

            list.add(root);
            solve(root.left, list);
            solve(root.right, list);
        }
    }
}
