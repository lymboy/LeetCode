import java.util.Random;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class GuessGame {
    private int picker = -1;

    public int guess(int n) {
        if (n == picker) return 0;
        return picker > n ? 1 : -1;
    }

    public int getPicker() {
        return picker;
    }

    public void setPicker(int picker) {
        this.picker = picker;
    }
}
