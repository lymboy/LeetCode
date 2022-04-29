import java.util.HashSet;
import java.util.Set;

public class T202 {

    public boolean isHappy(int n) {
        Set<Integer> result = new HashSet<>();

        while (n != 1 && !result.contains(n)) {
            result.add(n);
            n = cal(n);
        }
        return n == 1;
    }

    private int cal(int n) {
        int r = 0;
        while (n != 0) {
            r += (n%10) * (n%10);
            n /= 10;
        }
        return r;
    }
}
