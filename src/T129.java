/**
 * https://leetcode.cn/problems/sum-root-to-leaf-numbers/?envType=study-plan-v2&envId=top-interview-150
 * 129. 求根节点到叶节点数字之和
 */
public class T129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        return fn(root.left, root.val) + fn(root.right, root.val);
    }

    public int fn(TreeNode root, int parentVal) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return parentVal*10+root.val;
        }
        return fn(root.left, parentVal*10+root.val) + fn(root.right, parentVal*10+root.val);
    }
}