import java.util.Objects;

/**
 * https://leetcode.cn/problems/lMSNwu/description/
 */
public class LCR025 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }

        int len1 = 0;
        int len2 = 0;

        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null) {
            len1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            len2++;
            p2 = p2.next;
        }
        p1 = l1;
        p2 = l2;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        int i = 0;
        while (p1 != null) {
            arr1[i++] = p1.val;
            p1 = p1.next;
        }
        i = 0;
        while (p2 != null) {
            arr2[i++] = p2.val;
            p2 = p2.next;
        }
        ListNode res = null;
        int quo = 0;
        int m=len1-1;
        int n = len2-1;
        for (; m>=0 || n>=0; m--,n--) {
            int t1=0;
            int t2=0;
            if (m>=0) {
                t1 = arr1[m];
            }
            if (n>=0) {
                t2 = arr2[n];
            }
            int t = t1+t2+quo;    
            quo = t / 10;
            res = new ListNode(t % 10, res);
        }
        if (quo > 0) {
            res = new ListNode(quo, res);
        }
        return res;
    }

    // 测试：生成并打印官方 Demo 数据
    public static void main(String[] args) {
        ListNode l1 = getDemoL1();
        ListNode l2 = getDemoL2();
        
        new LCR025().addTwoNumbers(l1, l2);
    }

    public static ListNode getDemoL1() {
        // 从后往前构造（更直观）：3 → 4 → 2 → 7（最终返回7作为头节点）
        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(7, node2);
        return node1;
    }

    /**
     * 生成官方 Demo 中的 l2 = [5,6,4]
     */
    public static ListNode getDemoL2() {
        // 从后往前构造：4 → 6 → 5（最终返回5作为头节点）
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(6, node3);
        ListNode node1 = new ListNode(5, node2);
        return node1;
    }
}
