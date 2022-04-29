import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Demo00 {

    private static int counts = 0;

    private Map<Integer, Long> results = new HashMap<>();

    public long fib(int n) {

        counts++;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1L;
        }
        if (!results.containsKey(n)) {
            results.put(n, fib(n - 1) + fib(n - 2));
        }
        return results.get(n);
    }

    @Test
    public void test() {
        long startTime = System.nanoTime();
        System.out.println(fib(1000));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000000.0 + " s");
        System.err.println("运行了 " + Demo00.counts + "次");
    }

}
