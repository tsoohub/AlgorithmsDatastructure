public class RangeAddition2 {

    public int maxCount(int m, int n, int[][] ops) {

        if(ops.length ==0)  return m * n;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int[][] M = new int[m][n];

        for(int[] o : ops) {

            for(int i=0; i < o[0]; i++) {

                for(int j=0; j < o[1]; j++) {
                    M[i][j] = M[i][j] + 1;
                    if(M[i][j] > max) {
                        max = M[i][j];
                        count = 0;
                    }
                    if(M[i][j] == max) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
