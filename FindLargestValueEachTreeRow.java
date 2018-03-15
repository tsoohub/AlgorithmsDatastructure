import java.util.ArrayList;
import java.util.List;

public class FindLargestValueEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        if(root == null)    return null;
        List<Integer> maxAtLevel = new ArrayList<>();
        return helperLevelLargest(root, 0, maxAtLevel);
    }

    private List<Integer> helperLevelLargest(TreeNode node, int level, List<Integer> maxInRow) {
        if(node ==null)
            return maxInRow;

        if(level >= maxInRow.size()) {
            maxInRow.add(level, node.val);
        }
        else {
            if(node.val > maxInRow.get(level)) {
                maxInRow.set(level, node.val);
            }
        }
        helperLevelLargest(node.left, level+1, maxInRow);
        helperLevelLargest(node.right, level+1, maxInRow);

        return maxInRow;
    }
}
