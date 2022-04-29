import java.util.ArrayList;
import java.util.List;

public class T17 {

    private final static String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        findCombination(digits, 0, "");
        return ans;
    }

    void findCombination(String str, int index, String s) {
        if (index == str.length()) {
            ans.add(s);
            return;
        }
        String letter = letters[str.charAt(index) - '0'];
        for (int i = 0; i < letter.length(); i++) {
            findCombination(str, index + 1, s + letter.charAt(i));
        }
    }

    public static void main(String[] args) {
        T17 a = new T17();
        a.letterCombinations("23");
        a.ans.forEach(System.out::println);
    }

}
