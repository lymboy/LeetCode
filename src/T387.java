public class T387 {
    
    public int firstUniqChar(String s) {

        int[] answer = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            answer[s.charAt(i)-'a']++;
        }
        for (int i=0; i<s.length(); i++) {
            if (answer[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
