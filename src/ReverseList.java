public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(head.val);
        while (head.next != null) {
            newHead.next = new ListNode(head.next.val);
            head = head.next;
        }
        return newHead;
    }


    private class ListNode {
        int val;
        ListNode next = null;
    
        ListNode(int val) {
            this.val = val;
        }
    }
}