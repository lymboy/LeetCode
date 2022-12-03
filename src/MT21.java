import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-08-06
 */
public class MT21 {

    private Map<String, Integer> map;

    @Test
    public void test9() {

        map = new HashMap<>();

        int x = 44;
        int y = 85;
        System.out.println(f(x,y));
    }

    public int f(int x, int y) {
        if (map.containsKey(x+""+y)) {
            return map.get(x+""+y);
        }
        if (x+y < 3) {
            map.put(x+""+y, 0);
            return 0;
        }
        if (x<=0 || y<=0) {
            map.put(x+""+y, 0);
            return 0;
        }
        if (x+y == 3) {
            map.put(x+""+y, 1);
            return 1;
        }

        int ans = 1+Math.max(f(x-1, y-2),f(x-2, y-1));
        map.put(x+""+y, ans);
        return ans;
    }
}
