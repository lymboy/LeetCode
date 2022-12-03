import org.junit.Test;

public class T905 {

    public int[] sortArrayByParity(int[] nums) {
        int p = 0;
        int q = nums.length - 1;

        while (p <= q) {
            if (nums[p]%2 == 0) {
                p++;
            }else if (nums[q]%2 == 1) {
                q--;
            } else {
                swap(nums, p, q);
            }
        }

        return nums;
    }

    void swap(int[] nums, int p, int q) {
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }

    @Test
    public void test30() {
        int[] arr = sortArrayByParity(new int[]{1, 2, 3, 4, 5, 6, 7});
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}