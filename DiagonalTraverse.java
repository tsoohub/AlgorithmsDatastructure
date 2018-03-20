import java.util.Arrays;

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length ==0)   return new int[]{};

        int ROW = matrix.length;
        int COL = matrix[0].length;

        int diagnol = ROW + COL - 1;

        int[] zigzag = new int[ROW*COL];
        int index = 0;

        for(int d=1; d <= diagnol; d++) {
            int start_col = Math.max(0, d - ROW);
            int count = Math.min(Math.min(d, (COL-start_col)), ROW);

            if(d % 2 ==1) {
                for(int e =0; e < count; e++) {
                    zigzag[index++] = matrix[Math.min(ROW, d) - e - 1][start_col+e];
                }
            }
            else {
                for(int e =count-1; e >= 0; e--) {
                    zigzag[index++] = matrix[Math.min(ROW, d) - e - 1][start_col+e];
                }
            }
        }

        return zigzag;
    }

    public static void main(String[] args) {
        DiagonalTraverse dt = new DiagonalTraverse();

        int[][] matrix = {
            {1, 2, 3 },
            {4, 5, 6 },
            {7, 8, 9 }
        };

        System.out.println(Arrays.toString(dt.findDiagonalOrder(matrix)));
    }
}
