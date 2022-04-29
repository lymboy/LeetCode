import java.util.Arrays;

public class T655 {
    
    public static boolean checkPossibility(int[] nums) {

        int n = nums.length, cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 3};
        boolean b = checkPossibility(arr);
        System.out.println(Arrays.toString(arr));
    }
}