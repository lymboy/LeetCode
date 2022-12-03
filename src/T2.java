/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-05
 */
public class T2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode p = result;
        int a = 0;
        while (l1 != null && l2!= null) {
            int b = l1.val + l2.val + a;
            p.next = new ListNode(b%10);
            p = p.next;
            a = b/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                int b = l2.val + a;
                p.next = new ListNode(b%10);
                p = p.next;
                a = b/10;
                l2 = l2.next;
            }
        }
        if (l2 == null) {
            while (l1 != null) {
                int b = l1.val + a;
                p.next = new ListNode(b%10);
                p = p.next;
                a = b/10;
                l1 = l1.next;
            }
        }
        if (a!=0) {
            p.next = new ListNode(1);
            p = p.next;
        }

        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
