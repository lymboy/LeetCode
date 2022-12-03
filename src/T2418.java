import org.junit.Test;

import java.util.Arrays;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-20
 */
public class T2418 {

    @Test
    public void test9() {
        sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
    }


    public String[] sortPeople(String[] names, int[] heights) {


        QuickSort.print(heights);
        System.out.println(Arrays.deepToString(names));

        quickSort(names, heights, 0, heights.length - 1);

        QuickSort.print(heights);
        System.out.println(Arrays.deepToString(names));

        return names;
    }

    void quickSort(String[] names, int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(names, arr, left, right);

            quickSort(names, arr, left, partitionIndex - 1);
            quickSort(names, arr, partitionIndex + 1, right);
        }
    }

    int partition(String[] names, int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] > arr[pivot]) {
                swap(names, arr, i, index);
                index++;
            }
        }
        swap(names, arr, pivot, index - 1);
        return index - 1;
    }

    void swap(String[] names, int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

        String s = names[i];
        names[i] = names[j];
        names[j] = s;
    }
}
