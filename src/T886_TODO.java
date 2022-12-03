import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-16
 */
public class T886_TODO {

    @Test
    public void test12() {
        //int[][] dislikes = {{1,2},{1,3},{2,4}};
        int[][] dislikes = {{1,2},{1,3},{2,3}};
        boolean b = new Solution().possibleBipartition(3, dislikes);
        System.out.println(b);
    }

    class Solution {
        public boolean possibleBipartition(int n, int[][] dislikes) {


            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int i = 1; i <= n; i++) {
                if (!set2.contains(i)) {
                    set1.add(i);
                }
                for (int[] dislike : dislikes) {
                    if (dislike[0] == i) {
                        if (set2.contains(dislike[1])) {
                            set2.remove(dislike[1]);
                        } else {
                            if (set2.contains(i)) {
                                set1.add(dislike[1]);
                            } else {
                                set2.add(dislike[1]);
                            }
                        }
                    }
                }
            }

            int x = set1.size();
            int y = set2.size();

            return x >=1 && y >=1 && (x+y)==n;
        }
    }
}
