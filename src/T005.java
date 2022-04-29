import org.junit.Test;

public class T005 {
    

    public String longestPalindrome(String s) {
        int p = 0;
        int q = s.length()-1;

        if (isPalindrome(s, p, q)) {

        }

        return s.substring(p, q);
    }

    private boolean isPalindrome(String s, int p, int q) {
        if (p > q) {
            return false;
        }

        while (p <= q) {
            if (s.charAt(p) != s.charAt(q) ) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }

    @Test
    public void test8() {
        System.out.println(System.nanoTime());
        
    }
}
