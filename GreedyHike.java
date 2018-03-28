import java.util.Scanner;

public class GreedyHike {


    public void alicePath(int[][] path, int x, int y) {

        findGoodPath(path,x, y+1, 0, path[x][y]);
    }

    private void findGoodPath(int[][] path, int x, int y, int sum, int prev) {

        if(path[0].length-1 == y){
            System.out.println(x+" "+y+" "+(sum+(Math.abs(path[x][y]-prev))));
            return;
        }

        int cur = path[x][y];
        int xx = x-1 >= 0 ? Math.abs(path[x-1][y] - prev) : Integer.MAX_VALUE;
        int x0 = Math.abs(cur - prev);
        int x1 = x+1 < path.length ? Math.abs(path[x+1][y] - prev) : Integer.MAX_VALUE;

        if(xx == x0 || x1 == x0) {
            findGoodPath(path, x, y+1, sum + x0, cur);
        }
        else if(xx < x0 && x1 < x0 && xx == x1) {
            findGoodPath(path, x+1, y+1, sum + x1, path[x+1][y]);
        }
        else {
            int min = Math.min(Math.min(xx, x0), x1);
            if(min ==xx)        findGoodPath(path, x-1, y+1, sum+min, path[x-1][y]);
            else if(min ==x0)   findGoodPath(path, x, y+1, sum+min, cur);
            else findGoodPath(path, x+1, y+1, sum+min, path[x+1][y]);
        }

    }

    public static void main(String[] args) {
        GreedyHike gh = new GreedyHike();
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int s = scan.nextInt();
        int e = scan.nextInt();

        int[][] paths = new int[x][y];

        for(int i=0; i < x; i++) {
            for(int j=0; j < y; j++) {
                paths[i][j] = scan.nextInt();
            }
        }

        gh.alicePath(paths, s, e);
    }
}
