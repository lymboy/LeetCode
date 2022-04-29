import java.util.Comparator;
import java.util.stream.IntStream;

import org.junit.Test;

public class T455 {

    public int findContentChildren(int[] g, int[] s) {
        int answer = 0;

        g = IntStream.of(g).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        s = IntStream.of(s).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        // System.out.println(Arrays.toString(g));
        // System.out.println(Arrays.toString(s));

        int i = 0;
        int j = 0;

        while (i<g.length && j<s.length) {
            if (s[j] >= g[i]) {
                answer++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return answer;
    }

    @Test
    public void test26() {
        int r = findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3});
        System.out.println(r);
    }
}
