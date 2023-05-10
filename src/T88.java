import lombok.SneakyThrows;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2023-04-28
 */
public class T88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] tmp = new int[m+n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                tmp[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                tmp[k++] = nums2[j++];
            } else {
                tmp[k++] = nums1[i++];
                tmp[k++] = nums2[j++];
            }
        }
        if (i < m) {
            for (; i < m; i++) {
                tmp[k++] = nums1[i];
            }
        }
        if (j < n) {
            for (; j < n; j++) {
                tmp[k++] = nums2[j];
            }
        }
        for (i=0; i<(m+n); i++) {
            nums1[i] = tmp[i];
        }
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test40() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(System.out::println);

    }
}
