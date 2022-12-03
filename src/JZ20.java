import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @link https://leetcode.cn/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/
 * @since 2022-07-22
 */
public class JZ20 {

    public boolean isNumber(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return false;
        }

        s = s.toLowerCase();
        if (s.contains("e")) {
            String[] es = s.split("e");
            if (es.length != 2) {
                return false;
            }
            return (judge(es[0]) && judge(es[1]));
        } else {
            return judge(s);
        }

    }

    boolean judge(String s) {
        if (s.length() == 0) {
            return false;
        }
        boolean hasDot = false;
        int index = 0;
        boolean ret = false;

        int cNum = 0;
        char c;
        while (index < s.length()) {
            if (s.charAt(index) == '.') {
                if (!hasDot) {
                    hasDot = true;
                } else {
                    return false;
                }
            }
            c = s.charAt(index);
            if (c == '+' || c == '-') {
                break;
            }
            index++;
        }
        //if (s.charAt(0) == '+' || s.charAt(0) == '-') {
        //    index++;
        //}
        //if (s.charAt(0) == '.') {
        //    hasDot = true;
        //    index++;
        //}

        while (index < s.length()) {
            ret = true;
            c = s.charAt(index);
            if (c == '.') {
                if (!hasDot) {
                    hasDot = true;
                } else {
                    return false;
                }
                index++;
            } else {
                cNum = c - '0';
                if (cNum <= 9 && cNum >= 0) {
                    index++;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return ret;
    }

    @Test
    public void test52() {
        System.out.println(isNumber("+."));
    }
}
