public class LCSMemoized {

    int counter = 0;
    public int LCS(String X, String Y) {

        int m = X.length();
        int n = Y.length();

        int[][] L = new int[m+1][n+1];

        for(int i=0; i <= m; i++) {

            for(int j=0; j <= n; j++) {

                L[i][j] = -1;

            }
        }

        return LCSHelper(X, Y, m, n, L);
    }

    int LCSHelper(String S1, String S2, int m, int n, int[][] L) {
        counter++;
        if(L[m][n] < 0) {
            if(n ==0) {
                L[m][0] = 0;
            }
            else if(m ==0) {
                L[0][n] = 0;
            }
            else if(S1.charAt(m-1) ==S2.charAt(n-1)) {
                L[m][n] = LCSHelper(S1, S2, m -1, n - 1, L) + 1;
            }
            else {
                L[m][n] = Math.max(LCSHelper(S1, S2, m, n-1, L), LCSHelper(S1, S2, m-1, n, L));
            }
        }
        return L[m][n];
    }

    public static void main(String[] args) {
        LCSMemoized l = new LCSMemoized();

        String str = "GAATTCAGTTA";
        String str2 = "GGATCGA";

        long startTime = System.currentTimeMillis();
        System.out.println(l.LCS(str, str2));   // 6
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Running time: "+elapsedTime);


       // System.out.println(l.counter);          //  67
    }
}
