import java.util.LinkedList;
import java.util.List;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-03-06
 */
public class T94 {
    List<Integer> result = new LinkedList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
        }
        return result;
    }
}
