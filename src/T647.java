import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-31
 */
public class T647 {

    @Test
    public void test9() {
        String s = "abc";
        int i = countSubstrings(s);
        System.out.println(i);
    }

    @Test
    public void test18() {
        int i = testReturn();
        System.out.println(1+2+""+4+5);
    }

    public int testReturn() {
        int a = 3;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(a);
        } finally {
            a = 6;
        }
        return 0;
    }

    public int countSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        String str = sb.toString();
        int res = s.length();
        for (int i = 0; i < str.length(); i++) {
            int p = i - 1;
            int q = i + 1;
            while (p>=0 && q<str.length()) {
                if (str.charAt(p--) == str.charAt(q++)) {
                    res++;
                } else {
                    break;
                }
            }
        }
        return res/2;
    }
}
