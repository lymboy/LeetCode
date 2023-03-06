import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-12-22
 */
public class JZII001_TODO {

    public int divide(int a, int b) {

        return a/b;
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test26() {
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    @SneakyThrows(Exception.class)
    public void test40() {
        int a = divide(-2147483648, -3);
        System.out.println(a);
    }
}
