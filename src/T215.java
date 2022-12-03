import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-23
 */
public class T215 {

    @Test
    public void test9() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        findKthLargest(nums, 2);
    }

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k - 1);
        return nums[k - 1];
    }

    void quickSort(int[] nums, int left, int right, int k) {
        if (left >= right) {
            return;
        }
        int index = partition(nums, left, right);
        if (index == k) {
            return;
        }
        quickSort(nums, left, index - 1, k);
        quickSort(nums, index + 1, right, k);

    }

    int partition(int[] nums, int left, int right) {
        int tmp = nums[left];
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (nums[i] > tmp) {
                swap(nums, i, index++);
            }
        }
        swap(nums, index - 1, left);
        return index - 1;
    }

    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
