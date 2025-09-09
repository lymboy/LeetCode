/**
 * https://leetcode.cn/problems/path-sum/description/?envType=study-plan-v2&envId=top-interview-150
 * 112. 路径总和
 */
public class T112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
}