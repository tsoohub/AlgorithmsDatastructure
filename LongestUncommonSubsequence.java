public class LongestUncommonSubsequence {

    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;

        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        LongestUncommonSubsequence l = new LongestUncommonSubsequence();
        l.findLUSlength("as", "sfs");

        System.out.println("aba".contains("aba"));
    }
}
