import org.junit.Test;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-02
 */
public class T008 {

    public int myAtoi(String s) {

        int sign = 1;
        int ret = 0;
        int index = 0;
        while (index<s.length() && s.charAt(index)==' ') {
            index++;
        }
        if (index == s.length()) {
            return 0;
        }
        Character firstChar = s.charAt(index);
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            sign  = -1;
            index++;
        }
        for (int i = index; i < s.length(); i++) {

            Character numStr = s.charAt(i);

            if (numStr - '0' >= 0 && numStr - '9' <= 9) {
                int num = numStr - '0';
                if (sign==1 && (ret > (Integer.MAX_VALUE - num) / 10)) {
                    return Integer.MAX_VALUE;
                } else if (sign==-1 && (-ret < (Integer.MIN_VALUE + num) / 10)) {
                    return Integer.MIN_VALUE;
                }
                ret = ret * 10 + num;
            } else {
                break;
            }
        }
        return sign*ret;
    }

    @Test
    public void test31() {
        System.out.println(myAtoi("  12+34"));
    }
}
