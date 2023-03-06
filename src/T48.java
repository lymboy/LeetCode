import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-21
 */
public class T48 {

    public void rotate(int[][] matrix) {

        int WIDTH = matrix.length;
        int[][] newArr = new int[WIDTH][WIDTH];
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                int y = WIDTH - i - 1;
                newArr[j][y] = matrix[i][j];
            }
        }
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                matrix[i][j] = newArr[i][j];
            }
        }
    }
}
