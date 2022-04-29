import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Map<Integer, Integer> map1 = new HashMap<>();
        // Map<Integer, Integer> map2 = new HashMap<>();
        // List<Integer> result = new ArrayList<>();

        // for (int i=0; i<nums1.length; i++) {
        //     if (map1.containsKey(nums1[i])) {
        //         map1.put(nums1[i], map1.get(nums1[i])+1);
        //     } else {
        //         map1.put(nums1[i], 0);
        //     }
        // }
        // for (int i=0; i<nums2.length; i++) {
        //     if (map2.containsKey(nums2[i])) {
        //         map2.put(nums2[i], map2.get(nums2[i])+1);
        //     } else {
        //         map2.put(nums2[i], 0);
        //     }
        // }
        // int n = map1.size() > map2.size() ? map1.size() : map2.size();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] a = intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(a));
    }
}
