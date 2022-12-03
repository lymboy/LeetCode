/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-27
 */
public class T1822 {
    public int arraySign(int[] nums) {
        int neg = 0;
        int zero = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num < 0) {
                neg++;
            }
        }
        if (zero >= 1) {
            return 0;
        }
        return neg%2 == 0 ? 1:-1;
    }
}
