import org.junit.Test;

import java.util.Random;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-15
 */
public class T374  extends GuessGame {

    public T374() {
    }

    public T374(int picker, int num) {
        setPicker(picker);
        int res = guessNumber(num);
        System.out.println(res);
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid = (r-l)/2 + l;
        while (l<=r) {
            int res = guess(mid);
            if (res == 0) {
                break;
            }
            if (res == 1) {
                l = mid+1;
            }else if (res == -1) {
                r = mid-1;
            }
            mid = (r-l)/2 + l;
        }
        return mid;
    }

    public static void main(String[] args) {
        new T374(1702766719, 2126753390);
    }

}
