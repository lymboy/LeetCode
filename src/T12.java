import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class T12 {

    public String intToRoman(int num) {
        StringBuffer ret = new StringBuffer();
        Map<Integer, String> romansNum = new LinkedHashMap<>();
        romansNum.put(1000, "M");
        romansNum.put(900, "CM");
        romansNum.put(500, "D");
        romansNum.put(400, "CD");
        romansNum.put(100, "C");
        romansNum.put(90, "XC");
        romansNum.put(50, "L");
        romansNum.put(40, "XL");
        romansNum.put(10, "X");
        romansNum.put(9, "IX");
        romansNum.put(5, "V");
        romansNum.put(4, "IV");
        romansNum.put(1, "I");
        

        if (romansNum.containsKey(num)) {
            ret.append(romansNum.get(num));
        } else {
            for (int n : romansNum.keySet()){

                if (num == 0) {
                    break;
                }

                int div = num / n;
                int mod = num % n;

                if (div != 0) {
                    for (int i = 0; i < div; i++) {
                        ret.append(romansNum.get(n));
                    }
                }

                if (mod != 0) {
                    if (romansNum.containsKey(mod)) {
                        ret.append(romansNum.get(mod));
                        mod = mod / n;
                    }
                }

                num = mod;
            }
        }

        return ret.toString();
    }

    @Test
    public void test28() {
        System.err.println(intToRoman(1994)); 
    }
}