/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-19
 */
public class JZ05 {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i)==' ' ? "%20":s.charAt(i));
        }
        return builder.toString();
        //return s.replace(" ", "%20");
    }
}
