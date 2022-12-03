/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class T21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = head;
        while (list1!=null && list2!=null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 =list2.next;
            }
            p = p.next;
        }
        if (list1 == null) {
            p.next = list2;
        } else {
            p.next= list1;
        }
        return head.next;
    }
}
