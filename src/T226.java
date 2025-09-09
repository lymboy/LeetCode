/**
 * https://leetcode.cn/problems/invert-binary-tree/?envType=study-plan-v2&envId=top-interview-150
 * 226. 翻转二叉树
 */
public class T226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        return swapLR(root, root.left, root.right);
    }

    public TreeNode swapLR(TreeNode root, TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return root;
        }

        if (left == null && right != null) {
            root.right = null;
            root.left = swapLR(right, right.left, right.right);
            return root;
        }
        if (left != null && right == null) {
            root.left = null;
            root.right = swapLR(left, left.left, left.right);
            return root;
        }
        root.left = swapLR(right, right.left, right.right);
        root.right = swapLR(left, left.left, left.right);
        return root;
    }
}