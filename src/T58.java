/**
 * https://leetcode.cn/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
 * 58. 最后一个单词的长度
 * 从后往前遍历，先跳到第一个非空格的位置
 * 然后从后往前数计算长度
 */
public class T58 {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int i=s.length()-1;
        while (i>=0 && s.charAt(i)==' ') {
            i--;
        }
        while (i>=0 && s.charAt(i)!=' ') {
            res++;
            i--;
        }

        return res;
    }
}