import java.util.ArrayList;
import java.util.List;

public class T454 {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                list.add(A[i] + B[j]);
            }
        }
        int res = 0;
        for (int i=0; i<C.length; i++) {
            for (int j=0; j<D.length; j++) {
                if (list.contains(0 - (C[i]+D[j]))) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a = fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2});
        System.out.println(a);
    }

}
