import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-13
 */
public class JZ06 {

    public int[] reversePrint(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        //head.next = pre;
        //pre = head.next;
        while (cur != null) {
            ListNode p = cur.next;
            cur.next = pre;
            pre = cur;
            cur = p;
        }
        head = pre;

        ArrayList<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.val);
            head = head.next;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    @Test
    public void test26() {
        ListNode c = new ListNode(3, null);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);

        //while (a != null) {
        //    System.out.println(a.val);
        //    a = a.next;
        //}

        int[] ints = reversePrint(a);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
}

