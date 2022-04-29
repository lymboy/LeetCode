import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class T70 {

    private Map<Integer, Integer> results = new HashMap<>();
    
    public int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (!results.containsKey(n)) {
            results.put(n, climbStairs(n-1) + climbStairs(n-2));
        }
        return results.get(n);
    }

    @Test
    public void test17() {
        System.out.println(climbStairs(10));
    }
}
