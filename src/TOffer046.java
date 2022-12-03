import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-05
 */
public class TOffer046 {

    /**
     * TODO: 此题未解决
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            result.add(node.val);

            if (node != null) {
                nodes.add(node.right);
                nodes.add(node.left);
            }
        }

        return result;
    }

    @Test
    public void test61() {
        TreeNode a = new TreeNode(7);
        TreeNode b = new TreeNode(5, null, a);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(2, c, b);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(3, e, null);
        TreeNode root = new TreeNode(1, d, f);
        //TreeNode right = new TreeNode(3);
        TreeNode right = null;
        List<Integer> integers = rightSideView(root);
        integers.forEach(System.out::println);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}