/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class T704 {

    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int mid = (i + j) / 2;
        while (i < j) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
            mid = (i + j) / 2;
        }
        return -1;
    }

}
