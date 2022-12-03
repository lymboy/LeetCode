import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-11
 */
public class T079 {

    // 上下左右四个方向遍历
    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    // 记录行，列数
    int m, n;
    // 标记数组，判断是否已经访问过
    boolean[][] visited = null;

    public boolean exist(char[][] board, String word) {

        if (board == null || board.length == 0) {
            return false;
        }

        m = board.length;
        n = board[0].length;

        visited = new boolean[m][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 以所有点作为起始点
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     *
     * @param board
     * @param word
     * @param index 访问到word第 index 个位置
     * @param x
     * @param y
     * @return
     */
    private boolean dfs(char[][] board, String word, int index, int x, int y) {
        // 如果访问到了word一个位置
        if (index == word.length() - 1 ) {
            // 当前位置是否跟word最后一个字符相等
            return board[x][y] == word.charAt(index);
        }
        // 如果当前遍历的字符跟word 第index字符相等，则继续访问后续位置
        if (board[x][y] == word.charAt(index)) {
            visited[x][y] = true;
            // 依次从四个方向分别计算
            for (int i = 0; i < 4; i++) {
                int newX = x + direction[i][0];
                int newy = y + direction[i][1];
                if (inArea(newX, newy) && !visited[newX][newy]) {
                    if (dfs(board, word, index + 1, newX, newy)) {
                        return true;
                    }
                }
            }
            visited[x][y] = false;
        }
        return false;
    }

    /**
     * 判断当前坐标点是否越界
     * @param x
     * @param y
     * @return
     */
    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }


    @Test
    public void test57() {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "SEE";

        System.out.println(exist(board, word));
    }
}
