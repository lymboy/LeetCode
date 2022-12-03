import org.junit.Test;

import java.util.Scanner;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-20
 */
public class HW1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        if (N < 0 || N > 100000000000L) {
            System.out.println(-1);
            return;
        }

        String bStr = Long.toBinaryString(N);


        Long[] n1 = new Long[bStr.length() / 2];
        Long[] n2 = new Long[bStr.length() / 2];
        String s = "1";
        for (int i = 0; i < n1.length; i++) {
            n1[i] = Long.parseLong(s + s, 2);
            s = s + "0";
        }
        s = "1";
        for (int i = 0; i < n2.length; i++) {
            n2[i] = Long.parseLong(s + s, 2);
            s = s + "1";
        }

        long ret = 0;
        for (int i = 0; i < Long.toBinaryString(N).length() / 2; i++) {
            if (n1[i] > N) {
                break;
            }
            if (n1[i] < N && N < n2[i]) {
                String tmp = Long.toBinaryString(n1[i]);
                tmp = tmp.substring(0, tmp.length() / 2);
                int index = tmp.length() - 1;
                while (Long.parseLong(tmp) <= N) {
                    String[] a = tmp.split("");
                    a[index] = "1";
                    tmp = String.join("", a);
                }
                ret = ret + (long) (Math.pow(2, tmp.length() - index));
            } else if (N >= n2[i]) {
                ret = ret + (long) (Math.pow(2, i));
            } else if (n1[i] == N) {
                ret++;
            }
        }
        System.out.println(ret);


    }

    @Test
    public void test61() {
        System.out.println(Integer.parseInt("101101", 2));
    }
}
