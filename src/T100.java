
/**
 * https://leetcode.cn/problems/same-tree/description/?envType=study-plan-v2&envId=top-interview-150
 * 100. 相同的树
 * 递归语义：左子树相等 && 右子树相等
 */
public class T100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}