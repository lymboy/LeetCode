import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-09-23
 */
public class JZ67 {

    public int strToInt(String str) {
        str = str.trim();
        boolean isNegtive = false;
        int i=0;
        while (i<str.length() && str.charAt(i++) != '-'){};
        // 是负数
        if (i<str.length()) {

        } else {

        }

        return 0;
    }


    @Test
    public void test25() {
        System.out.println((int)(-9128347&-2147483648));
    }

}
