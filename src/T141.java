/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-31
 */
public class T141 {

    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head.next;
        while (p != null && q != null) {

            if (p == q) {
                return true;
            }

            p = p.next;
            q = q.next;
        }
        return false;
    }
}
