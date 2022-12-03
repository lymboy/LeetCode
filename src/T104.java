/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-17
 */
public class T104 {

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right)+1;
        }
    }
}
