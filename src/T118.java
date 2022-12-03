import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-23
 */
public class T118 {

    @Test
    public void test12() {
        generate(10);
    }

    public List<List<Integer>> generate(int numRows) {
        int[] arr = new int[numRows + 1];
        arr[1] = 1;
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> tmp = new LinkedList<>();
            List<Integer> t = res.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tmp.add(1);
                } else {
                    tmp.add(t.get(j) + t.get(j - 1));
                }
            }
            res.add(tmp);
        }
        return res;
    }

}
