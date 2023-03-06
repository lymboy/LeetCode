import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-03
 */
public class T1796 {


    public int secondHighest(String s) {
        int[] numArr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - '0';
            if (index >= 0 && index <= 9) {
                numArr[index]++;
            }
        }
        boolean flag = false;
        for (int i = numArr.length - 1; i >= 0; i--) {
            if (numArr[i] > 0) {
                if (!flag) {
                    flag = true;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    @Test
    public void test31() {
        String s = "ck077";

        int i = secondHighest(s);
        System.out.println(i);
    }
}
