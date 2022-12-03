import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class T1710 {

    /**
     * 贪心，每次都取最大的数据
     * @param boxTypes
     * @param truckSize
     * @return
     */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(a -> a[1]));
        int res = 0;
        for (int[] boxType : boxTypes) {
            if (truckSize > 0) {
                if (truckSize >= boxType[0]) {
                    res += boxType[0]+boxType[1];
                    truckSize -= boxType[0];
                } else if (truckSize < boxType[0]) {
                    res += truckSize*boxType[1];
                    break;
                }
            }
        }
        return res;
    }
}
