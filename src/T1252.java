/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-12
 */
public class T1252 {

    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];

        for (int[] index : indices) {
            for (int i = 0; i < n; i++) {
                result[index[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                result[i][index[1]]++;
            }
        }

        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j]%2 == 1) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int oddCells2(int m, int n, int[][] indices) {
        int[] ROW = new int[m];
        int[] COLUMN = new int[n];
        for (int[] index : indices) {
            ROW[index[0]]++;
            COLUMN[index[1]]++;
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += (ROW[i]%2 == 0 ? 0 : 1);
        }
        for (int i = 0; i < n; i++) {
            sum += (COLUMN[i]%2 == 0 ? 0 : 1);
        }

        return sum;
    }
}
