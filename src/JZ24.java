/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-11
 */
public class JZ24 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            while (head != null) {
                ListNode t = head;
                head = head.next;
                t.next = pre;
                pre = t;
            }
            head = pre;
            return head;
        }
    }
}
