public class MaxArea {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int max2 = 0;
        boolean prev = false;

        for(int i=0; i < grid.length; i++) {

            for(int j=0; j < grid[i].length; i++) {

                   // me
//                grid[i][j+1] // front
//                grid[i][j-1] // back
//                grid[i-1][j] // up
//                grid[i+1][j] // down

                if(grid[i][j] == 1) {
                    max2 += 1;



                    prev = true;
                }
            }
        }

        return max;
    }


}
