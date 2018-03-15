public class ReverseInt {

    public int reverse(int x) {

        long rev = 0;
        while(x != 0) {

            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }

            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return (int)rev;
    }

    public static void main(String[] args) {

        ReverseInt r = new ReverseInt();

        System.out.println(r.reverse(12312));
        System.out.println(r.reverse(12319));
        System.out.println(r.reverse(12313));
        System.out.println(r.reverse(12315));

    }
}
