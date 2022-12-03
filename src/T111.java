/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-17
 */
public class T111 {

    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left==null && root.right==null) {
                return 1;
            }
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            if (root.left!= null) {
                left = minDepth(root.left);
            }
            if (root.right != null) {
                right = minDepth(root.right);
            }
            return Math.min(left, right)+1;
        }
    }
}
