import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-07
 */
public class T648 {

    public String replaceWords(List<String> dictionary, String sentence) {

        dictionary.sort((a, b) -> {
            return a.length() != b.length() ? a.length() - b.length() : a.compareTo(b);
        });
        String[] s = sentence.split(" ");
        for (int i=0; i<s.length; i++) {
            for (String s2 : dictionary) {
                if (s[i].startsWith(s2)) {
                    s[i] = s2;
                    break;
                }
            }
        }

        return String.join(" ", s);
    }

    @Test
    public void test38() {
        List<String> dictionary  = Arrays.asList("cat","bat","rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }

}
