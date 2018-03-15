public class LCSBrute {

    long counter=0;

    long LCS(String S1, String S2, int m, int n) {
        counter++;
        if(n ==0)
            return 0;
        else if(m==0)
            return 0;
        else if(S1.charAt(m-1) ==S2.charAt(n-1)) {
            return LCS(S1, S2, m-1, n-1) + 1;
        }
        else
            return Math.max(LCS(S1, S2, m, n-1), LCS(S1, S2, m-1, n));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        LCSBrute lcs = new LCSBrute();

        String str = "GAATTCAGTTA";
        String str2 = "GGATCGA";
        System.out.println(lcs.LCS(str, str2, str.length(), str2.length()));    // 6
        System.out.println(lcs.counter);    // 1450

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Running time: "+elapsedTime);
    }
}
