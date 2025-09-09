import java.util.LinkedList;
import java.util.List;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-03-06
 */
public class T145 {

    List<Integer> result = new LinkedList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            result.add(root.val);
        }
        return result;
    }

}
