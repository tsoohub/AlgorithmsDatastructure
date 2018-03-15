public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length ==0)
            return nums;

        int row = nums.length;
        int col = nums[0].length;

        if(row * col != r * c)
            return nums;

        int[][] newMatrix = new int[r][c];
        int rn = 0;
        int cn = 0;

        for(int i=0; i < row; i++) {

            for(int j=0; j < col; j++) {
                newMatrix[rn][cn++] = nums[i][j];

                if(cn == c) {
                    rn++;
                    cn =0;
                }
            }
        }
        return newMatrix;
    }
}
