import org.junit.Test;

public class T11 {

    public int maxArea(int[] height) {
        int area = 0;
        int i = 0, j = height.length-1;
        while (i < j) {
            int tmpArea = calArea(i, j, height);
            if (tmpArea > area) {
                area = tmpArea;
            }
            if (height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }

    private int calArea(int i, int j, int[] height) {
        return Math.abs(j-i)*Math.min(height[i], height[j]);
    }


    @Test
    public void test25() {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}