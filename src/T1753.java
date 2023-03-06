import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-21
 */
public class T1753 {

    public int maximumScore(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        int res = 0;
        while (arr[0] != 0 || arr[1] != 0) {
            arr[2]--;
            arr[1]--;
            Arrays.sort(arr);

            res++;
        }
        return res;
    }

}
