public class PalindromeInt {

    public boolean isPalindrome(int x) {
        if(x <= 0 || x % 10 == 0)  return false;

        int halfreverse = 0;
        while(x > halfreverse) {
            halfreverse = halfreverse * 10 + x % 10;
            x = x / 10;
        }

        return x == halfreverse || x == halfreverse / 10;
    }


    public static void main(String[] args) {

        PalindromeInt p = new PalindromeInt();

        System.out.println(p.isPalindrome(12325));
        System.out.println(p.isPalindrome(12321));

        System.out.println(p.isPalindrome(-12312));
    }
}
