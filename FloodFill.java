import java.util.HashMap;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int searchColor = image[sr][sc];
        HashMap<Integer, Integer> visited = new HashMap<>();
        visited.put(sr, sc);

        floodHelper(image, sr, sc, newColor, searchColor, visited);
        return image;
    }

    private void floodHelper(int[][] image, int row, int col, int newColor, int searchColor, HashMap<Integer, Integer> visited) {
        //left traversal
        int left = col-1;
        if(left >= 0 && isVisited(visited, row, left) && image[row][left] ==searchColor) {
            visited.put(row, left);
            image[row][left] = searchColor;
            floodHelper(image, row, left, newColor, searchColor, visited);
        }
        // right traversal
        int right = col+1;
        if(right < image[row].length && isVisited(visited, row, right) && image[row][right] ==searchColor) {
            visited.put(row, right);
            image[row][right] = searchColor;
            floodHelper(image, row, right, newColor, searchColor, visited);
        }
        // top traversal
        int top = row-1;
        if(top >=0 && isVisited(visited, top, col) && image[top][col] ==searchColor) {
            visited.put(top, col);
            image[top][col] = searchColor;
            floodHelper(image, top, col, newColor, searchColor, visited);
        }
        // bottom traversal
        int bottom = row+1;
        if(bottom < image.length && isVisited(visited, bottom, col) && image[bottom][col] ==searchColor) {
            visited.put(bottom, col);
            image[bottom][col] = searchColor;
            floodHelper(image, bottom, col, newColor, searchColor, visited);
        }
    }

    private boolean isVisited(HashMap<Integer, Integer> visited, int r, int c) {
        return visited.containsKey(r) && visited.get(r) ==c;
    }
}
