import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-20
 */
public class QuickSort {

    static void sort(int[] arr, int left, int right) {
        if (arr.length == 0 || left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int tmp = arr[left];
        while (i<j) {
            while (arr[i] >= tmp && i < j) {
                i++;
            }
            while (arr[j] <= tmp && i < j) {
                j--;
            }
            swap(arr, i, j);
        }
        swap(arr, left, --i);

        sort(arr, left, i);
        sort(arr, j, right);
    }

    static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        //Random random = new Random();
        //int[] array = new int[10];
        //
        //for (int i = 0; i < array.length; i++) {
        //    array[i] = random.nextInt(500);
        //}

        int[] array = {180, 165, 170};

        print(array);
        sort(array, 0, array.length-1);
        print(array);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
