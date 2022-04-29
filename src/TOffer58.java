public class TOffer58 {

    public static String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()).concat(s.substring(0, n));
    }

    public static void main(String[] args) {
        String s = reverseLeftWords("lrloseumgh", 6);
        System.out.println(s);
    }
}
