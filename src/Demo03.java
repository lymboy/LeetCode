import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-11
 */
public class Demo03 {

    @Test
    public void test9() {
        int[] arr = {1, 2, 2, 3, 3, 1, 7, 7, 9};
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        Integer[] integers = set.toArray(new Integer[0]);
        System.out.println(integers[0]);
    }
}
