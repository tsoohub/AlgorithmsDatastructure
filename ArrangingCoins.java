public class ArrangingCoins {

    public int arrangeCoins(int n) {

        if(n <= 0)  return 0;

        int stairs = 0;
        int m = n;

        for(int i=1; i <= n; i++) {
            m = m - i;
            if(m < 0)
                break;
            stairs++;
        }
        return stairs;
    }
}
