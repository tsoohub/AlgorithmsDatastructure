public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        if(s.length() ==0)  return 0;

        int count = 0;
        for(int i=0; i < s.length(); i++) {
            for(int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if(isPalindrome(sub)) {
                    count++;
                }
            }
        }

        return count;
    }

    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromicSubstrings p = new PalindromicSubstrings();
        System.out.println(p.countSubstrings("abc"));
    }
}
