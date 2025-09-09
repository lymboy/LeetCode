
public class T172 {
    public int trailingZeroes(int n) {
        if (n <= 4) {
            return 0;
        }
        return fn(n*(n-1), n-1);
    }
    public int fn(int s, int n) {
        if (s <= 4) {
            return 0;
        }
        int t = 0;
        if (s%10 == 0) {
            int k = s;
            while (k!=0) {
                if (k%10 == 0) {
                    t++;
                }
                k /= 10;
            }
        }
        return t+fn(n*(n-1), n-1);
    }

    public static void main(String[] args) {
        int s = new T172().trailingZeroes(18);
        System.out.println(s);
    }
}