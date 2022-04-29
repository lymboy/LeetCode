import java.util.Arrays;

public class T1480 {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];
        for (int i=1; i<n; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] r = runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(r));
    }
}
