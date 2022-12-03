/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-17
 */
public class T236 {
    class Solution {

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (root.val == p.val || root.val == q.val) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left!=null && right != null) {
                return root;
            } else if (left==null) {
                return right;
            } else {
                return left;
            }
        }
    }
}
