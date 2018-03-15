public class MaxAreaIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;


        for(int i=0; i < grid.length; i++) {

            for(int j=0; j < grid[0].length; j++) {

                if(grid[i][j] ==1) {
                    int area = maxAreaHelper(grid, i, j);
                    if(area > max) {
                        max = area;
                    }
                }
            }
        }
        return max;
    }

    private int maxAreaHelper(int[][] grid, int r, int c){

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] ==0)
            return 0;

        int land = 1;
        grid[r][c] = 0;
        land += maxAreaHelper(grid, r, c-1);
        land += maxAreaHelper(grid, r, c+1);
        land += maxAreaHelper(grid, r+1, c);
        land += maxAreaHelper(grid, r-1, c);

        return land;
    }

    public static void main(String[] args) {
        MaxAreaIsland m = new MaxAreaIsland();
        int[][] area = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};

        System.out.println("Max area: "+m.maxAreaOfIsland(area));
    }
}
