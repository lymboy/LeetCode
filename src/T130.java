import org.junit.Test;

import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-11
 */
public class T130 {

    // 上下左右四个方向遍历
    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    // 记录行，列数
    int m, n;

    public void solve(char[][] board) {

        if (board == null || board[0].length == 0) {
            return;
        }

        m = board.length;
        n = board[0].length;

        // 从四个边界的点出发，将所有与边界相连的点标记
        for (int i = 0; i <= m-1; i++) {
            dfs(board, i, 0);
            dfs(board, i, n-1);
        }
        for (int i = 0; i <= n-1; i++) {
            dfs(board, 0, i);
            dfs(board, m-1, i);
        }
        // 上面两个for循环执行后所有与边界相邻的点都会被标记为特殊字符


        // 全部遍历一次
        // 将所有被标记为#的点重新恢复成O, 仍旧是O的点则一定是被X包围且不与边界相连的，可以置为X
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    /**
     * @param board
     * @param x
     * @param y
     * @return
     */
    private void dfs(char[][] board, int x, int y) {
        // 如果没有越界并且当前字符是'O'则继续递归遍历
        if (inArea(x, y) && board[x][y]=='O') {
            board[x][y] = '#';
            for (int i = 0; i < direction.length; i++) {
                int newX = x + direction[i][0];
                int newY = y + direction[i][1];
                dfs(board, newX, newY);
            }
        }
    }

    /**
     * 判断当前坐标点是否越界
     *
     * @param x
     * @param y
     * @return
     */
    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    @Test
    public void test78() {
        //char[][] grid = {
        //        {'X', 'X', 'X', 'X'},
        //        {'X', 'O', 'O', 'X'},
        //        {'X', 'X', 'O', 'X'},
        //        {'X', 'O', 'X', 'X'}
        //};
        char[][] grid = {
                {'O'}
        };
        solve(grid);
        System.out.println(Arrays.deepToString(grid));
    }


    @Test
    public void test134() {
        char[][] grid = {
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };
        solve(grid);
        System.out.println(Arrays.deepToString(grid));
    }
}
