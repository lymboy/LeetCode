
public class T125 {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch>='a'&&ch<='z') || (ch>='0' && ch<='9')) {
                sb.append(ch);
            }
        }
        String newStr = sb.toString();
        int len = newStr.length();
        if (len==0) {
            return true;
        }
        int i=0;
        int j=newStr.length()-1;
        while (i<j && newStr.charAt(i)==newStr.charAt(j)) {
            i++;
            j--;
        }
        if (i<j) {
            return false;
        }
        return true;
    }
}