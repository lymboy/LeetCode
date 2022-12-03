import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void test39() {
        int[] next = getNext("ABAB");
        String s = Arrays.deepToString(Arrays.stream(next).boxed().toArray(Integer[]::new));
        System.out.println(s);
    }

    @Test
    public void test47() {
        int[] BIT_VALUE = {
                0x00000001, 0x00000002, 0x00000004, 0x00000008,
                0x00000010, 0x00000020, 0x00000040, 0x00000080,
                0x00000100, 0x00000200, 0x00000400, 0x00000800,
                0x00001000, 0x00002000, 0x00004000, 0x00008000,
                0x00010000, 0x00020000, 0x00040000, 0x00080000,
                0x00100000, 0x00200000, 0x00400000, 0x00800000,
                0x01000000, 0x02000000, 0x04000000, 0x08000000,
                0x10000000, 0x20000000, 0x40000000, 0x80000000};
        //for (int i : BIT_VALUE) {
        //    System.out.println(Integer.toBinaryString(i));
        //}
        System.out.println(Integer.toBinaryString(31));
    }

    @Test
    public void test64() {
        System.out.println(1/0);
    }

    public int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                if (p[++j] == p[++k]) {
                    next[j] = next[k];
                } else {
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

}
