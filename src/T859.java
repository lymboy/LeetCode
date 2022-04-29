public class T859 {

    public static boolean buddyStrings(String A, String B) {

        int m = A.length();
        int n = B.length();

        if (m != n || m == 0) {
            return false;
        }

        if (A.equals(B)) {
            int[] cnt = new int[26];
            for (int i = 0; i < A.length(); i++) {
                cnt[A.charAt(i) - 'a']++;
                if (cnt[A.charAt(i) - 'a'] >= 2) {
                    return true;
                }
            }
            return false;
        } else {
            int first = 0, second = m - 1;

            for (int i = 0; i < m; i++) {
                if (A.charAt(first) == B.charAt(first)) {
                    first++;
                }
                if (A.charAt(second) == B.charAt(second)) {
                    second--;
                }
                if (first >= second) {
                    return false;
                }
            }

            char[] strA = A.toCharArray();
            if (first != second) {
                char tmp = strA[first];
                strA[first] = strA[second];
                strA[second] = tmp;
            }
            return new String(strA).equals(B);
        }

    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ab"));
    }
}
