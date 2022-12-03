/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-22
 */
public class JZ04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length-1;
        int j = 0;
        while (i>0 && j>= 0 ) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                i--;
            }
            if (matrix[i][j] < target) {
                j++;
            }
        }
        return false;
    }

}
