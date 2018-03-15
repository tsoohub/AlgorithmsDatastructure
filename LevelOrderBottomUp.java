import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderBottomUp {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Solution 1 is
        // First make level order traversal and save every level values to list.
        // Second swap between bottom and top levels items.
        List<List<Integer>> list = new ArrayList<>();
        helperLevel(root, list, 0);

        int size = list.size();
        for(int i=0; i < size/2; i++) {

            Collections.swap(list, i, size-i-1);
        }
        return list;
    }

    private List<List<Integer>> helperLevel(TreeNode node, List<List<Integer>> list, int level) {
        if(node ==null)
            return null;

        if(list.size() <= level)
            list.add(new ArrayList<>());

        list.get(level).add(node.val);

        helperLevel(node.left, list, level+1);
        helperLevel(node.right, list, level+1);

        return list;
    }
}
