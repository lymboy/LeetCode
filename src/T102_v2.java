import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

// https://leetcode.cn/problems/binary-tree-level-order-traversal/description/
public class T102_v2 {
    // 使用队列，遍历每一层时把左右两个节点加入队列（注意判空），同时需要记录当前层的数量（只遍历当前层的节点）
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (Objects.isNull(root)) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> t = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tNode = queue.poll();
                t.add(tNode.val);
                if (Objects.nonNull(tNode.left)) {
                    queue.add(tNode.left);
                }
                if (Objects.nonNull(tNode.right)) {
                    queue.add(tNode.right);
                }
            }
            result.add(t);
        }
        return result;
    }
}