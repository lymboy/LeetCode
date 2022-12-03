import org.junit.Test;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-19
 */
public class JZ13 {

    boolean[][] map = null;

    public int movingCount(int m, int n, int k) {
        //map = new boolean[m][n];

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += ((!isBiggerK(i,j,k))?1:0);
            }
        }

        return sum;
    }

    //int bfs(int m, int n, int k, int sum) {
    //
    //    return 0;
    //}

    boolean isBiggerK(int i, int j, int k) {
        int sum = 0;
        while (i!=0 || j!=0) {
            sum += i%10;
            sum += j%10;
            i /= 10;
            j /= 10;
        }
        return sum>k;
    }

    boolean isCollision(int i, int j, int m, int n) {
        return i<0 || j<0 || i>=m || j>= n;
    }



    @Test
    public void test31() {
        System.out.println(movingCount(16,8,4));
    }
}
