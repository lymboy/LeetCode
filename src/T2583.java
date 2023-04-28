import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-03-06
 */
public class T2583 {


    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sums = new LinkedList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();

        nodes.addLast(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.pollFirst();
                sum += node.val;
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
            sums.add(sum);
        }
        sums.sort(Comparator.reverseOrder());
        return k <= sums.size() ? sums.get(k-1) : -1;
    }
}
