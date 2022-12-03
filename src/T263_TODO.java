/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-24
 */
public class T263_TODO {
    public boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        return judge(n/2)&&judge(n/5)&&judge(n/7);
    }

    boolean judge(int n) {
        return n==2||n==5||n==7;
    }
}
