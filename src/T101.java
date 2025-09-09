import apple.laf.JRSUIUtils.Tree;

/**
 * https://leetcode.cn/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-interview-150
 * 101. 对称二叉树
 * 核心：两棵树镜像对称即左数的右子树等于右树的左字数
 */
public class T101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return fn(root.left, root.right);
    }

    public boolean fn(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }
        return p.val==q.val && fn(p.left, q.right) && fn(p.right, q.left);
    }
}