import java.util.Arrays;

public class TLCP18 {
    public static int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);

        int m = staple.length;
        int n = drinks.length;
        int i = 0, j = n - 1;
        int cnt = 0;
        while (true) {
            if (staple[i] >= x) {
                break;
            }
            if (drinks[j] >= x) {
                j--;
            }
            if ((staple[i] + drinks[j]) <= x) {
                cnt = (cnt + j + 1) % 1000000007;
                i++;
            } else {
                j--;
            }
    
            if (i >= m || j < 0) {
                break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int a = breakfastNumber(new int[]{2, 1, 1}, new int[]{8, 9, 5, 1}, 9);
        System.out.println(a);
    }
}
