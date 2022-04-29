import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import jdk.jshell.Diag;

public class T64 {

    private Map<String, Integer> searched = new HashMap<>();

    private int dis = 0;
    
    public int minPathSum(int[][] grid) {
        return minPath(grid, 0, 0);
    }

    private int minPath(int[][] grid, int row, int column) {

        int m = grid.length;
        int n = grid[0].length;

        if (row >= m || column >= n) {
            return 0;
        }

        int current = grid[row][column];

        int a = current;
        int b = current;

        if (row < m && column < n) {
            a = current + minPath(grid, row+1, column);
            b = current + minPath(grid, row, column+1);
        }

        if (a <= b) {
            dis = a;
            return a;
        } else {
            dis = b;
            return b;
        }
    }

    @Test
    public void test41() {
        
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int r = minPathSum(grid);

        System.out.println(r);
    }
}
