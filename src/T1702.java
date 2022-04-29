import java.util.Arrays;

import org.junit.Test;

public class T1702 {
    
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        result[0] = first;

        for (int i=1; i<result.length; i++) {
            result[i] = result[i-1] ^ encoded[i-1];
        }

        return result;
    }

    @Test
    public void test7() {
    
        int[] ret = decode(new int[]{6,2,7,3}, 4);
        System.out.println(Arrays.toString(ret));
    }
}
