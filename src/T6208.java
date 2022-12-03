import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-16
 */
public class T6208 {

    @Test
    public void test9() {
        int i = new Solution().countTime("??:??");
        System.out.println(i);
    }

    class Solution {
        public int countTime(String time) {
            int h = 0;
            char a = time.charAt(0);
            char b = time.charAt(1);
            char c = time.charAt(3);
            char d = time.charAt(4);

            if (a!='?'&&b!='?'&&c!='?'&&d!='?') {
                return 1;
            }

            if (a == '?' && b == '?') {
                h += 2*10+4;
            } else if (a == '?') {
                if (b >= '4') {
                    h += 2;
                } else {
                    h += 3;
                }
            } else if (b == '?') {
                if (a == '2') {
                    h += 4;
                } else {
                    h += 10;
                }
            }

            int m=0;
            if (c == '?' && d == '?') {
                m += 60;
            } else if (c == '?') {
                m += 6;
            } else if (d == '?') {
                m += 10;
            }

            if ( h != 0 && m != 0) {
                return h*m;
            } else {
                return h==0?m:h;
            }
        }
    }
}
