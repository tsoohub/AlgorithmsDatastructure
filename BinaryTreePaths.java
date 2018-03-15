import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> path = new ArrayList<>();
        List<String> paths = new ArrayList<>();
        pathHelper(root, path, paths);

        return paths;
    }

    private void pathHelper(TreeNode root, List<String> path, List<String> paths) {
        if(root == null) return;

        path.add(String.valueOf(root.val));

        if(root.left == null && root.right ==null) {
            String p = path.stream().collect(Collectors.joining("->"));
            paths.add(p);

        }
        else {
            pathHelper(root.left, path, paths);
            pathHelper(root.right, path, paths);
        }
        if(!path.isEmpty())
            path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

    }
}
