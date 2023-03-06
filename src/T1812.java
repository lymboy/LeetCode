import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-08
 */
public class T1812 {

    public boolean squareIsWhite(String coordinates) {

        int x = coordinates.charAt(0) - 'a' + 1; // 是的x从1开始
        int y = coordinates.charAt(1) - '0';
        return ((x & 1) != (y & 1));
    }

    public boolean squareIsWhite2(String coordinates) {
        int x = coordinates.charAt(0) - 'a' + 1; // 是的x从1开始
        int y = coordinates.charAt(1) - '0';
        return ((x % 2) != (y % 2));
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test18() {
        boolean b = squareIsWhite("h3");
        System.out.println(b);
    }
}
