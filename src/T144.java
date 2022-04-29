import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class T144 {

    /**
     * Definition for a binary tree node.
     */
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));


        return res;
    }

    @Test
    public void test43() {
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1, left, right);

        System.out.println(Arrays.deepToString(preorderTraversal(root).toArray())); 

    }
}
