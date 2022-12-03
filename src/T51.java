import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-12
 */
public class T51 {

    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        if (n == 0) {
            return Collections.emptyList();
        }

        cols = new boolean[n];
        diag1 = new boolean[n];
        diag2 = new boolean[n];

        for (int i = 0; i < n; i++) {

            char[][] map = new char[n][n];
            for (int k = 0; k < map.length; k++) {
                for (int j = 0; j < map[0].length; j++) {
                    map[k][j] = '.';
                }
            }

            cols = new boolean[n];
            diag1 = new boolean[2*n-1];
            diag2 = new boolean[2*n-1];
            cols[i] = true;
            diag1[i] = true;
            diag2[n-i-1] = true;
            map[0][i] = 'Q';
            solve(map, 1, i, cols, diag1, diag2);
        }

        return ans;
    }

    private void solve(char[][] map,
                           int row,
                           int col,
                           boolean[] cols,
                           boolean[] diag1,
                           boolean[] diag2) {
        if (row >= map.length) {
            ans.add(char2List(map));
            return;
        }
        for (int i = 0; i < map[row].length; i++) {
            if (!cols[i] && !diag1[i+row] && !diag2[row-i+map.length-1]) {
                cols[i] = true;
                diag1[i+row] = true;
                diag2[row-i+ map.length-1] = true;
                map[row][i] = 'Q';
                solve(map, row+1, i, cols, diag1, diag2);
                map[row][i] = '.';
                cols[i] = false;
                diag1[i+row] = false;
                diag2[row-i+ map.length-1] = false;
            }
        }

        return;
    }

    private List<String> char2List(char[][] map) {
        List<String> ans = new ArrayList<>();
        for (char[] chars : map) {
            ans.add(new String(chars));
        }

        return ans;
    }

    @Test
    public void test16() {

        char[] c = {'a', 'b', '9'};
        System.out.println(new String(c));
    }

    @Test
    public void test95() {
        System.out.println(solveNQueens(1));
    }
}
