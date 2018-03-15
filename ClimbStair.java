public class ClimbStair {

    public int climbStairs(int n) {

        int memoize[] = new int[n+1];
        return climbHelper(0, n, memoize);
    }

    private int climbHelper(int i, int n, int[] memoize) {

        if(i > n) {
            return 0;
        }
        if(i ==n) {
            return 1;
        }
        if(memoize[i] > 0)
            return memoize[i];
        memoize[i] = climbHelper(i+1, n, memoize) + climbHelper(i + 2, n, memoize);

        return memoize[i];
    }

    public static void main(String args[]) {

        ClimbStair c = new ClimbStair();

        System.out.println(c.climbStairs(5));
    }
}
