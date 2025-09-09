
public class T28 {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        // 1. 先处理长度问题：needle更长则直接返回-1
        if (len2 > len1) {
            return -1;
        }
        // 2. 外层循环：遍历所有可能的起始位置（包含 len1 - len2）
        for (int i = 0; i <= len1 - len2; i++) {
            // 3. 内层循环：从当前i开始，逐字符对比needle
            int j = 0;
            // 对比当前i开始的子串与needle
            while (j < len2 && haystack.charAt(i + j) == needle.charAt(j)) {
                j++; // 匹配则j后移
            }
            // 4. 若j遍历完needle，说明匹配成功，返回当前起始下标i
            if (j == len2) {
                return i;
            }
        }
        // 5. 遍历完所有起始位置仍未匹配，返回-1
        return -1;
    }

    public static void main(String[] args) {
        // int res = new T28().strStr("hello", "ll");
        int res = new T28().strStr("mississippi", "issip");
        System.out.println(res);
    }
}