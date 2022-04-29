public class T1672 {
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int[] welthy = new int[m];
        for (int i=0; i<m; i++) {
            welthy[i] = 0;
            for (int j=0; j<n; j++) {
                welthy[i] += accounts[i][j];
            }
            if (welthy[i] > welthy[0]) {
                welthy[0] = welthy[i];
            }
        }
        return welthy[0];
    }

    public static void main(String[] args) {
        int[][] b = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int a  = maximumWealth(b);
        System.out.println(a);
    }

}
