import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-11
 */
public class T200 {

    // 上下左右四个方向遍历
    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    // 记录行，列数
    int m, n;
    // 标记数组，判断是否已经访问过
    boolean[][] visited = null;

    public int numIslands(char[][] grid) {

        if (grid == null || grid[0].length == 0) {
            return 0;
        }

        int res = 0;

        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }

        return res;
    }

    /**
     * @param grid
     * @param x
     * @param y
     * @return
     */
    private boolean dfs(char[][] grid, int x, int y) {
        // 如果当前遍历的字符是陆地，则继续访问后续位置
        if (grid[x][y] == '1') {
            visited[x][y] = true;
            // 依次从四个方向分别计算
            for (int i = 0; i < 4; i++) {
                int newX = x + direction[i][0];
                int newy = y + direction[i][1];
                if (inArea(newX, newy) && !visited[newX][newy]) {
                    if (dfs(grid, newX, newy)) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }
}
