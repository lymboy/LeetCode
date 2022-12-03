/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class T148 {

    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null)  {
            len++;
            p = p.next;
        }

        for (int i = 0; i < len; i++) {
            p = head;
            ListNode maxNode = p;
            int val = p.val;
            for (int j = 0; j < len - i; j++) {
                if (val < p.val) {
                    maxNode = p;
                    val = p.val;
                }
                if (j == (len-i-1)) {
                    int t = maxNode.val;
                    maxNode.val = p.val;
                    p.val = t;
                }

                p = p.next;
            }
        }
        return head;
    }
}
