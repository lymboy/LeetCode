import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-11
 */
public class Demo02 {

    @Test
    public void test9() {
        char[] cs = new char[]{'a', 'b', 'a', 'b', 'c'};
        Node[] nodes = new Node[26];
        for (int i = 0; i < 26; i++) {
            nodes[i] = new Node((char)('a'+i), 0, -1);
        }
        for (int i = 0; i < cs.length; i++) {
            nodes[cs[i]-'a'].value++;
            if (nodes[cs[i]-'a'].index == -1) {
                nodes[cs[i]-'a'].index = i;
            }
        }

        Arrays.sort(nodes);
        List<Node> list = Arrays.stream(nodes).filter(n -> n.value != 0).collect(Collectors.toList());

        list.forEach(System.out::println);
    }


    class Node implements Comparable<Node> {
        char key = 'a';
        int value = 0;
        int index = -1;

        public Node(char key, int value, int index) {
            this.key = key;
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Node o) {
            if (o.value == value) {
                return index-o.index;
            }
            if (value > o.value) {
                return -1;
            }
            return 1;
        }

        @Override
        public String toString() {
            return "[" + key + ", "+ value + "]";
        }
    }
}
