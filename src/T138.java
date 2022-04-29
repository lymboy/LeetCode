import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
// Definition for a Node.
*/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class T138 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Integer> record1 = new HashMap<>();
        Map<Integer, Node> record2 = new HashMap<>();
        Node root = new Node(head.val);
        Node p1 = root;
        Node p2 = head;
        p2 = p2.next;
        int i = 0, j = 0;
        record1.put(head, i++);
        record2.put(j++, p1);
        while (p2 != null) {
            record1.put(p2, i++);
            p1.next = new Node(p2.val);
            p2 = p2.next;
            p1 = p1.next;
            record2.put(j++, p1);
        }

        p1 = root;
        p2 = head;
        while(p1 != null) {
            p1.random = record2.get(record1.get(p2.random));
            p1 = p1.next;
            p2 = p2.next;
        }

        return root;

    }

    void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -->");
            head = head.next;
        }
    }

    @Test
    public void test57() {
        Node head = new Node(6);
        Node p = head;
        for (int i=0; i<5; i++) {
            p.next = new Node(i);
            p = p.next;
        }
        print(head);
        System.out.println("\n############################");
        print(copyRandomList(head));
    }
}