import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-05
 */
public class T1237 {

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {

        List<List<Integer>> result = new ArrayList<>();
        int x=1, y=1000;
        while (x<=1000 && y>=1) {
            if (customfunction.f(x, y) > z) {
                y--;
            } else if (customfunction.f(x, y) < z) {
                x++;
            } else {
                result.add(Arrays.asList(x, y));
                x++;
            }
        }
        return result;
    }

    @Test
    public void test32() {
        List<List<Integer>> solution = findSolution((x, y) -> x+y, 5);
        solution.forEach(n -> {
            for (Integer integer : n) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        });
    }

}

@FunctionalInterface
interface CustomFunction {
    int f(int x, int y);
}
