import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-19
 */
public class T1700 {


    @Test
    public void test14() {

    }

    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            Queue<Integer> q = new LinkedList();
            for (int student : students) {
                q.add(student);
            }

            int i = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                int t = i;
                for (int j = 0; j < size; j++) {
                    int first = q.poll();
                    if (first == sandwiches[i]) {
                        i++;
                    } else {
                        q.add(first);
                    }
                }
                if (t == i) {
                    return size;
                }

            }

            return 0;
        }
    }
}

