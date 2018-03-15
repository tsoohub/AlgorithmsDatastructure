import java.util.ArrayList;
import java.util.List;

public class PostOrderFromLeaf {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return null;

        List<List<Integer>> list = new ArrayList<>();
        int heigth = height(root);

        for(int i=1; i <= heigth; i++) {
            List<Integer> sublist = new ArrayList<>();
            level(root, i, sublist);
        }

        return list;
    }

    private List<Integer> level(TreeNode node, int level, List<Integer> list) {

        if(node ==null)
            return list;

        if(level ==1)
            list.add(node.val);
        else if(level > 1) {
            list = level(node.left, level-1, list);
            list = level(node.right, level-1, list);
        }

        return list;
    }

    private int height(TreeNode node) {
        if(node ==null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }
}

