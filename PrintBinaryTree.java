import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree {

    public List<List<String>> printTree(TreeNode root) {

        int height = height(root);
        int nodes = (int)Math.pow(2, height)-1;
        int level = 0;

        List<List<String>> matrix = new ArrayList<>();
        levelOrder(root, 0, height, level, nodes, matrix);

        return matrix;
    }

    private int height(TreeNode root) {
        if(root ==null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    private void levelOrder(TreeNode root, int low, int high, int level, int cell, List<List<String>> matrix) {

        if(root ==null)
            return;

        if(matrix.size() <= level) {
            List<String> cells = new ArrayList<>();
            for(int i=0; i < cell-1; i++) {
                cells.add("");
            }
            matrix.add(cells);
        }

        int mid = (low+high) / 2;
        matrix.get(level).add(mid, root.val+"");

        levelOrder(root.left, low, mid, level+1, cell, matrix);
        levelOrder(root.right,(low+high+1) / 2, high,level+1, cell, matrix);
    }
}
